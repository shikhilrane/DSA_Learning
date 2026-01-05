package _02_Array.Problems._09_Two_Pointers._01_Sort_Array_Consisting_of_0_and_1;

public class SortArray_Optimised {
    public static void main(String[] args) {
        int[] array = {1,0,0,1,0,1,1,0,0};

        sortedArray(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void sortedArray(int[] a){
        int left = 0;
        int right = a.length-1;
        while (left < right){
            if (a[left] == 0) {
                left++;
            } else if (a[right] == 1) {
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
