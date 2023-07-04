package twopointers.q042trappingrainwater

import com.avnatnezter.leetcode.twopointers.q042trappingrainwater.Solution
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class SolutionTest extends AnyFlatSpec with should.Matchers {
    "test1" should "work" in {
        Solution.trap(Array(0,1,0,2,1,0,1,3,2,1,2,1)) should be(6)
    }

    "test2" should "work" in {
        Solution.trap(Array(4,2,0,3,2,5)) should be(9)
    }

    "test3" should "work" in {
        Solution.trap(Array(4,2,3)) should be(1)
    }

    "test4" should "work" in {
        Solution.trap(Array(4,2,0,3,2,5)) should be(9)
    }
}
