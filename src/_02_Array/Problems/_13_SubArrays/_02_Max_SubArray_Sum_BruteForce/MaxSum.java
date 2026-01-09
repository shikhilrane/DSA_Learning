package _02_Array.Problems._13_SubArrays._02_Max_SubArray_Sum_BruteForce;

// Find Max Subarrays Sum using brute force

public class MaxSum {
    public static void main(String[] args) {
        int[] array = {1,-2,6,-1,3};

        int sum = findSum(array);

        System.out.println(sum);
    }

    public static int findSum(int[] a){
        int maximumSum = Integer.MIN_VALUE;         // Stores the maximum subarray sum found so far
        for (int i = 0; i < a.length; i++) {        // Choose starting index of subarray
            for (int j = i; j < a.length; j++) {    // Choose ending index of subarray
                int currentSum = 0;                 // Reset sum for each new subarray
                for (int k = i; k <= j ; k++) {     // Add elements from index i to j
                    currentSum = currentSum + a[k]; // Add current element to subarray sum
                    if (currentSum > maximumSum) {  // Check if this sum is maximum
                        maximumSum = currentSum;    // Update maximum sum
                    }
                }
            }
        }
        return maximumSum;                    // Return maximum subarray sum
    }

}

/*
    What the Question is Asking:
        You are given an integer array.

    Your task:
        - Find the maximum sum among all possible subarrays.

    Important points:
        - A subarray is a continuous part of the array.
        - You must consider all possible subarrays.
        - The subarray with the largest sum is the answer.

    Example:
        Array = {1, -2, 6, -1, 3}

        Possible subarrays and sums:
            {1} → 1
            {1, -2} → -1
            {1, -2, 6} → 5
            {1, -2, 6, -1} → 4
            {1, -2, 6, -1, 3} → 7

            {-2} → -2
            {-2, 6} → 4
            {-2, 6, -1} → 3
            {-2, 6, -1, 3} → 6

            {6} → 6
            {6, -1} → 5
            {6, -1, 3} → 8  ✅ (maximum)

            {-1} → -1
            {-1, 3} → 2

            {3} → 3

        Maximum Subarray Sum = 8

    In short:
        Find the largest sum that can be obtained
        from any continuous part of the array.
*/

/*
    Logic (Brute Force Approach):

    1. Use the first loop to fix the starting index of the subarray.
    2. Use the second loop to fix the ending index of the subarray.
    3. Use the third loop to calculate the sum of elements
       from start index to end index.
    4. Keep comparing each subarray sum with the maximum sum found so far.
    5. Update maximum sum whenever a bigger sum is found.

    In short:
        Generate all subarrays,
        calculate their sums,
        and track the maximum.
*/
