package com.avnatnezter.practice

import scala.collection.mutable

object TrappingRainWater {
  def main(args: Array[String]): Unit = {
    println(trapTwoPointers(Array(0,1,0,2,1,0,1,3,2,1,2,1)))
  }

  def trap(height: Array[Int]): Int = {
    val maxLeft = mutable.ArrayBuffer.fill(height.length)(0)
    val maxRight = mutable.ArrayBuffer.fill(height.length)(0)

    for (i <- 1 until height.length)
      maxLeft(i) = math.max(maxLeft(i - 1), height(i - 1))

    for (i <- (0 until height.length - 1).reverse)
      maxRight(i) = math.max(maxRight(i + 1), height(i + 1))

    var volume = 0
    for (i <- height.indices)
      volume += math.max(math.min(maxLeft(i), maxRight(i)) - height(i),0)

    volume
  }

  def trapTwoPointers(height: Array[Int]): Int = {
    var volume = 0
    var left = 0
    var right = height.length - 1
    var maxLeft = height(left)
    var maxRight = height(right)

    while (left < right) {
      if (maxLeft < maxRight) {
        volume += maxLeft - height(left)
        left += 1
        maxLeft = math.max(maxLeft, height(left))
      } else {
        volume += maxRight - height(right)
        right -= 1
        maxRight = math.max(maxRight, height(right))
      }
    }

    volume
  }
}
