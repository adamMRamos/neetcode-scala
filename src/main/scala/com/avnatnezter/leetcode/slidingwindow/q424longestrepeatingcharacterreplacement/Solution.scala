package com.avnatnezter.leetcode.slidingwindow.q424longestrepeatingcharacterreplacement

import scala.collection.mutable

object Solution {
  def characterReplacement(s: String, k: Int): Int = {
    val counts = mutable.HashMap.empty[Char, Int]
    for (c <- 'A' to 'Z')
      counts.put(c, 0)

    var result = 1
    var left = 0
    var right = 0
    def valid: Boolean =
      ((right - left + 1) - counts.maxBy(_._2)._2) <= k

    counts(s(right)) += 1
    while (right < s.length - 1) {
      right += 1
      counts(s(right)) += 1

      if (valid) {
        result = math.max(result, right - left + 1)
      } else {
        counts(s(left)) -= 1
        left += 1
      }
    }

    result
  }

  def characterReplacementImproved(s: String, k: Int): Int = {
    val counts = mutable.HashMap.empty[Char, Int]
    for (c <- 'A' to 'Z')
      counts.put(c, 0)

    var maxFrequency = 0
    var result = 0
    var left = 0
    for (right <- s.indices) {
      counts(s(right)) += 1
      maxFrequency = math.max(counts(s(right)), maxFrequency)

      // if substring is 'invalid'
      if ((right - left + 1) - maxFrequency > k) {
        counts(s(left)) -= 1
        left += 1
      } else {
        result = math.max(right - left + 1, result)
      }
    }

    result
  }
}
