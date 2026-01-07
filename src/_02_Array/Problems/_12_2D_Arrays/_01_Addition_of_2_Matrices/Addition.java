package _02_Array.Problems._12_2D_Arrays._01_Addition_of_2_Matrices;

// Add two matrices
// NOTE : To perform addition, both matrices must be of same size by rows and columns

public class Addition {
    public static void main(String[] args) {
        int[][] array1 = {
                {2,3,4,5},
                {1,2,3,4},
                {8,5,4,7}
        };
        int[][] array2 = {
                {6,2,4,8},
                {3,1,5,2},
                {8,7,1,5}
        };

        add(array1,3,4,array2,3,4);
    }

    public static void add(int[][] a, int r1, int c1, int[][] b, int r2, int c2){
        if (r1 != r2 || c1 != c2) {                                     // Check if both matrices have same size
            System.out.println("Wrong input, addition not possible");   // Print error message
            return;                                                     // Stop method execution
        }

        int[][] sum = new int[r1][c1];                                  // Create matrix to store sum

        for (int i = 0; i < sum.length; i++) {                          // Loop through rows
            for (int j = 0; j < sum[i].length; j++) {                   // Loop through columns
                sum[i][j] = a[i][j] + b[i][j];                          // Add corresponding elements
            }
        }

        for (int i = 0; i < sum.length; i++) {                          // Loop to print result matrix
            for (int j = 0; j < sum[i].length; j++) {                   // Loop through columns
                System.out.print(sum[i][j] + " ");                      // Print each sum value
            }
            System.out.println(); // Move to next row
        }
    }
}
