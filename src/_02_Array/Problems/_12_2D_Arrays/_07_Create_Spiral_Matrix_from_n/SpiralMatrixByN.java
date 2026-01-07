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
