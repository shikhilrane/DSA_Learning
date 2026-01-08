package _02_Array.Problems._12_2D_Arrays._03_Transpose_of_2D_Array;

// Write s program to display Transpose of 2D array

public class TransposeOfArray {
    public static void main(String[] args) {
        int[][] array = {
                {2,3,4,5},
                {1,2,3,4},
                {8,5,4,7}
        };

        int[][] transposeOfArray = findTranspose(array,3,4);
        for (int i = 0; i < transposeOfArray.length; i++) {
            for (int j = 0; j < transposeOfArray[i].length; j++) {
                System.out.print(transposeOfArray[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] findTranspose(int[][] a, int r, int c){
        int[][] ans = new int[c][r];    // Created new as array with same number of columns as rows of existing array and vise-versa
        for (int i = 0; i < c; i++) {   // Iterate over column of existing array
            for (int j = 0; j < r; j++) {   // Iterate over row of existing array
                ans[i][j] = a[j][i];    // save column of existing array and row in row of new array and row in array
            }
        }
        return ans;
    }
}

/*
    What the Question Wants (Problem Understanding):

    The question says:
        "Write a program to display Transpose of 2D array"

    This means:
        - You are given a 2D array (matrix)
        - You need to convert its rows into columns
        - And columns into rows
        - The original matrix should NOT be modified

    What is expected from you:
        1. Create a new matrix
        2. Size of new matrix should be:
               number of columns x number of rows
        3. Copy elements in such a way that:
               element at position (i, j)
               goes to position (j, i)
        4. Print or return the transposed matrix

    Important clarification:
        - This is NOT in-place transpose
        - Extra space (new matrix) IS allowed
        - Works for both square and rectangular matrices

    Example understanding:

        Original Matrix (3 x 4):
            1  2  3  4
            5  6  7  8
            9 10 11 12

        Transposed Matrix (4 x 3):
            1  5  9
            2  6 10
            3  7 11
            4  8 12

    In short:
        Create a new matrix where
        rows become columns and
        columns become rows.
*/


/*
    /*
    Logic for Transpose of a 2D Array (Using Extra Array):

                c
                V
        {a00, a01, a02, a03},
    a = {a10, a11, a12, a13},   <= r
        {a20, a21, a22, a23}

    Original matrix size:
        r x c  →  3 x 4

    Rule for transpose:
        - Rows become columns
        - Columns become rows
        - Element at position (i, j) moves to (j, i)

    Transposed matrix size:
        c x r  →  4 x 3

                       r
                       V
    transpose = {a00, a10, a20},
                {a01, a11, a21},
                {a02, a12, a22},
                {a03, a13, a23}

    Formula used:
        transpose[i][j] = original[j][i]

    In short:
        Each column of the original matrix becomes a row
        in the transposed matrix.
*/