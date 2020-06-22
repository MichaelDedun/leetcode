package com.leetcode.arrays;

public class FlippingAnImage {

    public static int[][] flipAndInvertImage(int[][] A) {
        int start = 0;
        int end = A.length - 1;
        for (int[] str : A) {
            while (start < end) {
                int temp = str[start];
                str[start++] = str[end];
                str[end--] = temp;
            }
            start = 0;
            end = A.length - 1;
        }
        int i = 0;
        for (int[] str : A) {
            while (i < A.length) {
                if (str[i] == 1) {
                    str[i] = 0;
                    i++;
                } else {
                    str[i] = 1;
                    i++;
                }
            }
            i = 0;
        }
        return A;
    }

}
