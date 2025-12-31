package _01_Time_And_Space_Complexity._01_Time_Complexity._04_Time_Complexity_Problems._12_Increment_Pointer_By_2_Nested_Reversed;

public class NestedIncrement {
    public static void main(String[] args) {
        int n = 10;
        int val = 0;
        for (int i = 1; i <= n ; i*=2) {
            for (int j = n; j > i ; j--) {
                System.out.print(j + ", ");
                val++;
            }
            System.out.println();
        }
        System.out.println("Total number of count : " + val);
    }
        /*
        Iteration No.            i                                       j[range of iterations)       j[total no. of iteration wrt 'i']
            1                    1   =   2^0    =   2^1-1                      [n to 1)                          (n-1)
            2                    2   =   2^1    =   2^2-1                      [n to 2)                          (n-2)
            3                    4   =   2^2    =   2^3-1                      [n to 4]                          (n-4)
            4                    8   =   2^3    =   2^4-1                      [n to 8]                          (n-8)
            .                    .
            .                    .
            .                    .
            k                                   =   2^k-1                      [n to 2^k-1]                       n-2^k-1
            k+1                                 =   2^k+1-1   =   2^k          [n to 2^k]                         n-2^k   <== Assume this is last opn happened for this loop

        TC of Outer loop for 2^k i.e. 'k' is O(log n) as we have derived it in last questions
        Here, we have to find TC wrt to total iterations taken by inner loop i.e. 'j'
        So, the answer will be equals to the addition of j[total no. of iteration wrt 'i']
        So, (n-1) + (n-2) + (n-4) + (n-8) + ... + n-2^k
        Taking common n,
              kn - (1 + 2 + 4 + 8 + ... + 2^k)
        This is a GP
        As we know this is a geometric progression i.e.(GP) and formula to find addition of GP is,
              a(rⁿ-1)
            = ------
               2-1
           Where, a = first term, r = common ratio, n = total number of terms
                      1(2^k - 1)    first term is our GP is 1, common ratio is 2 and total number of terms k (k from 2^k i.e. last itn of j wrt i)
            = kn  -  ---------
                        2 - 1
            = n (log₂n) - 2^log₂n       putting values for k on both sides i.e. log₂n
            = n (log₂n) - n 2^log₂      In RHS, we bring n to the front
            = n (log₂n) - n             In RHS, value of 2^log₂ will be equals to 1
            = n (log₂n)                 By ignoring lower degree term
         TC = O(n log₂n)
    */
}
