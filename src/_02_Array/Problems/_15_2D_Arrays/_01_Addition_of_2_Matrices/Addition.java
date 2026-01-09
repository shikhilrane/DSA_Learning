package _02_Array.Problems._15_2D_Arrays._01_Addition_of_2_Matrices;

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

/*
    What the Question Wants (Problem Understanding):

    The question says:
        "Add two matrices"

    This means:
        - You are given two 2D arrays (matrices)
        - You need to add them element by element

    Conditions mentioned in the question:
        - Both matrices must have the same number of rows
        - Both matrices must have the same number of columns
        - If sizes are different, addition is NOT possible

    What you are expected to do:
        1. Check if both matrices have equal dimensions
        2. Create a new matrix to store the result
        3. Add elements at the same position from both matrices
        4. Print the resultant matrix

    What is NOT required:
        - No sorting
        - No transpose
        - No multiplication
        - No change in matrix structure

    Example understanding:

        Matrix A:
            1  2
            3  4

        Matrix B:
            5  6
            7  8

        Result Matrix:
            6   8
            10 12

        Because:
            1+5, 2+6
            3+7, 4+8

    In short:
        Add elements that are at the SAME position
        in both matrices to form a new matrix.
*/


/*
    Logic for Matrix Addition:

             c1                              c2
              V                               V
        {a00, a01, a02},               {b00, b01, b02},
    a = {a10, a11, a12},   <= r1   b = {b10, b11, b12},   <= r2
        {a20, a21, a22}            {b20, b21, b22}

    Rule:
        - Number of rows must be same → r1 == r2
        - Number of columns must be same → c1 == c2
        - Only then matrix addition is possible

    Resultant matrix size:
        r1 x c1

            {r00, r01, r02}
    sum =   {r10, r11, r12}
            {r20, r21, r22}

    Calculation:
        r00 = a00 + b00
        r01 = a01 + b01
        r02 = a02 + b02

        r10 = a10 + b10
        r11 = a11 + b11
        r12 = a12 + b12

        r20 = a20 + b20
        r21 = a21 + b21
        r22 = a22 + b22

    In short:
        Every element of the first matrix is added with the
        element at the same position in the second matrix.
*/