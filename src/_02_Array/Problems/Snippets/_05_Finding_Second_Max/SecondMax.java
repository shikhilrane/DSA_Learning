package _02_Array.Problems.Snippets._05_Finding_Second_Max;

public class SecondMax {
    public static int findMax(int[] a){
        int maxValue = Integer.MIN_VALUE;       // Initialise the value with Minimum value that int can store
        for (int i = 0; i < a.length; i++) {    // Traverse the array
            if(a[i]>maxValue){                  // if any element occurs greater than last minimum value captured
                maxValue = a[i];                // Then replace that element with last greater number
            }
        }
        return maxValue;
    }

    public static int secondLargest(int[] a){
        int max = findMax(a);                   // get the max number of array using this method
        for (int i = 0; i < a.length; i++) {    // traverse the array
            if (a[i] == max) {                  // if any element matches with max number that we saved from method
                a[i] = Integer.MIN_VALUE;       // Then mark this too minimum number that int can store
            }
        }
        int secondMax = findMax(a);             // again get max number from array and that will be second-largest number because first largest marked as minimum value
        return secondMax;
    }
}
