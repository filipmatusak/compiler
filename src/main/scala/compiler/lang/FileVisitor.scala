package compiler.lang

import compiler.generated.GramatikaBaseVisitor
import compiler.generated.GramatikaParser.{Func_declarationContext, FunctionDefsContext}
import compiler.lang.tree._

import scala.collection.JavaConverters._

class FileVisitor extends GramatikaBaseVisitor[Init] {
  override def visitFunctionDefs(ctx: FunctionDefsContext): Init = {
    val functions = ctx.children.asScala.collect{ case x: Func_declarationContext => x}
      .map(c => BlockVisitor(c))

    Init(functions)
  }
}
