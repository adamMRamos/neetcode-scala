package com.avnatnezter.leetcode.binarysearch.q074searcha2dmatrix

object Solution {
  def searchMatrix(matrix: Array[Array[Int]], target: Int): Boolean = {
    val (cols, rows) = (matrix.head.length, matrix.length)
    var (left, right) = (0, cols * rows - 1)

    def mid: Int = left + (right - left) / 2
    def x: Int = mid % cols
    def y: Int = mid / cols
    def value: Int = matrix(y)(x)

    while (left <= right) {
      if (value < target)
        left = mid + 1
      else if (value > target)
        right = mid - 1
      else
        return true
    }

    false
  }
}
