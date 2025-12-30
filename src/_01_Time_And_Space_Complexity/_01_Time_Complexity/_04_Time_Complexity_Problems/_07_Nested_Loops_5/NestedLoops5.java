package _01_Time_And_Space_Complexity._01_Time_Complexity._04_Time_Complexity_Problems._07_Nested_Loops_5;

public class NestedLoops5 {
    public static void main(String[] args) {
        int n = 25;
        double sqrt = Math.sqrt(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < sqrt; j++) {
                System.out.println("Nested loop : i = " + i + " j = " + j);
            }
        }
    }

    // Outer loop runs n times
    // Inner loop runs √n times
    // Total operations = n × √n
    // f(n) = n√n
    // Time Complexity = O(n√n)
}
