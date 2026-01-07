package _02_Array.Problems._03_Count_Num_of_Elems_Strictly_Greater_than_value_x;

// Program to count number of elements strictly than value x

public class StrictlyGreater {
    public static void main(String[] args) {
        int[] arr = {4,2,6,7,1,9,5,8};
        int x = 5;

        System.out.println("There are " + countGreater(arr,x) + " number of elements which are greater than " + x);
    }

    public static int countGreater(int[] a, int num){
        int count = 0;                          // Created a counter that starts from 0
        for (int i = 0; i < a.length; i++) {    // Traverse the array till its length
            if (a[i] > num) {                   // If element from array greater than targeted number
                count++;                        // Then increase the count
            }
        }
        return count;                           // Return the count
    }
}
