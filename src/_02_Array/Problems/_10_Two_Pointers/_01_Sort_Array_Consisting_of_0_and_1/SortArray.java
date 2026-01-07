package _02_Array.Problems._10_Two_Pointers._01_Sort_Array_Consisting_of_0_and_1;

// Sort an Array consisting of only 0s and 1s in ascending order.

public class SortArray {
    public static void main(String[] args) {

        int[] array = {1,0,0,1,0,1,1,0,0,0}; // Array with only 0 and 1

        returnSortedArray(array); // Sort array so all 0 come first, then 1

        for (int i = 0; i < array.length; i++) { // Go through the array
            System.out.println(array[i]); // Print each value
        }
    }

    public static void returnSortedArray(int[] a){

        int count = 0; // Count how many 0 are there

        for (int i = 0; i < a.length; i++) { // Check each element
            if (a[i] == 0) { // If element is 0
                count++; // Increase zero count
            }
        }

        for (int i = 0; i < a.length; i++) { // Fill array again
            if (i < count){ // First positions
                a[i] = 0; // Put 0
            }
            else { // Remaining positions
                a[i] = 1; // Put 1
            }
        }
    }


}
