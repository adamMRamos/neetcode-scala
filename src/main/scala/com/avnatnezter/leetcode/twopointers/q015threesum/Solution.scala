package com.avnatnezter.leetcode.twopointers.q015threesum

import scala.collection.mutable

object Solution {
    def threeSum(nums: Array[Int]): List[List[Int]] = {
        val sums = mutable.ListBuffer[List[Int]]()

        val sorted = nums.sorted
        for (i <- sorted.indices) {
            val a = sorted(i)

            var (l, r) = (i + 1, sorted.length - 1)
            while (l < r && (i < 1 || a != sorted(i-1))) {
                val (b, c) = (sorted(l), sorted(r))

                if (a + b + c == 0 && (l < i + 2 || b != sorted(l-1))) {
                    sums.append(List(a, b, c))
                    r -= 1
                    l += 1
                } else if (b + c > -a) {
                    r -= 1
                } else {
                    l += 1
                }
            }
        }

        sums.toList
    }
}
