package compiler.lang.tree

import compiler.lang.BaseFlatSpec

class ExprSpec extends BaseFlatSpec {
  behavior of "expr classes"

  it should "print subNumExpr corretly" in new TestScope {
    val subNumExpr = SubNumExpr(NumExpr(59), IntegerType).toStr

    val exp =
      s"""\t%1 = mul i32 59, -1
        |\t%2 = alloca i32
        |\tstore i32 %1, i32* %2""".stripMargin
    assert(subNumExpr === exp)
  }
}
