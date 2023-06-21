package com.avnatnezter.leetcode.arraysandhashing.q238productofarrayexceptself

import scala.collection.mutable

object Solution {
    def productExceptSelf(nums: Array[Int]): Array[Int] = {
        productExceptSelfConstantSpace(nums)
    }

    private def productExceptSelfLinearSpace(nums: Array[Int]): Array[Int] = {
        val prefixes = mutable.ArrayBuffer.fill[Int](nums.length)(0)
        for (i <- nums.indices)
            if (i == 0)
                prefixes(i) = 1 * nums(i)
            else
                prefixes(i) = prefixes(i - 1) * nums(i)

        val postfixes = mutable.ArrayBuffer.fill[Int](nums.length)(0)
        for (i <- nums.indices.reverse)
            if (i == nums.length - 1)
                postfixes(i) = 1 * nums(i)
            else
                postfixes(i) = postfixes(i + 1) * nums(i)

        val answer = mutable.ArrayBuffer.fill[Int](nums.length)(0)
        for (i <- nums.indices) {
            val prefix = if (i == 0) 1 else prefixes(i - 1)
            val postfix = if (i == nums.length - 1) 1 else postfixes(i + 1)
            answer(i) = prefix * postfix
        }

        answer.toArray
    }

    /**
     * This solution is absurdly slow on Leetcode. Memory is decent at about 70%
     * but speed is as low as 5% of submissions.
     */
    private def productExceptSelfLinearSpaceImmutable(nums: Array[Int]): Array[Int] = {
        val pres = nums.zipWithIndex.foldLeft(Array(1)) { case (prefix, (n, i)) =>
            prefix :+ n * prefix(i)
        }
        val posts = nums.reverse.zipWithIndex.foldLeft(Array(1)) { case (postfix, (n, i)) =>
            postfix :+ n * postfix(i)
        }

        for ((pre, post) <- pres.take(nums.length) zip posts.reverse.tail)
            yield pre * post
    }


    private def productExceptSelfConstantSpace(nums: Array[Int]): Array[Int] = {
        val answer = mutable.ArrayBuffer.fill[Int](nums.length)(1)
        for (i <- nums.indices)
            if (i < nums.length - 1)
                answer(i + 1) = answer(i) * nums(i)

        var prevPostfix = 1
        for (i <- nums.indices.reverse) {
            answer(i) = answer(i) * prevPostfix
            prevPostfix = nums(i) * prevPostfix
        }

        answer.toArray
    }
}
