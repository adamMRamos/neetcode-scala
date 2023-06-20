package com.avnatnezter.leetcode.arraysandhashing.q001twosum

import scala.collection.mutable

object Solution {
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
        twoSumHashMap(nums, target)
    }

    private def twoSumHashMap(nums: Array[Int], target: Int): Array[Int] = {
        val partners = mutable.HashMap.empty[Int, mutable.HashSet[Int]]
        for (i <- nums.indices)
            partners.getOrElseUpdate(nums(i), mutable.HashSet.empty) += i

        for (i <- nums.indices) {
            val partner = target - nums(i)

            if (partner == nums(i) && partners.get(partner).exists(_.size > 1))
                return partners(partner).toArray
            else if (partner != nums(i) && partners.contains(partner))
                return i +: partners(partner).toArray
        }

        Array()
    }

    private def twoSumHashMapSinglePass(nums: Array[Int], target: Int): Array[Int] = {
        val partners = mutable.HashMap.empty[Int, Int]
        for (i <- nums.indices)
            if (partners.contains(target - nums(i)))
                return Array(i, partners(target - nums(i)))
            else
                partners.put(nums(i), i)

        Array()
    }
}
