package compiler.lang

import compiler.lang.tree._

class VisitorSpec extends BaseFlatSpec {
  behavior of "parse"

  it should "parse function, return, assigment" in new TestScope {
    val st = parse(VisitorSpec.data1)

    val res = st.toStr
    println(res)

    val expected =
      Init(Seq(
        FunctionDef(
          "fcia",
          Seq(
            Param("a", IntegerType),
            Param("b", FloatType),
            Param("c", FloatType)),
          IntegerType,
          Block(Seq(
            ValueDefinition("y", FloatType, Some(FloatExpr(1.314))),
            ValueDefinition("x", IntegerType, Some(NumExpr(6))),
            ReturnStatement(IdExpr("a", IntegerType))
          ))
        )
      ))

    assert(st === expected)
  }

  it should "parse bool, reuse variable" in new TestScope {
    val st = parse(VisitorSpec.data2)

    val res = st.toStr
    println(res)

    val expected =
      Init(Seq(
        FunctionDef("fcia", Seq(Param("x", IntegerType)), BoolType,
          Block(Seq(
            ValueDefinition("a", BoolType, Some(BoolExpr(true))),
            ValueDefinition("b", BoolType, Some(IdExpr("a", BoolType))),
            ValueDefinition("str", StringType, Some(StringExpr("aa"))),
            ReturnStatement(IdExpr("b", BoolType))
          ))
        )
      ))

    assert(st === expected)
  }

  it should "parse function calls" in new TestScope {
    val st = parse(VisitorSpec.data3)

    val res = st.toStr
    println(res)

    val expected =
      Init(Seq(
        FunctionDef("main", Seq(), IntegerType,
          Block(Seq(
            ValueDefinition("int", IntegerType, Some(FunCallExpr("readInt", Nil, IntegerType))),
            ExprStatement(FunCallExpr("printiln", Seq(IdExpr("int", IntegerType)), IntegerType)),
            ValueDefinition("ch", CharType, Some(FunCallExpr("readChar", Nil, CharType))),
            ExprStatement(FunCallExpr("printcln", Seq(IdExpr("ch", CharType)), IntegerType)),
            ValueDefinition("str", StringType, Some(FunCallExpr("readString", Nil, StringType))),
            ExprStatement(FunCallExpr("printsln", Seq(IdExpr("str", StringType)), IntegerType)),
            ReturnStatement(IdExpr("int", IntegerType))
          ))
        )
      ))

    assert(st === expected)
  }

  it should "parse for cycle" in new TestScope {
    val st = parse(VisitorSpec.data4)

    val res = st.toStr
    println(res)

    val expected =
      Init(Seq(
        FunctionDef("main", Seq(), IntegerType,
          Block(Seq(
            ForStatement(Seq(
              ForRange(IdExpr("i", IntegerType), NumExpr(0), NumExpr(10), NumExpr(2)),
              ForRange(IdExpr("j", IntegerType), NumExpr(0), IdExpr("i", IntegerType), NumExpr(1))
            ), Block(Seq(
              ExprStatement(FunCallExpr("printi", Seq(IdExpr("i", IntegerType)), IntegerType)),
              ValueDefinition("m", StringType, Some(StringExpr(" "))),
              ExprStatement(FunCallExpr("prints", Seq(IdExpr("m", StringType)), IntegerType)),
              ExprStatement(FunCallExpr("printiln", Seq(IdExpr("j", IntegerType)), IntegerType))
            ))),
            ReturnStatement(NumExpr(0))
          ))
        )
      ))

    assert(st === expected)
  }

  it should "parse nested for cycles" in new TestScope {
    val st = parse(VisitorSpec.data5)

    val res = st.toStr
    println(res)

    val expected =
      Init(Seq(
        FunctionDef("main", Seq(), IntegerType,
          Block(Seq(
            ForStatement(Seq(
              ForRange(IdExpr("i", IntegerType), NumExpr(0), NumExpr(10), NumExpr(2))
            ), Block(Seq(
              ForStatement(Seq(
                ForRange(IdExpr("j", IntegerType), NumExpr(0), IdExpr("i", IntegerType), NumExpr(1))
              ), Block(Seq(
                ExprStatement(FunCallExpr("printiln", Seq(IdExpr("j", IntegerType)), IntegerType))
              )))
            ))),
            ReturnStatement(NumExpr(0))
          ))
        )
      ))

    assert(st === expected)
  }

