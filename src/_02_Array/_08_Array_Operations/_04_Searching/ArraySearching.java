package _02_Array._08_Array_Operations._04_Searching;

public class ArraySearching {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int targetElement = 40;

        // Traversing array to search targetElement
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == targetElement) {
                System.out.println("Element " + arr[i] + " found at position " + i);
            }
        }
    }
}
