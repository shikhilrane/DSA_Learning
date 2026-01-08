package _02_Array.Problems._12_2D_Arrays._07_Create_Spiral_Matrix_from_n;

// Given a positive integer n, generate an n*n matrix filled with elements from 1 to n^2 in spiral order

public class SpiralMatrixByN {
    public static void main(String[] args) {
        int n = 4;

        int[][] matrix = spiralByN(n);

        for (int[] i : matrix){
            for (int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static int[][] spiralByN(int n){

        int topRow = 0;          // Starting row index
        int bottomRow = n - 1;   // Ending row index
        int leftCol = 0;         // Starting column index
        int rightCol = n - 1;    // Ending column index

        int[][] matrix = new int[n][n]; // Result n x n matrix

        int current = 1;         // Number to be filled in matrix

        while (topRow <= bottomRow && leftCol <= rightCol){ // Loop until boundaries overlap

            // topRow -> leftCol to rightCol
            for (int j = leftCol; j <= rightCol; j++) {     // Fill top row left to right
                matrix[topRow][j] = current;                // Place current number
                current++;                                  // Move to next number
            }
            topRow++;                                       // Move top boundary down

            // rightCol -> topRow to bottomRow
            for (int i = topRow; i <= bottomRow; i++) {     // Fill right column top to bottom
                matrix[i][rightCol] = current;              // Place current number
                current++;                                  // Move to next number
            }
            rightCol--;                                     // Move right boundary left

            // bottomRow -> rightCol to leftCol
            if (topRow <= bottomRow) {                      // Check to avoid overlap
                for (int j = rightCol; j >= leftCol; j--) { // Fill bottom row right to left
                    matrix[bottomRow][j] = current;         // Place current number
                    current++;                              // Move to next number
                }
                bottomRow--;                                // Move bottom boundary up
            }

            // leftCol -> bottomRow to topRow
            if (leftCol <= rightCol) {                      // Check to avoid overlap
                for (int i = bottomRow; i >= topRow; i--) { // Fill left column bottom to top
                    matrix[i][leftCol] = current;           // Place current number
                    current++;                              // Move to next number
                }
                leftCol++;                                  // Move left boundary right
            }
        }

        return matrix;                                      // Return spiral-filled matrix
    }

}

/*
    What the Question Wants (Problem Understanding):

    The question says:
        "Given a positive integer n, generate an n*n matrix
         filled with elements from 1 to n² in spiral order"

    This means:
        - You are given a single integer n
        - You must create a square matrix of size n x n
        - You need to fill numbers starting from 1 up to n²
        - Numbers must be placed in spiral order

    What is expected from you:
        1. Create a new 2D array of size n x n
        2. Start filling numbers from 1
        3. Fill the matrix in spiral direction:
               → top row
               → right column
               → bottom row
               → left column
        4. Shrink boundaries after each spiral round
        5. Continue until all numbers from 1 to n² are filled
        6. Return the generated matrix

    Important conditions:
        - Matrix must be square
        - Spiral filling should be clockwise
        - All numbers must be used exactly once

    What the question does NOT want:
        - No printing-only solution
        - No traversal of an existing matrix
        - No random filling of values

    Example understanding:

        If n = 3, output should be:
            1  2  3
            8  9  4
            7  6  5

    In short:
        Create a new n x n matrix and fill it
        with numbers from 1 to n² in spiral order.
*/


/*
    Logic for Creating Spiral Matrix using n (In-place filling):

    Given n = 4

    We need to create a matrix of size n x n
    and fill numbers from 1 to n² in spiral order.

    Initial boundaries:
        topRow = 0
        bottomRow = n - 1
        leftCol = 0
        rightCol = n - 1

    Current number starts from 1.

    Steps followed in every round:

    1. topRow -> leftCol to rightCol
        Fill top row from left to right
        Increase topRow after filling

    2. rightCol -> topRow to bottomRow
        Fill right column from top to bottom
        Decrease rightCol after filling

    3. bottomRow -> rightCol to leftCol
        Fill bottom row from right to left
        Decrease bottomRow after filling

    4. leftCol -> bottomRow to topRow
        Fill left column from bottom to top
        Increase leftCol after filling

    These four steps complete one spiral layer.

    The boundaries are moved inward after each layer,
    and the process continues until all numbers from
    1 to n² are filled.

    Example for n = 4:

        1   2   3   4
        12  13  14  5
        11  16  15  6
        10  9   8   7

    Important points:
        - Works only for square matrix (n x n)
        - Numbers are filled in spiral order
        - Time Complexity: O(n²)
        - Space Complexity: O(n²) (result matrix)

    In short:
        Keep filling numbers in spiral direction
        while shrinking the boundaries.
*/
