package compiler.lang

abstract class BaseException(msg: String, cause: Throwable = null) extends RuntimeException(msg, cause)

class ExpressionException(msg: String) extends BaseException(msg)

class TypeException(msg: String) extends BaseException(msg)
