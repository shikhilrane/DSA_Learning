package Leetcode_Problems._01_Arrays._02_26_Remove_Duplicates_from_Sorted_Array;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(array));
    }

    public static int removeDuplicates(int[] nums) {
        int k = 1;      // k started from 1 because we know, at least one element is always unique in a non-empty sorted array
        for (int i = 1; i < nums.length; i++) { // iterate loop over nums array that starts from index 1
            if (nums[i] != nums[i-1]){          // if current element is not equals to previous element
                nums[k] = nums[i];              // Then Store it in nums[k]
                k++;                            // Increment k by one
            }
        }
        return k;
    }
}

/*
    i = 1
        nums[i] = 0, nums[i-1] = 0
        0 != 0 → No
        k stays 1
        Array unchanged: [0,0,1,1,1,2,2,3,3,4]


    i = 2
        nums[i] = 1, nums[i-1] = 0
        1 != 0 → Yes
        nums[k] = nums[i] → nums[1] = 1
        k = 2
        Array: [0,1,1,1,1,2,2,3,3,4]


    i = 3
        nums[i] = 1, nums[i-1] = 1
        1 != 1 → No
        k stays 2
        Array unchanged: [0,1,1,1,1,2,2,3,3,4]


    i = 4
        nums[i] = 1, nums[i-1] = 1
        1 != 1 → No
        k stays 2
        Array unchanged: [0,1,1,1,1,2,2,3,3,4]


    i = 5
        nums[i] = 2, nums[i-1] = 1
        2 != 1 → Yes
        nums[k] = nums[i] → nums[2] = 2
        k = 3
        Array: [0,1,2,1,1,2,2,3,3,4]


    i = 6
        nums[i] = 2, nums[i-1] = 2
        2 != 2 → No
        k stays 3
        Array unchanged: [0,1,2,1,1,2,2,3,3,4]


    i = 7
        nums[i] = 3, nums[i-1] = 2
        3 != 2 → Yes
        nums[k] = nums[i] → nums[3] = 3
        k = 4
        Array: [0,1,2,3,1,2,2,3,3,4]


    i = 8
        nums[i] = 3, nums[i-1] = 3
        3 != 3 → No
        k stays 4
        Array unchanged: [0,1,2,3,1,2,2,3,3,4]


    i = 9
        nums[i] = 4, nums[i-1] = 3
        4 != 3 → Yes
        nums[k] = nums[i] → nums[4] = 4
        k = 5
        Array: [0,1,2,3,4,2,2,3,3,4]

*/