  it should "parse first complex" in new TestScope {
    val st = parse(VisitorSpec.data6)

    val res = st.toStr
    println(res)

    val expected =
      Init(Seq(
        FunctionDef("main", Seq(), IntegerType,
          Block(Seq(
            ValueDefinition("N", IntegerType, Some(FunCallExpr("readInt", Nil, IntegerType))),
            ValueDefinition("maxi", IntegerType, Some(FunCallExpr("readInt", Nil, IntegerType))),
            ForStatement(Seq(
              ForRange(IdExpr("i", IntegerType), NumExpr(0),
                AddSubMulDivExpr(IdExpr("N", IntegerType), NumExpr(1), IntegerType, OpMinus), NumExpr(1))
            ), Block(Seq(
              ValueDefinition("x", IntegerType, Some(FunCallExpr("readInt", Nil, IntegerType))),
              IfStatement(CompareExpr(IdExpr("x", IntegerType), IdExpr("maxi", IntegerType), GTOP),
                Block(Seq(
                  AssignmentStatement(IdExpr("maxi", IntegerType), IdExpr("x", IntegerType))
                )), None, None)
            ))),
            ExprStatement(FunCallExpr("printiln", Seq(IdExpr("maxi", IntegerType)), IntegerType)),
            ReturnStatement(NumExpr(0))
          ))
        )
      ))

    assert(st === expected)
  }

  it should "parse complex expression" in new TestScope {
    val st = parse(VisitorSpec.data7)

    val res = st.toStr
    println(res)

    val expected =
      Init(Seq(
        FunctionDef("main", Seq(), IntegerType,
          Block(Seq(
            ValueDefinition("X", IntegerType, Some(NumExpr(1))),
            ValueDefinition("b", BoolType, Some(BoolExpr(true))),
            ValueDefinition("N", BoolType, Some(
              BitOperationExpr(
                BitOperationExpr(
                  CompareExpr(
                    AddSubMulDivExpr(
                      AddSubMulDivExpr(
                        AddSubMulDivExpr(
                          NumExpr(2),
                          IdExpr("X", IntegerType),
                          IntegerType,
                          OpMul
                        ),
                        NumExpr(4),
                        IntegerType,
                        OpDiv
                      ),
                      AddSubMulDivExpr(
                        NumExpr(8),
                        NumExpr(2),
                        IntegerType,
                        OpDiv
                      ),
                      IntegerType,
                      OpMinus
                    ),
                    NumExpr(0),
                    GTOP
                  ),
                  ParenthExpr(BitOperationExpr(
                    CompareExpr(
                      AddSubMulDivExpr(
                        NumExpr(9),
                        AddSubMulDivExpr(
                          NumExpr(2),
                          IdExpr("X", IntegerType),
                          IntegerType,
                          OpMul
                        ),
                        IntegerType,
                        OpPlus
                      ),
                      NumExpr(3),
                      EQOP
                    ),
                    IdExpr("b", BoolType),
                    BitOr,
                    BoolType
                  ),BoolType),
                  BitAnd,
                  BoolType
                ),
                CompareExpr(
                  NumExpr(1),
                  AddSubMulDivExpr(
                    NumExpr(2),
                    IdExpr("X", IntegerType),
                    IntegerType,
                    OpMinus
                  ),
                  EQOP
                ),
                BitAnd,
                BoolType
              )
            ))

          ))
        )
      ))

    assert(st === expected)
  }

  it should "parse arrays" in new TestScope {
    val st = parse(VisitorSpec.data8)

    val res = st.toStr
    println(res)

    val expected =
      Init(Seq(
        FunctionDef("main", Seq(), IntegerType,
          Block(Seq(
            ValueDefinition("N", IntegerType, Some(NumExpr(5))),
            ArrayValueDef("x", ArrayType(IntegerType, 1, Seq(IdExpr("N", IntegerType)))),
            ArrayAssignmentStatement("x", ArrayType(IntegerType, 1, NumExpr(0)), NumExpr(9)),
            ValueDefinition("y", IntegerType, Some(ArrayIdExpr("x", IntegerType, Seq(NumExpr(2)), ArrayType(IntegerType, 1, Seq(IdExpr("N", IntegerType)))))),
            ReturnStatement(NumExpr(0))
          ))
        )
      ))

    assert(st === expected)
  }

  it should "parse char" in new TestScope {
    val st = parse(VisitorSpec.data9)

    val res = st.toStr
    println(res)

    val expected =
      Init(Seq(
        FunctionDef("main", Seq(), IntegerType,
          Block(Seq(
            ValueDefinition("c", CharType, Some(CharExpr('A'))),
            ExprStatement(FunCallExpr("printcln", Seq(IdExpr("c", CharType)), IntegerType)),
            ReturnStatement(NumExpr(0))
          ))
        )
      ))

    assert(st === expected)
  }
}

object VisitorSpec {
  val data1 =
    """def fcia a: Int, b, c: Float -> Int = {
      | var y: Float = 1.314;
      | var x: Int = 6;
      |	return a;
      |}
      |""".stripMargin

  val data2 =
    """def fcia x: Int -> Bool = {
      | var a: Bool = true;
      | var b: Bool = a;
      | var str: String = "aa";
      |	return b;
      |}
      |""".stripMargin

