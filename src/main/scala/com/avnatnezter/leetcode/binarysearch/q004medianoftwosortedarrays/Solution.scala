package com.avnatnezter.leetcode.binarysearch.q004medianoftwosortedarrays

class Solution {
    def findMedianSortedArrays(nums1: Array[Int], nums2: Array[Int]): Double = {
        val left = nums1
        val right = nums2

        val partitionSize = (left.length + right.length) / 2
        val leftPartition2 = right.length / 2
        val leftPartition1 = Math.abs(partitionSize - leftPartition2)

        println(s"partition = $partitionSize, left2 = $leftPartition2, left1 = $leftPartition1")
        0d
    }
}
