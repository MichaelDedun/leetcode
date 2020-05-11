package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindComplement {
    public int findComplement(int num) {
        List<Integer> help = new ArrayList<>();
        while (num > 0) {
            if (num % 2 == 1) {
                help.add(0);
            } else {
                help.add(1);
            }
            num /= 2;
        }
        int res = 0;
        for (int i = 0; i < help.size(); i++) {
            res += Math.pow(2, i) * help.get(i);
        }
        return res;
    }
}
