package _02_Array.Problems.Snippets._07_Swap;

public class SwappingNumber {
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
