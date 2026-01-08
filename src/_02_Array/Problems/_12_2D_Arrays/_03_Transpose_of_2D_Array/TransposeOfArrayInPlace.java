package _02_Array.Problems._12_2D_Arrays._03_Transpose_of_2D_Array;

// Write s program to display Transpose of 2D array without creating new array
// NOTE : Inplace transpose can be only happen in square matrix

public class TransposeOfArrayInPlace {
    public static void main(String[] args) {
        int[][] array = {
                {2,3,4,5},
                {1,2,3,4},
                {8,5,4,7},
                {5,2,9,4}
        };

        findTranspose(array,4,4);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void findTranspose(int[][] a, int r, int c){
        for (int i = 0; i < a.length; i++) {            // Loop through rows
            for (int j = i + 1; j < a.length; j++) {    // Loop through columns above diagonal
            swap(a, i, j);                              // Swap a[i][j] with a[j][i]
            }
        }
    }

    public static void swap(int[][] a, int i, int j){
        int temp = a[i][j];     // Store value of a[i][j]
        a[i][j] = a[j][i];      // Put value of a[j][i] into a[i][j]
        a[j][i] = temp;         // Put stored value into a[j][i]
    }
}

/*
    What the Question Wants (Problem Understanding):

    The question says:
        "Write a program to display Transpose of 2D array
         without creating new array"

    This means:
        - You are given a 2D array (matrix)
        - You must convert rows into columns
        - And columns into rows
        - WITHOUT using any extra matrix

    Important condition given in the question:
        - In-place transpose is possible ONLY
          when the matrix is square
        - Number of rows must be equal to number of columns

    What you are expected to do:
        1. Do NOT create a new matrix
        2. Modify the original matrix itself
        3. Swap elements across the main diagonal
        4. Avoid touching diagonal elements
        5. Ensure no element is swapped twice

    What the question does NOT want:
        - No extra 2D array
        - No copying into another matrix
        - No transpose for rectangular matrices

    Example understanding:

        Original Matrix (4 x 4):
            1  2  3  4
            5  6  7  8
            9 10 11 12
            13 14 15 16

        Transposed Matrix (in-place):
            1  5  9  13
            2  6 10  14
            3  7 11  15
            4  8 12  16

    In short:
        Modify the same square matrix by swapping
        elements across the diagonal, without
        using any extra space.
*/


/*
    Logic for In-place Transpose of a Square Matrix:

              c (= r)
                V
        {a00, a01, a02, a03},
    a = {a10, a11, a12, a13},
        {a20, a21, a22, a23},
        {a30, a31, a32, a33}

    Matrix size:
        r x c  →  4 x 4 (square matrix)

    Important rule:
        - In-place transpose is possible ONLY for square matrices
        - r must be equal to c

    Idea:
        - Elements across the main diagonal are swapped
        - Element at position (i, j) is swapped with (j, i)
        - Diagonal elements (i == j) are not touched

    Why inner loop starts from j = i + 1:
        - To avoid swapping diagonal elements
        - To avoid double swapping the same pair

    Swapping example:
        a01 ↔ a10
        a02 ↔ a20
        a03 ↔ a30
        a12 ↔ a21
        a13 ↔ a31
        a23 ↔ a32

    Formula used:
        swap(a[i][j], a[j][i])

    In short:
        Swap elements across the diagonal to convert rows into columns
        without using any extra space.
*/