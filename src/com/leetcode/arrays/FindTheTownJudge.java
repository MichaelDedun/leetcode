package com.leetcode.arrays;

public class FindTheTownJudge {

    public static int findJudge(int N, int[][] trust) {
        int[] count = new int[N+1];
        for (int[] persons : trust) {
            count[persons[0]]--;
            count[persons[1]]++;
        }

        for (int i =1;i <=N; i++) {
            if (count[i] == N-1) return i;
        }
        return -1;
    }

}
