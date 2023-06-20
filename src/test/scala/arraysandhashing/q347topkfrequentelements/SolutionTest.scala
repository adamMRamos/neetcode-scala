package arraysandhashing.q347topkfrequentelements

import com.avnatnezter.leetcode.arraysandhashing.q347topkfrequentelements.Solution
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class SolutionTest extends AnyFlatSpec with should.Matchers {
    "test1" should "work" in {
        Solution.topKFrequent(Array(1,1,1,2,2,3), 2) shouldEqual Array(1,2)
    }

    "test2" should "work" in {
        Solution.topKFrequent(Array(1), 1) shouldEqual Array(1)
    }

    "test3" should "work" in {
        Solution.topKFrequent(Array(1,2), 2) shouldEqual Array(1,2)
    }
}
