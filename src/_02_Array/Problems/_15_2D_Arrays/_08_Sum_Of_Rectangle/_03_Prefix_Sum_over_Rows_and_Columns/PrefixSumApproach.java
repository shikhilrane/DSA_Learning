package _02_Array.Problems._15_2D_Arrays._08_Sum_Of_Rectangle._03_Prefix_Sum_over_Rows_and_Columns;

// Sum of Rectangle using prefix sum over both rows and columns
// Prefix sum over columns and Rows both

public class PrefixSumApproach {
    public static void main(String[] args) {
        int[][] array = {
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25},
                {26,27,28,29,30}
        };

        int sum = findSum(array,1,2,2,3);
        System.out.println(sum);
    }

    public static int findSum(int[][] a, int l1, int l2, int r1, int r2){
        int ans = 0;                          // Variable to store final rectangle sum

        findPrefixSumMatrix(a);               // Convert matrix into 2D prefix sum matrix

        int sum = 0;                          // Sum till bottom-right corner (l2, r2)
        int up = 0;                           // Sum of area above the rectangle
        int left = 0;                         // Sum of area left of the rectangle
        int leftUp = 0;                       // Sum of overlapping area (top-left corner)

        sum = a[l2][r2];                      // Total sum from (0,0) to (l2,r2)

        if (l1 > 0) {                         // If rectangle does not start from first row
            up = a[l1-1][r2];                 // Take sum of area above rectangle
        }

        if (r1 > 0) {                         // If rectangle does not start from first column
            left = a[l2][r1-1];               // Take sum of area left of rectangle
        }

        if (l1 > 0 && r1 > 0) {               // If rectangle is not touching top or left edge
            leftUp = a[l1-1][r1-1];            // Add back overlapping area once
        }

        ans = sum - up - left + leftUp;       // Apply inclusion-exclusion formula

        return ans;                           // Return final rectangle sum
    }


    public static void findPrefixSumMatrix(int[][] a){
        int r = a.length;                     // Total number of rows
        int c = a[0].length;                  // Total number of columns

        // Calculate row-wise prefix sum
        for (int i = 0; i < r; i++) {         // Traverse each row
            for (int j = 1; j < c ; j++) {    // Start from second column
                a[i][j] = a[i][j] + a[i][j-1];// Add left cell value to current cell
            }
        }

        // Calculate column-wise prefix sum
        for (int i = 1; i < r; i++) {         // Start from second row
            for (int j = 0; j < c; j++) {     // Traverse each column
                a[i][j] = a[i][j] + a[i-1][j];// Add upper cell value to current cell
            }
        }
    }

}

/*
    What the Question is Asking (Problem Understanding):

    You are given:
        1. A 2D matrix (rows × columns)
        2. Four integers:
              l1, r1 → top-left corner of a rectangle
              l2, r2 → bottom-right corner of a rectangle

    Your task:
        - Find the sum of all elements that lie inside
          the rectangle formed by these two coordinates.

    Rectangle rules:
        - l1 ≤ l2  (top row comes before bottom row)
        - r1 ≤ r2  (left column comes before right column)
        - The rectangle includes both boundary rows and columns

    What “sum of rectangle” means:
        - Add every element inside the rectangle
        - Starting from row l1 to l2
        - And column r1 to r2

    Example:

        Matrix:
            11  12  13  14  15
            16  17  18  19  20
            21  22  23  24  25
            26  27  28  29  30

        Given:
            l1 = 1, r1 = 2
            l2 = 2, r2 = 3

        Rectangle covered:
            18  19
            23  24

        Output:
            18 + 19 + 23 + 24 = 84

    What the question expects:
        - NOT just brute-force nested loops
        - Use prefix sum technique for faster calculation
        - Especially useful when multiple rectangle queries are asked

    In short:
        The question asks you to efficiently calculate
        the sum of elements inside a sub-rectangle of a matrix.
*/


/*
    Logic for Rectangle Sum using 2D Prefix Sum (Optimal Approach):

    What the problem wants:
        - Given a matrix and a rectangle defined by:
              (l1, r1) → top-left
              (l2, r2) → bottom-right
        - Find the sum of all elements inside this rectangle

    Idea:
        - Convert the matrix into a 2D prefix sum matrix
        - Each cell a[i][j] stores sum of all elements
          from (0,0) to (i,j)

    Prefix Sum Formula:
        a[i][j] =
            original[i][j]
          + a[i-1][j]
          + a[i][j-1]
          - a[i-1][j-1]

    Rectangle Sum Formula:

        sum = a[l2][r2]
            - a[l1-1][r2]        (remove upper area)
            - a[l2][r1-1]        (remove left area)
            + a[l1-1][r1-1]      (add overlapping area back)

    Why we add leftUp:
        - The top-left area gets subtracted twice
        - So we add it once to balance

    Example:

        Prefix Matrix:
            11  23  36  50  65
            27  56  87  120 155
            48  99  153 210 270

        Rectangle (1,2) to (2,3):

        sum = a[2][3]
            - a[0][3]
            - a[2][1]
            + a[0][1]

    Time Complexity:
        Prefix creation: O(r * c)
        Query time: O(1)

    Space Complexity:
        O(1) (done in-place)

    In short:
        Pre-calculate full 2D prefix sum,
        then use inclusion-exclusion to get rectangle sum instantly.
*/
