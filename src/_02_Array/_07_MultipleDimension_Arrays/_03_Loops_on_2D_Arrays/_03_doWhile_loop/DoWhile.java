package _02_Array._07_MultipleDimension_Arrays._03_Loops_on_2D_Arrays._03_doWhile_loop;

public class DoWhile {
    public static void main(String[] args) {

        // 1st way to create 2D Array

        int firstArr[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(firstArr[1][2]);             // this is how we can access specific element of an array
        int i = 0;
        do{
            int j = 0;
            do{
                System.out.print(firstArr[i][j] + " ");
                j++;
            }while (j<firstArr.length);                 // This loop will iterate over column of 2D array
            i++;
            System.out.println();
        }while (i<firstArr.length);                     // This loop will iterate over rows of 2D array

        // i*(j+n) (means when number of column greater than number of rows)
        int secondArr[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        int k = 0;
        do{
            int l = 0;
            do{
                System.out.print(secondArr[k][l] + " ");
                l++;
            }while (l<secondArr.length+1);              // here we've to add number, that states how many extra columns than rows
            k++;
            System.out.println();
        }while (k<secondArr.length);                    // This loop will iterate over rows of 2D array

        System.out.println();

        // (i+n)*j (means when number of rows greater than number of columns)
        int thirdArr[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}
        };
        int n = 0;
        do{
            int m = 0;
            do{
                System.out.print(thirdArr[n][m] + " ");
                m++;
            }while (m<thirdArr[n].length);              // This loop will iterate over column of 2D array, we've to state, [i] if rows>columns
            n++;
            System.out.println();
        }while (n<thirdArr.length);                     // This loop will iterate over rows of 2D array

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
        int a = 0;
        do{
            int b = 0;
            do{
                System.out.print(myArr[a][b] + " ");
                b++;
            }while (b<myArr.length);                        // This loop will iterate over column of 2D array
            a++;
            System.out.println();
        }while (a<myArr.length);                            // This loop will iterate over rows of 2D array

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
        int c = 0;
        do{
            int d = 0;
            do{
                System.out.print(newArr[c][d] + " ");
                d++;
            }while (d<newArr.length+1);                         // here we've to add number, that states how many extra columns than rows
            c++;
            System.out.println();
        }while (c<newArr.length);                               // This loop will iterate over rows of 2D array

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
        int e = 0;
        do{
            int f = 0;
            do{
                System.out.print(urArr[e][f] + " ");
                f++;
            }while (f<urArr[e].length);                 // This loop will iterate over column of 2D array, we've to state, [i] if rows>columns
            e++;
            System.out.println();
        }while (e<urArr.length);                        // This loop will iterate over rows of 2D array
    }
}
