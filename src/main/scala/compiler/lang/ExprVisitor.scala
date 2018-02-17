package compiler.lang

import compiler.generated.GramatikaBaseVisitor
import compiler.generated.GramatikaParser._
import compiler.generated.GramatikaParser
import compiler.lang.tree._

import scala.collection.mutable

class ExprVisitor(variables: mutable.Map[String, Type]) extends GramatikaBaseVisitor[Expr]{

  override def visitExprStat(ctx: ExprStatContext): Expr = visit(ctx.expr())

  override def visitExprFunCall(ctx: ExprFunCallContext): FunCallExpr = {
    val name = ctx.func_call().name.getText
    val args = ctx.func_call().expr().map(visit)
    FunCallExpr(name, args, Global.getFuncType(name))
    //else null FunCallExpr(ctx.func_call().ID().getText, ctx.func_call().expr().map(visit))
  }

  override def visitExprId(ctx: ExprIdContext): Expr = IdExpr(ctx.ID().getText, variables(ctx.ID().getText))

  override def visitExprString(ctx: ExprStringContext): Expr = {
    val rawStr = ctx.string_literal().STRING().getText
    val text = rawStr.slice(1, rawStr.length - 1)
    StringExpr(text, StringType)
  }

  override def visitExprBool(ctx: ExprBoolContext) = BoolExpr(ctx.bool_literal().getText == "true")

  override def visitExprFloat(ctx: ExprFloatContext) = FloatExpr(ctx.FLOAT().getText.toDouble)

  override def visitExprNum(ctx: ExprNumContext) = NumExpr(ctx.NUM().getText.toInt)

  override def visitExprSubNum(ctx: ExprSubNumContext) = SubNumExpr(NumExpr(ctx.NUM().getText.toInt))

  override def visitExprSubFloat(ctx: ExprSubFloatContext) = SubFloatExpr(FloatExpr(ctx.FLOAT().getText.toDouble))

  override def visitExprSubId(ctx: ExprSubIdContext): SubIdExpr = {
    val id = IdExpr(ctx.ID().getText, variables(ctx.ID().getText))
    SubIdExpr(id, id.typ)
  }

  override def visitExprAddSub(ctx: ExprAddSubContext): AddSubMulDivExpr = {
    val expr1 = visit(ctx.expr(0))
    val expr2 = visit(ctx.expr(1))
    val op = if(ctx.op.getType == ADD) OpPlus else OpMinus
    AddSubMulDivExpr(expr1, expr2, expr1.typ, op)
  }

  override def visitExprParenth(ctx: ExprParenthContext): ParenthExpr = {
    val expr = visit(ctx.expr())
    ParenthExpr(expr, expr.typ)
  }

  override def visitExprCompare(ctx: ExprCompareContext): Expr = {
    val e1 = visit(ctx.expr(0))
    val e2 = visit(ctx.expr(1))
    val op = ctx.comp.getType match {
      case GramatikaParser.EQ => EQOP
      case GramatikaParser.NE => NEOP
      case GramatikaParser.LT => LTOP
      case GramatikaParser.LE => LEOP
      case GramatikaParser.GT => GTOP
      case GramatikaParser.GE => GEOP
    }
    CompareExpr(e1, e2, op = op)
  }

  override def visitExprBitOp(ctx: ExprBitOpContext): Expr = {
    val e1 = visit(ctx.expr(0))
    val e2 = visit(ctx.expr(1))
    val op = ctx.op.getType match {
      case `BIT_AND` => BitAnd
      case `BIT_OR` => BitOr
      case `BIT_XOR` => BitXor
    }
    BitOperationExpr(e1, e2, op, e1.typ)
  }

  override def visitExprAnd(ctx: ExprAndContext): Expr = {
    val e1 = visit(ctx.expr(0))
    val e2 = visit(ctx.expr(1))
    BitOperationExpr(e1, e2, BitAnd, e1.typ)
  }


  override def visitExprOr(ctx: ExprOrContext): Expr = {
    val e1 = visit(ctx.expr(0))
    val e2 = visit(ctx.expr(1))
    BitOperationExpr(e1, e2, BitOr, e1.typ)
  }

  override def visitExprMult(ctx: ExprMultContext): Expr = {
    val expr1 = visit(ctx.expr(0))
    val expr2 = visit(ctx.expr(1))
    val op = if(ctx.op.getType == MUL) OpMul else OpDiv
    AddSubMulDivExpr(expr1, expr2, expr1.typ, op)
  }

  override def visitArray_id(ctx: Array_idContext): Expr = {
    val name = ctx.ID().getText
    val exprVis = new ExprVisitor(variables)
    val exprs = ctx.array_sufix().toSeq.flatMap(_.expr()).map(exprVis.visit)

    val t = variables(name)
    t match {
      case ArrayType(_, d, _) => if(exprs.size != d) throw new TypeException(s"Index for array $name must by fully qualified")
      case _ => throw new TypeException(s"Variable $name is not array");
    }

    ArrayIdExpr(name, t.asInstanceOf[ArrayType].base, exprs, t.asInstanceOf[ArrayType])
  }

  override def visitExprChar(ctx: ExprCharContext): Expr = {
    CharExpr(ctx.char_literal().CHAR().getText.charAt(1))
  }

  override def visitExprNot(ctx: ExprNotContext): Expr = {
    val expr = visit(ctx.expr())
    BitOperationExpr(expr, BoolExpr(true), BitXor, BoolType)
  }
}
