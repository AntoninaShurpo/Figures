package com.tasks;

public class ArraySortedRemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 1, 3, 4};
        int result = removeDuplicates(nums);
        System.out.println("" + result);
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

}


