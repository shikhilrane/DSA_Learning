package _02_Array.Problems._01_Number_of_Occurences_of_Element;

// Count the number of occurrences of element x in a given array

public class CountOccurrences {
    public static void main(String[] args) {
        int[] arr = {5,6,5,1,5};
        int x = 5;

        System.out.println(countOcc(arr,x));
    }

    public static int countOcc(int[] a, int num){
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == num) {
                count++;
            }
        }
        return count;
    }
}
