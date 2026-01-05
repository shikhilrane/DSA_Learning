package _02_Array.Problems._10_Prefix_Sum._01_Give_Prefix_Sum_of_Array_Element;

// Given an integer array 'a', return the prefix sum / running sum in the same array without creating new array

public class PrefixSum_Optimised {
    public static void main(String[] args) {
        int[] arr = {2,1,3,4,5};

        int[] ints = makePrefixSumArray(arr);

        for (int i : ints){
            System.out.println(i);
        }
    }

    public static int[] makePrefixSumArray(int[] a){
        for (int i = 1; i < a.length; i++) {
            a[i] = a[i] + a[i-1];
        }
        return a;
    }
}
