package _02_Array.Problems._07_Array_Manipulation_Pattern._01_Find_Unique_Number;

// FInd Unique number in a given Array where all the elements are being repeated twice with one value being unique (Only positive number)

public class FindUniqueNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,1,3};
        System.out.println(findUnique(arr));
    }

    public static int findUnique(int[] a){
        int notUnique = -1;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length ; j++) {
                if (a[i] == a[j]) {
                    a[i] = notUnique;
                    a[j] = notUnique;
                }
            }
        }

        int unique = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                unique = a[i];
            }
        }
        return unique;
    }
}
