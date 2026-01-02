package _02_Array.Problems._06_Target_Sum_Pattern._01_Target_Sum;

// Find the total number of pairs in the array whose sum is equal to the given value x

public class TargetSum {
    public static void main(String[] args) {
        int[] arr = {4,6,3,5,8,2};
        int targetSum = 7;

        System.out.println(targetCount(arr, targetSum));
    }

    public static int targetCount(int[] a, int num) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                int n1 = a[i] + a[j];
                if (n1 == num) {
                    count++;
                }
            }
        }
        return count;
    }
}