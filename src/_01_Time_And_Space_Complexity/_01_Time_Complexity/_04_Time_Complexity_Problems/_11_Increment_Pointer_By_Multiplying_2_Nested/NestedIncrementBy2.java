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
    /*
        Iteration No.            i                                       j[range of iterations]       j[total no. of iteration wrt 'i']
            1                    1   =   2^0    =   2^1-1                      [1 to 1]                           1
            2                    2   =   2^1    =   2^2-1                      [1 to 2]                           2
            3                    4   =   2^2    =   2^3-1                      [1 to 4]                           4
            4                    8   =   2^3    =   2^4-1                      [1 to 8]                           8
            5                    16  =   2^4    =   2^5-1                      [1 to 16]                          16
            .                    .
            .                    .
            .                    .
            k                                   =   2^k-1                      [1 to 2^k-1]                       2^k-1
            k+1                                 =   2^k+1-1   =   2^k          [1 to 2^k]                         2^k   <== Assume this is last opn happened for this loop

        TC of Outer loop for 2^k i.e. 'k' is O(log n) as we have derived it in last questions
        Here, we have to find TC wrt to total iterations taken by inner loop i.e. 'j'
        So, the answer will be equals to the addition of j[total no. of iteration wrt 'i']
        So, 1 + 2 + 4 + 8 + 16 + ... + 2^k
        As we know this is a geometric progression i.e.(GP) and formula to find addition of GP is,
            = a(rⁿ-1)
              ------
               2-1
           Where, a = first term, r = common ratio, n = total number of terms
            = 1(2^k - 1)    first term is our GP is 1, common ratio is 2 and total number of terms k (k from 2^k i.e. last itn of j wrt i)
              ---------
                2 - 1
            = 2^k           simplified the equation
            = 2^log₂n       we know value of the k from last problem
            = n 2^log₂      bring 'n' to front
            = n             2^log₂ is 1
         TC = O(n)
    */
}
