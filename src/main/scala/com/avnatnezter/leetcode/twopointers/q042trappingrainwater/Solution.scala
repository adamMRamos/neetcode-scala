package com.avnatnezter.leetcode.twopointers.q042trappingrainwater

object Solution {
    def trap(height: Array[Int]): Int = {
        var left = 0
        var right = 1
        var volumeOffset = 0

        def area: Int =
            Math.min(height(left), height(right)) * ((right - left) - 1) - volumeOffset

        var volume = 0
        while (left < height.length) {
            if (right < height.length && height(left) <= height(right)) {
                volume += area
                left = right
                right += 1
                volumeOffset = 0
            } else if (right >= height.length) {
                left += 1
                right = left + 1
                volumeOffset = 0
            } else {
                volumeOffset += height(right)
                right += 1
            }
        }

        volume
    }
}
