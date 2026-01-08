package _02_Array.Problems._09_Miscellaneous._02_Reverse_an_Array._02_Reverse_Array_Without_Using_Another_Array;

// Reverse an array without creating another array

public class ReverseArrayWithoutAnother {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        reverseOriginalArray(arr);

        for (int x : arr) {
            System.out.println(x);
        }
    }

    public static void reverseOriginalArray(int[] a){
        int i = 0;                      // Pointer starting from first index
        int j = a.length - 1;           // Pointer starting from last index

        while (i < j) {                 // Continue until both pointers meet
            swapInArray(a, i, j);       // Swap elements at index i and j
            i++;                        // Move i forward
            j--;                        // Move j backward
        }
    }

    public static void swapInArray(int[] a, int i, int j){
        int temp = a[i];                // Store value at index i
        a[i] = a[j];                    // Replace value at index i with value at j
        a[j] = temp;                    // Assign stored value to index j
    }
}

/*
    What the Question is Asking (Problem Understanding):

    You are given:
        - An integer array.

    Your task:
        - Reverse the array.
        - Do this WITHOUT creating any new array.

    Important constraints:
        - You must modify the same array (in-place).
        - No extra array or extra space should be used.

    What “reverse the array” means:
        - First element becomes last
        - Second element becomes second last
        - And so on

    Example:
        Input:
            {1, 2, 3, 4, 5, 6}

        Output:
            {6, 5, 4, 3, 2, 1}

    What the question expects:
        - Use index manipulation instead of extra memory
        - Typically solved using the two-pointer technique

    In short:
        Reverse the array by swapping elements
        from both ends without using extra space.
*/


/*
    Logic:
        1. Use two pointers:
           - One starting from the beginning of the array (i)
           - One starting from the end of the array (j)
        2. Swap the elements at index i and j.
        3. Move i forward and j backward.
        4. Repeat until i is less than j.
        5. This reverses the array in place without using extra space.

     Example :
        evenArray = 1 2 3 4 5 6
                ^         ^
                i         j

                6 2 3 4 5 1
                  ^     ^
                  i     j

                6 5 3 4 2 1
                    ^ ^
                    i j

                6 5 4 3 2 1     = Answer



         oddArray =  1 2 3 4 5
                     ^       ^
                     i       j

                     5 4 3 2 1
                       ^   ^
                       i   j

                     5 4 3 2 1
                         ^
                         i

                     5 4 3 2 1     = Answer
*/
