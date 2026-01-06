package _02_Array._07_MultipleDimension_Arrays._02_Ways_to_create_2D_Arrays;

public class ThreeDArrays {
    public static void main(String[] args) {
        int[][][] array = {
                {
                    {1,2,3},
                    {4,5,6},
                    {7,8,9,10}
                },

                {
                    {11,12,13},
                    {14,15,16},
                    {17,18,19,20}
                },

                {
                    {21,22,23},
                    {24,25,26},
                    {27,28,29,30}
                }

        };

        // Retrieving value from 3D array
        System.out.println(array[2][1][0]);

        // Loop on 3D array
        // For Loop
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        // ForEach Loop
        for(int[][] i : array){
            for (int[] j : i){
                for (int k : j){
                    System.out.print(k + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
