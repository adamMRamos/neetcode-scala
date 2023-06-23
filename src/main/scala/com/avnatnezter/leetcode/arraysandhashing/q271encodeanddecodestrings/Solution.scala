package com.avnatnezter.leetcode.arraysandhashing.q271encodeanddecodestrings

import scala.collection.mutable

object Solution {
    /*
     * @param strs: a list of strings
     * @return: encodes a list of strings to a single string.
     *//*
     * @param strs: a list of strings
     * @return: encodes a list of strings to a single string.
     */

    def encode(strs: List[String]): String =
        strs.map(s => s.length + "#" + s).mkString

    /*
     * @param str: A string
     * @return: decodes a single string to a list of strings
     */
    def decode(str: String): List[String] = {
        val message = mutable.ListBuffer.empty[String]

        var i = 0
        while (i < str.length) {
            val total = str(i).asDigit

            message += str.substring(i + 2, i + total + 2)

            i += total + 2
        }

        message.toList
    }
}
