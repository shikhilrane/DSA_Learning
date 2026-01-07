package _02_Array.Problems._10_Two_Pointers._01_Sort_Array_Consisting_of_0_and_1;

public class SortArray_Optimised {
    public static void main(String[] args) {
        int[] array = {1,0,0,1,0,1,1,0,0};

        sortedArray(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void sortedArray(int[] a){
        int left = 0;                       // Pointer starting from left side
        int right = a.length - 1;           // Pointer starting from right side

        while (left < right){               // Continue until pointers meet
        if (a[left] == 0) {                 // If left side already has 0
                left++;                     // Move left pointer forward
            }
            else if (a[right] == 1) {       // If right side already has 1
                right--;                    // Move right pointer backward
            }
            else {                          // Left has 1 and right has 0 (wrong position)
                swapping(a, left, right);   // Swap them
                left++;                     // Move left pointer
                right--;                    // Move right pointer
            }
        }
    }

    public static void swapping(int[] a, int i, int j){
        int temp = a[i];    // Store left value
        a[i] = a[j];        // Put right value on left
        a[j] = temp;        // Put stored value on right
    }
}
