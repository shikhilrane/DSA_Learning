package _02_Array.Problems._06_Target_Sum_Pattern._02_Count_Number_of_Triplets;

// Count the number of triplets whose sum is equal to the given value x

public class NumberOfTriplets {
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,3};
        int targetSum = 12;

        System.out.println(countTriplets(arr,targetSum));
    }

    public static int countTriplets(int[] a, int num){
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                for (int k = j+1; k < a.length; k++) {
                    int n = a[i] + a[j] + a[k];
                    if (n == num) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
