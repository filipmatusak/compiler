package compiler.lang

import compiler.generated.GramatikaParser.Value_typeContext
import compiler.lang.tree._
import compiler.generated.GramatikaParser._

import scala.collection.mutable

object VisitorHelper {
  def parseType(ctx: Value_typeContext,
                value: Option[ExprContext],
                variables: Option[mutable.Map[String, Type]] = None): Type = {

    val baseType: Type = ctx.t.getType match {
      case `INT_TYPE` => IntegerType
      case `CHAR_TYPE` => CharType
      case `STRING_TYPE` => StringType
      case `FLOAT_TYPE` => FloatType
      case `BOOL_TYPE` => BoolType
    }

    val arrayDim = ctx.array_sufix().size()

    arrayDim match {
      case 0 => baseType
      case x if variables.isDefined =>
        val exprVis = new ExprVisitor(variables.get)
        val exprs = ctx.array_sufix().toSeq.flatMap(_.expr()).map(exprVis.visit)
        ArrayType(baseType, arrayDim, exprs)
      case x =>
        val expr = if(ctx.array_sufix().toSeq.flatMap(_.expr()).nonEmpty) Seq(NumExpr(0))
          else Nil
        ArrayType(baseType, arrayDim,expr)
    }
  }
}
