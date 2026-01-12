package _02_Array.Problems.Snippets._12_Prefix_Sum;

public class Prefix_Sum {
    public static int[] makePrefixSumArray(int[] a){
        int[] prefixSumArray = new int[a.length];
        prefixSumArray[0] = a[0];               // first (i.e. 0th index) will be always same so first we stored it like this
        int j = 1;                              // Initialise pointer for prefixSumArray from 1
        for (int i = 1; i < a.length; i++) {    // Start from second element
            prefixSumArray[j] = a[i] + a[i-1];  // Add previous sum to current value
            j++;                                // Incremented pointer for prefixSumArray
        }
        return prefixSumArray;                  // Return array after converting it to prefix sum
    }
}
