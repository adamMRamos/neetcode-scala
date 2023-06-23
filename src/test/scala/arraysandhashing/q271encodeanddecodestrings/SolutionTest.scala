package arraysandhashing.q271encodeanddecodestrings

import com.avnatnezter.leetcode.arraysandhashing.q271encodeanddecodestrings.Solution
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class SolutionTest extends AnyFlatSpec with should.Matchers {
    "test1" should "work" in {
        val message = List("i", "love", "to", "4#code")
        Solution.decode(Solution.encode(message)) shouldEqual message
    }
}
