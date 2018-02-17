package compiler

import collection.JavaConverters._

package object lang {
  implicit def javaList2Scala[T](ls: java.util.List[T]): List[T] = ls.asScala.toList
  implicit def nullable2Seq[T](x: T): Seq[T] = if(x == null) Seq() else Seq(x)

}
