package com.avnatnezter.leetcode.stack.q155minstack

import scala.collection.mutable

class MinStack() {
    val stack: mutable.Stack[(Int, Int)] = mutable.Stack.empty[(Int, Int)]

    def push(value: Int) {
        stack.push(
            value -> (if (stack.isEmpty) value else Math.min(value, getMin()))
        )
    }

    def pop() {
        stack.pop()
    }

    def top(): Int = {
        stack.head._1
    }

    def getMin(): Int = {
        stack.head._2
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
