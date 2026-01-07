package _02_Array.Problems._11_Prefix_Sum._03_Two_Subarrays_With_Equal_Sum;

// Check if we can partition the array into two subarrays with equal sum. More formally, check that the prefix sum of a part of the array is equal to the suffix sum of rest of th array

public class PartitionOfArrayEqualSum {
    public static void main(String[] args) {
        int[] array = {6,3,2,5,1,1};

        boolean ans = givePartitionSum(array);
        System.out.println(ans);
    }

    public static boolean givePartitionSum(int[] a){
        int totalSum = findArraySum(a);         // Find total sum of the array
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

// SuffixSum = Total - PrefixSum