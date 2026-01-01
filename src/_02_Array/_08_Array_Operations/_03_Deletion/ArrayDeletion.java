package _02_Array._08_Array_Operations._03_Deletion;

public class ArrayDeletion {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int indexPosition = 2;

        // Step 1 : Create New Array
        int[] newArr = new int[arr.length-1];

        // Step 2 : Copy-Paste the elements from old array to new array
        int j = 0;  // Use to indicate index of newArr
        for (int i = 0; i < arr.length; i++) {
            if (i == indexPosition){
                continue;
            }
            newArr[j] = arr[i];
            j++;
        }

        // Step 3 : Traversing newArray
        for (int i : newArr){
            System.out.println(i);
        }
    }
}
