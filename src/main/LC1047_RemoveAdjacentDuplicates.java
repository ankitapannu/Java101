package main;

import java.util.Stack;

public class LC1047_RemoveAdjacentDuplicates {
	
	// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
	
	public String removeDuplicates(String S) {
        if (S.length() == 1) {
            return S;
        }
        String result = "";
        Stack<Character> stack = new Stack<Character>();
        stack.push(S.charAt(0));
        for (int i = 1; i < S.length(); i++) {
            if (!stack.empty() && S.charAt(i) == stack.peek()) {
                stack.pop();
            } else {
                stack.push(S.charAt(i));
            }
        }
        if (stack.empty()) {
            return "";
        } else {
            char[] arr = new char[stack.size()];
            int i = 0;
            while (!stack.empty()) {
                arr[i] = stack.pop();
                i++;
            }
            for (int j = arr.length - 1; j >= 0; j--) {
                result += arr[j];
            }
            return result;
        }
    }

}
