package compiler.lang

import java.io.{FileInputStream, FileOutputStream}

import compiler.generated.{GramatikaLexer, GramatikaParser}
import compiler.lang.tree._
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}

import scala.io.Source

object App {
  def main(args: Array[String]): Unit = {

    val is = if (args.length > 0) new FileInputStream(args(0)) else System.in
    val input = CharStreams.fromStream(is)

    val lexer = new GramatikaLexer(input)
    val tokens = new CommonTokenStream(lexer)
    val parser = new GramatikaParser(tokens)

    registerFunctions()

    val tree = parser.init
    if(tree.exception.nonEmpty) return

    val visitor = new FileVisitor
    val st = visitor.visit(tree)


    val errors = Test(st)
    if(errors.nonEmpty){
      errors.foreach{ e =>
        println("Error: " + e)
      }
      return
    }

    val res = header + st.toStr

    if(args.length > 1){
      new FileOutputStream(args(1)).write(res.getBytes)
    } else {
      System.out.print(res)
    }
  }

  val header: String = Source.fromResource("header.ll").getLines.mkString("\n")

  def registerFunctions(): Unit =
    baseFunctions.map(x => (x._1, x._2.resultType))
    .foreach(x => Global.registerFunction(x._1, x._2))


  val baseFunctions: Map[String, FunctionDef] = Map[String, FunctionDef](
    "readInt" -> FunctionDef("readInt", Seq(), IntegerType, Block(Nil)),
    "readChar" -> FunctionDef("readChar", Seq(), CharType, Block(Nil)),
    "readFloat" -> FunctionDef("readFloat", Seq(), FloatType, Block(Nil)),
    "printi" -> FunctionDef("printi", Seq(Param("x", IntegerType)), IntegerType, Block(Nil)),
    "printiln" -> FunctionDef("printiln", Seq(Param("x", IntegerType)), IntegerType, Block(Nil)),
    "printc" -> FunctionDef("printc", Seq(Param("x", CharType)), IntegerType, Block(Nil)),
    "printcln" -> FunctionDef("printcln", Seq(Param("x", CharType)), IntegerType, Block(Nil)),
    "prints" -> FunctionDef("prints", Seq(Param("x", StringType)), IntegerType, Block(Nil)),
    "printsln" -> FunctionDef("printsln", Seq(Param("x", StringType)), IntegerType, Block(Nil)),
    "printd" -> FunctionDef("printd", Seq(Param("x", FloatType)), IntegerType, Block(Nil)),
    "printdln" -> FunctionDef("printdln", Seq(Param("x", FloatType)), IntegerType, Block(Nil)),
    "printb" -> FunctionDef("printb", Seq(Param("x", BoolType)), IntegerType, Block(Nil)),
    "printbln" -> FunctionDef("printbln", Seq(Param("x", BoolType)), IntegerType, Block(Nil)),
    "readString" -> FunctionDef("readString", Seq(), StringType, Block(Nil))
  )
}


