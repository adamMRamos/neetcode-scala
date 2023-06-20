package arraysandhashing.q001twosum

import com.avnatnezter.leetcode.arraysandhashing.q001twosum.Solution
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class SolutionTest extends AnyFlatSpec with should.Matchers {
    "test1" should "work" in {
        Solution.twoSum(Array(2,7,11,15), 9)
    }

    "test2" should "work" in {
        Solution.twoSum(Array(3,2,4), 6)
    }

    "test3" should "work" in {
        Solution.twoSum(Array(3,3), 6)
    }
}
