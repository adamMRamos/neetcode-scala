# q36 Valid Sudoku
It's important to remember that for this solution we only need to determine if the
puzzle is valid and not if it is solvable.
We can determine validity by checking 3 dimensions of the puzzle. Rows, columns, 
and the sub-grids. We can write this as a single loop but this solution uses a 
double loop. Another thing to note is neetcode's solution checks one cell at a time
and then maps that cell's location to a dimension. This is accomplished by having
hashmaps of hashsets where the keys of the maps are the "dimension" the cell belongs
to. In this solution we will just create 3 new hashsets (row, col, sub-grid) every 
time we increment our outer loop. Our inner loop will be used to traverse values
that belong to each hashset. So for example while outer loop is at 0 we will traverse
the 0th row, 0th col, and 0th sub-grid. We do this by translating I and J, where I
and J are the current indices of our outer and inner loop, to corresponding coordinates
based on the dimension. For a row we use I and J as is, for a col we flip it to J 
and I, and for a sub-grid we translate I and J to sub-grid coordinates.
The runtime complexity for this solution is O(9^2) and space complexity is O(9^3)
since we create 3 hashsets and a cell will belong to all 3 hashsets.