package compiler.lang.tree

import compiler.lang.Global

sealed trait Expr extends Tree {
  def typ: Type
  def t: String = typ.toStr
}

case class IdExpr(name: String, typ: Type) extends Expr {
  override def toStr: String = {
    val id1 = Global.getNextVar
    val id2 = Global.getNextVar
     // s"\t%$id1 = alloca ${typ.toStr}\n" +
     // s"\tstore $t %$name, $t* %$id1"

    s"\t%$id1 = load $t, $t* %$name\n" +
      s"\t%$id2 = alloca ${typ.toStr}\n" +
      s"\tstore $t %$id1, $t* %$id2"
  }
}

case class NumExpr(value: Int, typ: Type = IntegerType) extends Expr {
  override def toStr: String = {
    val id = Global.getNextVar
    s"\t%$id = alloca $t\n" +
      s"\tstore $t $value, $t* %$id"
  }
}

case class CharExpr(value: Char, typ: Type = CharType) extends Expr {
  override def toStr: String = {
    val id = Global.getNextVar
    s"\t%$id = alloca $t\n" +
      s"\tstore $t ${value.toInt}, $t* %$id"
  }
}

case class FloatExpr(value: Double, typ: Type = FloatType) extends Expr {
  override def toStr: String = {
    val id = Global.getNextVar
    s"\t%$id = alloca $t\n" +
      s"\tstore $t $value, $t* %$id"
  }
}

case class BoolExpr(value: Boolean, typ: Type = BoolType) extends Expr {
  override def toStr: String = {
    val id = Global.getNextVar
    s"\t%$id = alloca $t\n" +
      s"\tstore $t $value, $t* %$id"
  }
}

case class StringExpr(value: String, typ: Type = StringType) extends Expr {
  override def toStr: String = {
    val id = Global.getNextVar
    val t = s"[${value.length+1} x i8]"
    s"\t%$id = alloca $t\n" +
      s"""\tstore $t c\"${value.map(c => "\\"+Integer.toHexString(c.toInt)).mkString("")}\\00\", $t* %$id\n""" +
      s"\t%${Global.getNextVar} = getelementptr $t, $t* %$id, i8 0, i8 0\n" +
    s"\t%${Global.getNextVar} = alloca i8*\n" +
    s"\tstore i8* %${Global.getLastVar-1}, i8** %${Global.getLastVar}"
  }
}

case class FunCallExpr(name: String, args: Seq[Expr], typ: Type) extends Expr {
  override def toStr: String = {
    val exprStr = args.foldLeft(("", Seq[Int]())) { case ((aggStr, ids), e) =>
      (aggStr + "\n" + e.toStr, ids :+ Global.getLastVar)
    }

    val params = exprStr._2.zip(args.map(_.t)).map( x => x._2 + "* %" + x._1).mkString(", ")
    exprStr._1 + "\n" +
    s"\t%${Global.getNextVar} = call $t @$name($params)\n" +
    s"\t%${Global.getNextVar} = alloca $t\n" +
    s"\tstore $t %${Global.getLastVar-1}, $t* %${Global.getLastVar}"
  }
}

case class SubNumExpr(expr: NumExpr, typ: Type = IntegerType) extends Expr {
  override def toStr: String = typ match {
    case IntegerType =>
      s"""\t%${Global.getNextVar} = mul $t ${expr.value}, -1
         |\t%${Global.getNextVar} = alloca $t
         |\tstore $t %${Global.getLastVar-1}, $t* %${Global.getLastVar}""".stripMargin
    case _ => ""
  }
}

case class SubFloatExpr(expr: FloatExpr, typ: Type = FloatType) extends Expr {
  override def toStr: String = typ match {
    case FloatType =>
      s"""\t%${Global.getNextVar} = fmul $t ${expr.value}, -1.0
         |\t%${Global.getNextVar} = alloca $t
         |\tstore $t %${Global.getLastVar-1}, $t* %${Global.getLastVar}""".stripMargin
    case _ => ""
  }
}

case class SubIdExpr(expr: IdExpr, typ: Type) extends Expr {
  override def toStr: String = typ match {
    case FloatType =>
      s"""${expr.toStr}
         |\t%${Global.getNextVar} = load $t, $t* %${Global.getLastVar-1}
         |\t%${Global.getNextVar} = fmul $t %${Global.getLastVar-1}, -1${if(typ == FloatType) ".0" else ""}
         |\t%${Global.getNextVar} = alloca $t
         |\tstore $t %${Global.getLastVar-1}, $t* %${Global.getLastVar}""".stripMargin
    case _ => ""
  }
}

case class ArrayIdExpr(name: String, typ: Type, exprs: Seq[Expr], arrayType: ArrayType) extends Expr {
  override def toStr: String = {
    val exprStr = exprs.foldLeft(("", Seq[Int]())) { case ((aggStr, ids), e) =>
      (aggStr + "\n" + e.toStr, ids :+ Global.getLastVar)
    }

    val arrayBaseType = typ match {
      case IntegerType => "Int"
      case BoolType => "Bool"
      case CharType => "Char"
      case FloatType => "Double"
      case StringType => "String"
      case _ => ""
    }

    val fcall = s"@get${arrayBaseType}ArrayPointer(i64** %$name, ${exprStr._2.map(x => "i32* %" + x).mkString(",")})"

    s"""${exprStr._1}
       |\t%${Global.getNextVar} = call $t* (i64**, i32*, ...) $fcall""".stripMargin
  }
}

