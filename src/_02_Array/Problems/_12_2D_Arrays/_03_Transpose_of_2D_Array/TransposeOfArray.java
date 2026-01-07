package _02_Array.Problems._12_2D_Arrays._03_Transpose_of_2D_Array;

// Write s program to display Transpose of 2D array

public class TransposeOfArray {
    public static void main(String[] args) {
        int[][] array = {
                {2,3,4,5},
                {1,2,3,4},
                {8,5,4,7}
        };

        int[][] transposeOfArray = findTranspose(array,3,4);
        for (int i = 0; i < transposeOfArray.length; i++) {
            for (int j = 0; j < transposeOfArray[i].length; j++) {
                System.out.print(transposeOfArray[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] findTranspose(int[][] a, int r, int c){
        int[][] ans = new int[c][r];    // Created new as array with same number of columns as rows of existing array and vise-versa
        for (int i = 0; i < c; i++) {   // Iterate over column of existing array
            for (int j = 0; j < r; j++) {   // Iterate over row of existing array
                ans[i][j] = a[j][i];    // save column of existing array and row in row of new array and row in array
            }
        }
        return ans;
    }
}

/*
            {2,3,4,5},
   array =  {1,2,3,4},
            {8,5,4,7}

            {2,1,8}
            {3,2,5}
  arrayT =  {4,3,4}
            {5,4,7}

   While taking transpose we should know that array's rows to get converted in columns and columns to get converted in rows
   so create new 2d array with rows as same number of columns, and columns as same number of rows of existing array
   Traverse an array and place i in place of j and j in place of i
   Put, value of existing array's column element in new array's row and value of existing array's row element in new array's column.
*/