package com.avnatnezter.leetcode.arraysandhashing.q347topkfrequentelements

import scala.collection.mutable

object Solution {
    def topKFrequent(nums: Array[Int], k: Int): Array[Int] = {
        topKFrequentHashMap(nums, k)
    }

    private def topKFrequentGroupBy(nums: Array[Int], k: Int): Array[Int] = nums
            .groupBy(n => n)
            .toList
            .sortWith((a, b) => a._2.length > b._2.length)
            .map(_._1)
            .take(k)
            .toArray

    private def topKFrequentHashMap(nums: Array[Int], k: Int): Array[Int] = {
        val totals = mutable.HashMap.empty[Int, Int]

        for (n <- nums)
            totals.put(n, 1 + totals.getOrElse(n, 0))

        totals.toList.sortWith((a, b) => a._2 > b._2).take(k).map(_._1).toArray
    }

    private def topKFrequentBucketSort(nums: Array[Int], k: Int): Array[Int] = {
        val totals = mutable.HashMap.empty[Int, Int]
        val frequencies = List.fill(nums.length + 1)(mutable.ArrayBuffer.empty[Int])

        for (n <- nums)
            totals.put(n, 1 + totals.getOrElse(n, 0))
        for ((n, t) <- totals)
            frequencies(t) += n

        val ans = mutable.ArrayBuffer.empty[Int]
        var i = frequencies.length - 1
        while (i > 0) {
            for (n <- frequencies(i)) {
                ans += n
                if (ans.length == k)
                    return ans.toArray
            }
            i -= 1
        }

        null
    }
}
