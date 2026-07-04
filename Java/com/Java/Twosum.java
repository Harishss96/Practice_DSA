package com.Java;

public class Twosum {
    
    public static void main(String[] args) { 

        int[] nums = {2, 7, 11, 15};
        int target = 13;
        int[] sum = addup(nums, target);

           if (sum.length == 2) {
            System.out.println("Indices: " + sum[0] + ", " + sum[1]);
        } else {
            System.out.println("No solution found.");
        }
         
    }
 
    
    static int[] addup(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0]; // Return an empty array if no solution is found
    }

}
