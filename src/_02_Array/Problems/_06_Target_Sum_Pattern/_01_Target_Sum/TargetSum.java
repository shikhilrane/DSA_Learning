package _02_Array.Problems._06_Target_Sum_Pattern._01_Target_Sum;

// Find the total number of pairs in the array whose sum is equal to the given value x

public class TargetSum {
    public static void main(String[] args) {
        int[] arr = {4,6,3,5,8,2};
        int targetSum = 7;

        System.out.println(targetCount(arr, targetSum));
    }

    public static int targetCount(int[] a, int num) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {            // Traverse an array
            for (int j = i+1; j < a.length; j++) {      // Traverse an array that starts from next index from i
                int n1 = a[i] + a[j];                   // Added first element of i and first element of j
                if (n1 == num) {                        // If sum is equal to target sum
                    count++;                            // Then increase the count
                }
            }
        }
        return count;
    }
}

/*
        Logic:

        1. Initialize a variable `count` to store the number of valid pairs.

        2. Use two nested loops:
           - Outer loop (i) picks the first element of the pair.
           - Inner loop (j) starts from i + 1 and picks the second element.

        3. For each pair (a[i], a[j]):
           - Add both elements.
           - If their sum is equal to the target value, increment the count.

        4. Using j = i + 1 ensures:
           - No element is paired with itself
           - Duplicate and reverse pairs are avoided

        5. After checking all possible pairs, return the count.
*/


/*
        Array       : [4, 6, 3, 5, 8, 2]
        Indexes     :  0  1  2  3  4  5
        Target Sum  : 7


        i = 0  (a[i] = 4)
        --------------------------------
        j = 1  → 4 + 6 = 10  ❌
        j = 2  → 4 + 3 = 7   ✅  count = 1
        j = 3  → 4 + 5 = 9   ❌
        j = 4  → 4 + 8 = 12  ❌
        j = 5  → 4 + 2 = 6   ❌


        i = 1  (a[i] = 6)
        --------------------------------
        j = 2  → 6 + 3 = 9   ❌
        j = 3  → 6 + 5 = 11  ❌
        j = 4  → 6 + 8 = 14  ❌
        j = 5  → 6 + 2 = 8   ❌


        i = 2  (a[i] = 3)
        --------------------------------
        j = 3  → 3 + 5 = 8   ❌
        j = 4  → 3 + 8 = 11  ❌
        j = 5  → 3 + 2 = 5   ❌


        i = 3  (a[i] = 5)
        --------------------------------
        j = 4  → 5 + 8 = 13  ❌
        j = 5  → 5 + 2 = 7   ✅  count = 2


        i = 4  (a[i] = 8)
        --------------------------------
        j = 5  → 8 + 2 = 10  ❌


        i = 5
        --------------------------------
        No elements to compare


        Matching Pairs:
        (4, 3)
        (5, 2)


        Final Output:
        count = 2

*/