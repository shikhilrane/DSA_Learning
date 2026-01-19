package Leetcode_Problems._01_Arrays._01_1_Two_Sum;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = {2,7,11,15};
        int target = 9;

        int[] ints = twoSum(array, target);

        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);        // Element at given index gives the sum as target
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i]+nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}

/*
    i = 0;
        j = 1;
            nums[i] + nums[j] = 2 + 7 = 9
            9 == 20 → No

        j = 2;
            nums[i] + nums[j] = 2 + 11 = 13
            13 == 20 → No

        j = 3;
            nums[i] + nums[j] = 2 + 15 = 17
            17 == 20 → No


    i = 1;
        j = 2;
            nums[i] + nums[j] = 7 + 11 = 18
            18 == 20 → No

        j = 3;
            nums[i] + nums[j] = 7 + 15 = 22
            22 == 20 → No


    i = 2;
        j = 3;
            nums[i] + nums[j] = 11 + 15 = 26
            26 == 20 → No


    i = 3;
        j = i + 1 = 4 → Out of bounds
        Inner loop does not run

*/