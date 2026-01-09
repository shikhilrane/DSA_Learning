package _02_Array.Problems._13_SubArrays._03_Max_SubArray_Sum_Prefix;

// Find Max Subarrays Sum using Prefix Sum Technique

public class MaxSumPrefix {
    public static void main(String[] args) {
        int[] array = {1,-2,6,-1,3};

        int arraySum = findSum(array);
        System.out.println(arraySum);
    }


    public static int findSum(int[] a){
        int maximumSum = Integer.MIN_VALUE;         // Store maximum subarray sum found so far

        int[] prefixArr = prefixSumArray(a);        // Create prefix sum array

        for (int i = 0; i < a.length; i++) {        // Choose starting index of subarray
            for (int j = i; j < a.length; j++) {    // Choose ending index of subarray
                int currentSum;                     // Store sum of current subarray
                if (i == 0) {                       // If subarray starts from index 0
                    currentSum = prefixArr[j];      // Sum is directly prefix[j]
                } else {
                    currentSum = prefixArr[j] - prefixArr[i - 1];   // Use prefix formula
                }

                if (currentSum > maximumSum) {      // Update max if current is larger
                    maximumSum = currentSum;
                }
            }
        }
        return maximumSum;                    // Return maximum subarray sum
    }

    public static int[] prefixSumArray(int[] a){
        int[] prefix = new int[a.length];     // Array to store prefix sums
        prefix[0] = a[0];                     // First prefix value is first element

        for (int i = 1; i < a.length; i++) {  // Build prefix array
            prefix[i] = prefix[i - 1] + a[i]; // Add previous sum to current value
        }

        return prefix;                        // Return prefix sum array
    }
}

/*
    What the Question is Asking (Max Subarray Sum using Prefix Sum):
        You are given an integer array.
        Your task is to find the maximum sum of any subarray.

    Subarray:
        - A continuous part of the array
        - Can start and end at any index

    Example:
        Array = {1, -2, 6, -1, 3}

        Best subarray:
            {6, -1, 3}
        Maximum Sum = 8
*/

/*
    Logic (Prefix Sum Approach):

    Idea:
        - Instead of calculating subarray sum again and again,
          we pre-calculate prefix sums.

    Prefix Sum:
        prefix[i] = sum of elements from index 0 to i

    Subarray sum formula:
        sum(i to j) = prefix[j] - prefix[i - 1]

    Steps:
        1. Create prefix sum array.
        2. Try all possible start (i) and end (j) indices.
        3. Calculate subarray sum using prefix array.
        4. Keep updating the maximum sum.

    Time Complexity:
        O(n²)

    Space Complexity:
        O(n)

    In short:
        Use prefix sums to avoid recalculating sums repeatedly.
*/
