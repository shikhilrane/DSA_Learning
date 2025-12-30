package _01_Time_And_Space_Complexity._01_Time_Complexity._04_Time_Complexity_Problems._11_Increment_Pointer_By_Multiplying_2_Nested;

public class NestedIncrementBy2 {
    public static void main(String[] args) {
        int n = 20;
        int val = 0;
        for (int i = 1; i <= n ; i*=2) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + ", ");
                val++;
            }
            System.out.println();
        }
        System.out.println("Total number of iterations : " + val);
    }

}
