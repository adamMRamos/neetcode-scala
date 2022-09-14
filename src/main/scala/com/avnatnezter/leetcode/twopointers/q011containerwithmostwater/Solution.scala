package com.avnatnezter.leetcode.twopointers.q011containerwithmostwater

class Solution {
    def maxArea(height: Array[Int]): Int = {
        ???
    }
    
    def maxAreaBruteForce(height: Array[Int]): Int = {
        val xs = for {
            (y1, x1) <- height.zipWithIndex
            (y2, x2) <- height.zipWithIndex
        } yield Math.min(y1, y2) * Math.abs(x1 - x2)

        xs.max
    }
}
