package com.avnatnezter.leetcode.arraysandhashing.q242validanagram

import scala.collection.mutable

object Solution {
    def isAnagram(s: String, t: String): Boolean =
        isAnagramWithSorting(s, t)

    private def isAnagramWithGroupBy(s: String, t: String): Boolean = {
        val lettersInS = s.groupBy(s => s)
        val lettersInT = t.groupBy(s => s)
        (s.length == t.length) && lettersInS.forall { case (key, totals) =>
            lettersInT.get(key).exists(_.length == totals.length)
        }
    }

    private def isAnagramWithSingleHashMap(s: String, t: String): Boolean = {
        if (s.length != t.length) return false

        val counting = mutable.HashMap.empty[Char, Int]

        for (i <- s.indices) {
            val sc = s(i)
            val tc = t(i)

            if (!counting.contains(sc))
                counting.put(sc, 1)
            else
                counting.put(sc, counting(sc) + 1)

            if (!counting.contains(tc))
                counting.put(tc, -1)
            else
                counting.put(tc, counting(tc) - 1)
        }

        counting.forall(_._2 == 0)
    }

    private def isAnagramWithSorting(s: String, t: String): Boolean =
        s.sorted == t.sorted
}
