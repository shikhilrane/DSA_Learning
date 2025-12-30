package _01_Time_And_Space_Complexity._01_Time_Complexity._04_Time_Complexity_Problems._05_Nested_Loops_3;

public class NestedLoop3 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("Nested loop : i = " + i + " j = " + j);
            }
        }
    }

    // f(n) = 0 + 1 + 2 + 3 + ... + (n - 1)      (NOTE : Use 1 + 2 + 3 + ... + n only when work increases per iteration.)
    // f(n) = n(n - 1) / 2           (Formula to get sum of series)
    // f(n) = (n²/2) - (n/2)
    // f(n) = n² - n
    // TC = n²
}
