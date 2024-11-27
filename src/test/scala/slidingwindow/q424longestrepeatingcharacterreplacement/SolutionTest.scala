package slidingwindow.q424longestrepeatingcharacterreplacement

import com.avnatnezter.leetcode.slidingwindow.q424longestrepeatingcharacterreplacement.Solution
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class SolutionTest extends AnyFlatSpec with should.Matchers {
  "test" should "work" in {
    Solution.characterReplacement("ABAB", 2) should be (4)
    Solution.characterReplacement("ABAB", 0) should be (1)
    Solution.characterReplacement("AABABBA", 1) should be (4)

    Solution.characterReplacementImproved("ABAB", 2) should be (4)
    Solution.characterReplacementImproved("ABAB", 0) should be (1)
    Solution.characterReplacementImproved("AABABBA", 1) should be (4)
  }
}
