package stack.q853carfleet

import com.avnatnezter.leetcode.stack.q853carfleet.Solution
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class SolutionTest extends AnyFlatSpec with should.Matchers {
    "test1" should "work" in {
        Solution.carFleet(12, Array(10,8,0,5,3), Array(2,4,1,1,3)) should be(3)
    }

    "test2" should "work" in {
        Solution.carFleet(10, Array(3), Array(3)) should be(1)
    }

    "test3" should "work" in {
        Solution.carFleet(100, Array(0,2,4), Array(4,2,1)) should be(1)
    }
}
