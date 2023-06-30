package com.avnatnezter.leetcode.twopointers.q011containerwithmostwater

object Solution2 {
    def maxArea(height: Array[Int]): Int = {
        def area(left: Int, right: Int): Int =
            Math.min(height(left), height(right)) * (right - left)

        var maxArea = 0
        var (left, right) = (0, height.length - 1)
        while (left < right) {
            maxArea = Math.max(area(left, right), maxArea)
            // if left pointer is smaller than right then shift left pointer
            // otherwise shift the right pointer
            if (height(left) < height(right)) left += 1
            else right -= 1
        }

        maxArea
    }
}
