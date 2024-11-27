package com.avnatnezter.practice

import scala.collection.mutable

object ValidParenthesis {
  def main(args: Array[String]): Unit = {
    println(isValid("{()}"))
    println(isValid("{)"))
    println(isValid("{}()[]"))
  }

  def isValid(s: String): Boolean = {
    val open = mutable.Stack.empty[Char]

    def isOpenParenthesis(c: Char): Boolean =
      c == '{' || c == '(' || c =='['

    def matchingOpen(c: Char): Char = c match {
      case '}' => '{'
      case ')' => '('
      case ']' => '['
    }

    var i = 0
    while (i < s.length) {
      if (isOpenParenthesis(s(i)))
        open.push(s(i))
      else if (matchingOpen(s(i)) == open.top)
        open.pop()

      i += 1
    }

    open.isEmpty
  }
}
