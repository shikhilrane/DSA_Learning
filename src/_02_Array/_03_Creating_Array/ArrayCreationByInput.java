package _02_Array._03_Creating_Array;

import java.util.Scanner;

public class ArrayCreationByInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements you put in array : ");
        int inputs = sc.nextInt();  // Taking input for total numbers of inputs we want to put

        int[] array = new int[inputs];

        for (int i = 0; i < array.length; i++) {    // Traverse a loop to put all the elements in an array
            System.out.print("Enter value for index " + i + " : ");
            array[i] = sc.nextInt();    // It will keep put every entry in an array
        }

        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }
    }
}
