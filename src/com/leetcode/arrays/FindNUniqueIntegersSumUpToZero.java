package com.leetcode.arrays;

public class FindNUniqueIntegersSumUpToZero {

    public static int[] sumZero(int n) {
        int start = 1;
        int[] arr = new int[n];

        for(int i = 0; i < n - 1; i += 2)
        {
            arr[i] = start;
            arr[i + 1] = -start;
            start++;
        }

        if(n % 2 == 1)
        {
            arr[arr.length - 1] = 0;
        }

        return arr;
    }
}
