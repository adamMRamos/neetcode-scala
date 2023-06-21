package arraysandhashing.q238productofarrayexceptself

import com.avnatnezter.leetcode.arraysandhashing.q238productofarrayexceptself.Solution
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class SolutionTest extends AnyFlatSpec with should.Matchers {
    "test1" should "work" in {
        Solution.productExceptSelf(Array(1,2,3,4)) shouldEqual Array(24,12,8,6)
    }

    "test2" should "work" in {
        Solution.productExceptSelf(Array(-1,1,0,-3,3)) shouldEqual Array(0,0,9,0,0)
    }
}
