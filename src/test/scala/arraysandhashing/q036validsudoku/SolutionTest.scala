package arraysandhashing.q036validsudoku

import com.avnatnezter.leetcode.arraysandhashing.q036validsudoku.Solution
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class SolutionTest extends AnyFlatSpec with should.Matchers {
    "test1" should "work" in {
        Solution.isValidSudoku(Array(
            //-(x,y)
            //-(0,0)------------------(0,3)---------------(0,6)---------//
            Array('5', '3', '.',/*|*/ '.', '7', '.',/*|*/ '.', '.', '.'),
            Array('6', '.', '.',/*|*/ '1', '9', '5',/*|*/ '.', '.', '.'),
            Array('.', '9', '8',/*|*/ '.', '.', '.',/*|*/ '.', '6', '.'),
            //-(1,0)------------------(1,3)---------------(1,6)---------//
            Array('8', '.', '.',/*|*/ '.', '6', '.',/*|*/ '.', '.', '3'),
            Array('4', '.', '.',/*|*/ '8', '.', '3',/*|*/ '.', '.', '1'),
            Array('7', '.', '.',/*|*/ '.', '2', '.',/*|*/ '.', '.', '6'),
            //-(2,0)------------------(2,3)---------------(2,6)---------//
            Array('.', '6', '.',/*|*/ '.', '.', '.',/*|*/ '2', '8', '.'),
            Array('.', '.', '.',/*|*/ '4', '1', '9',/*|*/ '.', '.', '5'),
            Array('.', '.', '.',/*|*/ '.', '8', '.',/*|*/ '.', '7', '9')
        )) shouldEqual true
    }

    "test2 invalid at square (1,3)" should "work" in {
        Solution.isValidSudoku(Array(
            //-(x,y)
            //-(0,0)------------------(0,3)---------------(0,6)---------//
            Array('5', '3', '.',/*|*/ '.', '7', '.',/*|*/ '.', '.', '.'),
            Array('6', '.', '.',/*|*/ '1', '9', '5',/*|*/ '.', '.', '.'),
            Array('.', '9', '8',/*|*/ '.', '.', '.',/*|*/ '.', '6', '.'),
            //-(1,0)------------------(1,3)---------------(1,6)---------//
            Array('8', '.', '.',/*|*/ '.', '6', '.',/*|*/ '.', '.', '3'),
            Array('4', '.', '.',/*|*/ '8', '.', '3',/*|*/ '.', '.', '1'),
            Array('7', '.', '.',/*|*/ '.', '2', '8',/*|*/ '.', '.', '6'),
            //-(2,0)------------------(2,3)---------------(2,6)---------//
            Array('.', '6', '.',/*|*/ '.', '.', '.',/*|*/ '2', '8', '.'),
            Array('.', '.', '.',/*|*/ '4', '1', '9',/*|*/ '.', '.', '5'),
            Array('.', '.', '.',/*|*/ '.', '8', '.',/*|*/ '.', '7', '9')
        )) shouldEqual false
    }
}
