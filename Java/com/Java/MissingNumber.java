package com.Java;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {

        int[] nums = {3, 0, 1};

        int missing = findMissingNumber(nums);

        System.out.println("Missing Number: " + missing);
    }

  static int findMissingNumber(int[] nums) {

    Arrays.sort(nums);

    // Assume Missing number is 0
    if (nums[0] != 0) {
        return 0;
    }

    for (int i = 0; i < nums.length - 1; i++) {

        if (nums[i + 1] != nums[i] + 1) {
            return nums[i] + 1;
        }
    }

    // Missing number is at the end
    return nums[nums.length - 1] + 1;
}
}