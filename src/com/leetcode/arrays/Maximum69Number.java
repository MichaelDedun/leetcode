package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class Maximum69Number {

    public static int maximum69Number (int num) {
//        List<Integer> nums = new ArrayList<>();
//        while (num != 0) {
//            nums.add(num%10);
//            num/=10;
//        }
//        for (int i = 0; i < nums.size(); i++) {
//            if (nums.get(i) == 6) {
//                nums.set(i,9);
//                break;
//            }
//        }
//        StringBuilder str = new StringBuilder();
//        for (int el : nums)
//            str.append(el);
//        return Integer.parseInt(str.toString());
        String str = Integer.toString(num);
        char[] nums = str.toCharArray();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == '6') {
                nums[i] = '9';
                break;
            }
        }
        return Integer.parseInt(String.valueOf(nums));
    }

    public static void main(String[] args) {
        System.out.println(maximum69Number(
                669)) ;
    }

}
