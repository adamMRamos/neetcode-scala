package bitmanipulation.q007reverseinteger

import com.avnatnezter.leetcode.bitmanipulation.q007reverseinteger.Solution
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class SolutionTest extends AnyFlatSpec with should.Matchers {
    "123" should "be 321" in {
        new Solution().reverse(123) should be (321)
    }

    "-123" should "be -321" in {
        new Solution().reverse(-123) should be (-321)
    }

    "120" should "be 21" in {
        new Solution().reverse(120) should be (21)
    }

    "positive overflow" should "be 0" in {
        new Solution().reverse(1000000003) should be (0)
    }

    "positive overflow2 except value does not overflow" should "be 2147483641" in {
        new Solution().reverse(1463847412) should be (2147483641)
    }

    "positive overflow3" should "be 0" in {
        new Solution().reverse(1534236469) should be (0)
    }

    "negative underflow" should "be 0" in {
        new Solution().reverse(-1000000003) should be (0)
    }

    "negative underflow2 except value does not underflow" should "be -2143847412" in {
        new Solution().reverse(-2147483412) should be (-2143847412)
    }
}
