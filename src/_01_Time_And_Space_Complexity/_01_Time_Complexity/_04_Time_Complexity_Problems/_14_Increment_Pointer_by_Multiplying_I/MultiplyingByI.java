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

                Total iterations are 'p'
                so TC = O(p)
                but we have to represent TC in terms of 'n'
                so,
                 = i <= n
                 = 2^k <= n
                 = log₂(2^k) <= log₂n
                 = k log₂2 <= log₂n
                 = k <= log n
           TC(k) = O(log n)

                This is a TC of 'k' but now we have to find TC in terms of 'p'
                because, k = 2^p  (from last iteration)
                so,
                   = k = 2^p
                   = log₂k = log₂(2^p)
                   = log₂k = p log₂2
                   = log₂k = p
                so, value of p is,
           p = log₂k

                now putting value of 'k' in 'p'
                 = log(log n)
                so the complexity of 'p' is,
                TC(p) = O(log(log n))
    */
}
