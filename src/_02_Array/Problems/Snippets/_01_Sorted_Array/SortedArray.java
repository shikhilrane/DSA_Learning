package _02_Array.Problems.Snippets._01_Sorted_Array;

public class SortedArray {
    public static boolean sortedArray(int[] a) {
        for (int i = 0; i < a.length-1; i++) {      // Traverse the array till its last index i.e. length-1
            if (a[i] > a[i+1]) {                   // If element from array greater than direct next element than array (Comparing 2-2 elements from array)
                return false;                       // If greater, then return false (because if greater, then array can't be sorted array)
            }
        }
        return true;                                // If fails to satisfy above condition then return true
    }
}
