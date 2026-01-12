package _02_Array.Problems.Snippets._04_Finding_Unique;

public class FindUnique {
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
