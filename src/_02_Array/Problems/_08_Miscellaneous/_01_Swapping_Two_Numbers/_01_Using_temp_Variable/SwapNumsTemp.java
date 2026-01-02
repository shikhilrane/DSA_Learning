package _02_Array.Problems._08_Miscellaneous._01_Swapping_Two_Numbers._01_Using_temp_Variable;

// Swap two numbers using temp variable

public class SwapNumsTemp {
    public static void main(String[] args) {
        int a = 9;
        int b = 3;

        swapNums(a,b);
    }

    public static void swapNums(int a, int b){
        System.out.println("Value of a before swapping : " + a);
        System.out.println("Value of b before swapping : " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Value of a after swapping : " + a);
        System.out.println("Value of b after swapping : " + b);
    }
}
