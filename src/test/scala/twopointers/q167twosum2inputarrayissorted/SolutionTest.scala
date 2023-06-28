package twopointers.q167twosum2inputarrayissorted

import com.avnatnezter.leetcode.twopointers.q167twosum2inputarrayissorted.Solution
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class SolutionTest extends AnyFlatSpec with should.Matchers {
    "test1" should "work" in {
        Solution.twoSum(Array(2,7,11,15), 9) shouldEqual Array(1,2)
    }

    "test2" should "work" in {
        Solution.twoSum(Array(2,7,11,15), 18) shouldEqual Array(2,3)
    }

    "test3" should "work" in {
        Solution.twoSum(Array(2,3,4), 6) shouldEqual Array(1,3)
    }

    "test4" should "work" in {
        Solution.twoSum(Array(-1,0), -1) shouldEqual Array(1,2)
    }
}
