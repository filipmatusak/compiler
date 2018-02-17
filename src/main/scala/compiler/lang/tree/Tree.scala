package compiler.lang.tree

import compiler.lang.Global

trait Tree {
  def toStr: String
}

case object Empty extends Tree {
  override def toStr: String = ""
}

case class Init(functions: Seq[FunctionDef]) extends Tree {
  override def toStr: String = {
    functions.foldLeft(""){ case(agg, f) =>
      val str = f.toStr

      Global.resetVar()
      agg + "\n\n" + str
    }
  }
}

case class FunctionDef(name: String, params: Seq[Param], resultType: Type, block: Block) extends Tree {
  override def toStr: String = {
    val mappedParams = params.map(x => x.copy(name=name+"."+x.name))
    val head = s"define ${resultType.toStr} @$name(${mappedParams.map(_.toStr).mkString(", ")}){"
    val b = block.toStr
    val paramsOverride = params.map{p =>
      s"\t%${p.name} = alloca ${p.typ.toStr}\n" +
      s"\t%$name.${p.name}.2 = load ${p.typ.toStr}, ${p.typ.toStr}* %$name.${p.name}\n" +
      s"\tstore ${p.typ.toStr} %$name.${p.name}.2, ${p.typ.toStr}* %${p.name}"
    }.mkString("\n")
    head + "\n" + paramsOverride + "\n" + b + "\n" + "}"
  }
}

case class Param(name: String, typ: Type) extends Tree {
  override def toStr: String = typ.toStr + "* %" + name
}

case class Block(statements: Seq[Statement]) extends Tree {
  override def toStr: String = {
    statements.foldLeft(""){ case (agg, s) =>
      val str = s.toStr
      agg + "\n\n" + str
    }.drop(1)
  }
}


