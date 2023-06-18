package com.avnatnezter.leetcode.arraysandhashing.q217containsduplicate

object Solution {
    def containsDuplicate(nums: Array[Int]): Boolean =
        nums.groupBy(x => x).exists(_._2.length > 1)
}
