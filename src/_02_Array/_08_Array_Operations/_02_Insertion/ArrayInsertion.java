package _02_Array._08_Array_Operations._02_Insertion;

public class ArrayInsertion {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int indexPosition = 2;
        int element = 28;

        // Step 1 : Create new array
        int[] newArr = new int[arr.length+1];

        // Step 2 : Copy-Paste the elements from old array to new array till indexPosition-1
        for (int i = 0; i < indexPosition; i++) {
            newArr[i] = arr[i];
        }

        // Step 3 : Insert provided element at particular indexPosition
        newArr[indexPosition] = element;

        // Step 4 : Copy-Paste the pending elements from old array to new array
        for (int i = indexPosition; i < arr.length; i++) {
            newArr[i+1] = arr[i];
        }

        // Step 5 : Traversing newArray
        for (int i = 0; i < newArr.length ; i++) {
            System.out.println(newArr[i]);
        }
    }
}
