package _02_Array.Problems.Snippets._03_Target_Sum;

public class TargetSum {
    public static int targetCount(int[] a, int num) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {            // Traverse an array
            for (int j = i+1; j < a.length; j++) {      // Traverse an array that starts from next index from i
                int n1 = a[i] + a[j];                   // Added first element of i and first element of j
                if (n1 == num) {                        // If sum is equal to target sum
                    count++;                            // Then increase the count
                }
            }
        }
        return count;
    }
}
