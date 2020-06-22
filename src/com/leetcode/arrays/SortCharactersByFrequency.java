package com.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class SortCharactersByFrequency {

    public static String frequencySort(String s) {
        Map<Character, Integer> counter = new HashMap<>();

        for (char c : s.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }
        StringBuilder result = new StringBuilder();
        counter.entrySet()
                .stream()
                .sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue()))
                .forEach(el -> result.append(String.valueOf(el.getKey()).repeat(Math.max(0, el.getValue()))));
        return result.toString();
    }

}
