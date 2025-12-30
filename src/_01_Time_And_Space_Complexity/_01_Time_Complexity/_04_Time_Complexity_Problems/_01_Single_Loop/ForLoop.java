package _01_Time_And_Space_Complexity._01_Time_Complexity._04_Time_Complexity_Problems._01_Single_Loop;

public class ForLoop {
    public static void main(String[] args) {
        int[] arr = {24,6,8,2};
        f1(arr);
    }

    public static void f1(int[] a){
        int n = a.length;
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }

    // TC = O(n)
    // because, loop will run n times so time complexity will be O(n)
}
