package _02_Array.Problems._08_Miscellaneous._03_Rotate_an_Array._02_Rotate_an_Array_Without_Extra_Space;

// Rotate the given array 'a' by 'k' steps without extra space, where k is non-negative. (NOTE : k can be greater than n as well

public class RotateArrayWoutExtraSpace {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotateInPlace(arr,5);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void rotateInPlace(int[] a, int k){
        int n = a.length;
        k = k % n;                   // Reduce k if it is greater than array length
        reverse(a, 0, n-k-1);   // Reverse first (n - k) elements of the array
        reverse(a, n-k, n-1);   // Reverse last k elements of the array
        reverse(a, 0, n-1);     // Reverse the entire array to get final rotated array
    }

    public static void reverse(int[] a, int i, int j){
        while (i < j) {                   // Continue swapping until pointers meet
            swapInArray(a, i, j);         // Swap elements at index i and j
            i++;                          // Move left pointer forward
            j--;                          // Move right pointer backward
        }
    }

    public static void swapInArray(int[] a, int i, int j){
        int temp = a[i];                  // Store value at index i temporarily
        a[i] = a[j];                      // Replace value at index i with value at j
        a[j] = temp;                      // Assign stored value to index j
    }
}

/*
    Logic:
        1. Find the length of the array `n`.
        2. Reduce the value of k using:
              k = k % n
           This handles cases where k is greater than the array length.
        3. Reverse the first part of the array:
              reverse(a, 0, n - k - 1)
           This reverses the elements from index 0 to index (n - k - 1).
        4. Reverse the second part of the array:
              reverse(a, n - k, n - 1)
           This reverses the last k elements of the array.
        5. Reverse the entire array:
              reverse(a, 0, n - 1)
        6. After these three reversals, the array becomes rotated by k steps
           without using any extra space.


        Example :
            array = 1 2 3 4 5 6 7
            k = 5

            so it is,
            1 2 | 3 4 5 6 7
            firstPart | secondPart

            reverse firstPart   =   2 1 | 3 4 5 6 7
            reverse secondPart  =   2 1 | 7 6 5 4 3
            reverse whole array =   3 4 5 6 7 | 1 2 (done)
*/
