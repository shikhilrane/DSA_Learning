package _01_Time_And_Space_Complexity._01_Time_Complexity._04_Time_Complexity_Problems._09_Increment_Pointer_by_K;

public class IncrementPointerByK {
    public static void main(String[] args) {
        int n = 15;
        int k = 3;
        int val = 0;
        for (int i = 1; i < n; i*=k) {
            System.out.println(i);
            val++;
        }
        System.out.println("Total number of count : " + val);
    }
}

/*
            Iteration No.               i
                1                       1     =   k^0    =   k^1-1
                2                       k     =   k^1    =   k^2-1
                3                       k^2   =   k^2    =   k^3-1
                4                       k^3   =   k^3    =   k^4-1
                5                       k^4   =   k^4    =   k^5-1
                .                       .
                .                       .
                .                       .
                p                                        =   k^p-1
                p+1                                      =   k^p+1-1   =   k^p

            But we can't represent TC in terms of O(p) because p represents iterations, and we have to represent TC in terms of 'n' and 'k' because these are inputs
            Also we don't know the value of 'p' yet
            To find value of 'kp',
                = i < n
                = k^p < n                  Because last iteration will be always lesser than 'n', so we have replaced 'i' with last valid iteration by k^p
                = logₖ(k^p) < logₖ(n)       took logₖ() on both sides
                = p logₖk < logₖ(n)         Bring k to front by formula 1
                = p < logₖ(n)               logₖk = 1 by formula 2
                = p < log(n)               we can neglect base k because logs are interconvertible
                So total numbers of iterations 'k' will be always lesser than log(n)
                so we can consider log(n) as TC
             TC = O(log n)
*/