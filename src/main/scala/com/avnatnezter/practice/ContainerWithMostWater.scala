package com.avnatnezter.practice

object ContainerWithMostWater {
  def main(args: Array[String]): Unit = {
    println(maxArea(Array(1,8,6,2,5,4,8,3,7)))
  }

  def maxArea(height: Array[Int]): Int = {
    var max = 0

    var (left, right) = (0, height.length - 1)

    while (left < right) {
      val minHeight = math.min(height(left), height(right))
      val distance = right - left
      max = math.max(max, minHeight * distance)

      if (height(left) > height(right))
        right -= 1
      else
        left += 1
    }

    max
  }
}
