package _02_Array.Problems._12_2D_Arrays._08_Sum_Of_Rectangle._02_PreCalculating_Horizontal_Sum_of_Each_Row_Approach;

// Sum of Rectangle using Pre-Calculating the horizontal sum for each row
// Pre-Calculating the horizontal sum for ech row in the matrix

public class PrecalculationgApproach {
    public static void main(String[] args) {
        int[][] array = {
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25},
                {26,27,28,29,30}
        };

        int sum = findSum(array,0,2,1,3);
        System.out.println(sum);
    }

    public static int findSum(int[][] a, int l1, int l2, int r1, int r2){
        int sum = 0;                              // Variable to store final rectangle sum
        findPrefixSumMatrix(a);                  // Convert each row into prefix sum form

        for (int i = l1; i <= l2; i++) {         // Loop through rows from l1 to l2
            if (r1 > 0){                         // If rectangle does not start from first column
                sum = sum + a[i][r2] - a[i][r1-1]; // Subtract left part and add row contribution
            } else {
                sum = sum + a[i][r2];            // Directly add prefix sum till r2
            }
        }

        return sum;                              // Return total rectangle sum
    }

    public static void findPrefixSumMatrix(int[][] a){
        int r = a.length;                        // Total number of rows in matrix
        int c = a[0].length;                    // Total number of columns in matrix

        for (int i = 0; i < r; i++) {            // Loop through each row
            for (int j = 1; j < c ; j++) {       // Start from column 1
                a[i][j] = a[i][j] + a[i][j-1];   // Add previous column value to current cell
            }
        }
    }

}

/*
    What the Question Wants (Problem Understanding):

    The question says:
        "Sum of Rectangle using Pre-Calculating
         the horizontal sum for each row"

    This means:
        - You are given a 2D matrix
        - You are given rectangle coordinates:
              (l1, r1) → top-left
              (l2, r2) → bottom-right
        - You need to calculate the sum of all elements
          inside this rectangle

    Difference from brute force:
        - Instead of adding every element one by one,
          you must first pre-calculate row-wise prefix sums
        - Then use those prefix sums to answer the query faster

    What is expected from you:
        1. Convert each row of the matrix into its prefix sum
        2. For every row between l1 and l2:
               subtract prefix sums to get row contribution
        3. Add contributions of all rows to get final sum

    What the question does NOT want:
        - No nested loops inside rectangle (like brute force)
        - No column-wise prefix sum
        - No extra 2D array for prefix sums

    In short:
        Use row-wise prefix sums to calculate
        rectangle sum more efficiently.
*/

/*
    Logic for Rectangle Sum using Row-wise Prefix Sum:

    Idea:
        - Convert each row of the matrix into a prefix sum array
        - Each cell stores sum of elements from column 0 to that column

    Prefix sum creation:
        a[i][j] = a[i][j] + a[i][j - 1]

    After prefix sum:
        Each row allows O(1) range sum query

    Steps followed in findSum():

    1. Pre-calculate horizontal prefix sum for each row
        - This modifies the original matrix

    2. Initialize sum = 0

    3. For each row i from l1 to l2:
        - If r1 > 0:
              rowSum = a[i][r2] - a[i][r1 - 1]
        - Else:
              rowSum = a[i][r2]

    4. Add rowSum to total sum

    Example:

        Original row:
            11  12  13  14  15

        After prefix sum:
            11  23  36  50  65

        Sum from column 1 to 3:
            = a[row][3] - a[row][0]
            = 50 - 11 = 39

    Time Complexity:
        Prefix sum creation: O(r * c)
        Rectangle sum query: O(l2 - l1 + 1)

    Space Complexity:
        O(1) (done in-place)

    In short:
        Pre-calculate row prefix sums,
        then subtract to get rectangle sum.
*/
