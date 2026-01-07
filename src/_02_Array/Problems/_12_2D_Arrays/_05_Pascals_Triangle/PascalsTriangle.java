package _02_Array.Problems._12_2D_Arrays._05_Pascals_Triangle;

// Given an integer n, return the first n rows of Pascal's Triangle.
// In Pascal's Triangle, each number is the sum of two numbers directly above it

public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 10;

        int[][] pt = pascal(n);

        for (int i = 0; i < pt.length; i++) {
            for (int j = 0; j < pt[i].length; j++) {
                System.out.print(pt[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] pascal(int n){
        int[][] ans = new int[n][];

        for (int i = 0; i < n; i++) {
            ans[i] = new int[i+1];
            ans[i][0] = ans[i][i] = 1;

            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }

        return ans;
    }
}

/*
    Properties of Pascal's triangle :
    1. p[i][j] = p[i-1][j] + p[i-1][j-1]
    2. In every row, first and last element = 1
    3. Jagged Array = ith row has (i+1) columns
*/