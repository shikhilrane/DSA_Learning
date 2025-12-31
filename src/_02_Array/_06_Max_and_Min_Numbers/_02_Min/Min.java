package _02_Array._06_Max_and_Min_Numbers._02_Min;

// This is a program to find lowest number amongst the element of an array
// java.lang is automatically imported in every Java program, you do not need to explicitly import it to use Integer.MAX_VALUE

public class Min {
    public static void main(String[] args) {
        int nums[] = {46,43,45,44,47};                  // 1.
        System.out.println(getLowestWL(nums));          // 8
    }

    // Finding Minimum Number using for loop
    public static int getLowestFL(int lowNum[]){        // 2.
        int lowestNumber = Integer.MAX_VALUE;           // 3.
        for (int i = 0; i < lowNum.length; i++) {       // 4.
            if (lowestNumber>lowNum[i]) {               // 5.
                lowestNumber = lowNum[i];               // 6.
            }
        }
        return lowestNumber;                            // 7.
    }

    // Finding Minimum Number using forEach loop
    public static int getLowestFE(int lowNum[]){
        int lowestNumber = Integer.MAX_VALUE;
        for (int i : lowNum) {
            if (lowestNumber>i) {
                lowestNumber = i;
            }
        }
        return lowestNumber;
    }

    // Finding Minimum Number using while loop
    public static int getLowestWL (int lowNum[]){
        int lowestNumber = Integer.MAX_VALUE;
        int i = 0;
        while (i<lowNum.length) {
            if (lowestNumber>lowNum[i]) {
                lowestNumber = lowNum[i];
            }
            i++;
        }
        return lowestNumber;
    }

    // Finding Minimum Number using do-while loop
    public static int getLowestDWL (int lowNum[]){
        int lowestNumber = Integer.MAX_VALUE;
        int i = 0;
        do {
            if (lowestNumber>lowNum[i]) {
                lowestNumber = lowNum[i];
            }
            i++;
        } while (i<lowNum.length);
        return lowestNumber;
    }
}

/*
    1. made a int type of array.
    2. made a function that return lowest number and passed parameter as int type of array.
    3. We saved lagest number (i.e. Integer.MAX_VALUE = infinity) to compare it with our array.
    4. Used a for loop to iterate over array.
    5. if lowest number(i.e. Integer.MAX_VALUE, it will update as loop check executes) is greater than element of array
    6. that number will be get stored in that variable (i.e. int lowestNumber) instead of previous number
    7. return that lowest number after execution of loop
    8. o/p in main function
*/