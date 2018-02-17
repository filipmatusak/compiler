package compiler.lang

import compiler.lang.tree._

import scala.collection.mutable
import scala.collection.mutable.ListBuffer


class Test() {
  def visit(n: FunctionDef, ctx: TestContext): Unit = {
    for{p <-n.params; Typed(ar: ArrayType) <- p.typ; if ar.exprs.nonEmpty}  Errors.add(s"Function array parameter ${p.name} contains dimension range")
    for{p <-n.params; if ctx.fs.keySet.contains(p.name) }                   Errors.add("Function parameter name and function name conflict: " + p.name)
    for{Typed(r: ArrayType) <- n.resultType; if r.exprs.nonEmpty}           Errors.add(s"Function ${n.name}: array result type contains dimension range")
    visit(n.block, ctx.copy(vars = ctx.vars ++ n.params.map(x => (x.name, x.typ))))
    if(n.block.statements.isEmpty || !n.block.statements.last.isInstanceOf[ReturnStatement]) Errors.add(s"Last statement of function ${ctx.actual.name} must be return statement")
    n.resultType match {
      case ArrayType(StringType, _, _) => Errors.add("Result type of function cannot by string array")
      case StringType => Errors.add("Result type of function cannot by string")
      case _ =>
    }
  }

  def visit(n: Block, ctx: TestContext): Unit = {
    val vars = mutable.Map[String, Type]() ++ ctx.vars
    n.statements.foreach {
      case x: ValueDefinition =>
        if(vars.keySet.contains(x.name)) Errors.add("Variable name conflict " + x.name + " in function " + ctx.actual.name)
        if(x.expr.isDefined && x.typ != x.expr.get.typ) Errors.add("Wrong type of expression for " + x.name)
        vars.put(x.name, x.typ)
        x.expr.foreach(visit(_, ctx.add(vars)))
      case x: ArrayValueDef =>
        if(vars.keySet.contains(x.name)) Errors.add("Variable name conflict " + x.name + " in function " + ctx.actual.name)
        if(x.typ.dimention != x.typ.exprs.size) Errors.add("Each dimension must be defined for array " + x.name)
        if(x.typ.exprs.exists(e => e.typ != IntegerType)) Errors.add("Each dimension must be integer type for array " + x.name)
        vars.put(x.name, x.typ)
      case x: ReturnStatement =>
        (x.expr.typ, ctx.actual.resultType) match {
          case (ArrayType(b1,d1,_), ArrayType(b2,d2,_)) => if(b1 != b2 || d1 != d2)
            Errors.add("Return statement returns wrong type ")
          case _ => if(x.expr.typ != ctx.actual.resultType) Errors.add("Return statement returns wrong type ")
        }
        visit(x.expr, ctx.add(vars))
      case x: IfStatement => visit(x, ctx.add(vars))
      case x: AssignmentStatement =>
        (x.id.typ, x.expr.typ) match {
          case (ArrayType(b1, d1, _), ArrayType(b2, d2, _)) => if(b1 != b2 || d1 != d2) Errors.add("Wrong type of expression for " + x.id.name)
          case _ => if(x.id.typ != x.expr.typ) Errors.add("Wrong type of expression for " + x.id.name)
        }
        visit(x.expr, ctx.add(vars))
      case x: ArrayAssignmentStatement =>
        if(x.typ.base != x.expr.typ) Errors.add("Wrong type of expression for " + x.name)
        if(x.typ.dimention != x.typ.exprs.size) Errors.add("Each dimension must be defined for array " + x.name)
        if(x.typ.exprs.exists(e => e.typ != IntegerType)) Errors.add("Each dimension must be integer type for array " + x.name)
        (x.typ.exprs ++ Seq(x.expr)).foreach(e => visit(e,ctx.add(vars)))
      case x: ExprStatement => visit(x.expr, ctx.add(vars))
      case x: ForStatement =>
        x.ranges.foreach{ r =>
          if(vars.keySet.contains(r.id.name)) Errors.add("Variable name conflict " + r.id.name )
          visit(r.from, ctx.add(vars))
          if(r.from.typ != IntegerType) Errors.add("Range for " + r.id.name + " must be integer type")
          visit(r.to, ctx.add(vars))
          if(r.to.typ != IntegerType) Errors.add("Range for " + r.id.name + " must be integer type")
          visit(r.by, ctx.add(vars))
          if(r.by.typ != IntegerType) Errors.add("Range for " + r.id.name + " must be integer type")
          vars.put(r.id.name, IntegerType)
        }
        visit(x.block, ctx.add(vars))
    }
  }

