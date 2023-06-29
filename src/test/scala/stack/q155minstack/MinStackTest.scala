package stack.q155minstack

import com.avnatnezter.leetcode.stack.q155minstack.MinStack
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class MinStackTest extends AnyFlatSpec with should.Matchers {
    "test1" should "work" in {
        val minStack = new MinStack()
        minStack.push(-2)
        minStack.push(0)
        minStack.push(-3)
        minStack.getMin() shouldEqual -3
        minStack.pop()
        minStack.top() shouldEqual 0
        minStack.getMin() shouldEqual -2
    }
}
