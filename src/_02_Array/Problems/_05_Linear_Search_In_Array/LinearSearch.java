package _02_Array.Problems._05_Linear_Search_In_Array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,7,9};
        int k = 9;

        int searchedElement = searchElement(arr,k);
        System.out.println(searchedElement);
    }

    public static int searchElement(int[] a, int k){
        for (int i = 0; i < a.length; i++) {    // Traverse an array
            if (a[i] == k) {        // If any element matches with the element
                return i;           // Return the index of that element
            }
        }
        return -1;      // Else return -1
    }
}
