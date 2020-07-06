package main;

// https://leetcode.com/problems/shuffle-the-array/

public class LC1470_ShuffleArray {

	public static int[] shuffleV1(int[] nums, int n) {
        int[] result = new int[2*n];
        for (int i = 0; i < n; i++) {
            result[2*i] = nums[i];
            result[2*i+1] = nums[n+i];
        }
        return result;
    }
	
}
