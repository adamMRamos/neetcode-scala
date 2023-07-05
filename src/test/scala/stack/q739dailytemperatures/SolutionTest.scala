package stack.q739dailytemperatures

import com.avnatnezter.leetcode.stack.q739dailytemperatures.Solution
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class SolutionTest extends AnyFlatSpec with should.Matchers {
    "test1" should "work" in {
        Solution.dailyTemperatures(Array(73,74,75,71,69,72,76,73)) should be(Array(1,1,4,2,1,1,0,0))
    }

    "test2" should "work" in {
        Solution.dailyTemperatures(Array(30,40,50,60)) should be(Array(1,1,1,0))
    }

    "test3" should "work" in {
        Solution.dailyTemperatures(Array(30,60,90)) should be(Array(1,1,0))
    }
}
