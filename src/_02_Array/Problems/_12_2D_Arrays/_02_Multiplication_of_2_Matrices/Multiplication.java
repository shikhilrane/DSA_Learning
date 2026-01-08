package _02_Array.Problems._12_2D_Arrays._02_Multiplication_of_2_Matrices;

// Multiplication two matrices
// NOTE : To perform Multiplication, Number of columns of first matrix (c1) must be equal to number of rows of second matrix(r2). And the resultant matrix will be of r1*c2
//        Like in matrix of r1*c1 (3x4) and r2*c2 (4x2)  must be equal when c1==r2 and resultant matrix would be of r1*c2 (3x2). Resultant matrix = 3x2

public class Multiplication {
    public static void main(String[] args) {
        int[][] array1 = {
                {2,3,4,5},
                {1,2,3,4},
                {8,5,4,7}       // r1 = 3 and c1 = 4
        };
        int[][] array2 = {
                {6,2},
                {4,5},
                {8,7},
                {9,3}          // r2 = 4 and c2 = 2
        };

        multiply(array1, 3,4, array2,4, 2);
    }

    public static void multiply(int[][]a, int r1, int c1, int[][] b, int r2, int c2){
        if (c1 != r2) {                                                     // Check if matrix multiplication is possible
            System.out.println("Wrong input, multiplication not possible"); // Print error message
            return;                                                         // Stop execution
        }

        int[][] mul = new int[r1][c2];                              // As per dimension of resultant matrix

        for (int i = 0; i < r1; i++) {                              // Iterating over rows of first matrix
            for (int j = 0; j < c2; j++) {                          // Iterating over columns of second matrix
                for (int k = 0; k < c1 ; k++) {                     // Used for c1 (num of cols of first matrix),
                    mul[i][j] = mul[i][j] + (a[i][k] * b[k][j]);    // It will keep adding the multiplications from all indices
                }
            }
        }

        for (int i = 0; i < mul.length; i++) {
            for (int j = 0; j < mul[i].length; j++) {
                System.out.print(mul[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
    What the Question Wants (Problem Understanding):

    The question says:
        "Multiply two matrices"

    This means:
        - You are given two matrices (2D arrays)
        - You need to multiply them using matrix multiplication rules
        - This is NOT element-wise multiplication

    Condition given by the question:
        - Number of columns of first matrix (c1)
          must be equal to number of rows of second matrix (r2)
        - If c1 != r2, multiplication is NOT possible

    What you are expected to do:
        1. Check whether matrix multiplication is possible (c1 == r2)
        2. Create a resultant matrix of size:
               r1 x c2
        3. For each cell (i, j) of result:
               multiply i-th row of first matrix
               with j-th column of second matrix
               and add all products
        4. Store the sum in result[i][j]
        5. Print the resultant matrix

    What the question does NOT want:
        - No element-wise multiplication
        - No transpose
        - No sorting
        - No shortcut formula

    Example understanding:

        First matrix (3 x 4)
        Second matrix (4 x 2)

        Since c1 == r2 (4 == 4),
        multiplication is possible.

        Resultant matrix size:
            3 x 2

    In short:
        Multiply rows of the first matrix
        with columns of the second matrix
        to form the result.
*/


/*
               c1                              c2
                V                               V
      {a00, a01, a02, a03},                 {b00, b01},
  a = {a10, a11, a12, a13},  <= r1      b = {b10, b11},   <= r2
      {a20, a21, a22, a23}                  {b20, b21},
                                            {b30, b31},

       As we know,  c1 == r2. Then and only then multiplication is possible
       Here c1 = 4 and r2 = 4, so multiplication is possible

                           r00 r01
        Resultant matrix = r10 r11
                           r20 r21

        r00 = (a00 * b00) + (a01 * b10) + (a02 * b20) + (a03 * b30)             r01 = (a00 * b01) + (a01 * b11) + (a02 * b21) + (a03 * b31)
        r10 = (a10 * b00) + (a11 * b10) + (a12 * b20) + (a13 * b30)             r11 = (a10 * b01) + (a11 * b11) + (a12 * b21) + (a13 * b31)
        r11 = (a20 * b00) + (a21 * b10) + (a22 * b20) + (a23 * b30)             r11 = (a20 * b01) + (a21 * b11) + (a22 * b21) + (a23 * b31)

        In short, Every row's element of first matrix will get multiplied with every column of second matrix
*/