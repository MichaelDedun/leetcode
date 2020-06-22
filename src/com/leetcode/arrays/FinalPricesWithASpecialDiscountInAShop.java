package com.leetcode.arrays;

import java.util.Arrays;

public class FinalPricesWithASpecialDiscountInAShop {

    public static int[] finalPrices(int[] prices) {
        int[] output = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            int j = i+1;
            output[i] = prices[i];
            while (j < prices.length) {
                if (prices[j] <= prices[i]) {
                    output[i] = prices[i] - prices[j];
                    break;
                }
                j++;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(finalPrices(new int[]{4,7,1,9,4,8,8,9,4})));
    }
}
