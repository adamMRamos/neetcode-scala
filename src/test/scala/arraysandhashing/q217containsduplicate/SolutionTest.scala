package arraysandhashing.q217containsduplicate

import com.avnatnezter.leetcode.arraysandhashing.q217containsduplicate.Solution
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class SolutionTest extends AnyFlatSpec with should.Matchers {
    "test1" should "work" in {
        Solution.containsDuplicate(Array(1,2,3,1))
    }

    "test2" should "work" in {
        Solution.containsDuplicate(Array(1,2,3,4))
    }

    "test3" should "work" in {
        Solution.containsDuplicate(Array(1,1,1,3,3,4,3,2,4,2))
    }
}
