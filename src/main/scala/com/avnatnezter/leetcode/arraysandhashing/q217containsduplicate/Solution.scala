package com.avnatnezter.leetcode.arraysandhashing.q217containsduplicate

import scala.collection.mutable

object Solution {
    def containsDuplicate(nums: Array[Int]): Boolean =
        containsDuplicateWithHashing(nums)

    private def containsDuplicateGroupBy(nums: Array[Int]): Boolean =
        nums.groupBy(x => x).exists(_._2.length > 1)

    private def containsDuplicateWithHashing(nums: Array[Int]): Boolean = {
        val hs = mutable.HashSet.empty[Int]
        for (k <- nums)
            if (!(hs add k)) return true

        false
    }
}
