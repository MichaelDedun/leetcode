package com.leetcode.arrays;

public class NumberOfStudentsDoingHomeworkAtAGivenTime {

    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int counter = 0;
        for(int i = 0; i < endTime.length; i++)
            if(startTime[i] <= queryTime && endTime[i]>=queryTime)
                counter++;
        return counter;
    }

}
