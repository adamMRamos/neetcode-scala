package com.avnatnezter.leetcode.binarysearch.q074searcha2dmatrix

object Solution {
  def searchMatrix(matrix: Array[Array[Int]], target: Int): Boolean = {
    val cols = matrix.head.length
    val rows = matrix.length
    var (left, right) = (0, cols * rows)

    def mid: Int = (right - left) / 2
    def x: Int = mid % cols
    def y: Int = mid / cols
    def value: Int = matrix(x)(y)

    while (left < right) {
      if (value == target)
        return true
      else if (value > target)
        left = mid + 1
      else
        right = mid - 1
    }

    false
  }
}
