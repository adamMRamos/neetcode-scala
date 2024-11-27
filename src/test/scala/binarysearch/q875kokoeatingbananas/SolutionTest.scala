package binarysearch.q875kokoeatingbananas

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should
import com.avnatnezter.leetcode.binarysearch.q875kokoeatingbananas.Solution

class SolutionTest extends AnyFlatSpec with should.Matchers {
  "test" should "work" in {
    Solution.minEatingSpeed(Array(1,4,3,2), 9) should be (2)
    Solution.minEatingSpeed(Array(3,6,7,11), 8) should be (4)
  }
}
