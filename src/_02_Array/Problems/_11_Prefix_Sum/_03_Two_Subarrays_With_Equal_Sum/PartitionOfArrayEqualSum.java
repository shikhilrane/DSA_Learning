package _02_Array.Problems._11_Prefix_Sum._03_Two_Subarrays_With_Equal_Sum;

// Check if we can partition the array into two subarrays with equal sum. More formally, check that the prefix sum of a part of the array is equal to the suffix sum of rest of th array

public class PartitionOfArrayEqualSum {
    public static void main(String[] args) {
        int[] array = {1,3,2,5,1,1};

        boolean ans = givePartitionSum(array);
        System.out.println(ans);
    }

    public static boolean givePartitionSum(int[] a){
        int totalSum = findArraySum(a);

        int prefixSum = 0;
        for (int i = 0; i < a.length; i++) {
            prefixSum = prefixSum + a[i];
            int suffixSum = totalSum - prefixSum;
            if (prefixSum == suffixSum) {
                return true;
            }
        }
        return false;
    }

    public static int findArraySum(int[] a){
        int totalSum = 0;
        for (int i = 0; i < a.length; i++) {
            totalSum = totalSum + a[i];
        }
        return totalSum;
    }
}

// SuffixSum = Total - PrefixSum