package _02_Array._08_Array_Operations._05_Updation;

public class ArrayUpdation {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int targetPosition = 2;
        int element = 35;

        // Directly Storing element in targetPositon of array
        arr[targetPosition] = element;

        // Traversing array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
