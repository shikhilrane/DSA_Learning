package _02_Array.Problems._08_Miscellaneous._01_Swapping_Two_Numbers._01_Using_temp_Variable;

// Swap two numbers using temp variable

public class SwapNumsTemp {
    public static void main(String[] args) {
        int a = 9;
        int b = 3;

        swapNums(a,b);
    }

    public static void swapNums(int a, int b){
        System.out.println("Value of a before swapping : " + a);    // 9
        System.out.println("Value of b before swapping : " + b);    // 3

        int temp = a;       // temp = 9
        a = b;              // a = 3
        b = temp;           // b = 9

        System.out.println("Value of a after swapping : " + a);     // 3
        System.out.println("Value of b after swapping : " + b);     // 9
    }
}

/*
    Logic :
        save value of a in temp, b in a and then temp in b
*/