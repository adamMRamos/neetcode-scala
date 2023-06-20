package arraysandhashing.q242validanagram

import com.avnatnezter.leetcode.arraysandhashing.q242validanagram.Solution
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class SolutionTest extends AnyFlatSpec with should.Matchers {
    "test1" should "work" in {
        Solution.isAnagram("anagram", "nagaram") shouldEqual true
    }

    "test2" should "work" in {
        Solution.isAnagram("rat", "car") shouldEqual false
    }

    "test3" should "work" in {
        Solution.isAnagram("a", "ab") shouldEqual false
    }
}
