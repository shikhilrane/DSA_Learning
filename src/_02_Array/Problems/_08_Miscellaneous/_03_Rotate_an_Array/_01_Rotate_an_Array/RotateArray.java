package _02_Array.Problems._08_Miscellaneous._03_Rotate_an_Array._01_Rotate_an_Array;

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
        k = k % n;
        int[] ans = new int[n];
        int j = 0;

        for (int i = n-k; i < n; i++) {
            ans[j] = a[i];
            j++;
        }

        for (int i = 0; i < n-k ; i++) {
            ans[j] = a[i];
            j++;
        }

        return ans;
    }
}
