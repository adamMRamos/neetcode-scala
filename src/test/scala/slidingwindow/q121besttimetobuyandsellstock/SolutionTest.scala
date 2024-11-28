package slidingwindow.q121besttimetobuyandsellstock

import com.avnatnezter.leetcode.slidingwindow.q121besttimetobuyandsellstock.Solution
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class SolutionTest extends AnyFlatSpec with should.Matchers  {
  "maxProfit" should "be 5" in {
    Solution.maxProfit(Array(7, 1, 5, 3, 6, 4)) should be (5)
  }

  "maxProfit" should "be 0" in {
    Solution.maxProfit(Array(7, 6, 4, 3, 1)) should be (0)
  }

  "maxProfit2Pointers" should "be 5" in {
    Solution.maxProfit2Pointers(Array(7, 1, 5, 3, 6, 4)) should be (5)
  }

  "maxProfit2Pointers" should "be 0" in {
    Solution.maxProfit2Pointers(Array(7, 6, 4, 3, 1)) should be (0)
  }
}
