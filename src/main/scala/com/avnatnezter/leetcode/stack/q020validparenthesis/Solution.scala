package com.avnatnezter.leetcode.stack.q020validparenthesis

import scala.collection.mutable

object Solution {
    def isValid(s: String): Boolean = {
        def isCloseParenthesis(c: Char) = c match {
            case ')' | '}' | ']' => true
            case _ => false
        }
        def matchingClose(c: Char): Option[Char] = c match {
            case '(' => Some(')')
            case '{' => Some('}')
            case '[' => Some(']')
            case _ => None
        }

        val openParenthesis = mutable.Stack.empty[Char]
        for (c <- s)
            if (isCloseParenthesis(c))
                if (openParenthesis.headOption.flatMap(matchingClose).contains(c))
                    openParenthesis.pop()
                else
                    return false
            else
                openParenthesis.push(c)
        openParenthesis.isEmpty
    }
}
