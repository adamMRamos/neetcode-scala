package com.avnatnezter.leetcode.arraysandhashing.q49groupanagrams

object Solution {
    def groupAnagrams(strs: Array[String]): List[List[String]] = {
        groupAnagramsWithGroupBy(strs)
    }

    def groupAnagramsWithGroupBy(strs: Array[String]): List[List[String]] =
        strs.groupBy(_.sorted).view.mapValues(_.toList).values.toList
}
