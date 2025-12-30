package _01_Time_And_Space_Complexity._01_Time_Complexity._04_Time_Complexity_Problems._02_Two_Loops_in_Func;

public class TwoLoops {
    public static void main(String[] args) {
        int[] arr1 = {24,6,8,2};
        int[] arr2 = {43,54,865,23};
        f1(arr1, arr2);
    }

    public static void f1(int[] a1, int[] a2){
        int n = a1.length;
        int m = a2.length;
        for (int i = 0; i < n; i++) {
            System.out.println(a1[i]);
        }
        for (int i = 0; i < m; i++) {
            System.out.println(a2[i]);
        }
    }

    // TC for first loop = O(n)
    // TC for second loop = O(m)
    // Since loops are independent and sequential, we add their complexities
    // Total Time Complexity = O(n + m)

}
