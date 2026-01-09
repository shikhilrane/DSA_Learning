package _02_Array.Problems._15_2D_Arrays._08_Sum_Of_Rectangle._01_Brute_Force_Approach;

// Sum of Rectangle using Brute Force Approach
// Given matrix 'a' of dimension n*m  and 2 coordinates (l1 and r1) and (l2 and r2). Return the sum of triangle from (l1 and r1) to (l2 and r2)

/*
    Here,
        1. l2> = l1 and r2 >= r1
        2. 0 <= l1,l2 < n (here n is row, and l1,l2 representing first and last row respectively)
        3. 0 <= r1,r2 < m (here m is column, and r1,r2 representing first and last column respectively)
*/

public class AdditionBruteForce {
    public static void main(String[] args) {
        int[][] array = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        int sum = findSum(array,1,2,1,2);
        System.out.println(sum);
    }

    public static int findSum(int[][] a, int l1, int l2, int r1, int r2){
        int sum = 0;                          // Variable to store total sum of rectangle
        for (int i = l1; i <= l2; i++) {      // Loop through rows from l1 to l2
            for (int j = r1; j <= r2; j++) {  // Loop through columns from r1 to r2
                sum = sum + a[i][j];          // Add current element to sum
            }
        }
        return sum;                           // Return final calculated sum
    }
}

/*
    What the Question Wants (Problem Understanding):

    The question says:
        "Sum of Rectangle using Brute Force Approach"

    This means:
        - You are given a 2D matrix of size n x m
        - You are given two coordinates:
              (l1, r1) → top-left corner of rectangle
              (l2, r2) → bottom-right corner of rectangle
        - You need to calculate the sum of all elements
          that lie inside this rectangle (inclusive)

    Conditions given in the question:
        1. l2 >= l1 and r2 >= r1
        2. Row indices are in range: 0 to n-1
        3. Column indices are in range: 0 to m-1

    What is expected from you:
        1. Traverse the matrix from row l1 to l2
        2. For each row, traverse columns from r1 to r2
        3. Add every element inside this rectangular area
        4. Return or print the total sum

    Why it is called Brute Force:
        - Every element inside the rectangle is visited one by one
        - No precomputation (like prefix sum) is used

    What the question does NOT want:
        - No prefix sum optimization
        - No extra space usage
        - No mathematical shortcut

    Example understanding:

        Matrix:
            1  2  3  4
            5  6  7  8
            9 10 11 12

        Rectangle coordinates:
            (l1, r1) = (0, 1)
            (l2, r2) = (1, 2)

        Rectangle elements:
            2  3
            6  7

        Sum = 2 + 3 + 6 + 7 = 18

    In short:
        Go through all elements inside the given rectangle
        and add them using simple nested loops.
*/

/*
    Logic for Finding Sum of a Rectangle (Brute Force):

    Given:
        - A 2D matrix 'a'
        - Two coordinates:
              (l1, r1) → top-left corner of rectangle
              (l2, r2) → bottom-right corner of rectangle

    Conditions:
        - l2 >= l1
        - r2 >= r1
        - Indices must lie within matrix boundaries

    Idea:
        - Traverse only the cells that lie inside
          the given rectangular area
        - Add each element to a running sum

    Steps followed:

    1. Initialize sum = 0
        - This will store the total rectangle sum

    2. Loop over rows:
        for i = l1 to l2
        - Move vertically inside the rectangle

    3. Loop over columns:
        for j = r1 to r2
        - Move horizontally inside the rectangle

    4. Add each element:
        sum = sum + a[i][j]

    5. After loops finish,
        return the total sum

    Why this is Brute Force:
        - Every element inside the rectangle
          is visited exactly once
        - No precomputation or optimization is used

    Example:

        Matrix:
            1  2  3
            4  5  6
            7  8  9

        Rectangle:
            (l1, r1) = (0, 1)
            (l2, r2) = (2, 2)

        Elements considered:
            2  3
            5  6
            8  9

        Sum = 2 + 3 + 5 + 6 + 8 + 9 = 33

    Time Complexity:
        O((l2 - l1 + 1) * (r2 - r1 + 1))

    Space Complexity:
        O(1)

    In short:
        Visit every element inside the rectangle
        and add them using nested loops.
*/
