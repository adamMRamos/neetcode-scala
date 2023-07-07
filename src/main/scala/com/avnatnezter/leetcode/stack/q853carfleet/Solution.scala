package com.avnatnezter.leetcode.stack.q853carfleet

import scala.collection.mutable

object Solution {
    def carFleet(target: Int, position: Array[Int], speed: Array[Int]): Int = {
        def timeToDestination(speed: (Int, Int)): Float = (target - speed._1).toFloat / speed._2.toFloat

        val stack = mutable.Stack.empty[(Int, Int)]
        val speeds = (position zip speed).sortBy(_._1).reverse
        stack push speeds.head
        for (current <- speeds.tail)
            if (timeToDestination(stack.top) < timeToDestination(current))
                stack push current

        stack.size
    }
}
