package _02_Array._07_MultipleDimension_Arrays._03_Loops_on_2D_Arrays._01_for_loop;

public class ForLoop {
    public static void main(String[] args) {
        // 1st way to create 2D Array

        // i*j
        int firstArr[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(firstArr[1][2]);                 // this is how we can access specific element of an array
        for (int i = 0; i < firstArr.length; i++) {         // This loop will iterate over rows of 2D array
            for (int j = 0; j < firstArr[i].length; j++) {     // This loop will iterate over column of 2D array
                System.out.print(firstArr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // i*(j+n) (means when number of column greater than number of rows)
        int secondArr[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        for (int i = 0; i < secondArr.length; i++) {        // This loop will iterate over rows of 2D array
            for (int j = 0; j < secondArr[i].length; j++) {  // here we've to add number, that states how many extra columns than rows
                System.out.print(secondArr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // (i+n)*j (means when number of rows greater than number of columns)
        int thirdArr[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}
        };
        for (int i = 0; i < thirdArr.length; i++) {         // This loop will iterate over rows of 2D array
            for (int j = 0; j < thirdArr[i].length; j++) {  // This loop will iterate over column of 2D array, we've to state, [i] if rows>columns
                System.out.print(thirdArr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // 2nd way to create 2D arrays

        // i*j
        int myArr[][] = new int[3][3];
        myArr[0][0] = 1;
        myArr[0][1] = 2;
        myArr[0][2] = 3;
        myArr[1][0] = 4;
        myArr[1][1] = 5;
        myArr[1][2] = 6;
        myArr[2][0] = 7;
        myArr[2][1] = 8;
        myArr[2][2] = 9;
        System.out.println(myArr[1][0]);                // This is how we can access specific element of an array
        for (int i = 0; i < myArr.length; i++) {        // This loop will iterate over rows of 2D array
            for (int j = 0; j < myArr.length; j++) {    // This loop will iterate over column of 2D array
                System.out.print(myArr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // i*(j+n) (means when number of column greater than number of rows)
        int newArr[][] = new int[3][4];
        newArr[0][0] = 1;
        newArr[0][1] = 2;
        newArr[0][2] = 3;
        newArr[0][3] = 4;
        newArr[1][0] = 5;
        newArr[1][1] = 6;
        newArr[1][2] = 7;
        newArr[1][3] = 8;
        newArr[2][0] = 9;
        newArr[2][1] = 10;
        newArr[2][2] = 11;
        newArr[2][3] = 12;
        for (int i = 0; i < newArr.length; i++) {       // This loop will iterate over rows of 2D array
            for (int j = 0; j < newArr[i].length; j++) { // here we've to add number, that states how many extra columns than rows
                System.out.print(newArr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // (i+n)*j (means when number of rows greater than number of columns)
        int urArr[][] = new int[4][3];
        urArr[0][0] = 1;
        urArr[0][1] = 2;
        urArr[0][2] = 3;
        urArr[1][0] = 4;
        urArr[1][1] = 5;
        urArr[1][2] = 6;
        urArr[2][0] = 7;
        urArr[2][1] = 8;
        urArr[2][2] = 9;
        urArr[3][0] = 10;
        urArr[3][1] = 11;
        urArr[3][2] = 12;
        for (int i = 0; i < urArr.length; i++) {        // This loop will iterate over rows of 2D array
            for (int j = 0; j < urArr[i].length; j++) { // This loop will iterate over column of 2D array, we've to state, [i] if rows > columns
                System.out.print(urArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}