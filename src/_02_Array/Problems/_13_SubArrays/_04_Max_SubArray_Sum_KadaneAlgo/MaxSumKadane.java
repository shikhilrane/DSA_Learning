package _02_Array.Problems._13_SubArrays._04_Max_SubArray_Sum_KadaneAlgo;

// Find Max Subarrays Sum using Kadane's Algorithm
// Kadane’s Algorithm : Resets the sum to 0, if at any point, sum becomes NEGATIVE

public class MaxSumKadane {
    public static void main(String[] args) {
        int[] array = {1,-2,6,-1,3};

        int arraySum = findSum(array);
        System.out.println(arraySum);
    }

    public static int findSum(int[] a){
        int maxSum = Integer.MIN_VALUE;         // Stores maximum subarray sum found so far
        int currentSum = 0;                     // Stores running sum of current subarray

        for (int i = 0; i < a.length; i++) {   // Traverse the array
            currentSum = currentSum + a[i];    // Add current element to running sum
            if (currentSum > maxSum) {         // If running sum is better than max
                maxSum = currentSum;           // Update maxSum
            }
            if (currentSum < 0){               // If running sum becomes negative
                currentSum = 0;                // Reset it to start fresh
            }
        }

        return maxSum;                          // Return maximum subarray sum
    }
}

/*
    Kadane’s Algorithm

    What it is:
    - Finds maximum sum of a contiguous subarray.

    What it does:
    - Keeps a running sum.
    - Resets sum when it becomes negative.
    - Tracks the maximum sum seen.

    Why it works:
    - A negative sum cannot help future subarrays.

    Use:
    - Maximum subarray sum problems.

    Time: O(n)
    Space: O(1)

    Example:
        Array: [1, -2, 6, -1, 3]

        Step-by-step:
        currentSum = 0, maxSum = -∞

        Take 1   → currentSum = 1   → maxSum = 1
        Take -2  → currentSum = -1  → reset to 0
        Take 6   → currentSum = 6   → maxSum = 6
        Take -1  → currentSum = 5   → maxSum = 6
        Take 3   → currentSum = 8   → maxSum = 8

        Result:
        Maximum subarray sum = 8
*/


/*
    Logic (Kadane’s Algorithm):

    Idea:
        - Keep adding elements to a running sum.
        - If the running sum becomes negative,
          it will only reduce future sums, so reset it.

    Steps:
        1. Start currentSum = 0 and maxSum = very small value.
        2. Add current element to currentSum.
        3. Update maxSum if currentSum is greater.
        4. If currentSum becomes negative, reset it to 0.
        5. Continue till end of array.

    Why reset when currentSum < 0?
        - A negative sum will only decrease the sum
          of any subarray that comes after it.

    Time Complexity:
        O(n)

    Space Complexity:
        O(1)

    In short:
        Drop negative sums, keep best running total.
*/