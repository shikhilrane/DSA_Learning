package _01_Time_And_Space_Complexity._01_Time_Complexity._04_Time_Complexity_Problems._06_Nested_loops_4;

public class NestedLoops4 {
    public static void main(String[] args) {
        int n = 123;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n ; j++) {
                System.out.println(n);
            }
            for (int k = 1; k <= n; k++) {
                for (int l = 1; l <= n ; l++) {
                    System.out.println(n);
                }
            }
        }
    }

    // For each iteration of the outer loop (i):
    //   - The first inner loop (j) runs n times → n operations
    //   - The second inner loop consists of:
    //         - loop k running n times
    //         - for each k, loop l runs n times → n × n = n² operations
    //
    // So, for one iteration of i:
    //   Total work = n + n²
    //
    // Since the outer loop runs n times:
    //   Total work = n × (n + n²)
    //              = n² + n³
    //
    // Dominant term = n³
    // Time Complexity = O(n³)
}
