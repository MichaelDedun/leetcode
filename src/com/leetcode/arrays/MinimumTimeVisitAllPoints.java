package com.leetcode.arrays;

public class MinimumTimeVisitAllPoints {

    public int minTimeToVisitAllPoints(int[][] points) {
        int res = 0;
        for (int i = 0; i < points.length - 1; i++) {
            res+= distance(points[i][0],points[i][1],points[i+1][0],points[i+1][1]);
        }
        return res;
    }

    public int distance(int x1, int y1, int x2, int y2) {
        return Math.max(Math.abs(x1 - x2), Math.abs(y1 - y2));
    }

}
