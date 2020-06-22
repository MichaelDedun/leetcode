package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsInAString {

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int[] counter = new int[26];
        if (s.length() == 0) return result;
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
                result.add(j);
            }

            if (i - j == p.length() && counter[s.charAt(j++) - 'a']++ >= 0) {
                count++;
            }

        }
        return result;
    }

}
