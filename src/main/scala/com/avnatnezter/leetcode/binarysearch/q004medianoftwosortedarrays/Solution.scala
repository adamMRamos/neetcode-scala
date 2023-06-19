package com.avnatnezter.leetcode.binarysearch.q004medianoftwosortedarrays

class Solution {
    def findMedianSortedArrays(nums1: Array[Int], nums2: Array[Int]): Double = {
        val (a, b) = if (nums2.length > nums1.length) (nums1, nums2) else (nums2, nums1)
        val total = a.length + b.length
        val half = total / 2

        var leftPointer = 0
        var rightPointer = a.length - 1

        def leftIndexA: Int = Math.min(leftPointer + rightPointer, (leftPointer + rightPointer) / 2)
        def leftIndexB: Int = half - leftIndexA - 2

        def leftValueA: Int = if (leftIndexA >= 0) a(leftIndexA) else Int.MinValue
        def rightValueA: Int = if (leftIndexA + 1 < a.length) a(leftIndexA + 1) else Int.MaxValue
        def leftValueB: Int = if (leftIndexB >= 0) b(leftIndexB) else Int.MinValue
        def rightValueB: Int = if (leftIndexB + 1 < b.length) b(leftIndexB + 1) else Int.MaxValue

        def moveRightPointer: Boolean = leftValueA > rightValueB
        def moveLeftPointer: Boolean = leftValueB > rightValueA

        while (moveRightPointer || moveLeftPointer)
            if (moveRightPointer)
                rightPointer = leftIndexA - 1
            else
                leftPointer = leftIndexA + 1

        if (total % 2 == 0)
            (Math.max(leftValueA, leftValueB) + Math.min(rightValueA, rightValueB)) / 2d
        else
            Math.min(rightValueA, rightValueB)
    }
}