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
    Logic :
        add a and b
        subtract b from a
        now again subtract b from a
*/