  def visit(n: IfStatement, ctx: TestContext): Unit = {
    visit(n.expr, ctx)
    n.elseBlock.foreach(visit(_, ctx))
    n.nextIf.foreach(visit(_, ctx))
  }

  def visit(n: Expr, ctx: TestContext): Unit = {
    n match {
      case x: IdExpr =>
      case x: NumExpr =>
      case x: CharExpr =>
      case x: FloatExpr =>
      case x: BoolExpr =>
      case x: StringExpr =>
      case x: ParenthExpr => visit(x.expr, ctx)
      case x: FunCallExpr =>
        x.args.foreach(visit(_, ctx))
        if(!ctx.fs.contains(x.name)) Errors.add("Undefined function " + x.name)
        else {
          if(x.args.size != ctx.fs(x.name).params.size) Errors.add("Wrong number of argument for call function " + x.name)
          x.args.zip(ctx.fs(x.name).params).foreach{case(a, p) =>
            if(a.typ != p.typ) Errors.add("Wrong type of argument for call function " + x.name)
          }
        }
      case x: SubNumExpr => visit(x.expr, ctx)
      case x: SubFloatExpr => visit(x.expr, ctx)
      case x: SubIdExpr =>
        if(x.expr.typ != IntegerType && x.expr.typ != FloatType) Errors.add("Unsupported operation: sub " + x.expr.typ + " for " + x.expr.name)
        visit(x.expr, ctx)
      case x: ArrayIdExpr =>
        x.exprs.foreach(visit(_, ctx))
        if(!ctx.vars(x.name).isInstanceOf[ArrayType]) Errors.add("Variable " + x.name + " is not array")
        if(x.exprs.exists(_.typ != IntegerType)) Errors.add("Index to array must by integer for " + x.name)
        if(x.exprs.size != x.arrayType.dimention) Errors.add("Each dimension must be defined for array " + x.name)
      case x: AddSubMulDivExpr =>
        visit(x.expr1, ctx)
        visit(x.expr2, ctx)
        if(x.expr1.typ != x.expr2.typ) Errors.add(s"Unsupported operation ${x.op} between ${x.expr1.typ} and ${x.expr2.typ}")
        if(x.typ != IntegerType && x.typ != FloatType) Errors.add("Unsupported operation sub for type " + x.typ)
      case x: BitOperationExpr =>
        visit(x.e1, ctx)
        visit(x.e2, ctx)
        if(x.e1.typ != x.e2.typ) Errors.add(s"Unsupported operation ${x.op} between ${x.e1.typ} and ${x.e2.typ}")
        if(x.typ != IntegerType && x.typ != CharType && x.typ != BoolType) Errors.add("Unsupported operation sub for type " + x.typ)
      case x: CompareExpr =>
        visit(x.e1, ctx)
        visit(x.e2, ctx)
        if(x.e1.typ != x.e2.typ) Errors.add(s"Unsupported operation ${x.op} between ${x.e1.typ} and ${x.e2.typ}")
    }
  }
}

object Typed { def unapply[A](a: A) = Some(a) }

case class TestContext(actual: FunctionDef, fs: Map[String, FunctionDef], vars: Map[String, Type]){
  def add(x: mutable.Map[String, Type]): TestContext = this.copy(vars = vars ++ x)
}

case object Errors {
  var errors: ListBuffer[String] = ListBuffer[String]()

  def add(msg: String): Unit = errors.prepend(msg)

  def get(): List[String] = errors.toList
}

object Test {


  def apply(tree: Init): List[String] = {
    val functions = tree.functions.map(x => (x.name, x))

    functions.groupBy(_._1).foreach{ x =>
      if(x._2.size > 1) Errors.add("Function names conflict: " + x._1)
    }

    val fs = functions.map(x => (x._1, x._2)).toMap ++ App.baseFunctions

    if(!fs.contains("main") || fs("main").resultType != IntegerType)
      Errors.add("Function main -> Int must be defined")

    functions.foreach(x => new Test().visit(x._2, TestContext(x._2, fs, Map())))

    Errors.get()
  }
}
