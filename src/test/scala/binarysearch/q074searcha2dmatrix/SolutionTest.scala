package binarysearch.q074searcha2dmatrix

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should
import com.avnatnezter.leetcode.binarysearch.q074searcha2dmatrix.Solution

class SolutionTest extends AnyFlatSpec with should.Matchers {
  "searchMatrix target is 3" should "be true" in {
    val matrix = Array(
      Array( 1, 3, 5, 7),
      Array(10,11,16,20),
      Array(23,30,34,60),
    )
    val target = 3

    Solution.searchMatrix(matrix, target) shouldBe true
  }

  "searchMatrix target is 13 but is not there" should "be false" in {
    val matrix = Array(
      Array( 1, 3, 5, 7),
      Array(10,11,16,20),
      Array(23,30,34,60),
    )
    val target = 13

    Solution.searchMatrix(matrix, target) shouldBe false
  }
}
