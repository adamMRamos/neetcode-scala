package backtracking.q017lettercombinationsofaphonenumber

import com.avnatnezter.leetcode.backtracking.q017lettercombinationsofaphonenumber.Solution
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class SolutionTest extends AnyFlatSpec with should.Matchers {
    "test1" should "work" in {
        Solution.letterCombinations("23") should be (
            List("ad","ae","af","bd","be","bf","cd","ce","cf")
        )
    }

    "test2" should "work" in {
        Solution.letterCombinations("") should be (Nil)
    }

    "test3" should "work" in {
        Solution.letterCombinations("2") should be (List("a","b","c"))
    }
}
