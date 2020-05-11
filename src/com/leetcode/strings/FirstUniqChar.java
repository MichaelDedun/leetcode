package com.leetcode.strings;

public class FirstUniqChar {

    public static int firstUniqChar(String s) {
        char[] symbols = s.toCharArray();
        int[] alphabet = new int[26];
        for (char symbol : symbols) {
            alphabet[symbol - 'a']++;
        }

        for (int i = 0; i < symbols.length; i++) {
            if (alphabet[symbols[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

}
