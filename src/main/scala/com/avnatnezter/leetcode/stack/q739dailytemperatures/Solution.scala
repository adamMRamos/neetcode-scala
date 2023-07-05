package com.avnatnezter.leetcode.stack.q739dailytemperatures

import scala.collection.mutable

object Solution {
    def dailyTemperatures(temperatures: Array[Int]): Array[Int] = {
        val days = mutable.ArrayBuffer.fill(temperatures.length)(0)
        val stack = mutable.Stack.empty[(Int, Int)]

        for (i <- temperatures.indices) {
            while (stack.nonEmpty && stack.top._1 < temperatures(i)) {
                val day = stack.pop()._2
                days(day) = i - day
            }
            stack push temperatures(i) -> i
        }

        days.toArray
    }
}
