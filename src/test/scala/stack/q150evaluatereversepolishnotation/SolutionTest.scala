package stack.q150evaluatereversepolishnotation

import com.avnatnezter.leetcode.stack.q150evaluatereversepolishnotation.Solution
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class SolutionTest extends AnyFlatSpec with should.Matchers {
    "test1" should "work" in {
        Solution.evalRPN(Array("2","1","+","3","*")) shouldEqual 9
    }

    "test2" should "work" in {
        Solution.evalRPN(Array("4","13","5","/","+")) shouldEqual 6
    }

    "test3" should "work" in {
        Solution.evalRPN(Array("10","6","9","3","+","-11","*","/","*","17","+","5","+")) shouldEqual 22
    }
}
