package _02_Array.Problems._07_Array_Manipulation_Pattern._02_Find_Second_Largest;

// Find the second-largest element in the given array

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {9,8,9,6,9,5,8,11};
        System.out.println(secondLargest(arr));
    }

    public static int findMax(int[] a){
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>maxValue){
                maxValue = a[i];
            }
        }
        return maxValue;
    }

    public static int secondLargest(int[] a){
        int max = findMax(a);
        for (int i = 0; i < a.length; i++) {
            if (a[i] == max) {
                a[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = findMax(a);
        return secondMax;
    }
}
