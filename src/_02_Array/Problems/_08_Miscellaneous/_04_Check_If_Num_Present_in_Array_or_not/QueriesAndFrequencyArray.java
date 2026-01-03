package _02_Array.Problems._08_Miscellaneous._04_Check_If_Num_Present_in_Array_or_not;

// Given Q queries, check if the given number is present in the array or not
// NOTE : Value of all the elements in the array is less than 10 to the power 5

import java.util.Scanner;

public class QueriesAndFrequencyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1 : Taking input for number of elements we are going to put in array
        System.out.print("Enter number of inputs for array : ");
        int n = sc.nextInt();

        // Step 2 : Gave length to the array w.r.t. input
        int[] arr = new int[n];

        // Step 3 : Enter elements according to the length
        System.out.println("Enter " + n + " elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 7 : Call the array
        int[] freq = makeFrequencyArray(arr);

        // Step 8 : Call the number of queries you want to ask
        System.out.println("Enter number of queries : ");
        int q = sc.nextInt();

        // Step 9 : Use while to iterate according to q
        while (q > 0){
            // Step 10 : Start asking queries
            System.out.print("Enter number to search : ");
            int x = sc.nextInt();
            // Step 11 : If any query found in array then return 'YES' else 'NO'
            if (freq[x] > 0) {
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
            q--;
        }
    }

    // Step 4 : Create a method that return frequency array
    public static int[] makeFrequencyArray(int[] a){
        // Step 5 : Created an array and its capacity is 10 raise to power 5 (Given in the question)
        int[] freq = new int[100001];
        // Step 6 : keep putting traverse an array
        for (int i = 0; i < a.length; i++) {
            freq[a[i]]++;   // It will count the frequency of array elements from array (if in array, 4 comes 2 times then it will count as 2)
        }
        return freq;
    }
}
