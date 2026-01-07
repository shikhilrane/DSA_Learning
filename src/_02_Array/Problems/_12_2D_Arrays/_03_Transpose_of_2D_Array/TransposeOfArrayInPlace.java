package _02_Array.Problems._12_2D_Arrays._03_Transpose_of_2D_Array;

// Write s program to display Transpose of 2D array without creating new array
// NOTE : Inplace transpose can be only happen in square matrix

public class TransposeOfArrayInPlace {
    public static void main(String[] args) {
        int[][] array = {
                {2,3,4,5},
                {1,2,3,4},
                {8,5,4,7},
                {5,2,9,4}
        };

        findTranspose(array,4,4);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void findTranspose(int[][] a, int r, int c){
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                swap(a,i,j);
            }
        }
    }

    public static void swap(int[][] a, int i, int j){
        int temp = a[i][j];
        a[i][j] = a[j][i];
        a[j][i] = temp;
    }
}

/*
                {2,3,4,5},
                {1,2,3,4},
                {8,5,4,7},
                {5,2,9,4}

                {2,1,8,5},
                {3,2,5,2},
                {4,3,4,9},
                {5,4,7,4}

                {a00,a01,a02,a03},
                {a10,a11,a12,a13},
                {a20,a21,a22,a23},
                {a30,a31,a32,a33}
*/