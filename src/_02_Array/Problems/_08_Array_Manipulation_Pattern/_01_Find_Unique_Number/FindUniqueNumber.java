package _02_Array.Problems._08_Array_Manipulation_Pattern._01_Find_Unique_Number;

// Find Unique number in a given Array where all the elements are being repeated twice with one value being unique (Only positive number)

public class FindUniqueNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,1,3};
        System.out.println(findUnique(arr));
    }

    public static int findUnique(int[] a){
        int notUnique = -1;                         // Marker value to identify duplicate elements
        for (int i = 0; i < a.length; i++) {        // Traverse an array
            for (int j = i+1; j < a.length ; j++) { // Traverse array from next index of i
                if (a[i] == a[j]) {                 // If element of outer loop and inner loop matches
                    a[i] = notUnique;               // Then mark element of outer loop as notUnique i.e. -1
                    a[j] = notUnique;               // Then mark element of inner loop as notUnique i.e. -1
                }
            }
        }

        int unique = -1;                            // Stores the unique element
        for (int i = 0; i < a.length; i++) {        // Traverse the array
            if (a[i] > 0) {                         // if any element comes greater than 0
                unique = a[i];                      // then set value of that element to unique
            }
        }
        return unique;
    }
}
/*
    Logic :
        1. Traverse the array and if any number repeats in that traversal then mark both occurrences as -1.
        2. Again traverse the loop on array and as it catches any number greater than 0, then mark it as unique and return that number
*/