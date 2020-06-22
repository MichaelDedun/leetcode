package com.leetcode.arrays;

import java.util.*;

public class destCity {

    public static String destCity(List<List<String>> paths) {
        Map<String,String> map = new HashMap<>();
        for(List<String> path : paths) {
            map.put(path.get(0), path.get(1));
        }
        String dest = paths.get(0).get(0);
        for (Map.Entry<String,String> test : map.entrySet()) {
            System.out.println(test.getKey() + " = " + test.getValue());
        }
        return dest;
    }

    public static void main(String[] args) {
        List<List<String>> temp = new ArrayList<>();
        temp.add(Arrays.asList("London", "New York"));
        temp.add(Arrays.asList("New York", "Lima"));
        temp.add(Arrays.asList("Lima", "Sao Paulo"));
        destCity(temp);
    }
}
