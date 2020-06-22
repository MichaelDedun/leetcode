package com.leetcode.arrays;

public class CoinChange2 {

    public static int change(int amount, int[] coins) {
        int[][] result = new int[coins.length + 1][amount + 1];
        for (int i = 0; i <= coins.length; i++) {
            for (int j = 0; j <= amount; j++) {
                if (j == 0) result[i][j] = 1;
                else if (i == 0) result[i][j] = 0;
                else if (j >= coins[i - 1])
                    result[i][j] = result[i][j - coins[i - 1]] + result[i-1][j];
                else
                    result[i][j] = result[i-1][j];
            }
        }
        return result[coins.length][amount];
    }

}
