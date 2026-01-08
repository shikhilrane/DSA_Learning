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
        int left = 0;                           // Pointer starting from left side
        int right = a.length - 1;               // Pointer starting from right side

        while (left < right){                   // Continue until pointers meet
            if (a[left] == 0) {                 // If left side already has 0
                left++;                         // Move left pointer forward
            }
            else if (a[right] == 1) {           // If right side already has 1
                right--;                        // Move right pointer backward
            }
            else {                              // Left has 1 and right has 0 (wrong position)
                swapping(a, left, right);       // Swap them
                left++;                         // Move left pointer
                right--;                        // Move right pointer
            }
        }
    }

    public static void swapping(int[] a, int i, int j){
        int temp = a[i];    // Store left value
        a[i] = a[j];        // Put right value on left
        a[j] = temp;        // Put stored value on right
    }
}

/*
    What the Question is Asking (Problem Understanding):

    You are given:
        - An array that contains only 0s and 1s.

    Your task:
        - Rearrange the array so that:
              • All 0s come first
              • All 1s come after the 0s

    Important points:
        - You do NOT need to count how many 0s or 1s
        - You do NOT need to use sorting
        - You should do it efficiently in one pass
        - The operation should be done in-place

    Example:
        Input:
            {1, 0, 0, 1, 0, 1, 1, 0, 0}

        Output:
            {0, 0, 0, 0, 1, 1, 1, 1, 1}

    What the question expects:
        - Use a smart approach instead of brute force
        - Use two pointers to swap misplaced values

    In short:
        Separate 0s and 1s by moving 0s to the left
        and 1s to the right.
*/


/*
    Logic (Two Pointer – Optimised):

    1. Keep one pointer at start and one at end.
    2. Move left pointer if it already has 0.
    3. Move right pointer if it already has 1.
    4. If left has 1 and right has 0, swap them.
    5. Repeat until both pointers meet.

    In short:
        Push all 0s to left and 1s to right using two pointers.
*/
