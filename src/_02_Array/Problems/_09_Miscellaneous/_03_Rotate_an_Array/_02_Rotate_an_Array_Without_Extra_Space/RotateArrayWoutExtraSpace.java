package _02_Array.Problems._09_Miscellaneous._03_Rotate_an_Array._02_Rotate_an_Array_Without_Extra_Space;

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
    What the Question is Asking:

    You are given:
        - An integer array 'a'
        - A non-negative integer 'k'

    Your task:
        - Rotate the array to the right by 'k' steps
        - Do this WITHOUT using any extra array (in-place)

    Important note:
        - k can be greater than the length of the array (n)
        - So you must first reduce k using:
              k = k % n

    What "rotate by k steps" means:
        - Elements shifted to the right
        - Elements that move past the end
          come back to the front

    Example:
        Array = {1, 2, 3, 4, 5, 6, 7}
        k = 5

        After rotation:
            {3, 4, 5, 6, 7, 1, 2}

    What the question expects:
        - No extra space (no new array)
        - Efficient solution
        - Correct handling of large k values

    In short:
        Rotate the array to the right by k positions
        using only the given array.
*/


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
