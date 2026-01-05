package _02_Array.Problems._09_Two_Pointers._03_Sort_Array_of_Squares;

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
        int left = 0;
        int right = a.length-1;

        int[] ans = new int[a.length];
        int k = 0;

        while (left <= right){
            if (Math.abs(a[left]) > Math.abs(a[right])) {
                ans[k] = a[left] * a[left];
                k++;
                left++;
            } else {
                ans[k] = a[right] * a[right];
                k++;
                right--;
            }
        }

        reverse(ans);

        return ans;
    }

    public static void reverse(int[] a){
        int i = 0;
        int j = a.length-1;
        while (i<j){
            swap(a,i,j);
            i++;
            j--;
        }
    }

    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
