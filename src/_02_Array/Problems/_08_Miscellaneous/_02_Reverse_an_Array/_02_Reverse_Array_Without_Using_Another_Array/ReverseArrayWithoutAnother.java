package _02_Array.Problems._08_Miscellaneous._02_Reverse_an_Array._02_Reverse_Array_Without_Using_Another_Array;

// Reverse an array without creating another array

public class ReverseArrayWithoutAnother {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        reverseOriginalArray(arr);

        for (int x : arr) {
            System.out.println(x);
        }
    }

    public static void reverseOriginalArray(int[] a){
        int i = 0;
        int j = a.length-1;

        while (i < j){
            swapInArray(a,i,j);
            i++;
            j--;
        }
    }

    public static void swapInArray(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
