package _02_Array.Problems.Snippets._02_Linear_Search;

public class LinearSearch {
    public static int searchElement(int[] a, int k){
        for (int i = 0; i < a.length; i++) {    // Traverse an array
            if (a[i] == k) {        // If any element matches with the element
                return i;           // Return the index of that element
            }
        }
        return -1;      // Else return -1
    }
}
