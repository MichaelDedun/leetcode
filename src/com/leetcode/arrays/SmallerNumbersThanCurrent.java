package com.leetcode.arrays;

public class SmallerNumbersThanCurrent {
    //Input: nums = [8,1,2,2,3]
    //Output: [4,0,1,1,3]
    //Explanation:
    //For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
    //For nums[1]=1 does not exist any smaller number than it.
    //For nums[2]=2 there exist one smaller number than it (1).
    //For nums[3]=2 there exist one smaller number than it (1).
    //For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[102];
        for(int num : nums){
            count[num+1]++;
        }
        for(int i=1;i<102;i++){
            count[i] += count[i-1];
        }
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            result[i] = count[nums[i]];
        }
        return result;
    }

}
