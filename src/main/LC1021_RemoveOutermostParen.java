package main;

public class LC1021_RemoveOutermostParen {
	public String removeOuterParentheses(String S) {
        String result = "";
        int count = 0;
        int start = 0;
        for (int i = 0; i < S.length(); i++) {
            Character c = S.charAt(i);
            if (c == '(') {
                count++;
            } 
            if (c == ')') {
                count--;
            }
            if (count == 1 && c == '(') {
                start = i;
            }
            if (count == 0) {
                result += S.substring(start+1, i);
            }
        }
        return result;
    }
}
