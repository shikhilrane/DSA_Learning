package _02_Array.Problems._06_Return_Arr_With_Max_and_Min_num;

// Return the array that contain first and the last index of the sorted array

import java.util.Arrays;

public class ReturnArrWithMinMax {
    public static void main(String[] args) {
        int[] arr = {3,4,1,8,5,2,7};

        int[] newArray = returnMaxMin(arr);
        System.out.println(newArray[0]);
        System.out.println(newArray[1]);
    }

    public static int[] returnMaxMin(int[] a){
        Arrays.sort(a);                         // sort the array first
        int[] array = {a[0],a[a.length-1]};     // save first element and last element in array
        return array;                           // return array
    }
}
