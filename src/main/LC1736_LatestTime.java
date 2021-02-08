package main;

public class LC1736_LatestTime {
	
	// https://leetcode.com/problems/latest-time-by-replacing-hidden-digits/
	
	public String maximumTime(String time) {
        String latest = "";
        for (int i = 0; i < time.length(); i++) {
            char c = time.charAt(i);
            if (c != '?') {
                latest += c;
            } else {
                if (i == 0) {
                    if (time.charAt(1) == '?' || Integer.parseInt(String.valueOf(time.charAt(1))) < 4) {
                        latest += "2";
                    } else {
                        latest += "1";
                    }
                }
                else if (i == 1) {
                    if (latest.charAt(0) == '2') {
                        latest += "3";
                    } else {
                        latest += "9";
                    }
                }
                else if (i == 3) {
                    latest += "5";
                }
                else {
                   latest += "9"; 
                }
            }
        }
        return latest; 
    }

}
