package com.leetcode.arrays;

import java.util.Arrays;

public class ArrayPartitionI {

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int min = 0;
        for (int i = 0; i < nums.length - 1; i+=2) {
            min += nums[i];
        }
        return min;
    }
}
