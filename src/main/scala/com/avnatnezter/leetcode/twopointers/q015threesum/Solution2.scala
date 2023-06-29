package com.avnatnezter.leetcode.twopointers.q015threesum

import scala.collection.mutable

object Solution2 {
    def threeSum(nums: Array[Int]): List[List[Int]] = {
        threeSumSkipDuplicate(nums)
    }

    private def threeSumWithHashSet(nums: Array[Int]): List[List[Int]] = {
        val previousTriplets = mutable.HashSet.empty[List[Int]]

        val sorted = nums.sorted
        for (i <- sorted.indices) {
            var left = i + 1
            var right = sorted.length - 1
            while (left < right)
                if (sorted(i) + sorted(left) + sorted(right) == 0 && !previousTriplets.contains(List(sorted(i), sorted(left), sorted(right)))) {
                        previousTriplets.add(List(sorted(i), sorted(left), sorted(right)))
                        right -= 1
                        left += 1
                } else if (sorted(i) + sorted(left) + sorted(right) > 0)
                    right -= 1
                else
                    left += 1
        }

        previousTriplets.toList
    }

    private def threeSumSkipDuplicate(nums: Array[Int]): List[List[Int]] = {
        val previousTriplets = mutable.ArrayBuffer.empty[List[Int]]

        val sorted = nums.sorted
        for (i <- sorted.indices) {
            val a = sorted(i)

            // only iterate if we haven't seen A before
            if (i == 0 || a != sorted(i - 1)) {
                var (left, right) = (i + 1, sorted.length - 1)

                while (left < right) {
                    val b = sorted(left)
                    val c = sorted(right)

                    if (a + b + c > 0)
                        right -= 1
                    else if (a + b + c < 0)
                        left += 1
                    else {
                        previousTriplets += List(a, b, c)
                        left += 1
                        // shift our left pointer if it matches the previous location
                        while (left < right && sorted(left) == sorted(left -1))
                            left += 1
                    }
                }
            }
        }

        previousTriplets.toList
    }
}
