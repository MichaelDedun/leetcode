package com.leetcode.arrays;

public class FindNumbersWithEvenNumberOfDigits {

    public int findNumbers(int[] nums) {
        int counter = 0;
        int counterEven = 0;
        for (int i = 0; i < nums.length; i++) {
            while(nums[i] != 0) {
                counter++;
                nums[i]/=10;
            }
            if (counter % 2 == 0) {
                counterEven++;
            }
            counter = 0;
        }
        return counterEven;
    }

    //public int findNumbers(int[] nums) {
    //        int count = 0;
    //        for (int i = 0; i < nums.length; i++) {
    //            if ((nums[i] >= 10 && nums[i] < 100) ||
    //                (nums[i] >= 1000 && nums[i] < 10000)) {
    //                count++;
    //            }
    //        }
    //        return count;
    //    }

}
