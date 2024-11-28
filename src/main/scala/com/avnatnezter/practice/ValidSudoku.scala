package com.avnatnezter.practice

import scala.collection.mutable

object ValidSudoku {
  def main(cmd: Array[String]): Unit = {
    // true
    println(isValidSudoku(Array(
      //-(x,y)
      //-(0,0)------------------(0,3)---------------(0,6)---------//
      Array('5', '3', '.', /*|*/ '.', '7', '.', /*|*/ '.', '.', '.'),
      Array('6', '.', '.', /*|*/ '1', '9', '5', /*|*/ '.', '.', '.'),
      Array('.', '9', '8', /*|*/ '.', '.', '.', /*|*/ '.', '6', '.'),
      //-(1,0)------------------(1,3)---------------(1,6)---------//
      Array('8', '.', '.', /*|*/ '.', '6', '.', /*|*/ '.', '.', '3'),
      Array('4', '.', '.', /*|*/ '8', '.', '3', /*|*/ '.', '.', '1'),
      Array('7', '.', '.', /*|*/ '.', '2', '.', /*|*/ '.', '.', '6'),
      //-(2,0)------------------(2,3)---------------(2,6)---------//
      Array('.', '6', '.', /*|*/ '.', '.', '.', /*|*/ '2', '8', '.'),
      Array('.', '.', '.', /*|*/ '4', '1', '9', /*|*/ '.', '.', '5'),
      Array('.', '.', '.', /*|*/ '.', '8', '.', /*|*/ '.', '7', '9')
    )))

    // false
    println(isValidSudoku(Array(
      //-(x,y)
      //-(0,0)------------------(0,3)---------------(0,6)---------//
      Array('5', '3', '.', /*|*/ '.', '7', '.', /*|*/ '.', '.', '.'),
      Array('6', '.', '.', /*|*/ '1', '9', '5', /*|*/ '.', '.', '.'),
      Array('.', '9', '8', /*|*/ '.', '.', '.', /*|*/ '.', '6', '.'),
      //-(1,0)------------------(1,3)---------------(1,6)---------//
      Array('8', '.', '.', /*|*/ '.', '6', '.', /*|*/ '.', '.', '3'),
      Array('4', '.', '.', /*|*/ '8', '.', '3', /*|*/ '.', '.', '1'),
      Array('7', '.', '.', /*|*/ '.', '2', '8', /*|*/ '.', '.', '6'),
      //-(2,0)------------------(2,3)---------------(2,6)---------//
      Array('.', '6', '.', /*|*/ '.', '.', '.', /*|*/ '2', '8', '.'),
      Array('.', '.', '.', /*|*/ '4', '1', '9', /*|*/ '.', '.', '5'),
      Array('.', '.', '.', /*|*/ '.', '8', '.', /*|*/ '.', '7', '9')
    )))
  }

  def isValidSudoku(board: Array[Array[Char]]): Boolean = {
    def empty = mutable.HashSet.empty[Char]

    val rows = Array.fill(9)(empty)
    val columns = Array.fill(9)(empty)
    val squares = Array(
      Array(empty, empty, empty),
      Array(empty, empty, empty),
      Array(empty, empty, empty),
    )

    for (row <- board.indices) {
      for (col <- board(row).indices) {
        def canAdd(dimension: mutable.HashSet[Char]): Boolean =
          board(row)(col) == '.' || dimension.add(board(row)(col))

        if (!canAdd(rows(row))) return false
        if (!canAdd(columns(col))) return false
        if (!canAdd(squares(row/3)(col/3))) return false
      }
    }

    true
  }
}
