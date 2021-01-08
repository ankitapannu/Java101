package main;

import java.util.*;

public class LC1403_MinSubsequenceSum {

	// https://leetcode.com/problems/minimum-subsequence-in-non-increasing-order/
	
	public List<Integer> minSubsequence(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        if (nums.length == 0) {
            return result;
        }
        if (nums.length == 1) {
            result.add(nums[0]);
            return result;
        }
        Arrays.sort(nums);
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        int sum2 = 0;
        for (int i = nums.length-1; i >= 0; i--) {
            result.add(nums[i]);
            sum -= nums[i];
            sum2 += nums[i];
            if (sum2 > sum) {
                return result;
            }
        }
        return result;
    }
}
