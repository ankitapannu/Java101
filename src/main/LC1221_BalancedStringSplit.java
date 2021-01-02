package main;

public class LC1221_BalancedStringSplit {
	
	// https://leetcode.com/problems/split-a-string-in-balanced-strings/
	public int balancedStringSplit(String s) {
        int result = 0;
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'R') {
                total++;
            } else {
                total--;
            }
            if (total == 0) {
                result++;
            }
        }
        return result;
    }
}
