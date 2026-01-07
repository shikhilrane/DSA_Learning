package _02_Array.Problems._11_Prefix_Sum._01_Give_Prefix_Sum_of_Array_Element;

// Given an integer array 'a', return the prefix sum / running sum
// Prefix Sum : An array where each index stores the sum of all elements from index 0 to that index.

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {2,1,3,4,5};

        int[] ints = makePrefixSumArray(arr);

        for (int i : ints){
            System.out.println(i);
        }
    }

    public static int[] makePrefixSumArray(int[] a){
    int[] pref = new int[a.length];             // New array to store prefix sums
        pref[0] = a[0];                         // First prefix value is same as first element
        for (int i = 1; i < a.length; i++) {    // Start from second element
            pref[i] = pref[i-1] + a[i];         // Add current value to previous sum
        }
        return pref;                            // Return prefix sum array
    }
}

/*
    Understanding Prefix Sum :
    if,
        int[] a = {2,1,3,4,5};
          index =  0,1,2,3,4

        pref = 2,3,6,10,15
         i   = 0,1,2,3,4

         pref[0] = a[0]
         pref[1] = pref[0] + a[1]
         pref[2] = pref[1] + a[2]
         pref[3] = pref[2] + a[3]
         pref[4] = pref[3] + a[4]

         So formula for prefix =
            pref[i] = pref[i-1] + array[i]
 */