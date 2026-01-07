package _02_Array.Problems._12_2D_Arrays._04_Rotate_2D_Array;

// Given a square matrix, turn it by 90 degrees in a clockwise direction without using any extra space

public class RotateArray {
    public static void main(String[] args) {
        int[][] array = {
                {2,3,4,5},
                {1,2,3,4},
                {8,5,4,7},
                {5,2,9,4}
        };

        rotate(array,4);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotate(int[][] a, int n){
        transpose(a,n,n);
        for (int i = 0; i < a.length; i++) {
            reverse(a[i]);
        }
    }

    public static void reverse(int[] a){
        int i = 0;
        int j = a.length - 1;

        while (i < j) {
            swapForReverse(a, i, j);
            i++;
            j--;
        }
    }

    public static void swapForReverse(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void transpose(int[][] a, int r, int c){
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                swapForTranspose(a,i,j);
            }
        }
    }

    public static void swapForTranspose(int[][] a, int i, int j){
        int temp = a[i][j];
        a[i][j] = a[j][i];
        a[j][i] = temp;
    }
}
