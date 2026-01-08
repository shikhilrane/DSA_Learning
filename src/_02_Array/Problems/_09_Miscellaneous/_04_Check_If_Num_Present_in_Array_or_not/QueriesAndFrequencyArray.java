package _02_Array.Problems._09_Miscellaneous._04_Check_If_Num_Present_in_Array_or_not;

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
                System.out.println("YES, query " + x + " is present in the array");
            }else {
                System.out.println("NO, query " + x + " is not present in the array");
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
            freq[a[i]]++;   // Increment frequency of element a[i]. (if in array, 4 comes 2 times then it will count as 2)
        }
        return freq;
    }
}

/*
    What the Question is Asking (Problem Understanding):

    You are given:
        - An integer array
        - Q queries
        - Each query contains a number x

    Your task:
        - For every query, check whether the given number x
          is present in the array or not.

    Important condition given:
        - All values in the array are less than 10^5
        - This allows us to use a frequency array

    What the question wants you to do:
        - Preprocess the array so that each query
          can be answered quickly
        - Instead of searching the array again and again

    How presence is checked:
        - If the number appears at least once → print "YES"
        - If the number does not appear → print "NO"

    Example:
        Array:
            {2, 4, 6, 4, 9}

        Queries:
            4 → YES (present twice)
            5 → NO
            9 → YES

    Why frequency array is used:
        - Direct searching for each query is slow
        - Frequency array allows O(1) lookup
        - Index represents the number
        - Value represents how many times it appears

    In short:
        Answer multiple presence queries efficiently
        using a frequency array.
*/


/*
    Logic :
        There is an array whose size can be up to 10 raise to power 5 (as per given in question)
        so,
            array = 4, 6, 3, 5, 8, 6, 5, 78, 54, 768, 757, 5456, 6565, 3, 65775, 5, 54656, ...
        In this array there can be 10 raise to power 5 elements
        and user will ask few continues queries to ask if these queries is present or not in this given array

        So, there can be 100000 elements according to size, so array has to traverse fully for every single query, so it will increase the TC
        so to reduce this problem we will use frequency array,
            Frequency array stores the count of number of elements from given array. e.g. If 4 present 3 times then it will set frequency of 4 to 3
        So when user puts a query, like 4 then it will check in frequency array, if frequency of 4 is greater than 0 or not(because the element whose frequency greater than 0, that element is present in frequency array),
            If, yes it will return the 'YES' from frequency array
            else, no it will return the 'NO' from frequency array





    Visualisation :
        array = 4, 6, 3, 5, 8, 6, 5, 78, 54, 768, 757, 5456, 6565, 3, 65775, 5, 54656, ...
                                         3
                                   2     2  2
              Frequency =          1  1  1  1     1
        Frequency Array = 0, 0, 0, 0, 0, 0, 0, 0, 0, .......
                 Index  = 0  1  2  3  4  5  6  7  8  .......


        Frequency Counting
        ------------------
        Element → Count
        3     → 2
        4     → 1
        5     → 3
        6     → 2
        8     → 1
        78    → 1
        54    → 1
        768   → 1
        757   → 1
        5456  → 1
        6565  → 1
        65775 → 1
        54656 → 1


        Explanation
        -----------
        • Index of frequency array represents the number itself
        • Value at that index represents how many times it occurs
        • Example:
            freq[5] = 3  → number 5 occurs three times
            freq[3] = 2  → number 3 occurs two times
*/