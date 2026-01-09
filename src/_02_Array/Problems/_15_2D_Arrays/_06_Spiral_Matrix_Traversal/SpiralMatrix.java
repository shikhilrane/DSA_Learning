package _02_Array.Problems._15_2D_Arrays._06_Spiral_Matrix_Traversal;

// Print Spiral of given matrix

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] array = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        spiral(array,3,4);
    }
    public static void spiral(int[][] a, int r, int c){
        int topRow = 0;
        int bottomRow = r-1;
        int leftCol = 0;
        int rightCol = c-1;

        while (topRow <= bottomRow && leftCol <= rightCol){     // Loop until rows and columns are valid
            // topRow -> leftCol to rightCol
            for (int j = leftCol; j <= rightCol; j++) {         // Move left to right on top row
                System.out.print(a[topRow][j] + " ");           // Print element
            }
            System.out.println();
            topRow++;                                           // Move top boundary down

            // rightCol -> topRow to bottomRow
            for (int i = topRow; i <= bottomRow; i++) {         // Move top to bottom on right column
                System.out.print(a[i][rightCol] + " ");         // Print element
            }
            System.out.println();
            rightCol--;                                         // Move right boundary left

            // bottomRow -> rightCol to leftCol
            if (topRow <= bottomRow) {                          // Check to avoid re-printing same row
                for (int j = rightCol; j >= leftCol; j--) {     // Move right to left on bottom row
                    System.out.print(a[bottomRow][j] + " ");    // Print element
                }
                System.out.println();
                bottomRow--;                                    // Move bottom boundary up
            }

            // leftCol -> bottomRow to topRow
            if (leftCol <= rightCol) {                          // Check to avoid re-printing same column
                for (int i = bottomRow; i >= topRow; i--) {     // Move bottom to top on left column
                    System.out.print(a[i][leftCol] + " ");      // Print element
                }
                System.out.println();
                leftCol++;                                      // Move left boundary right
            }
        }
    }
}

/*
    What the Question Wants (Problem Understanding):

    The question says:
        "Print Spiral of given matrix"

    This means:
        - You are given a 2D array (matrix)
        - You have to print all elements of the matrix
          in spiral order
        - Spiral order means moving around the matrix
          in a circular manner

    What is expected from you:
        1. Start printing from the top-left corner
        2. Print elements in this order:
               → top row (left to right)
               → right column (top to bottom)
               → bottom row (right to left)
               → left column (bottom to top)
        3. After completing one round,
           move inside the matrix
        4. Repeat until all elements are printed

    Important points mentioned/assumed:
        - The matrix can be rectangular or square
        - No extra array is required
        - Only printing is needed, not storing

    What the question does NOT want:
        - No sorting
        - No modification of matrix values
        - No creation of another matrix

    Example understanding:

        Input Matrix:
            1   2   3   4
            5   6   7   8
            9  10  11  12

        Spiral Output:
            1  2  3  4  8  12  11  10  9  5  6  7

    In short:
        Print all elements of the matrix
        by moving in spiral order.
*/


/*
    Logic for Spiral Matrix Traversal (2D Array):

    Given a matrix of size r x c.

    Initial boundaries are defined as:
        topRow    = 0
        bottomRow = r - 1
        leftCol   = 0
        rightCol  = c - 1

    The idea is to traverse the matrix in spiral order
    by moving in four directions and shrinking boundaries
    after each traversal.

    Steps followed in each spiral round:

    1. topRow -> leftCol to rightCol
        Print the top row from left to right
        Then increment topRow

    2. rightCol -> topRow to bottomRow
        Print the right column from top to bottom
        Then decrement rightCol

    3. bottomRow -> rightCol to leftCol
        Print the bottom row from right to left
        Then decrement bottomRow
        (Only if topRow <= bottomRow)

    4. leftCol -> bottomRow to topRow
        Print the left column from bottom to top
        Then increment leftCol
        (Only if leftCol <= rightCol)

    These four steps complete one spiral layer.

    The loop continues until all elements
    of the matrix are printed.

    Example:
        Input Matrix:
            1   2   3   4
            5   6   7   8
            9  10  11  12

        Output:
            1  2  3  4
            8 12
            11 10 9
            5  6  7

    Important points:
        - Works for both square and rectangular matrices
        - No extra space is used
        - Time Complexity: O(r * c)
        - Space Complexity: O(1)

    In short:
        Traverse the matrix in spiral order
        by shrinking the boundaries after each round.
*/