  val data3 =
    """def main -> Int = {
      | var int: Int = readInt();
      | printiln(int);
      | var ch: Char = readChar();
      | printcln(ch);
      | var str: String = readString();
      | printsln(str);
      |	return int;
      |}
      |""".stripMargin

  val data4 =
    """def main -> Int = {
      | for( i <- 0 to 10 by 2, j <- 0 to i) {
      |   printi(i);
      |   var m: String = " ";
      |   prints(m);
      |   printiln(j);
      | }
      |	return 0;
      |}
      |""".stripMargin

  val data5 =
    """def main -> Int = {
      | for( i <- 0 to 10 by 2) {
      |   for( j <- 0 to i ){
      |     printiln(j);
      |   }
      | }
      |	return 0;
      |}
      |""".stripMargin

  val data6 =
    """def main -> Int = {
      |	var N: Int = readInt();
      |	var maxi: Int = readInt();
      |	for( i <- 0 to N - 1 ) {
      |		var x: Int = readInt();
      |		if x > maxi -> { maxi = x; }
      |	}
      |	printiln(maxi);
      |	return 0;
      |}""".stripMargin

  val data7 =
    """def main -> Int = {
      | var X: Int = 1;
      | var b: Bool = true;
      |	var N: Bool = 2*X/4 - 8/2 > 0 && (9 + 2*X == 3 || b) && 1 == 2 - X;
      |}""".stripMargin

  val data8 =
    """def main -> Int = {
      | var N: Int = 5;
      | var x: Int[N];
      | x[0] = 9;
      | var y: Int = x[2];
      |	return 0;
      |}""".stripMargin

  val data9 =
    """def main -> Int = {
      | var c: Char = 'A';
      | printcln(c);
      |	return 0;
      |}""".stripMargin

  val data10 =
    """def main -> Int = {
      | var c: Char = 'A';
      | printcln(c);
      |	return 0;
      |}""".stripMargin
}

/*
Init(ArrayBuffer(FunctionDef(main,List(),IntegerType,Block(List(ValueDefinition(X,IntegerType,Some(NumExpr(1,IntegerType))), ValueDefinition(b,BoolType,Some(BoolExpr(true,BoolType))), ValueDefinition(N,BoolType,Some(BitOperationExpr(BitOperationExpr(CompareExpr(AddSubMulDivExpr(AddSubMulDivExpr(AddSubMulDivExpr(NumExpr(2,IntegerType),IdExpr(X,IntegerType),IntegerType,OpMul),NumExpr(4,IntegerType),IntegerType,OpDiv),AddSubMulDivExpr(NumExpr(8,IntegerType),NumExpr(2,IntegerType),IntegerType,OpDiv),IntegerType,OpMinus),NumExpr(0,IntegerType),GTOP,BoolType),ParenthExpr(BitOperationExpr(CompareExpr(AddSubMulDivExpr(NumExpr(9,IntegerType),AddSubMulDivExpr(NumExpr(2,IntegerType),IdExpr(X,IntegerType),IntegerType,OpMul),IntegerType,OpPlus),NumExpr(3,IntegerType),EQOP,BoolType),IdExpr(b,BoolType),BitOr,BoolType),BoolType),BitAnd,BoolType),CompareExpr(NumExpr(1,IntegerType),AddSubMulDivExpr(NumExpr(2,IntegerType),IdExpr(X,IntegerType),IntegerType,OpMinus),EQOP,BoolType),BitAnd,BoolType)))))))) di
 equal Init(List(FunctionDef(main,List(),IntegerType,Block(List(ValueDefinition(X,IntegerType,Some(NumExpr(1,IntegerType))), ValueDefinition(b,BoolType,Some(BoolExpr(true,BoolType))), ValueDefinition(N,BoolType,Some(BitOperationExpr(BitOperationExpr(CompareExpr(AddSubMulDivExpr(AddSubMulDivExpr(AddSubMulDivExpr(NumExpr(2,IntegerType),IdExpr(X,IntegerType),IntegerType,OpMul),NumExpr(4,IntegerType),IntegerType,OpDiv),AddSubMulDivExpr(NumExpr(8,IntegerType),NumExpr(2,IntegerType),IntegerType,OpDiv),IntegerType,OpMinus),NumExpr(0,IntegerType),GTOP,BoolType),BitOperationExpr(CompareExpr(AddSubMulDivExpr(NumExpr(9,IntegerType),AddSubMulDivExpr(NumExpr(2,IntegerType),IdExpr(X,IntegerType),IntegerType,OpMul),IntegerType,OpPlus),NumExpr(3,IntegerType),EQOP,BoolType),IdExpr(b,BoolType),BitOr,BoolType),BitAnd,BoolType),CompareExpr(NumExpr(1,IntegerType),AddSubMulDivExpr(NumExpr(2,IntegerType),IdExpr(X,IntegerType),IntegerType,OpMinus),EQOP,BoolType),BitAnd,BoolType))))))))

 */