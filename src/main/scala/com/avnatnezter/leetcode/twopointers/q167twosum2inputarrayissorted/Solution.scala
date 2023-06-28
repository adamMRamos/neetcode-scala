package com.avnatnezter.leetcode.twopointers.q167twosum2inputarrayissorted

import scala.collection.mutable

object Solution {
    def twoSum(numbers: Array[Int], target: Int): Array[Int] = {
        twoSum2Pointers(numbers, target)
    }

    private def twoSumBruteForce(numbers: Array[Int], target: Int): Array[Int] = {
        for (i <- numbers.indices)
            for (j <- i + 1 until numbers.length)
                if (numbers(i) + numbers(j) == target)
                    return Array(i + 1, j + 1)

        Array()
    }

    private def twoSumWithMap(numbers: Array[Int], target: Int): Array[Int] = {
        val map = mutable.HashMap.empty[Int, Int]

        for (i <- numbers.indices) {
            val partner = target - numbers(i)
            if (map.contains(partner))
                return Array(i + 1, map(partner) + 1).sorted
            else
                map.put(numbers(i), i)
        }

        Array()
    }

    private def twoSum2Pointers(numbers: Array[Int], target: Int): Array[Int] = {
        var left = 0
        var right = numbers.length - 1
        while (left < right)
            if (numbers(left) + numbers(right) == target)
                return Array(left + 1, right + 1)
            else if (numbers(left) + numbers(right) > target)
                right -= 1
            else
                left += 1

        Array()
    }
}
