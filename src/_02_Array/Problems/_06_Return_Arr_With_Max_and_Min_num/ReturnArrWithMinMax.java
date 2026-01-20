package _02_Array.Problems._06_Return_Arr_With_Max_and_Min_num;

// Return the array that contain first and the last index of the sorted array

import java.util.Arrays;

public class ReturnArrWithMinMax {
    public static void main(String[] args) {
        int[] arr = {3,4,1,8,5,2,7};

        int[] newArray = returnMaxMin(arr);
        System.out.println(newArray[0]);
        System.out.println(newArray[1]);

        returnMinAndMax(arr);
    }

    public static int[] returnMaxMin(int[] a){
        Arrays.sort(a);                         // sort the array first
        int[] array = {a[0],a[a.length-1]};     // save first element and last element in array
        return array;                           // return array
    }

    public static void returnMinAndMax(int[] a) {
        if (a.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        int min = a[0];
        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
