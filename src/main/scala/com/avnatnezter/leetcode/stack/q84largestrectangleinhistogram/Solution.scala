package com.avnatnezter.leetcode.stack.q84largestrectangleinhistogram

import scala.collection.mutable

object Solution {
  def largestRectangleArea(heights: Array[Int]): Int = {
    val bars = mutable.Stack.empty[(Int, Int)]
    var maxArea = 0

    def canExtendBehind(i: Int): Boolean =
      heights(i) >= bars.top._2

    for (i <- heights.indices) {
      if (bars.isEmpty || canExtendBehind(i)) {
        bars push (i -> heights(i))
      }
      // otherwise start popping
      else {
        var start = i
        while (bars.nonEmpty && !canExtendBehind(i)) {
          val (prevIndex, prevHeight) = bars.pop()
          maxArea = math.max(prevHeight * (i - prevIndex), maxArea)
          start = prevIndex
        }
        bars.push(start -> heights(i))
      }
    }

    // try and find max area from remaining bars on the stack
    for ((index, height) <- bars) {
      maxArea = math.max(height * (heights.length - index), maxArea)
    }

    maxArea
  }

  // rewritten to be closer to neetcode answer
  def largestRectangleAreaAlt(heights: Array[Int]): Int = {
    val bars = mutable.Stack.empty[(Int, Int)]
    var maxArea = 0

    def cantExtendBehind(i: Int): Boolean =
      bars.top._2 > heights(i)

    for (i <- heights.indices) {
      var start = i
      while (bars.nonEmpty && cantExtendBehind(i)) {
        val (prevIndex, prevHeight) = bars.pop()
        maxArea = math.max(prevHeight * (i - prevIndex), maxArea)
        start = prevIndex
      }
      bars.push((start, heights(i)))
    }

    // try and find max area from remaining bars on the stack
    for ((index, height) <- bars) {
      maxArea = math.max(height * (heights.length - index), maxArea)
    }

    maxArea
  }
}
