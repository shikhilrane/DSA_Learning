package _02_Array.Problems._10_Two_Pointers._03_Sort_Array_of_Squares;

// Given an integer array 'a' sorted in non-decreasing order, return an array of the squares od each number sorted in non-decreasing order.
// NOTE : non-decreasing = 1,2,2,3 and Increasing = 1,2,3

public class SortArrayOfSq {
    public static void main(String[] args) {
        int[] a = {-10,-3,-2,1,4,5};

        int[] ints = returnArrayOfSquare(a);

        for (int i : ints){
            System.out.println(i);
        }
    }

    public static int[] returnArrayOfSquare(int[] a){
        int left = 0;                           // Pointer starting from left side
        int right = a.length - 1;               // Pointer starting from right side

        int[] ans = new int[a.length];          // New array to store squared values
        int k = 0;                              // Index to fill ans array

        while (left <= right){                  // Continue until both pointers cross

            if (Math.abs(a[left]) > Math.abs(a[right])) { // Compare absolute values
                ans[k] = a[left] * a[left];     // Store square of left value
                k++;                            // Move to next position in ans
                left++;                         // Move left pointer
            }
            else {                              // Right value has bigger or equal absolute value
                ans[k] = a[right] * a[right];   // Store square of right value
                k++;                            // Move to next position in ans
                right--;                        // Move right pointer
            }
        }

        reverse(ans);                           // Reverse array because larger squares were added first

        return ans;                             // Return sorted squared array
    }

    public static void reverse(int[] a){
        int i = 0;                  // Start pointer
        int j = a.length - 1;       // End pointer
        while (i < j){              // Reverse until pointers meet
            swap(a, i, j);          // Swap values
            i++;                    // Move start forward
            j--;                    // Move end backward
        }
    }

    public static void swap(int[] a, int i, int j){
        int temp = a[i];    // Store first value
        a[i] = a[j];        // Replace first with second
        a[j] = temp;        // Put stored value in second
    }

}
