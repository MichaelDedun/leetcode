package com.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> counterEl = new HashMap<>();
        for (int el : nums) {
            if (counterEl.containsKey(el) && counterEl.get(el) + 1 > nums.length / 2) {
                return el;
            } else {
                counterEl.put(el, counterEl.getOrDefault(el, 0) + 1);
            }
        }
        return 0;
    }
}
