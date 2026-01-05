package _02_Array.Problems._09_Two_Pointers._02_Sort_Array_of_Integers_Even_first_odd_Later;

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
        int left = 0;
        int right = a.length-1;

        while (left < right){
            if (a[left]%2 == 0) {
                left++;
            } else if (a[right]%2 == 1) {
                right--;
            } else {
                swapping(a,left,right);
                left++;
                right--;
            }
        }
    }

    public static void swapping(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
