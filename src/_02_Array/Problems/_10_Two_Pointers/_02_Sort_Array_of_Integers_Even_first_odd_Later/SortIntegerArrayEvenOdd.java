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
