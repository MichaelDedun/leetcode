package com.leetcode.arrays;

public class PeakIndexInAMountainArray {

    ////Найти индекс когда не выполняется условия A[i] < A[i+1];
    public int peakIndexInMountainArray(int[] A) {
        int i = 0;
        while (A[i] < A[i+1]) i++;
        return i;
    }

}
