package _02_Array.Problems._07_Array_Manipulation_Pattern._03_Find_First_Repeating_Value;

// Given an array 'a' consisting of integers. Returns the first value that is repeating in this array. If no value is being repeated then return -1.

public class FirstRepeatingValue {
    public static void main(String[] args) {
        int[] arr = {1,5,3,4,6,3,4};
        System.out.println(firstRepeat(arr));
    }

    public static int firstRepeat(int[] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    return a[i];
                }
            }
        }
        return -1;
    }
}
