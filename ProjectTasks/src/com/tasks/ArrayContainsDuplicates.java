package com.tasks;

public class ArrayContainsDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        boolean bool = containsDuplicate(nums);
        System.out.println("Is array contain duplicates: " + bool);
    }

    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; ++i) {
            for (int j = 0; j < i; ++j) {
                if (nums[j] == nums[i]) {
                    return true;
                }
            }
        }
        return false;
    }
}
