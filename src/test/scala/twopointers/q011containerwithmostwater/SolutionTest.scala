package twopointers.q011containerwithmostwater

import com.avnatnezter.leetcode.twopointers.q011containerwithmostwater.{Solution, Solution2}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class SolutionTest extends AnyFlatSpec with should.Matchers {
    "test" should "work" in {
        Solution2.maxArea(Array(1,8,6,2,5,4,8,3,7)) should be (49)
    }

    "test2" should "work" in {
        Solution2.maxArea(Array(1,1)) should be (1)
    }

    "test3" should "work" in {
        Solution2.maxArea(Array(2,3,4,5,18,17,6)) should be (17)
    }
}
