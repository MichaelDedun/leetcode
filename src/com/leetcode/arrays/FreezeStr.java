package com.leetcode.arrays;

public class FreezeStr {

    public static boolean freezeStr(String left, String right) {
        if (left.length() != right.length()) {
            return false;
        }

        int[] alphabet = new int[256];

        for (char c : left.toCharArray()) {
            alphabet[c]++;
        }

        for (char c : right.toCharArray()) {
            if (alphabet[c] == 0) {
                return false;
            }
        }
        return true;
    }
}
