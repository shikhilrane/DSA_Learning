package _01_Time_And_Space_Complexity._01_Time_Complexity._04_Time_Complexity_Problems._13_Dividing_Pointer_by_2_for_Outerloop;

public class DividingPointer {
    public static void main(String[] args) {
        int n = 10;
        int val = 0;
        for (int i = n; i >= 1 ; i/=2) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + ", ");
                val++;
            }
            System.out.println();
        }
        System.out.println("Total number of count : " + val);
    }
    /*
        Iteration No.            i                                      j[range of iterations]       j[total no. of iteration wrt 'i']
            1                    n   =  n/2^0   =   n/2^1-1                   [0 to n)                          n
            2                    n/2 =  n/2^1   =   n/2^2-1                   [0 to n/2)                        n/2
            3                    n/4 =  n/2^2   =   n/2^3-1                   [0 to n/4)                        n/4
            4                    n/8 =  n/2^3   =   n/2^4-1                   [0 to n/8)                        n/8
            .                    .
            .                    .
            .                    .
            k                                   =   n/2^k-1                   [1 to n/2^k-1]                    n/2^k-1
            k+1                                 =   n/2^k+1-1   =   n/2^k     [1 to n/2^k]                      n/2^k   <== Assume this is last opn happened for this loop

        Here we don't know the value of 'k' in iteration of i, because 'log n' was for i*=2, and we have to find value of 'k' for i/=2
        = i >= 1
        = n/2^k >= 1
        = n >= 2^k                                  Cross multiplication
        = log₂n >= log₂(2^k)                        Taking log on both sides
        = log₂n >= k log₂2                          In RHS bring k to front
        = log₂n >= k                                In RHS, log₂2 = 1
        which is similarly equals to, log n
     TC = O(log n)                                  TC for k for outer loop i

        Now, we have to find TC for inner loop
        Adding j[total no. of iteration wrt 'i'],
        = n + n/2 + n/4 + n/8 + ... + n/2^k
        = n (1 + 1/2 + 1/4 + 1/8 + ... + 1/2^k)     Taking 'n' as common term
        = n (1 ((1/2^k - 1) / (1/2 - 1)))           Putting values in GP
        = n (1/2^k - 1)                             Simplifying GP Equation
        = n (1/2^log₂n - 1)                         Putting value of 'k'
        = n (1/n - 1)                               Simplifying 2^log₂n
        = n/n - n
        = 1 - n
        = n
     TC = O(n)
    */
}