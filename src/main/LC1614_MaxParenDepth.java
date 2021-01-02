package main;

public class LC1614_MaxParenDepth {
	
	// https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
	public int maxDepth(String s) {
        int max = 0;
        int current = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                current++;
                max = Math.max(current, max);
            }
            if (c == ')') {
                current--;
            }
        }
        return max;
    }
}
