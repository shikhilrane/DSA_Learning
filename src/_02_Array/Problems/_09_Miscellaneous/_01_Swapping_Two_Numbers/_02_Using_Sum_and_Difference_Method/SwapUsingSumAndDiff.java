package _02_Array.Problems._09_Miscellaneous._01_Swapping_Two_Numbers._02_Using_Sum_and_Difference_Method;

// Swap two numbers using sum and difference method

public class SwapUsingSumAndDiff {
    public static void main(String[] args) {
        int a = 9;
        int b = 3;

        swapNums(a,b);
    }

    public static void swapNums(int a, int b){
        System.out.println("Value of a before swapping : " + a);
        System.out.println("Value of b before swapping : " + b);

        a = a + b;      // a = 9+3 = 12
        b = a - b;      // b = 12-3 = 9
        a = a - b;      // a = 12-9 = 3

        System.out.println("Value of a after swapping : " + a);
        System.out.println("Value of b after swapping : " + b);
    }
}

/*
    What the Question is Asking (Problem Understanding):

    You are given:
        - Two integer variables a and b.

    Your task:
        - Swap the values of a and b.
        - Do this WITHOUT using a third (temporary) variable.

    Important constraint:
        - You must use only arithmetic operations
          (sum and difference).
        - No extra variable is allowed.

    What “swap” means:
        - Value of a should go into b
        - Value of b should go into a

    Example:
        Before swapping:
            a = 9
            b = 3

        After swapping:
            a = 3
            b = 9

    What the question expects:
        - Use mathematical operations cleverly
        - Avoid using temp variable
        - Demonstrate understanding of in-place value manipulation

    In short:
        Exchange values of two variables
        using only addition and subtraction.
*/


/*
    Logic :
        add a and b
        subtract b from a
        now again subtract b from a
*/