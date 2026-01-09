package _02_Array.Problems._12_Pairs_in_Array;

// Find all pairs in an Array

public class AllPossiblePairs {
    public static void main(String[] args) {
        int[] array = {2,4,6,8,10};

        pairsInArray(array);
    }

    public static void pairsInArray(int[] a){
        for (int i = 0; i < a.length; i++) {                            // Pick first element of the pair
            for (int j = i + 1; j < a.length; j++) {                    // Pick second element after first
                System.out.print("(" + a[i] + "," + a[j] + ")" + " ");  // Print the pair
            }
            System.out.println();                                       // Move to next line after each row
        }
    }
}

/*
 Question :
    int[] array = {2,4,6,8,10};
    all possible pairs,
        (2,4) (2,6) (2,8) (2,10)
        (4,6) (4,8) (4,10)
        (6,8) (6,10)
        (8,10)
*/

/*
    Logic (Nested Loops):

    1. Fix the first element using outer loop.
    2. Pair it with every element after it using inner loop.
    3. Print each pair.

    In short:
        For every element, pair it with
        all elements to its right.
*/
