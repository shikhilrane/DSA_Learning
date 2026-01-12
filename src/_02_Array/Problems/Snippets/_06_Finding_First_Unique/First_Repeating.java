package _02_Array.Problems.Snippets._06_Finding_First_Unique;

public class First_Repeating {
    public static int firstRepeat(int[] a){
        for (int i = 0; i < a.length; i++) {            // Traverse the array from i
            for (int j = i+1; j < a.length; j++) {      // Traverse the array from i+1
                if (a[i] == a[j]) {                     // If any element matches from both of the loops
                    return a[i];                        // Return that number
                }
            }
        }
        return -1;
    }
}
