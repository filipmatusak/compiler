package compiler.lang.tree

sealed trait Type extends Tree

case object IntegerType extends Type {
  override def toStr = "i32"
}

case object CharType extends Type {
  override def toStr = "i8"
}

case object StringType extends Type {
  override def toStr = "i8*"
}

case object FloatType extends Type {
  override def toStr = "double"
}

case object BoolType extends Type {
  override def toStr = "i1"
}

case class ArrayType(base: Type, dimention: Int, exprs: Seq[Expr]) extends Type {
  override def toStr: String = "i64*"
}