sealed trait Operation
case object OpPlus extends Operation
case object OpMinus extends Operation
case object OpMul extends Operation
case object OpDiv extends Operation

case class AddSubMulDivExpr(expr1: Expr, expr2: Expr, typ: Type, op: Operation) extends Expr {
  override def toStr: String = {
    val opt = op match {
      case OpPlus => "add"
      case OpMinus => "sub"
      case OpMul => "mul"
      case OpDiv => if(typ == IntegerType) "sdiv" else "div"
    }
    val rop = if(typ == FloatType) "f"+opt else opt
    val exp1str = expr1.toStr
    val exr1id = Global.getLastVar
    val exp2str = expr2.toStr
    val exr2id = Global.getLastVar
    s"""$exp1str
       |$exp2str
       |\t%${Global.getNextVar} = load $t, $t* %$exr1id
       |\t%${Global.getNextVar} = load $t, $t* %$exr2id
       |\t%${Global.getNextVar} = $rop $t %${Global.getLastVar-2}, %${Global.getLastVar-1}
       |\t%${Global.getNextVar} = alloca $t
       |\tstore $t %${Global.getLastVar-1}, $t* %${Global.getLastVar}""".stripMargin
  }
}

sealed trait BitOp
case object BitAnd extends BitOp
case object BitOr extends BitOp
case object BitXor extends BitOp

case class BitOperationExpr(e1: Expr, e2: Expr, op: BitOp, typ: Type) extends Expr {
  override def toStr: String = {
    val e1str = e1.toStr
    val e1id = Global.getLastVar
    val e2str = e2.toStr
    val e2id = Global.getLastVar
    val t = e1.typ.toStr
    val (c1, c2) = (Global.getNextVar, Global.getNextVar)
    val o = op match {
      case BitAnd => "and"
      case BitOr => "or"
      case BitXor => "xor"
    }
    s"""$e1str
       |$e2str
       |\t%$c1 = load $t, $t* %$e1id
       |\t%$c2 = load $t, $t* %$e2id
       |\t%${Global.getNextVar} = $o $t %$c1, %$c2
       |\t%${Global.getNextVar} = alloca $t
       |\tstore $t %${Global.getLastVar-1}, $t* %${Global.getLastVar}""".stripMargin
  }
}

case class ParenthExpr(expr: Expr, typ: Type) extends Expr {
  override def toStr: String = expr.toStr
}

sealed trait CompOp
case object EQOP extends CompOp
case object NEOP extends CompOp
case object LTOP extends CompOp
case object LEOP extends CompOp
case object GTOP extends CompOp
case object GEOP extends CompOp

case class CompareExpr(e1: Expr, e2: Expr, op: CompOp, typ: Type = BoolType) extends Expr {
  override def toStr: String = {
    val o = op match {
      case EQOP => "eq"
      case NEOP => "ne"
      case LTOP => "lt"
      case LEOP => "le"
      case GTOP => "gt"
      case GEOP => "ge"
    }

    val (base, c1, c2) = gen(e1, e2)
    val t = e1.typ.toStr
    val s = if(op != EQOP && op != NEOP) "s" else ""
    val cmpStr = e1.typ match {
      case IntegerType| CharType | BoolType =>
        s"\t%${Global.getNextVar} = icmp $s$o $t %$c1, %$c2\n" +
          s"\t%${Global.getNextVar} = alloca i1\n" +
          s"\tstore i1 %${Global.getLastVar-1}, i1* %${Global.getLastVar}"
      case FloatType =>
        s"\t%${Global.getNextVar} = fcmp o$o $t %$c1, %$c2" +
          s"\t%${Global.getNextVar} = alloca i1\n" +
          s"\tstore i1 %${Global.getLastVar-1}, i1* %${Global.getLastVar}"
      case StringType =>
        s"\t%${Global.getNextVar} = call i32 @strcmp(i8* %$c1, i8* %$c2)\n" +
          s"\t%${Global.getNextVar} = icmp $s$o i32 %${Global.getLastVar-1}, 0\n" +
          s"\t%${Global.getNextVar} = alloca i1\n" +
          s"\tstore i1 %${Global.getLastVar-1}, i1* %${Global.getLastVar}"
      case _ => ""
    }
    base + "\n" + cmpStr
  }

  def gen(e1: Expr, e2: Expr): (String, Int, Int) = {
    val e1str = e1.toStr
    val e1id = Global.getLastVar
    val e2str = e2.toStr
    val e2id = Global.getLastVar
    val t = e1.typ.toStr
    val (c1, c2) = (Global.getNextVar, Global.getNextVar)
    val base = s"""$e1str
                  |$e2str
                  |\t%$c1 = load $t, $t* %$e1id
                  |\t%$c2 = load $t, $t* %$e2id""".stripMargin
    (base, c1, c2)
  }
}

