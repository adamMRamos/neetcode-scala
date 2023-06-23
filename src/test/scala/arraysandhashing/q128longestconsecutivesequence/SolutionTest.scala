package arraysandhashing.q128longestconsecutivesequence

import com.avnatnezter.leetcode.arraysandhashing.q128longestconsecutivesequence.Solution
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class SolutionTest extends AnyFlatSpec with should.Matchers {
    "test1" should "work" in {
        Solution.longestConsecutive(Array()) shouldEqual 0
    }

    "test2" should "work" in {
        Solution.longestConsecutive(Array(100,4,200,1,3,2)) shouldEqual 4
    }

    "test3" should "work" in {
        Solution.longestConsecutive(Array(0,3,7,2,5,8,4,6,0,1)) shouldEqual 9
    }
}
