package com.avnatnezter.leetcode.twopointers.q011containerwithmostwater

class Solution {
    def area(y1: Int, y2: Int, x1: Int, x2: Int): Int = Math.min(y1, y2) * Math.abs(x1 - x2)

    def maxArea(height: Array[Int]): Int = {
        var max = 0
        var (l, r) = (0, height.length - 1)

        while (l < r) {
            val current = area(height(l), height(r), l, r)
            max = Math.max(current, max)

            if (height(l) < height(r)) l += 1
            else r -= 1
        }

        max
    }

    def maxAreaBruteForce(height: Array[Int]): Int = {
        val xs = for {
            (y1, x1) <- height.zipWithIndex
            (y2, x2) <- height.zipWithIndex
        } yield area(y1, y2, x1, x2)

        xs.max
    }
}
