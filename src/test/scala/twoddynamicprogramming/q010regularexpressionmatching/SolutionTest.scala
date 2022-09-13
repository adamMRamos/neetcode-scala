package twoddynamicprogramming.q010regularexpressionmatching

import com.avnatnezter.leetcode.twoddynamicprogramming.q010regularexpressionmatching.Solution
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class SolutionTest extends AnyFlatSpec with should.Matchers {
    "bbbba but pattern is .*a*a" should "be true" in {
        new Solution().isMatch("bbbba", ".*a*a") should be (true)
    }

    "a but pattern is ab*" should "be true" in {
        new Solution().isMatch("a", "ab*") should be (true)
    }

    "aa but pattern is a" should "be false" in {
        new Solution().isMatch("aa", "a") should be (false)
    }

    "aa and pattern is zero or more a's" should "be true" in {
        new Solution().isMatch("aa", "a*") should be (true)
    }

    "ab and pattern is zero or more characters" should "be true" in {
        new Solution().isMatch("ab", ".*") should be (true)
    }

    "aab and pattern is c*a*b" should "be true" in {
        new Solution().isMatch("aab", "c*a*b") should be (true)
    }

    "aaaaaxyzb and pattern is a.*b" should "be true" in {
        new Solution().isMatch("aaaaaxyzb", "a.*b") should be (true)
    }

    "aaaaaxyz and pattern is a.*b" should "be false" in {
        new Solution().isMatch("aaaaaxyz", "a.*b") should be (false)
    }

    "mississippi and pattern is mis*is*ip*." should "be true" in {
        new Solution().isMatch("mississippi", "mis*is*ip*.") should be (true)
    }

    "mississippi and pattern is mis*is*p*." should "be false" in {
        new Solution().isMatch("mississippi", "mis*is*p*.") should be (false)
    }
}
