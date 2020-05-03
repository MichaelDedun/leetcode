package com.leetcode.arrays;

import java.util.Arrays;

public class SquaresOfASortedArray {

    /////Возвести в степень и отсортировать

    public int[] sortedSquares(int[] A) {
        pow(A);
        sort(A);
        return A;
    }

    public void pow(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] *= A[i];
        }
    }

    public void sort(int[] A) {
        Arrays.sort(A);
    }

}
