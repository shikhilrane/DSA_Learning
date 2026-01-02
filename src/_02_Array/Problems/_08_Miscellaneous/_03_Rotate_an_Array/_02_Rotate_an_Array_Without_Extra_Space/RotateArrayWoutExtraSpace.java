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
        k = k % n;
        reverse(a, 0, n-k-1);
        reverse(a, n-k, n-1);
        reverse(a, 0, n-1);
    }

    public static void reverse(int[] a, int i, int j){
        while (i < j){
            swapInArray(a,i,j);
            i++;
            j--;
        }
    }

    public static void swapInArray(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
