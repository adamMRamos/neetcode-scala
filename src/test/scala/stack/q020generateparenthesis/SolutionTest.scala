package stack.q020generateparenthesis

import com.avnatnezter.leetcode.stack.q022generateparenthesis.Solution
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class SolutionTest extends AnyFlatSpec with should.Matchers {
    "test1" should "work" in {
        Solution.generateParenthesis(3) should be (List(
            "((()))",
            "(()())",
            "(())()",
            "()(())",
            "()()()"
        ))
    }

    "test2" should "work" in {
        Solution.generateParenthesis(1) should be (List(
            "()"
        ))
    }
}
