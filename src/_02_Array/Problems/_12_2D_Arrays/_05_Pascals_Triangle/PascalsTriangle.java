package _02_Array.Problems._12_2D_Arrays._05_Pascals_Triangle;

// Given an integer n, return the first n rows of Pascal's Triangle.
// In Pascal's Triangle, each number is the sum of two numbers directly above it

public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 10;

        int[][] pt = pascal(n);

        for (int i = 0; i < pt.length; i++) {
            for (int j = 0; j < pt[i].length; j++) {
                System.out.print(pt[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] pascal(int n){
        int[][] ans = new int[n][];         // Create a 2D jagged array for Pascal's Triangle (Not provided no. of columns because it is unknown)
        for (int i = 0; i < n; i++) {       // Loop through each row
            ans[i] = new int[i + 1];        // Each row has (i + 1) elements
            ans[i][0] = ans[i][i] = 1;      // First and last element of each row is always 1
            for (int j = 1; j < i; j++) {   // Fill middle elements of the row
                ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1]; // Sum of two elements above
            }
        }
        return ans;                 // Return Pascal's Triangle
    }
}

/*
    What the Question Wants (Problem Understanding):

    The question says:
        "Given an integer n, return the first n rows
         of Pascal's Triangle"

    This means:
        - You are given a single integer n
        - You need to generate a triangle pattern
          having exactly n rows
        - Each row should follow Pascal’s Triangle rules

    What is expected from you:
        1. Create a 2D array to store the triangle
        2. The number of rows should be n
        3. The i-th row should contain (i + 1) elements
        4. First and last element of every row must be 1
        5. Middle elements should be calculated using:
               value = element above + element above-left
        6. Return the generated triangle

    What the question does NOT want:
        - No printing logic is required in the method
        - No fixed-size 2D array (jagged array is expected)
        - No mathematical shortcut formulas

    Example understanding:

        If n = 5, output should be:
            1
            1 1
            1 2 1
            1 3 3 1
            1 4 6 4 1

    In short:
        Build Pascal’s Triangle row by row using
        values from the previous row.
*/


/*
    Properties of Pascal's triangle :
    1. p[i][j] = p[i-1][j] + p[i-1][j-1]
    2. In every row, first and last element = 1
    3. Jagged Array = ith row has (i+1) columns
*/

/*
    Logic for Pascal's Triangle:

    Pascal’s Triangle is built row by row using these rules:

    1. The number of rows is n.
    2. The i-th row contains exactly (i + 1) elements.
    3. The first and last element of every row is always 1.
    4. Every middle element is formed using:
           value = element above + element above-left

    Example (n = 5):

                1
              1   1
            1   2   1
          1   3   3   1
        1   4   6   4   1

    Index representation:

        ans[0] = {1}

        ans[1] = {1, 1}

        ans[2] = {1, 2, 1}
            ans[2][1] = ans[1][1] + ans[1][0]

        ans[3] = {1, 3, 3, 1}
            ans[3][1] = ans[2][1] + ans[2][0]
            ans[3][2] = ans[2][2] + ans[2][1]

    Properties:
        - Uses a jagged array (each row has different length)
        - Time complexity: O(n²)
        - Space complexity: O(n²)

    In short:
        Each row is built using values from the previous row,
        with 1 at both ends.
*/