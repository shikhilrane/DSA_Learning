package _02_Array.Problems._09_Miscellaneous._03_Rotate_an_Array._01_Rotate_an_Array;

// Rotate the given array 'a' by 'k' steps, where k is non-negative. (NOTE : k can be greater than n as well)

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 5;
        int[] rotatedArray = rotate(arr,k);

        for (int i = 0; i < rotatedArray.length; i++) {
            System.out.println(rotatedArray[i]);
        }
    }

    public static int[] rotate(int[] a, int k){
        int n = a.length;
        k = k % n;                  // to reduce the number of operations
        int[] ans = new int[n];     // Created new array with same length of existing array
        int j = 0;                  // Set pointer for new array to 0

        for (int i = n-k; i < n; i++) { // start array from n-k (e.g. 7-5=2) i.e. from second index till last index
            ans[j] = a[i];              // Start putting elements from 2nd index of existing array in new array's 1st index
            j++;                        // Increase the pointer for 2nd array
        }

        for (int i = 0; i < n-k ; i++) {    // Traverse existing array from first index to n-k (e.g. 7-5=2)
            ans[j] = a[i];                  // Start putting elements from 1st index of existing array in new array's remaining index
            j++;
        }

        return ans;
    }
}

/*
    Logic:
        1. Find the length of the array `n`.
        2. Reduce the value of k using:
              k = k % n
              it reduces number of operations like if we pass here 5 then it will be same for its all multiples like 5,15,20,25,....
              so to reduce the number of operations, we first take modulo of any input number
              e.g. if,
              k = 5;
              it will rotate 5 times : 1,2,3,4,5,6,7 to 3,4,5,6,7,1,2
              k = 10;
              it will rotate 10 times : 1,2,3,4,5,6,7 to 3,4,5,6,7,1,2     So o/p remains constant for fewer numbers of operations so we do this.
           This handles cases where k is greater than the array length.
        3. Create a new array `ans` of size n to store the rotated result.
        4. Copy the last k elements of the original array into the new array:
           - Start from index (n - k) to (n - 1)
           - Place them from index 0 onward in the new array.
           e.g. -
                if k = 5
                1 2 | 3 4 5 6 7
                        ^
                      this will go in front (this is n-k)
        5. Copy the remaining elements (from index 0 to n - k)
           into the new array after the first k elements.
        6. Return the new array which represents the rotated array.


        Example :
            array = 1 2 3 4 5 6 7
            k = 5

            so it is,
            1 2 | 3 4 5 6 7
            firstPart | secondPart

            new array = 0 0 0 0 0 0 0
            after adding second part from existing array = 3 4 5 6 7 0 0
            after adding first part from existing array = 3 4 5 6 7 1 2
*/
