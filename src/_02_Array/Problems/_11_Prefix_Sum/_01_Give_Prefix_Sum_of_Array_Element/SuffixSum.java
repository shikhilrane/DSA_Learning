package _02_Array.Problems._11_Prefix_Sum._01_Give_Prefix_Sum_of_Array_Element;

public class SuffixSum {
    public static void main(String[] args) {
        int[] arr = {2,1,3,4,5};

        int[] ints = makeSuffixSumArray(arr);

        for (int i : ints){
            System.out.println(i);
        }
    }

    public static int[] makeSuffixSumArray(int[] a){
        for (int i = a.length - 2; i >= 0; i--) {   // Start from second last element
            a[i] = a[i] + a[i + 1];                 // Add next element sum to current value
        }
        return a;                                   // Return array after converting it to suffix sum
    }
}

/*
    Logic (Suffix Sum – In-place):

    1. Start from the second last element of the array.
    2. Add the next element’s value to the current element.
    3. Store the result back in the same array.

    In short:
        Each element stores the sum of all elements after it.
*/
