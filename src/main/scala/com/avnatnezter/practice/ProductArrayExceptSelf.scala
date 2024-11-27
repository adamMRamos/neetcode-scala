package com.avnatnezter.practice

import scala.collection.mutable

object ProductArrayExceptSelf {
  def main(cmd: Array[String]): Unit = {
    println(productExceptSelfWithoutDivision(Array(1, 2, 3, 4)).mkString("Array(", ", ", ")"))
  }

  def productExceptSelf(nums: Array[Int]): Array[Int] = {
    val product = nums.product
    nums.map(i => if (i > 0) product / i else 0)
  }

  private def productExceptSelfWithoutDivision(nums: Array[Int]): Array[Int] = {
    val prefixes = mutable.ArrayBuffer.fill[Int](nums.length)(0)
    for (i <- nums.indices)
      prefixes(i) =
        if (i > 0)
          nums(i) * prefixes(i-1)
        else
          nums(i) * 1

    val suffixes = mutable.ArrayBuffer.fill[Int](nums.length)(0)
    for (i <- nums.indices.reverse)
      suffixes(i) =
        if (i < nums.length - 1)
          nums(i) * suffixes(i + 1)
        else
          nums(i) * 1

    val answer = mutable.ArrayBuffer.fill[Int](nums.length)(0)
    for (i <- nums.indices)
      answer(i) =
        (if (i > 0) prefixes(i - 1) else 1) *
          (if (i < nums.length - 1) suffixes(i + 1) else 1)

    answer.toArray
  }
}
