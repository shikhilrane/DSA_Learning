package _02_Array.Problems._12_2D_Arrays._04_Rotate_2D_Array;

// Given a square matrix, turn it by 90 degrees in a clockwise direction without using any extra space

public class RotateArray {
    public static void main(String[] args) {
        int[][] array = {
                {2,3,4,5},
                {1,2,3,4},
                {8,5,4,7},
                {5,2,9,4}
        };

        rotate(array,4);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotate(int[][] a, int n){

        transpose(a, n, n); // First convert matrix into its transpose

        for (int i = 0; i < a.length; i++) { // Go through each row
            reverse(a[i]); // Reverse each row to get 90° clockwise rotation
        }
    }

    public static void reverse(int[] a){
        int i = 0;                      // Pointer at start of row
        int j = a.length - 1;           // Pointer at end of row

        while (i < j) {                 // Reverse until pointers meet
            swapForReverse(a, i, j);    // Swap values
            i++;                        // Move left pointer forward
            j--;                        // Move right pointer backward
        }
    }

    public static void swapForReverse(int[] a, int i, int j){

        int temp = a[i];    // Store left value
        a[i] = a[j];        // Put right value on left
        a[j] = temp;        // Put stored value on right
    }

    public static void transpose(int[][] a, int r, int c){

        for (int i = 0; i < a.length; i++) {            // Loop through rows
            for (int j = i + 1; j < a.length; j++) {    // Loop through columns above diagonal
                swapForTranspose(a, i, j);              // Swap elements to transpose
            }
        }
    }

    public static void swapForTranspose(int[][] a, int i, int j){
        int temp = a[i][j];     // Store value of a[i][j]
        a[i][j] = a[j][i];      // Put value of a[j][i] into a[i][j]
        a[j][i] = temp;         // Put stored value into a[j][i]
    }

}
