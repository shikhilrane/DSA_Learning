package _02_Array.Problems._07_Target_Sum_Pattern._02_Count_Number_of_Triplets;

// Count the number of triplets whose sum is equal to the given value x

public class NumberOfTriplets {
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,3};
        int targetSum = 12;

        System.out.println(countTriplets(arr,targetSum));
    }

    public static int countTriplets(int[] a, int num){
        int count = 0;                                  // Stores total number of valid triplets
        for (int i = 0; i < a.length; i++) {            // Traverse array on array
            for (int j = i+1; j < a.length; j++) {      // Traverse array from next index of i
                for (int k = j+1; k < a.length; k++) {  // Traverse array from next index of j
                    int n = a[i] + a[j] + a[k];         // Added first element of i, first element of j and first element of k
                    if (n == num) {                     // Check if sum equals the target value
                        count++;                        // Then increase the count
                    }
                }
            }
        }
        return count;
    }
}

/*
        Logic:

        1. Initialize a variable `count` to store the number of valid triplets.

        2. Use three nested loops:
           - Outer loop (i) picks the first element of the triplet.
           - Middle loop (j) starts from i + 1 and picks the second element.
           - Inner loop (k) starts from j + 1 and picks the third element.

        3. For every combination of i, j, and k:
           - Add the elements a[i], a[j], and a[k].
           - If the sum equals the target value, increment the count.

        4. Using i < j < k ensures:
           - No duplicate triplets
           - No reverse ordering of the same triplet

        5. After checking all possible triplets, return the count.

*/


/*
            ARRAY INDEX MAP
            ===============
            Index :   0     1     2     3     4
            Value :   1     4     5     6     3

            Target Sum = 12


            LOOP EXECUTION TRACE
            ===================

            i = 0  → a[i] = 1
            -------------------------------------------

              j = 1 → a[j] = 4
                k = 2 → 1 + 4 + 5 = 10 ❌
                k = 3 → 1 + 4 + 6 = 11 ❌
                k = 4 → 1 + 4 + 3 = 8  ❌

              j = 2 → a[j] = 5
                k = 3 → 1 + 5 + 6 = 12 ✅  count = 1
                k = 4 → 1 + 5 + 3 = 9  ❌

              j = 3 → a[j] = 6
                k = 4 → 1 + 6 + 3 = 10 ❌


            i = 1  → a[i] = 4
            -------------------------------------------

              j = 2 → a[j] = 5
                k = 3 → 4 + 5 + 6 = 15 ❌
                k = 4 → 4 + 5 + 3 = 12 ✅  count = 2

              j = 3 → a[j] = 6
                k = 4 → 4 + 6 + 3 = 13 ❌


            i = 2  → a[i] = 5
            -------------------------------------------

              j = 3 → a[j] = 6
                k = 4 → 5 + 6 + 3 = 14 ❌


            i = 3
            -------------------------------------------
            Not enough elements for triplet

            i = 4
            -------------------------------------------
            Not enough elements for triplet


            MATCHING TRIPLETS
            =================
            → (1, 5, 6)
            → (4, 5, 3)


            FINAL RESULT
            ============
            Total Triplets Count = 2
*/