package _02_Array._06_Max_and_Min_Numbers._01_Max;

// This is a program to find largest number amongst the element of an array
// java.lang is automatically imported in every Java program, you do not need to explicitly import it to use Integer.MIN_VALUE

public class Max {
    public static void main(String[] args) {
        int nums[] = {46,43,49,44,47};                      // 1.
        System.out.println(getLargestWL(nums));             // 8.
    }

    // Finding Maximum Number using for loop
    public static int getLargestFL(int largeNum[]){         // 2.
        int largestNumber = Integer.MIN_VALUE;              // 3.
        for (int i = 0; i < largeNum.length; i++) {         // 4.
            if (largestNumber<largeNum[i]) {                // 5.
                largestNumber = largeNum[i];                // 6.
            }
        }
        return largestNumber;                               // 7.
    }

    // Finding Maximum Number using forEach loop
    public static int getLargestFE(int largeNum[]){
        int largestNumber = Integer.MIN_VALUE;
        for (int i : largeNum) {
            if (largestNumber<i) {
                largestNumber = i;
            }
        }
        return largestNumber;
    }

    // Finding Maximum Number using while loop
    public static int getLargestWL(int largeNum[]){
        int largestNumber = Integer.MIN_VALUE;
        int i = 0;
        while (i<largeNum.length) {
            if (largestNumber<largeNum[i]) {
                largestNumber = largeNum[i];
            }
            i++;
        }
        return largestNumber;
    }

    // Finding Maximum Number using do-while loop
    public static int getLargestDWL(int largeNum[]){
        int largestNumber = Integer.MIN_VALUE;
        int i = 0;
        do {
            if (largestNumber<largeNum[i]) {
                largestNumber = largeNum[i];
            }
            i++;
        } while (i<largeNum.length);
        return largestNumber;
    }
}

/*
    1. made a int type of array.
    2. made a function that return largest number and passed parameter as int type of array.
    3. We saved lowest number (i.e. Integer.MIN_VALUE = negative infinity) to compare it with our array.
    4. Used a for loop to iterate over array.
    5. if largest number(i.e. Integer.MIN_VALUE, it will update as loop check executes) is lower than element of array
    6. that number will be get stored in that variable (i.e. int largestNumber) instead of previous number
    7. return that largest number after execution of loop
    8. o/p in main function
 */