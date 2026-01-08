package _02_Array.Problems._11_Prefix_Sum._03_Two_Subarrays_With_Equal_Sum;

// Check if we can partition the array into two subarrays with equal sum. More formally, check that the prefix sum of a part of the array is equal to the suffix sum of rest of th array

public class PartitionOfArrayEqualSum {
    public static void main(String[] args) {
        int[] array = {6,3,2,5,1,1};

        boolean ans = givePartitionSum(array);
        System.out.println(ans);
    }

    public static boolean givePartitionSum(int[] a){
    int totalSum = findArraySum(a);             // Find total sum of the array
        int prefixSum = 0;                      // Variable to store sum from left side
        for (int i = 0; i < a.length; i++) {    // Go through each element
            prefixSum = prefixSum + a[i];       // Add current element to prefix sum
            int suffixSum = totalSum - prefixSum; // Remaining sum on right side
            if (prefixSum == suffixSum) {       // Check if left and right sums are equal
                return true;                    // Partition is possible
            }
        }
        return false; // No partition found with equal sum
    }

    public static int findArraySum(int[] a){
        int totalSum = 0;                       // Variable to store total sum
        for (int i = 0; i < a.length; i++) {    // Go through each element
            totalSum = totalSum + a[i];         // Add current element to total sum
        }
        return totalSum;                        // Return final sum of all elements
    }
}

/*
    What the Question is Asking:

    You are given an integer array.

    Your task:
        - Check whether it is possible to split the array
          into two parts such that:
              sum of left part == sum of right part

    Important points:
        - The array should be split at some index
        - Left subarray contains elements from start to that index
        - Right subarray contains remaining elements
        - Both subarrays must be non-empty

    Example:
        Array = {6, 3, 2, 5, 1, 1}

        Possible split:
            Left  = {6, 3, 2}
            Right = {5, 1, 1}

        Left sum  = 11
        Right sum = 7   ❌ (not equal)

        Another split:
            Left  = {6, 3, 2, 5}
            Right = {1, 1}

        Left sum  = 16
        Right sum = 2   ❌

        Final split:
            Left  = {6, 3, 2, 5, 1}
            Right = {1}

        Left sum  = 17
        Right sum = 1   ❌

        If any split gives equal sum → return true
        Otherwise → return false

    In short:
        Check if there exists an index where
        left sum equals right sum.
*/

/*
    Logic (Equal Partition Check):

    1. First calculate total sum of the array.
    2. Traverse the array and keep adding prefix sum.
    3. At each index:
           suffixSum = totalSum - prefixSum
    4. If prefixSum == suffixSum:
           partition is possible.

    In short:
        Keep checking left sum vs right sum
        while moving through the array.
*/
