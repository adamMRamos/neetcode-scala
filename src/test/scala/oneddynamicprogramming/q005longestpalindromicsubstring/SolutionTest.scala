package oneddynamicprogramming.q005longestpalindromicsubstring

import com.avnatnezter.leetcode.oneddynamicprogramming.q005longestpalindromicsubstring.Solution
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class SolutionTest extends AnyFlatSpec with should.Matchers {
    "input string is odd" should "return babad" in {
        new Solution().longestPalindrome("babad") should be ("bab")
    }

    "input string is even" should "return cbbd" in {
        new Solution().longestPalindrome("cbbd") should be ("bb")
    }
}
