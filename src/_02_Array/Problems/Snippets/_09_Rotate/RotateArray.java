package _02_Array.Problems.Snippets._09_Rotate;

public class RotateArray {
    public static void rotateInPlace(int[] a, int k){
        int n = a.length;
        k = k % n;                   // Reduce k if it is greater than array length
        reverse(a, 0, n-k-1);   // Reverse first (n - k) elements of the array
        reverse(a, n-k, n-1);   // Reverse last k elements of the array
        reverse(a, 0, n-1);     // Reverse the entire array to get final rotated array
    }

    public static void reverse(int[] a, int i, int j){
        while (i < j) {                   // Continue swapping until pointers meet
            swapInArray(a, i, j);         // Swap elements at index i and j
            i++;                          // Move left pointer forward
            j--;                          // Move right pointer backward
        }
    }

    public static void swapInArray(int[] a, int i, int j){
        int temp = a[i];                  // Store value at index i temporarily
        a[i] = a[j];                      // Replace value at index i with value at j
        a[j] = temp;                      // Assign stored value to index j
    }
}
