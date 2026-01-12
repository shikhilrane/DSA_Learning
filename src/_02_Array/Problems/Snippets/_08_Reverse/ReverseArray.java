package _02_Array.Problems.Snippets._08_Reverse;

public class ReverseArray {
    public static void reverseOriginalArray(int[] a){
        int i = 0;                      // Pointer starting from first index
        int j = a.length - 1;           // Pointer starting from last index

        while (i < j) {                 // Continue until both pointers meet
            swapInArray(a, i, j);       // Swap elements at index i and j
            i++;                        // Move i forward
            j--;                        // Move j backward
        }
    }

    public static void swapInArray(int[] a, int i, int j){
        int temp = a[i];                // Store value at index i
        a[i] = a[j];                    // Replace value at index i with value at j
        a[j] = temp;                    // Assign stored value to index j
    }
}
