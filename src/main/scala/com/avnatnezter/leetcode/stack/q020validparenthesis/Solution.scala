package com.avnatnezter.leetcode.stack.q020validparenthesis

import scala.collection.mutable

object Solution {
    def isValid(s: String): Boolean = {
        def opposite(c: Char): Option[Char] = c match {
            case '(' => Some(')')
            case '{' => Some('}')
            case '[' => Some(']')
            case _ => None
        }

        val stack = mutable.Stack.empty[Char]
        for (c <- s)
            if (stack.headOption.flatMap(opposite).contains(c))
                stack.pop()
            else
                stack.push(c)
        stack.isEmpty
    }
}
