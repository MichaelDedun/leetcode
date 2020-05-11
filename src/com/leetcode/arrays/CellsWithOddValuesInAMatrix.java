package com.leetcode.arrays;

public class CellsWithOddValuesInAMatrix {

    public int oddCells(int n, int m, int[][] indices) {
        int row[] = new int[n];
        int column[] = new int[m];
        int counter = 0;
        for (int index[] : indices) {
            row[index[0]]++;
            column[index[1]]++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                if ((row[i] + column[j])%2 == 1)
                    counter++;
        }
        return counter;
    }

}
