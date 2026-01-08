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

/*
    What the Question is Asking:

    You are given an array and multiple range queries.

    For each query (l, r):
        - You need to find the sum of elements
          from index l to index r.

    Doing this with loops for every query is slow.

    So the question expects you to:
        - Pre-calculate prefix sum once
        - Answer each query in O(1) time

    In short:
        Preprocess the array so that
        range sum queries become fast.
*/


/*
    Logic (Prefix Sum Queries):

    1. Build prefix sum array.
    2. prefixSum[i] stores sum from index 1 to i.
    3. For any query (l, r):
           sum = prefixSum[r] - prefixSum[l - 1]

    In short:
        Precompute prefix sum once,
        answer each query in constant time.
*/
