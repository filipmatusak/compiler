package compiler.lang.tree

import compiler.lang.Global

sealed trait Statement extends Tree

case class ValueDefinition(name: String, typ: Type, expr: Option[Expr]) extends Statement {
  override def toStr: String = {
    val t = typ.toStr
    expr match {
      case None => s"\t%$name = alloca " + t

      case Some(ex) =>
        val exprStr = ex.toStr
        exprStr + "\n" +
        s"\t%$name = alloca $t\n" +
        s"\t%${Global.getNextVar} = load $t, $t* %${Global.getLastVar-1}\n" +
        s"\tstore $t %${Global.getLastVar}, $t* %" + name
    }
  }
}

case class ArrayValueDef(name: String, typ: ArrayType) extends Statement {
  override def toStr: String = {
    val exprs = typ.exprs.foldLeft(("", Seq[Int]())){ case ((aggStr, ids), e) =>
      (aggStr + "\n" + e.toStr, ids :+ Global.getLastVar)
    }

    s"""${exprs._1}
       |\t%${Global.getNextVar} = alloca i32
       |\tstore i32 ${typ.dimention}, i32* %${Global.getLastVar}
       |\t%${Global.getNextVar} = call i64* (i32*, ...) @allocArray(i32* %${Global.getLastVar-1}, ${exprs._2.map(x => "i32* %" + x).mkString(", ")})
       |\t%$name = alloca i64*
       |\tstore i64* %${Global.getLastVar}, i64** %$name""".stripMargin
  }
}

case class ReturnStatement(expr: Expr) extends Statement {
  override def toStr: String = {
    val exprStr = expr.toStr
    val t = expr.typ.toStr
    val res = exprStr + "\n" +
      s"\t%${Global.getNextVar} = load $t, $t* %${Global.getLastVar-1}\n" +
    s"\tret $t %${Global.getLastVar};"
    Global.getNextVar
    res
  }
}

case class IfStatement(expr: Expr, thanBlock: Block, elseBlock: Option[Block], nextIf: Option[IfStatement]) extends Statement {
  override def toStr: String = {
    val id = Global.getNextIf
    s"""${expr.toStr}
       |\t%${Global.getNextVar} = load i1, i1* %${Global.getLastVar-1}
       |\t%if$id.cmp = icmp eq i1 %${Global.getLastVar}, true
       |\tbr i1 %if$id.cmp, label %if$id.than, label %if$id.else
       |if$id.than:
       |
       |${thanBlock.toStr}
       |
       |\tbr label %if$id.after
       |if$id.else:
       |
       |${elseBlock.map(_.toStr).getOrElse("")}
       |${nextIf.map(_.toStr).getOrElse("")}
       |
       |\tbr label %if$id.after
       |if$id.after:""".stripMargin
  }
}

case class AssignmentStatement(id: IdExpr, expr: Expr) extends Statement {
  override def toStr: String = {
    val t = expr.t
    s"""${expr.toStr}
       |\t%${Global.getNextVar} = load $t, $t* %${Global.getLastVar-1}
       |\tstore $t %${Global.getLastVar}, $t* %${id.name}""".stripMargin
  }
}

case class ArrayAssignmentStatement(name: String, typ: ArrayType, expr: Expr) extends Statement {
  override def toStr: String = {
    val exprs = typ.exprs.foldLeft(("", Seq[Int]())) { case ((aggStr, ids), e) =>
      (aggStr + "\n" + e.toStr, ids :+ Global.getLastVar)
    }
    val res = expr.toStr
    var resId = Global.getLastVar

    val arrayBaseType = expr.typ match {
      case IntegerType => "Int"
      case BoolType => "Bool"
      case CharType => "Char"
      case FloatType => "Double"
      case StringType => "String"
      case _ => ""
    }

    val fcall = s"@get${arrayBaseType}ArrayPointer(i64** %$name, ${exprs._2.map(x => "i32* %" + x).mkString(",")})"

    s"""${exprs._1}
       |$res
       |
       |\t%${Global.getNextVar} = call ${expr.t}* (i64**, i32*, ...) $fcall
       |\t%${Global.getNextVar} = load ${expr.t}, ${expr.t}* %$resId
       |\tstore ${expr.t} %${Global.getLastVar}, ${expr.t}* %${Global.getLastVar-1}""".stripMargin
  }
}

case class ExprStatement(expr: Expr) extends Statement {
  override def toStr: String = expr.toStr
}

case class ForRange(id: IdExpr, from: Expr, to: Expr, by: Expr) extends Tree {
  override def toStr: String = ""
}
case class ForStatement(ranges: Seq[ForRange], block: Block) extends Statement {
  def printFor(rangs: List[ForRange]): String = {
    rangs match {
      case Nil => block.toStr
      case range :: xs =>
        val forId = Global.getNextFor
        val fromExprStr = range.from.toStr
        val fromExprId = Global.getLastVar
        val toExprStr = range.to.toStr
        val toExprId = Global.getLastVar
        val byExprStr = range.by.toStr
        val byExprId = Global.getLastVar

        s"""\tbr label %for$forId.entry
          |for$forId.entry:
          |$fromExprStr
          |$toExprStr
          |$byExprStr
          |
          |\t%for$forId.by = load i32, i32* %$byExprId
          |\t%for$forId.from = alloca i32
          |\t%for$forId.fromtmp = load i32, i32* %$fromExprId
          |\tstore i32 %for$forId.fromtmp, i32* %for$forId.from
          |\t%for$forId.totmp1 = load i32, i32* %$toExprId
          |\t%for$forId.to = sub i32 %for$forId.totmp1, 1
          |\tbr label %for$forId.loop
          |for$forId.loop:
          |\t%${range.id.name} = alloca i32
          |\t%for$forId.tmp2 = load i32, i32* %for$forId.from
          |\tstore i32 %for$forId.tmp2, i32* %${range.id.name}
          |\t%for$forId.next = add i32 %for$forId.tmp2, %for$forId.by
          |\t%for$forId.cmp = icmp sle i32 %for$forId.tmp2, %for$forId.to
          |\tstore i32 %for$forId.next, i32* %for$forId.from
          |\tbr i1 %for$forId.cmp, label %for$forId.block, label %for$forId.after
          |
          |for$forId.block:
          |${printFor(xs)}
          |
          |\tbr label %for$forId.loop
          |for$forId.after:""".stripMargin
    }
  }

  override def toStr: String = {
    printFor(ranges.toList)
  }
}