package _01_Time_And_Space_Complexity._01_Time_Complexity._04_Time_Complexity_Problems._10_Increment_Pointer_By_Adding_i;

public class AddingI {
    public static void main(String[] args) {
        int n = 16;
        int val = 0;
        for (int i = 1; i <= n; i += i) {
            System.out.println(i);
            val++;
        }
        System.out.println("Total number of count : " + val);
    }

    /*
        Iteration No.               i
            1                       1   =   2^0    =   2^1-1
            2                       2   =   2^1    =   2^2-1
            3                       4   =   2^2    =   2^3-1
            4                       8   =   2^3    =   2^4-1
            5                       16   =  2^4    =   2^5-1
            .                       .
            .                       .
            .                       .
            k                                      =   2^k-1
            k+1                                    =   2^k+1-1   =   2^k            <== Assume this is last opn happened for this loop

        But we can't represent TC in terms of O(k) because k represents iterations, and we have to represent TC in terms of 'n'
        Also we don't know the value of 'k' yet
        To find value of 'k',
            condition for 'i' is, it will be always lesser than n,
            = i < n
            = 2^k < n                   Because last iteration will be always lesser than 'n', so we have replaced 'i' with last valid iteration by 2^k
            = log₂(2^k) < log₂(n)       Took log on both sides
            = k log₂2 < log₂(n)         Bring k to front by formula 1
            = k < log₂(n)               log₂2 = 1 by formula 2
            = k < log(n)                we can neglect base 2 because logs are interconvertible
            So total numbers of iterations 'k' will be always lesser than log(n)
            so we can consider log(n) as TC
         TC = O(log n)
    */
}
