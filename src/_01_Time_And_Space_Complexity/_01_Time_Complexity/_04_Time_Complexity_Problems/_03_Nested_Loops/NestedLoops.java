package _01_Time_And_Space_Complexity._01_Time_Complexity._04_Time_Complexity_Problems._03_Nested_Loops;

public class NestedLoops {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8};
        f1(a);
    }

    public static void f1(int[] a1){
        int n = a1.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Nested loop : i = " + i + " j = " + j);
            }
        }
    }

    // Here, for 1 iteration of i, j will run n times, and
    //       for 2 iteration of i, j will run n times,
    //       ........,
    //       for n iteration of i, j will run n times
    // So, from last iteration, for n iteration of i, j will run n times, it will be n*n, So n², So, TC = O(n²) (n square)
}
