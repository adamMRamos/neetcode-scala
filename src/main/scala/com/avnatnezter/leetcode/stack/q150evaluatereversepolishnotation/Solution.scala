package com.avnatnezter.leetcode.stack.q150evaluatereversepolishnotation

import scala.collection.mutable

object Solution {
    def evalRPN(tokens: Array[String]): Int = {
        val operations: Map[String, (Int, Int) => Int] = Map(
            ("+", (b, a) => a + b),
            ("-", (b, a) => a - b),
            ("*", (b, a) => a * b),
            ("/", (b, a) => a / b),
        )

        val answer = mutable.Stack.empty[Int]

        for (e <- tokens)
            answer push operations
                    .get(e).map(_(answer.pop, answer.pop))
                    .getOrElse(e.toInt)

        answer.pop
    }
}
