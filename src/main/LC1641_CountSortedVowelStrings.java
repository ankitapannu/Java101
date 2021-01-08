package main;

public class LC1641_CountSortedVowelStrings {
	
	// https://leetcode.com/problems/count-sorted-vowel-strings/
	
	public int countVowelStrings(int n) {
        int[] nums = new int[]{1, 1, 1, 1, 1};
        int i = 0;
        while (i < n) {
            for(int j = 1; j < nums.length; j++){
                nums[j] += nums[j - 1];
            }
            i++;
        }
        return nums[nums.length-1];
    }
}
