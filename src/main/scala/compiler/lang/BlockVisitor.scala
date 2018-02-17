package compiler.lang

import compiler.generated.GramatikaBaseVisitor
import compiler.generated.GramatikaParser._
import compiler.lang.VisitorHelper._
import compiler.lang.tree._

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

class BlockVisitor(name: String, params: Seq[Param], resultType: Type) extends GramatikaBaseVisitor[Tree]{
  // check used names

  val variables: mutable.Map[String, Type] = mutable.Map[String, Type]()

  params.foreach(x => variables.put(x.name, x.typ))

  override def visitBlock(ctx: BlockContext): Block = {
    Block(ctx.stat().map(visit).collect{ case x: Statement => x})
  }

  override def visitValue_declaration(ctx: Value_declarationContext): Statement = {
    val name = ctx.ID().getText
    val typ = parseType(ctx.value_type(), Some(ctx.expr()), Some(variables))
    val expr = ctx.expr().map(new ExprVisitor(variables).visit).headOption

    variables.put(name, typ)
    typ match {
      case t: ArrayType => ArrayValueDef(name, t)
      case _ => ValueDefinition(name, typ, expr)
    }
  }

  override def visitReturn(ctx: ReturnContext): Tree = {
    val expr = new ExprVisitor(variables).visit(ctx.expr())
    ReturnStatement(expr)
  }

  override def visitExprStat(ctx: ExprStatContext): Tree = {
    val expr = new ExprVisitor(variables).visit(ctx.expr())
    ExprStatement(expr)
  }

  override def visitFor(ctx: ForContext): Tree = {
    val ranges = ctx.for_range_list().for_range().map(visitFor_range)

    val newVar = new ListBuffer[Param]()
    variables.foreach(x => newVar += Param(x._1, x._2))
    ranges.foreach(x => newVar += Param(x.id.name, x.id.typ))

    val blockVis = new BlockVisitor(name, newVar, resultType)
    ForStatement(ranges, blockVis.visitBlock(ctx.block()))
  }

  override def visitFor_range(ctx: For_rangeContext): ForRange = {
    val id = IdExpr(ctx.ID().getText, IntegerType)
    variables.put(id.name, id.typ)
    val expr = new ExprVisitor(variables)
    val from = expr.visit(ctx.from)
    val to = expr.visit(ctx.to)
    val by = ctx.by.headOption.map(expr.visit).getOrElse(NumExpr(1))
    ForRange(id, from, to, by)
  }

  override def visitIfStat(ctx: IfStatContext): IfStatement = visitIf_statement(ctx.if_statement())

  override def visitIf_statement(ctx: If_statementContext): IfStatement = {
    val exprVis = new ExprVisitor(variables)
    val expr = exprVis.visit(ctx.expr())

    val newVar = new ListBuffer[Param]()
    variables.foreach(x => newVar += Param(x._1, x._2))

    val blockVis = new BlockVisitor(name, newVar, resultType)
    val thanBlock = blockVis.visitBlock(ctx.block(0))
    val elseBlock = ctx.block().size() match {
      case 1 => None
      case 2 => Some(blockVis.visitBlock(ctx.block().get(1)))
    }
    val nextIfStat = ctx.if_statement().map(visitIf_statement).headOption

    IfStatement(expr, thanBlock, elseBlock, nextIfStat)
  }

  override def visitAssignment(ctx: AssignmentContext): Statement = {
    val exprVis = new ExprVisitor(variables)
    ctx.ID.headOption match {
      case Some(i) =>
        val id = IdExpr(i.getText, variables(i.getText))
        AssignmentStatement(id, exprVis.visit(ctx.expr()))
      case None =>
        val name = ctx.array_id().ID().getText
        val expr = exprVis.visit(ctx.expr())
        val t = variables(name) match {
          case x: ArrayType => x
          case _ => throw new TypeException(name + " is not array")
        }
        val exprs = ctx.array_id().array_sufix().toSeq.flatMap(_.expr()).map(exprVis.visit)

        ArrayAssignmentStatement(name, ArrayType(t.base, t.dimention, exprs), expr)
    }
  }
}

object BlockVisitor {
  def apply(ctx: Func_declarationContext): FunctionDef = {
    val name = ctx.name.getText
    val params = for {
      paramList: Param_listContext <- ctx.param_list()
      paramGroup: Param_groupContext <- paramList.param_group()
      typ: Value_typeContext = paramGroup.value_type()
      paramName <- paramGroup.ID()
    } yield Param(paramName.getText, parseType(typ, None))

    val resType = parseType(ctx.resultType, None)

    Global.registerFunction(name, resType)

    val funcVisitor = new BlockVisitor(name, params, resType)

    val block = funcVisitor.visitBlock(ctx.block())

    FunctionDef(name, params, resType, block)
  }
}
