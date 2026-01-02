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
        int[] ans = new int[a.length];              // Create new array with same length of existing array
        int j = 0;                                  // Initialise pointer for newly new array
        for (int i = a.length-1; i >= 0; i--) {     // Traverse the array reversely
            ans[j] = a[i];                          // Start adding elements from first index of newly created array, from last index of existing array
            j++;                                    // Update the pointer for newly created array
        }
        return ans;
    }
}

/*
    Logic :
        Create new array and start adding element from last index of existing array in new array

    Example :
        array = 1,2,3,4,5
        new array = 0,0,0,0,0

        In loop, new array = 5,4,3,2,1
*/
