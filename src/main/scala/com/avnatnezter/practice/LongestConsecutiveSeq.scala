package com.avnatnezter.practice

object LongestConsecutiveSeq {
  def main(args: Array[String]): Unit = {
    println(longestConsecutive(Array()))
  }

  private def longestConsecutive(nums: Array[Int]): Int = {
    val set = nums.toSet

    var max = 0
    for (n <- nums) {
      if (!set.contains(n - 1)) {

        var localMax = 0
        var next = n

        do {
          localMax += 1
          next += 1
        }
        while (set.contains(next))

        max = math.max(localMax, max)
      }
    }

    max
  }
}
