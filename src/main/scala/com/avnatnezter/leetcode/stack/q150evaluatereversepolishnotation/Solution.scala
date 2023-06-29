package com.avnatnezter.leetcode.stack.q150evaluatereversepolishnotation

import scala.collection.mutable

object Solution {
    def evalRPN(tokens: Array[String]): Int = {
        val operations: Map[String, (Int, Int) => Int] = Map(
            ("+", (a, b) => a + b),
            ("-", (a, b) => a - b),
            ("*", (a, b) => a * b),
            ("/", (a, b) => a / b),
        )

        val expressions = mutable.Stack.empty[String]
        expressions.push(tokens(0))

        var answer = 0
        for (e <- tokens.tail) {
            if (operations.contains(e)) {
                val b = expressions.pop().toInt
                val a = {
                    if (!expressions.headOption.exists(operations.contains)) expressions.pop().toInt
                    else answer
                }
                answer = operations(e)(a, b)
            }
            expressions.push(e)
        }

        answer
    }
}
