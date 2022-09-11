package binarysearch.q004medianoftwosortedarrays

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should
import com.avnatnezter.leetcode.binarysearch.q004medianoftwosortedarrays.Solution

class SolutionTest extends AnyFlatSpec with should.Matchers {
    "B is the median" should "should return B as the median = 2" in {
        val A = Array(1,3)
        val B = Array(2)

        new Solution().findMedianSortedArrays(A, B) should be (2)
    }

    "A is left partition B is right partition" should "should return avg of left and right (2,3) = 2.5" in {
        val A = Array(1,2)
        val B = Array(3,4)

        new Solution().findMedianSortedArrays(A, B) should be (2.5)
    }

    "A + B is even" should "take average of 2 right partition values (3,4) = 3.5" in {
        val A = Array(1,2,3,4,5,6,7,8)
        val B = Array(1,2,3,4)

        new Solution().findMedianSortedArrays(A, B) should be (3.5)
    }

    "A + B is odd" should "should return min of 2 right partition values (4, 4) = 4" in {
        val A = Array(1,2,3,4,5,6,7,8)
        val B = Array(1,2,3,4,5)

        new Solution().findMedianSortedArrays(A, B) should be (4)
    }

    "A + B is odd" should "should return min of 2 right partition values (4, 5) = 4" in {
        val A = Array(1,2,3,4,5,6,7,8)
        val B = Array(1,2,3,5,5)

        new Solution().findMedianSortedArrays(A, B) should be (4)
    }
}
