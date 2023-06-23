package com.avnatnezter.leetcode.arraysandhashing.q128longestconsecutivesequence

object Solution {
    def longestConsecutive(nums: Array[Int]): Int = {
        val numSet = nums.toSet

        var longest = 0
        var count = 0
        for (n <- nums) {
            if (!numSet.contains(n - 1)) {
                var next = n
                while (numSet.contains(next)) {
                    count += 1
                    next += 1
                }
            }
            longest = Math.max(longest, count)
            count = 0
        }

        longest
    }
}
