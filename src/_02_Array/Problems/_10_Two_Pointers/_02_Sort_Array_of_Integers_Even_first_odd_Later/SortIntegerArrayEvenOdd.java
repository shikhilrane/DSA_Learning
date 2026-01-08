package _02_Array.Problems._10_Two_Pointers._02_Sort_Array_of_Integers_Even_first_odd_Later;

// Given an array of Integers 'a', move all the even integers at the beginning of the array followed by all odd integers. The relative order of odd or even integers does not matter. Return any array that satisfies the condition.

public class SortIntegerArrayEvenOdd {
    public static void main(String[] args) {
        int[] array = {3,5,8,5,3,2,6,8,3,6,9};

        sortedEvenOddArray(array);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void sortedEvenOddArray(int[] a){
        int left = 0;                       // Pointer starting from beginning
        int right = a.length - 1;           // Pointer starting from end

        while (left < right){               // Keep going until both pointers meet

            if (a[left] % 2 == 0) {         // If left number is even
                left++;                     // It is in correct place, move left
            }
            else if (a[right] % 2 == 1) {   // If right number is odd
                right--;                    // It is in correct place, move right
            }
            else {                          // Left has odd and right has even (wrong positions)
                swapping(a, left, right);   // Swap them
                left++;                     // Move left forward
                right--;                    // Move right backward
            }
        }
    }

    public static void swapping(int[] a, int i, int j){
        int temp = a[i];    // Store left value
        a[i] = a[j];        // Put right value on left
        a[j] = temp;        // Put stored value on right
    }
}

/*
    What the Question is Asking (Problem Understanding):

    You are given:
        - An integer array 'a' containing both even and odd numbers.

    Your task:
        - Rearrange the array so that:
              • All even numbers come first
              • All odd numbers come after the even numbers

    Important points mentioned in the question:
        - The relative order of even numbers does NOT matter
        - The relative order of odd numbers does NOT matter
        - Any valid arrangement is acceptable

    What this means:
        - You do NOT need to sort the array
        - You only need to separate even and odd numbers

    Example:
        Input:
            {3, 5, 8, 5, 3, 2, 6, 8, 3, 6, 9}

        One valid output:
            {8, 2, 6, 8, 6, 3, 5, 5, 3, 3, 9}

        Another valid output:
            {2, 6, 8, 6, 8, 3, 5, 5, 3, 3, 9}

        (Order can differ, that’s okay)

    What the question expects:
        - Do this efficiently
        - Prefer in-place solution (no extra array)
        - Use logical pointers instead of sorting

    In short:
        Separate even and odd numbers,
        putting evens first and odds later.
*/


/*
    Logic (Two Pointer):

    1. Use two pointers: one from start, one from end.
    2. Move left pointer if it already has an even number.
    3. Move right pointer if it already has an odd number.
    4. If left is odd and right is even, swap them.
    5. Repeat until both pointers meet.

    In short:
        Bring all even numbers to the left
        and all odd numbers to the right.
*/
