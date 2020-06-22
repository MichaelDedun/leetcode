package com.leetcode.arrays;

public class CountingBits {

    public int[] countBits(int num) {
        int[] result = new int[num + 1];
        int count = 0;
        for (int i = 0; i <= num; i++) {
            if (i == 0)
                result[i] = 0;
            int j = i;
            while (j > 0) {
                if (j % 2 == 1) {
                    count++;
                }
                j /= 2;
            }
            result[i] = count;
            count = 0;
        }
        return result;
    }
}
