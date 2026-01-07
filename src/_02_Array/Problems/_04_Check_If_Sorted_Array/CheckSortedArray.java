package _02_Array.Problems._04_Check_If_Sorted_Array;

// Check if the given array is sorted or not

public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,4,5,7,8};

        System.out.println(sortedArray(arr));
    }

    public static boolean sortedArray(int[] a) {
        for (int i = 0; i < a.length-1; i++) {      // Traverse the array till its last index i.e. length-1
            if (a[i] > a[i+1]) {                   // If element from array greater than direct next element than array (Comparing 2-2 elements from array)
                return false;                       // If greater, then return false (because if greater, then array can't be sorted array)
            }
        }
        return true;                                // If fails to satisfy above condition then return true
    }
}
