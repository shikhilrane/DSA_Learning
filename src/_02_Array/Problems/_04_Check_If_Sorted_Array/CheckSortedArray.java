package _02_Array.Problems._04_Check_If_Sorted_Array;

// Check if the given array is sorted or not

public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,4,5,7,8};

        System.out.println(sortedArray(arr));
    }

    public static boolean sortedArray(int[] a) {
        for (int i = 0; i < a.length-1; i++) {
            if (a[i] >= a[i+1]) {
                return false;
            }
        }
        return true;
    }
}
