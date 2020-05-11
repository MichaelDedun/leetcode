package com.leetcode.arrays;

public class DecompressRunLengthEncodedList {

    public static int[] decompressList(int[] nums) {
        int outputSize = 0;
        int k = 0;
        for (int i = 0; i < nums.length; i += 2)
            outputSize += nums[i];
        int[] result = new int[outputSize];
        for (int i = 0; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                result[k++] = nums[i + 1];
            }
        }
        return result;
    }

}
