package _02_Array.Problems._10_Two_Pointers._01_Sort_Array_Consisting_of_0_and_1;

// Sort an Array consisting of only 0s and 1s in ascending order.

public class SortArray {
    public static void main(String[] args) {
        int[] array = {1,0,0,1,0,1,1,0,0,0}; // Array with only 0 and 1

        returnSortedArray(array); // Sort array so all 0 come first, then 1

        for (int i = 0; i < array.length; i++) { // Go through the array
            System.out.println(array[i]); // Print each value
        }
    }

    public static void returnSortedArray(int[] a){
        int count = 0;                          // Count how many 0 are there
        for (int i = 0; i < a.length; i++) {    // Check each element
            if (a[i] == 0) {                    // If element is 0
                count++;                        // Increase zero count
            }
        }

        for (int i = 0; i < a.length; i++) {    // Fill array again
            if (i < count){                     // First positions
                a[i] = 0;                       // Put 0
            }
            else {                              // Remaining positions
                a[i] = 1; // Put 1
            }
        }
    }
}

/*
    What the Question is Asking (Problem Understanding):

    You are given:
        - An array that contains only two values: 0 and 1.

    Your task:
        - Sort the array in ascending order.
        - This means:
              • All 0s should come first
              • All 1s should come after the 0s

    Important points:
        - The array contains ONLY 0s and 1s
        - You do NOT need a general sorting algorithm
        - You are expected to solve it efficiently

    Example:
        Input:
            {1, 0, 0, 1, 0, 1, 1, 0, 0, 0}

        Output:
            {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}

    What the question expects:
        - Use the special property of the array (only 0s and 1s)
        - Avoid unnecessary sorting logic
        - Modify the array in-place

    In short:
        Rearrange the array so that
        all 0s come before all 1s.
*/


/*
    Logic (Short):

    1. Count how many 0s are present in the array.
    2. Fill the first 'count' positions with 0.
    3. Fill the remaining positions with 1.

    In short:
        Count zeros first, then rebuild the array.
*/
