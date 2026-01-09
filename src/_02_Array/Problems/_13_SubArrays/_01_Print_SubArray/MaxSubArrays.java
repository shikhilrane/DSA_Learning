package _02_Array.Problems._13_SubArrays._01_Print_SubArray;

// Print every continuous sequence of elements from the array

public class MaxSubArrays {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        printAllSubarrays(array);
    }

    public static void printAllSubarrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {          // Choose starting index of subarray
            for (int j = i; j < arr.length; j++) {      // Choose ending index of subarray
                for (int k = i; k <= j; k++) {           // Print elements from start (i) to end (j)
                    System.out.print(arr[k] + " ");      // Print current element of subarray
                }
                System.out.println();                    // Move to next line after one subarray
            }
            System.out.println();
        }
    }
}

/*
    What the Question is Asking:
        - You are given an integer array.

    Your task:
        - Print all possible subarrays of the array.

    Important points:
        - A subarray is a continuous part of the array.
        - Order of elements must be maintained.
        - Subarrays can start and end at any index.
        - Length of subarray can vary from 1 to n.

    Example:
        Array = {1, 2, 3}

        Subarrays:
            {1}
            {1, 2}
            {1, 2, 3}
            {2}
            {2, 3}
            {3}

    In short:
        Print every continuous portion of the array.
*/



/*
    Logic (Brute Force – 3 Loops):

    1. Use the first loop (i) to fix the starting index of the subarray.
    2. Use the second loop (j) to fix the ending index of the subarray.
    3. Use the third loop (k) to print elements from index i to j.
    4. Print a new line after each subarray.
    5. Repeat this for all possible start and end positions.

    In short:
        Fix start → fix end → print elements in between.
*/