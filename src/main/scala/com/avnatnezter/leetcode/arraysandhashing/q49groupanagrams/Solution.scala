package com.avnatnezter.leetcode.arraysandhashing.q49groupanagrams

import scala.collection.mutable

object Solution {
    def groupAnagrams(strs: Array[String]): List[List[String]] = {
        groupAnagramsWithoutSorting(strs)
    }

    def groupAnagramsWithGroupBy(strs: Array[String]): List[List[String]] =
        strs.groupBy(_.sorted).view.mapValues(_.toList).values.toList

    private def groupAnagramsWithoutSorting(strs: Array[String]): List[List[String]] = {
        val aIndex = 'a'.toByte.toInt
        val result = mutable.HashMap.empty[mutable.ArrayBuffer[Int], mutable.ListBuffer[String]]

        for (s <- strs) {
            val charCount = mutable.ArrayBuffer.fill(26)(0)
            for (c <- s)
                charCount(c.toByte.toInt - aIndex) += 1
            result.getOrElseUpdate(charCount, mutable.ListBuffer[String]()) += s
        }

        result.view.mapValues(_.toList).values.toList
    }
}
