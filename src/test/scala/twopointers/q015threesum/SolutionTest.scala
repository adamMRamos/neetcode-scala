package twopointers.q015threesum

import com.avnatnezter.leetcode.twopointers.q015threesum.{Solution, Solution2}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class SolutionTest extends AnyFlatSpec with should.Matchers {
    "test" should "work" in {
        Solution2.threeSum(Array(-1,0,1,2,-1,-4)).toSet should be (
            Set(
                List(-1,-1, 2),
                List(-1, 0, 1)
            )
        )
    }

    "test2" should "work" in {
        Solution2.threeSum(Array(0,1,1)) should be (Nil)
    }

    "test3" should "work" in {
        Solution2.threeSum(Array(0,0,0)) should be (List(List(0,0,0)))
    }

    "test4" should "work" in {
        Solution2.threeSum(Array(1,-1,-1,0)) should be (List(List(-1,0,1)))
    }

    "test5" should "work" in {
        Solution2.threeSum(Array(-2,-2,0,0,2,2)) should be (List(List(-2,0,2)))
    }

    "test6" should "work" in {
        Solution2.threeSum(Array(3,0,-2,-1,1,2)).toSet should be (
            Set(
                List(-2,-1, 3),
                List(-2, 0, 2),
                List(-1, 0, 1),
            )
        )
    }
}
