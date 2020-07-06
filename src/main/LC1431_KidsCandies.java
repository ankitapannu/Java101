package main;

// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LC1431_KidsCandies {
	public static int findMaxValue (int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
	
    public static List<Boolean> kidsWithCandiesV1(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<Boolean>(candies.length);
        int max = findMaxValue(candies);
        for (int i = 0; i < candies.length; i++) {
            boolean b = (candies[i] + extraCandies >= max);
            result.add(b);
        }
        return result;
    }
    
    public static List<Boolean> kidsWithCandiesV2(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<Boolean>(candies.length);
        int max = findMaxValue(candies);
        for (int candy : candies) {
            boolean b = (candy + extraCandies >= max);
            result.add(b);
        }
        return result;
    }
    
    public static List<Boolean> kidsWithCandiesV3(int[] candies, int extraCandies) {
        int max = findMaxValue(candies);
        IntStream candiesStream = Arrays.stream(candies);
        return candiesStream.boxed().map(c -> c + extraCandies >= max).collect(Collectors.toList());
    }

}
