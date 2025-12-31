package _01_Time_And_Space_Complexity._01_Time_Complexity._04_Time_Complexity_Problems._14_Increment_Pointer_by_Multiplying_I;

public class MultiplyingByI {
    public static void main(String[] args) {
        int n = 18;
        int val = 0;
        for (int i = 2; i <= n ; i*=i) {
            System.out.println(i);
            val++;
        }
        System.out.println("Total numbers of iterations : " + val);
    }
    /*
                Iteration No.               i
                1                           2     =   2^1    =   2^2^0
                2                           4     =   2^2    =   2^2^1
                3                           16    =   2^4    =   2^2^2
                4                           256   =   2^8    =   2^2^3
                .                           .
                .                           .
                .                           .
                p+1                               =   2^k    =   2^2^p
    */
}
