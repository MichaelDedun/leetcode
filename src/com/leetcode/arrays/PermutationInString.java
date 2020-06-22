package com.leetcode.arrays;

public class PermutationInString {

    public static boolean checkInclusion(String p, String s) {
        int[] counter = new int[26];
        for (char c : p.toCharArray()) {
            counter[c - 'a']++;
        }
        int i = 0;
        int j = 0;
        int count = p.length();
        while (i < s.length()) {
            if (counter[s.charAt(i++) - 'a']-- >= 1) {
                count--;
            }
            if (count == 0) {
                return true;
            }


        }
        return false;

    }

}
