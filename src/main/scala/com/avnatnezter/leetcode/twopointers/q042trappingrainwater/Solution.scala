package com.avnatnezter.leetcode.twopointers.q042trappingrainwater

import scala.collection.mutable

object Solution {
    def trap(height: Array[Int]): Int = {
        val maxLeft = mutable.ArrayBuffer.fill(height.length)(0)
        val maxRight = mutable.ArrayBuffer.fill(height.length)(0)

        for (i <- height.indices)
            if (i > 0)
                maxLeft(i) = Math.max(maxLeft(i - 1), height(i - 1))
        for (i <- height.indices.reverse)
            if (i < height.length - 1)
                maxRight(i) = Math.max(maxRight(i + 1), height(i + 1))

        var volume = 0
        for (i <- height.indices)
            volume += Math.max(Math.min(maxLeft(i), maxRight(i)) - height(i), 0)

        volume
    }
}
