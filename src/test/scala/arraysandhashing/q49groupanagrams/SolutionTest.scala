package arraysandhashing.q49groupanagrams

import com.avnatnezter.leetcode.arraysandhashing.q49groupanagrams.Solution
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class SolutionTest extends AnyFlatSpec with should.Matchers {
    "test1" should "work" in {
        Solution.groupAnagrams(Array("eat","tea","tan","ate","nat","bat"))
                .map(_.sorted)
                .sortBy(_.size) shouldEqual List(
            List("bat"),
            List("nat","tan"),
            List("ate","eat","tea")
        )
    }

    "test2" should "work" in {
        Solution.groupAnagrams(Array("")) shouldEqual List(
            List(""),
        )
    }

    "test3" should "work" in {
        Solution.groupAnagrams(Array("a")) shouldEqual List(
            List("a"),
        )
    }
}
