package com.avnatnezter.leetcode.bitmanipulation.q007reverseinteger

class Solution {
    def reverse(x: Int): Int = {
        val upperBound = Int.MaxValue / 10
        val lastMaxDigit = Int.MaxValue % 10
        val lowerBound = Int.MinValue / 10
        val lastMinDigit = Int.MinValue % 10

        var i = x
        var reversed = 0

        def nextI: Int = i % 10
        def inbounds: Boolean =
            (reversed < upperBound || (reversed == upperBound && nextI < lastMaxDigit)) &&
                    (reversed > lowerBound || (reversed == lowerBound && nextI > lastMinDigit))

        while (i != 0 && inbounds) {
            reversed = reversed * 10 + nextI
            i = i / 10
        }

        if (i == 0) reversed
        else 0
    }
}
