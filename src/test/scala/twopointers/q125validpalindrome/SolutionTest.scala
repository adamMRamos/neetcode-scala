package twopointers.q125validpalindrome

import com.avnatnezter.leetcode.twopointers.q125validpalindrome.Solution
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class SolutionTest extends AnyFlatSpec with should.Matchers {
    "test1" should "work" in {
        Solution.isPalindrome("A man, a plan, a canal: Panama") shouldEqual true
    }

    "test2" should "work" in {
        Solution.isPalindrome("race a car") shouldEqual false
    }

    "test3" should "work" in {
        Solution.isPalindrome(" ") shouldEqual true
    }

    "test4" should "work" in {
        Solution.isPalindrome("0P") shouldEqual false
    }
}
