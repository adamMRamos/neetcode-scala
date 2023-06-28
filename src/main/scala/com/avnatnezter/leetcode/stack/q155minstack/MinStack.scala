package com.avnatnezter.leetcode.stack.q155minstack

import scala.collection.mutable

class MinStack() {
    val stack = mutable.Stack.empty[(Int, Int)]

    def push(value: Int) {
        stack.push(value -> 0)
    }

    def pop() {

    }

    def top(): Int = {
        ???
    }

    def getMin(): Int = {
        ???
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = new MinStack()
 * obj.push(`val`)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */
