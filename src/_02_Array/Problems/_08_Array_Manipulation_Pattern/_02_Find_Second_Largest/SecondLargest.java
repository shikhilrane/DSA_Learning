package _02_Array.Problems._08_Array_Manipulation_Pattern._02_Find_Second_Largest;

// Find the second-largest element in the given array

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {9,8,9,6,9,5,8,11};
        System.out.println(secondLargest(arr));
    }

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
/*
    Logic :
        1. findMax() : Set the int variable with minimum number that van be stored. Then traverse the array and get the maximum number from it
        2. secondLargest() : get the maximum number from array using findMax() method then again traverse the array and mark max number of array to minimum number so that first max number will become minimum. Then again use findMax() to get the max number from array and that will be second-largest number because first largest marked as minimum value
*/