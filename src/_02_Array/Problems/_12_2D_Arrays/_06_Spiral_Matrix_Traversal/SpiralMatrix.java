package _02_Array.Problems._12_2D_Arrays._06_Spiral_Matrix_Traversal;

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
