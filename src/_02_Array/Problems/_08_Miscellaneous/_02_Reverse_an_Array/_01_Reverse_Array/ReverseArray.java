package _02_Array.Problems._08_Miscellaneous._02_Reverse_an_Array._01_Reverse_Array;

// Reverse an array creating another array

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int[] reversedArray = reversed(arr);
        for (int i : reversedArray){
            System.out.println(i);
        }
    }

    public static int[] reversed(int[] a){
        int[] ans = new int[a.length];
        int j = 0;
        for (int i = a.length-1; i >= 0; i--) {
            ans[j] = a[i];
            j++;
        }
        return ans;
    }
}
