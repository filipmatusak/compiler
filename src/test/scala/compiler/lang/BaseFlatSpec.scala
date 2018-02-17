package compiler.lang

import compiler.generated.{GramatikaLexer, GramatikaParser}
import compiler.lang.tree.Tree
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}
import org.scalatest.FlatSpec

abstract class BaseFlatSpec extends FlatSpec {
  abstract class TestScope {
    def parse(data: String): Tree = {
      Global.resetVar()

      var is = data
      val input = CharStreams.fromString(is)

      App.registerFunctions()

      val lexer = new GramatikaLexer(input)
      val tokens = new CommonTokenStream(lexer)
      val parser = new GramatikaParser(tokens)

      val tree = parser.init
      val visitor = new FileVisitor
      visitor.visit(tree)
    }
  }
}
