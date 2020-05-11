package com.leetcode.arrays;

public class ReplaceElementsWithGreatestElementOnRightSide {

    public static int[] replaceElements(int[] arr) {
        int[] res = new int[arr.length];
        int max = -1;
        res[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--){
            max = Math.max(arr[i + 1], max);
            res[i] = max;
        }
        return res;
    }

}
