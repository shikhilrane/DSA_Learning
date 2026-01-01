package _02_Array._08_Array_Operations._01_Traversal;

public class ArrayTraversal {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};

        // For Loop
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("For loop : " + arr[i]);
        }

        // ForEach Loop
        for (int i : arr){
            System.out.println("ForEach : " + i);
        }
    }
}
