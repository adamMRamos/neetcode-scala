package binarysearch.q004medianoftwosortedarrays

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should
import com.avnatnezter.leetcode.binarysearch.q004medianoftwosortedarrays.Solution

class SolutionTest extends AnyFlatSpec with should.Matchers {
    "test" should "pass" in {
        new Solution().findMedianSortedArrays(Array(1,2,3,4,5,6,7,9), Array(5,6,7)) should be (2d)
    }
}
