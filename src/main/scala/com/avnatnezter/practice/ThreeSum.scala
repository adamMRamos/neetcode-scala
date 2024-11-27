package com.avnatnezter.practice

import scala.collection.mutable

object ThreeSum {
  def main(args: Array[String]): Unit = {
    println(threeSum(Array(-1,0,1,2,-1,-4)))
  }

  def threeSum(nums: Array[Int]): List[List[Int]] = {
    val triplets = mutable.ListBuffer[List[Int]]()
    val sorted = nums.sorted

    for (i <- sorted.indices) {
      var (j,k) = (i + 1, sorted.length - 1)

      def sum(): Int = sorted(i) + sorted(j) + sorted(k)
      def triplet(): List[Int] = List(sorted(i), sorted(j), sorted(k))
      def equalsPrev(n: Int): Boolean = sorted(n) == sorted(n - 1)

      while (j < k && (i == 0 || !equalsPrev(i))) {
        if (sum < 0)
          j += 1
        else if (sum > 0)
          k -= 1
        else {
          triplets append triplet
          j += 1
          while (j < k && equalsPrev(j))
            j += 1
        }
      }
    }

    triplets.toList
  }
}
