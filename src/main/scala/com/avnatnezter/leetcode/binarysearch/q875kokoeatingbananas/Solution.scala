package com.avnatnezter.leetcode.binarysearch.q875kokoeatingbananas

object Solution {
  def minEatingSpeed(piles: Array[Int], h: Int): Int = {
    var left = 1
    var right = piles.max
    var rate = right

    while (left < right) {
      val speed = (left + right) / 2

      var time = 0d
      for (pile <- piles) {
        time += math.ceil(pile.toFloat / speed)
      }

      if (time <= h) {
        rate = math.min(speed, rate)
        right = speed - 1
      } else {
        left = speed + 1
      }
    }

    rate
  }
}
