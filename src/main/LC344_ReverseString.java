package main;

// https://leetcode.com/problems/reverse-string/

public class LC344_ReverseString {
	
	public static void reverseString(char[] s) {
        for (int i = 0; i < s.length/2; i++) {
            char current = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = current;
        }
    }
}
