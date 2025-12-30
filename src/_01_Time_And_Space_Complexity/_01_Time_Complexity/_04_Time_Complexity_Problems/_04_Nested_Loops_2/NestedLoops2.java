package _01_Time_And_Space_Complexity._01_Time_Complexity._04_Time_Complexity_Problems._04_Nested_Loops_2;

public class NestedLoops2 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Nested loop : i = " + i + " j = " + j);
            }
        }
    }

    // Here, for 1 iteration of i, j will run 5 times, and
    //       for 2 iteration of i, j will run 5 times,
    //       ........,
    //       for n iteration of i, j will run 5 times
    // So, from last iteration, for n iteration of i, j will run 5 times, it will be n*5, So 5n and we ignore constants, So, TC = O(n)
}
