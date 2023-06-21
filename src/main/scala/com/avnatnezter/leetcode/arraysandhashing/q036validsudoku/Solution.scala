package com.avnatnezter.leetcode.arraysandhashing.q036validsudoku

import scala.collection.mutable

object Solution {
    def isValidSudoku(board: Array[Array[Char]]): Boolean = {
        val bounds = 0 until 9

        for (i <- bounds) {
            val rows = mutable.HashSet.empty[Char]
            val columns = mutable.HashSet.empty[Char]
            val subGrid = mutable.HashSet.empty[Char]

            for (j <- bounds) {
                val row = board(i)(j)
                val col = board(j)(i)
                val grid = {
                    val xOffset = (i * 3) % 9
                    val yOffset = (i / 3) * 3
                    board(yOffset + j % 3)(xOffset + j / 3)
                }

                if (row != '.' && !rows.add(row)) return false
                if (col != '.' && !columns.add(col)) return false
                if (grid != '.' && !subGrid.add(grid)) return false
            }
        }

        true
    }
}
