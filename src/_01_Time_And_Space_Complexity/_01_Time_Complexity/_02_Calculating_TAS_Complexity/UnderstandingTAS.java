package _01_Time_And_Space_Complexity._01_Time_Complexity._02_Calculating_TAS_Complexity;

public class UnderstandingTAS {     // Not considered
    public static void main(String[] args) {    // Not considered
        // Considerations
        for (int i = 1; i <= 500; i++) {      // Considered (loop executes)
            System.out.println("Hello");    // Considered (loop executes)
        }



        // Unit of time
        // Example 1 :
        int num = 10;             // 1 unit of time
        System.out.println(num);  // 1 unit of time

        // Example 2 :
        int a = 10;               // 1 unit of time
        int b = 20;               // 1 unit of time
        if (a>b){                 // 1 unit of time
            System.out.println("a is greater");
        }
        else{
            System.out.println("b is greater");     // 1 unit of time
        }
        // Note : from Example 1 and Example 2, Consistently, it takes 2 units of time and 4 units of time respectively. In DSA such constant execution id referred as "Constant Time Complexity". i.e.O(1)

        // Example 3 :
        int n = 23;
        for (int i = 1; i <= n ; i++) {
            System.out.println(n);
        }
        // Here, loop will run n times so time complexity will be O(n)

        // Example 4 :
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= 5 ; j++) {
                System.out.println(n);
            }
        }
        // Here, for 1 iteration of i, j will run 5 times, and
        //       for 2 iteration of i, j will run 5 times,
        //       ........,
        //       for n iteration of i, j will run 5 times
        // So, from last iteration, for n iteration of i, j will run 5 times, it will be n*5, So 5n and we ignore constants, So, TC = O(n)

        // Example 5 :
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n ; j++) {
                System.out.println(n);
            }
        }
        // Here, for 1 iteration of i, j will run n times, and
        //       for 2 iteration of i, j will run n times,
        //       ........,
        //       for n iteration of i, j will run n times
        // So, from last iteration, for n iteration of i, j will run n times, it will be n*n, So n², So, TC = O(n²) (n square)

        // Example 6 :
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n ; j++) {
                System.out.println(n);
            }
            for (int k = 1; k <= n; k++) {
                System.out.println(n);
            }
        }
        // Here, for 1 iteration of i, j will run n times, k will run n times, and
        //       for 2 iteration of i, j will run n times, k will run n times,
        //       ........,
        //       for n iteration of i, j will run n times, k will run n times
        // So, from last iteration, for n iteration of i, j will run n times, k will run n times, it will be n²+n², So 2n², So, TC = O(n²) (constant ignored)

        // Example 7 :
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n ; j++) {
                System.out.println(n);
            }
            for (int k = 1; k <= n; k++) {
                for (int l = 1; l <= n ; l++) {
                    System.out.println(n);
                }
            }
        }
        // For each iteration of the outer loop (i):
        //   - The first inner loop (j) runs n times → n operations
        //   - The second inner loop consists of:
        //         - loop k running n times
        //         - for each k, loop l runs n times → n × n = n² operations
        //
        // So, for one iteration of i:
        //   Total work = n + n²
        //
        // Since the outer loop runs n times:
        //   Total work = n × (n + n²)
        //              = n² + n³
        //
        // Dominant term = n³
        // Time Complexity = O(n³)







        // Calculating Time complexity of Swapping Two Numbers program
        int num1 = 10;       // Assignment Statement
        int num2 = 20;       // Assignment Statement

        int temp = num1;     // Assignment Statement
        num1 = num2;         // Assignment Statement
        num2 = temp;         // Assignment Statement

        System.out.println("Number 1 : " + num1);   // Print Statement
        System.out.println("Number 2 : " + num2);   // Print Statement

        // f(n) = 5 Assignment Statement + 2 Print Statement
        // f(n) = 7 units of time which is constant
        // f(n) = 1
        // TC = O(1)





        // Factorial Program
        int m = 5;          // Assignment Statement
        int fact = 1;       // Assignment Statement
        for (int i = 1; i <= m; i++) {      // loop
            fact = fact * i;
        }

        System.out.println(fact);   // Print Statement
        // f(m) = 2 Assignment Statement + m (loop) + 1 Print Statement
        // f(m) = 3 units of time which is constant + m = 3m
        // f(m) = 3m
        // TC = O(m)





        // Star Pattern
        int p = 5;              // Assignment Statement
        for (int i = 1; i <= p ; i++) {         // loop
            for (int j = 1; j <= i ; j++) {     // loop
                System.out.print("*");
            }
            System.out.println();
        }
        // f(p) = 1+2+3+4+...+p      (NOTE : Use 1 + 2 + 3 + ... + p only when work increases per iteration.)
        // f(p) = p(p-1)/2           (Formula to get sum of series)
        // f(p) = (p²/2) - (p/2)
        // f(p) = p² - p
        // TC = p²






        // Fibonacci Series
        int q = 5;
        int c = 0;
        int d = 1;

        for (int i = 1; i <= q; i++) {
            System.out.print(c + " ");
            int next = c + d;
            c = d;
            d = next;
        }
        // f(q) = q times
        // f(q) = q
        // TC = O(q)





        // Reverse Number
        int r = 3457;
        int reverse = 0;

        // The while loop runs until r becomes 0
        // In each iteration, one digit is removed from r
        // So, the loop runs once for each digit in the number
        while (r != 0) {
            int digit = r % 10;
            reverse = reverse * 10 + digit;
            r = r / 10;
        }
        System.out.println("Reversed number: " + reverse);
        // f(r) = d
            // d is number of digits in number, It depends on the length of number of digits in number. i.e. If r has d digits, then the loop runs d times and work done in each iteration is constant (when result is depends on length of input, then TC will be represented in terms of number iteration according to numbers )
        // Since number of digits, d = log10(r)
        // Time Complexity = O(d) = O(log r)
        // (NOTE : If an algorithm processes a number digit by digit, its time complexity depends on the length of the number, not the value itself., == length of num)









        // Palindrome Number
        int s = 123454321;
        int original = s;
        int reversse = 0;
        while (s != 0) {
            int digit = s % 10;
            reversse = reversse * 10 + digit;
            s = s / 10;
        }
        if (original == reversse) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a palindrome number");
        }
        // f(s) = d
        // where d is the number of digits in the number s (i.e. dependent on length of s)
        // Since number of digits, d = log10(s)
        // TC = O(d) = O(log s)









        // Prime Number Program
        int t = 29;
        boolean isPrime = true;

        if (t <= 1) {
            isPrime = false;
        }

        for (int i = 2; i < t; i++) {
            if (t % i == 0) {     // Constant time operation
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
        // Work done in each iteration is constant
        // f(t) = t
        // Time Complexity = O(t)

    }
}

/*
    Note : only Executable statements are responsible for calculating time complexity
*/