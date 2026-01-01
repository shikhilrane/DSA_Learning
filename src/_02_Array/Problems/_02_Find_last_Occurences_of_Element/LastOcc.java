package _02_Array.Problems._02_Find_last_Occurences_of_Element;

// Program to find the last occurrence of element x in a given array

public class LastOcc {
    public static void main(String[] args) {
        int[] arr = {5,2,6,5,1,9,5,8};
        int x = 5;

        // 1st method
        System.out.println("Last occurrence of the 5 is at index : " + lastOcc(arr,x));

        // 2nd method
        System.out.println("Last occurrence of the 5 is at index : " + lastOccurrence(arr,x));
    }

    public static int lastOcc(int[] a, int num){
        for (int i = a.length-1; i >= 0 ; i--) {
            if (a[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static int lastOccurrence(int[] a, int num){
        int lastIndex = -1;
        for (int i = 0; i <a.length ; i++) {
            if (a[i] == num) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }
}
