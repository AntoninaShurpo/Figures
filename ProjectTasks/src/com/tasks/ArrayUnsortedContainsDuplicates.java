package com.tasks;

import java.util.Arrays;

public class ArrayUnsortedContainsDuplicates {
    public static void main(String[] args) {
        int[] nums = {5, 1, 2, 3, 1};
        boolean bool = containsDuplicates(nums);
        System.out.println("Is unsorted array contain duplicates: " + bool);
    }

    public static boolean containsDuplicates(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] == nums[i + 1])
                return true;
        }
        return false;
    }
}

