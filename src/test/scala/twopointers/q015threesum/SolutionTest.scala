package twopointers.q015threesum

import com.avnatnezter.leetcode.twopointers.q015threesum.Solution
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class SolutionTest extends AnyFlatSpec with should.Matchers {
    "test" should "work" in {
        Solution.threeSum(Array(-1,0,1,2,-1,-4)) should be (
            List(
                List(-1,-1,2),
                List(-1,0,1)
            )
        )
    }

    "tes2" should "work" in {
        Solution.threeSum(Array(0,1,1)) should be (Nil)
    }

    "test3" should "work" in {
        Solution.threeSum(Array(0,0,0)) should be (List(List(0,0,0)))
    }
}
