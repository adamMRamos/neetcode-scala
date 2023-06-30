package com.avnatnezter.leetcode.stack.q022generateparenthesis

import scala.collection.mutable

object Solution {
    def generateParenthesis(n: Int): List[String] = {
        generateParenthesisRecursive(n)
    }

    private def generateParenthesisWhileLoop(n: Int): List[String] = {
        case class State(open: Int, close: Int, str: String) {
            def pushClose: State = this.copy(close = close + 1, str = str + ')')
            def pushOpen: State = this.copy(open = open + 1, str = str + '(')
        }

        val answer = mutable.ListBuffer.empty[String]
        val states = mutable.Stack.empty[State]
        states push State(1, 0, "(")

        while (states.nonEmpty) {
            val s = states.pop()
            if (s.close < s.open)
                states push s.pushClose
            if (s.open < n)
                states push s.pushOpen

            if (s.open == n && s.close == n)
                answer += s.str
        }

        answer.toList
    }

    private def generateParenthesisRecursive(n: Int): List[String] = {
        val answer = mutable.ListBuffer.empty[String]
        val parenthesis = mutable.Stack.empty[Char]

        def backtrack(open: Int, close: Int): Unit = {
            if (open == n && close == n) {
                answer += parenthesis.reverse.mkString
                return
            }

            if (open < n) {
                parenthesis push '('
                backtrack(open + 1, close)
                parenthesis.pop()
            }

            if (close < open) {
                parenthesis push ')'
                backtrack(open, close + 1)
                parenthesis.pop()
            }
        }

        backtrack(0, 0)

        answer.toList
    }
}
