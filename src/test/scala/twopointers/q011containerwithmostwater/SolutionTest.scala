package twopointers.q011containerwithmostwater

import com.avnatnezter.leetcode.twopointers.q011containerwithmostwater.Solution
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class SolutionTest extends AnyFlatSpec with should.Matchers {
    "test" should "work" in {
        new Solution().maxArea(Array(1,8,6,2,5,4,8,3,7)) should be (49)
    }

    "test2" should "work" in {
        new Solution().maxArea(Array(1,1)) should be (1)
    }
}
