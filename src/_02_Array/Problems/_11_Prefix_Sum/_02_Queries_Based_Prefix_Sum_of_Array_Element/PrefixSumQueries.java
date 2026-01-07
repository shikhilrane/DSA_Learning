package _02_Array.Problems._11_Prefix_Sum._02_Queries_Based_Prefix_Sum_of_Array_Element;

// Check if we can partition the array into two subarrays into equal sum. More formally, check that the prefix sum of part of the array is equal to the suffix sum of rest of array

import java.util.Scanner;

public class PrefixSumQueries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements you want to add in array : ");
        int n = sc.nextInt();

        int[] arr = new int[n+1];

        System.out.print("Enter elements you want to add in array : ");
        for (int i = 1; i <= n ; i++) {
            arr[i] = sc.nextInt();
        }

        int[] prefixSum = makePrefixSumArray(arr);

        System.out.print("Enter number of queries you want to ask : ");
        int q = sc.nextInt();

        while (q > 0){
            System.out.print("Enter range : ");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = prefixSum[r] - prefixSum[l - 1];

            System.out.println("Sum : " + ans);
            q--;
        }
    }

    public static int[] makePrefixSumArray(int[] a){
        for (int i = 1; i < a.length; i++) { // Start from second element
            a[i] = a[i-1] + a[i];           // Add previous sum to current value
        }
        return a;                           // Return array after converting it to prefix sum
    }
}
