package _02_Array.Problems._09_Two_Pointers._01_Sort_Array_Consisting_of_0_and_1;

// Sort an Array consisting of only 0s and 1s in ascending order.

public class SortArray {
    public static void main(String[] args) {
        int[] array = {1,0,0,1,0,1,1,0,0,0};

        returnSortedArray(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void returnSortedArray(int[] a){
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                count++;
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (i < count){
                a[i] = 0;
            }
            else {
                a[i] = 1;
            }
        }
    }
}
