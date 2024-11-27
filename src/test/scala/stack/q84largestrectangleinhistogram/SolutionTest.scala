package stack.q84largestrectangleinhistogram

import com.avnatnezter.leetcode.stack.q84largestrectangleinhistogram.Solution
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class SolutionTest extends AnyFlatSpec with should.Matchers {
  "test" should "work" in {
    Solution.largestRectangleArea(Array(2,1,5,6,2,3)) should be (10)
    Solution.largestRectangleArea(Array(2,4)) should be (4)
    Solution.largestRectangleArea(Array(5,4,1,2)) should be (8)
  }
}
