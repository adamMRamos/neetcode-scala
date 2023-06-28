package stack.q020validparenthesis

import com.avnatnezter.leetcode.stack.q020validparenthesis.Solution
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class SolutionTest extends AnyFlatSpec with should.Matchers {
    "test1" should "work" in {
        Solution.isValid("()[]{}") shouldEqual true
    }

    "test2" should "work" in {
        Solution.isValid("()") shouldEqual true
    }

    "test3" should "work" in {
        Solution.isValid("(]") shouldEqual false
    }
}
