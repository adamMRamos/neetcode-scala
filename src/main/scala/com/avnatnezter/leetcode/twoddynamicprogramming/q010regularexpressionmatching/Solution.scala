package com.avnatnezter.leetcode.twoddynamicprogramming.q010regularexpressionmatching

import scala.collection.mutable

class Solution {
    case class Node(c: Char, repeated: Boolean = false, next: Option[Node])
    def createStateTransitions(p: String): Option[Node] = {
        var prev: Option[Node] = None
        var i = p.length - 1
        while (i >= 0) {
            if (p(i) == '*') {
                prev = Some(Node(p(i-1), repeated = true, next = prev))
                i -= 1
            } else {
                prev = Some(Node(p(i), next = prev))
            }
            i -= 1
        }
        prev
    }

    def isMatch(s: String, p: String): Boolean = {
        val cache = mutable.Map[(Int, Option[Node]), Boolean]()

        def dfs(i: Int, node: Option[Node]): Boolean = {
            if (cache.get((i, node)).nonEmpty)
                cache(i, node)
            else if (i >= s.length && node.isEmpty)
                true
            else if (node.isEmpty)
                false
            else {
                val matches = i < s.length && node.exists(n => s(i) == n.c || n.c == '.')

                if (node.exists(_.repeated)) cache.put(
                    (i, node),
                    dfs(i, node.flatMap(_.next)) || // don't use star
                        matches && dfs(i + 1, node)       // use the star
                )
                else if (matches)
                    cache.put((i, node), dfs(i + 1, node.flatMap(_.next)))
                else
                    cache.put((i, node), false)

                cache((i, node))
            }
        }

        dfs(0, createStateTransitions(p))
    }
}
