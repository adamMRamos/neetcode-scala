package com.avnatnezter.leetcode.twopointers.q125validpalindrome

object Solution {
    def isPalindrome(s: String): Boolean = {
        isPalindromeReverseString(s)
    }

    private def isPalindrome2Pointers(s: String): Boolean = {
        def notAlphaNumeric(c: Char): Boolean = !(c.isLetter || c.isDigit)

        var left = 0
        var right = s.length - 1
        while (left <= right && left < s.length) {
            while (left < right && notAlphaNumeric(s(left)))
                left += 1
            while (right > left && notAlphaNumeric(s(right)))
                right -= 1

            if (s(left).toLower != s(right).toLower)
                return false

            left += 1
            right -= 1
        }

        true
    }

    private def isPalindromeReverseString(s: String) = {
        val alphaNumeric = s.filter(c => c.isLetter || c.isDigit).map(_.toLower)

        alphaNumeric == alphaNumeric.reverse
    }
}
