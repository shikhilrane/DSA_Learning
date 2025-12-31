package _02_Array._05_Array_Call_by_Reference;

// Passing array as an argument in a function
// array as an argument works on concept "call by reference" as it changes values in an original array

public class ArrayAsFunction {
    public static void main(String[] args) {
        int marks[] = {94,95,96};                   // 1

        for (int i = 0; i < marks.length; i++) {    // 5
            System.out.println(marks[i]);
        }

        updation(marks);                            // 3
        for (int i = 0; i < marks.length; i++) {    // 4
            System.out.println(marks[i]);
        }
    }
    public static void updation(int uMarks[]){       // 2
        for (int i = 0; i < uMarks.length; i++) {
            uMarks[i] = uMarks[i] + 1;
        }
    }
}

/*
    1. we made an array
    2. passed this array in an function to update value by 1
    3. called a function
    4. whenever we want to use that array, after updation() function original value got updated in the main function as well
    5. before updation function, value of array elements will be as it is

    as we know original value of array got changed in a main function so that we can say that array as a fucntion works on the concept of "call by reference" method
 */