package compiler.lang

import compiler.lang.tree.Type

import scala.collection.mutable

object Global {
  var anonymousVariable = 1
  var forCounter = 1
  var ifCoutner = 1

  def getNextVar: Int = {
    anonymousVariable += 1
    anonymousVariable - 1
  }

  def getLastVar: Int = anonymousVariable - 1

  def getNextFor: Int = {
    forCounter += 1
    forCounter - 1
  }

  def resetVar(): Unit = {
    anonymousVariable = 1
  }

  def getLastFor: Int = forCounter - 1

  val functions: mutable.Map[String, Type] = mutable.Map[String, Type]()

  def registerFunction(name: String, typ: Type): Unit =
    functions.put(name, typ)

  def getFuncType(name: String): Type = functions(name)

  def getNextIf: Int = {
    ifCoutner += 1
    ifCoutner - 1
  }
}
