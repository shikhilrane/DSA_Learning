package _02_Array.Problems._12_2D_Arrays._04_Rotate_2D_Array;

// Given a square matrix, turn it by 90 degrees in a clockwise direction without using any extra space

public class RotateArray {
    public static void main(String[] args) {
        int[][] array = {
                {2,3,4,5},
                {1,2,3,4},
                {8,5,4,7},
                {5,2,9,4}
        };

        rotate(array,4);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotate(int[][] a, int n){

        transpose(a, n, n); // First convert matrix into its transpose

        for (int i = 0; i < a.length; i++) { // Go through each row
            reverse(a[i]); // Reverse each row to get 90° clockwise rotation
        }
    }

    public static void reverse(int[] a){
        int i = 0;                      // Pointer at start of row
        int j = a.length - 1;           // Pointer at end of row

        while (i < j) {                 // Reverse until pointers meet
            swapForReverse(a, i, j);    // Swap values
            i++;                        // Move left pointer forward
            j--;                        // Move right pointer backward
        }
    }

    public static void swapForReverse(int[] a, int i, int j){

        int temp = a[i];    // Store left value
        a[i] = a[j];        // Put right value on left
        a[j] = temp;        // Put stored value on right
    }

    public static void transpose(int[][] a, int r, int c){

        for (int i = 0; i < a.length; i++) {            // Loop through rows
            for (int j = i + 1; j < a.length; j++) {    // Loop through columns above diagonal
                swapForTranspose(a, i, j);              // Swap elements to transpose
            }
        }
    }

    public static void swapForTranspose(int[][] a, int i, int j){
        int temp = a[i][j];     // Store value of a[i][j]
        a[i][j] = a[j][i];      // Put value of a[j][i] into a[i][j]
        a[j][i] = temp;         // Put stored value into a[j][i]
    }
}

/*
    What the Question Wants (Problem Understanding):

    The question says:
        "Given a square matrix, turn it by 90 degrees
         in a clockwise direction without using any extra space"

    This means:
        - You are given a square 2D array (n x n)
        - You must rotate it 90° clockwise
        - You are NOT allowed to create any extra matrix

    Important conditions:
        - Matrix must be square (rows == columns)
        - Rotation must be done in-place
        - Only element swapping is allowed

    What you are expected to do:
        1. Do NOT create a new 2D array
        2. Modify the original matrix itself
        3. Use a logical transformation to rotate elements
        4. Follow an efficient approach (not brute force)

    Accepted approach:
        - First transpose the matrix
        - Then reverse each row

    What the question does NOT want:
        - No extra matrix
        - No copying into another array
        - No brute-force rotation element by element

    Example understanding:

        Original Matrix:
            1  2  3
            4  5  6
            7  8  9

        After 90° clockwise rotation:
            7  4  1
            8  5  2
            9  6  3

    In short:
        Rotate the same square matrix 90° clockwise
        without using any extra space.
*/


/*
    Logic for Rotating a Square Matrix by 90° Clockwise (In-place):

    Given matrix (n x n):

            {a00, a01, a02, a03},
        A = {a10, a11, a12, a13},
            {a20, a21, a22, a23},
            {a30, a31, a32, a33}

    Step 1: Transpose the matrix
        - Convert rows into columns
        - Element at (i, j) moves to (j, i)

        After transpose:

            {a00, a10, a20, a30},
            {a01, a11, a21, a31},
            {a02, a12, a22, a32},
            {a03, a13, a23, a33}

    Step 2: Reverse each row
        - Reverse elements in every row

        After reversing rows:

            {a30, a20, a10, a00},
            {a31, a21, a11, a01},
            {a32, a22, a12, a02},
            {a33, a23, a13, a03}

    Final result:
        Matrix rotated 90° clockwise.

    Important points:
        - Works only for square matrices (n x n)
        - No extra space is used (in-place)
        - Time complexity: O(n²)
        - Space complexity: O(1)

    In short:
        Transpose the matrix, then reverse each row.
*/