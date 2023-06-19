package com.avnatnezter.leetcode.oneddynamicprogramming.q005longestpalindromicsubstring

class Solution {
    def longestPalindrome(s: String): String = {
        var largestL = 0
        var largestR = 0

        def palindromeWalk(initL: Int, initR: Int): Unit = {
            var (l, r) = (initL, initR)
            while (l >= 0 && r < s.length && s(l) == s(r)) {
                if (r - l > largestR - largestL) {
                    largestL = l
                    largestR = r
                }
                l -= 1
                r += 1
            }
        }

        for (i <- 0 until s.length) {
            // handle odd case
            palindromeWalk(i, i)
            // handle even case
            palindromeWalk(i, i + 1)
        }

        s.substring(largestL, largestR + 1)
    }
}
