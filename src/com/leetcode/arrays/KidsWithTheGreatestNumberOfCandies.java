package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

    //Input: candies = [2,3,5,1,3], extraCandies = 3
    //Output: [true,true,true,false,true]
    //Explanation:
    //Kid 1 has 2 candies and if he or she receives all extra candies (3) will have 5 candies --- the greatest number of candies among the kids.
    //Kid 2 has 3 candies and if he or she receives at least 2 extra candies will have the greatest number of candies among the kids.
    //Kid 3 has 5 candies and this is already the greatest number of candies among the kids.
    //Kid 4 has 1 candy and even if he or she receives all extra candies will only have 4 candies.
    //Kid 5 has 3 candies and if he or she receives at least 2 extra candies will have the greatest number of candies among the kids.

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>(candies.length);
        int max = 0;
        for (int el: candies) {
            max = Math.max(max,el);
        }
        for (int i = 0; i < candies.length; i++) {
            result.add(candies[i] + extraCandies >= max);
        }
        return result;
    }

}
