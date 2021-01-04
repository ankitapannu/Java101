package main;

import java.util.*;

public class LC1657_CloseStrings {
	
	// https://leetcode.com/problems/determine-if-two-strings-are-close/
	public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
        for (int i = 0; i < word1.length(); i++) {
            char c1 = word1.charAt(i);
            map1.put(c1, map1.getOrDefault(c1, 0) + 1);
        }
        for (int i = 0; i < word2.length(); i++) {
            char c2 = word2.charAt(i);
            map2.put(c2, map2.getOrDefault(c2, 0) + 1);
        }
        if (map1.equals(map2)) {
            return true;
        }
        if(!map1.keySet().equals(map2.keySet())) return false;
        ArrayList<Integer> val1 = new ArrayList<Integer>(map1.values());
        ArrayList<Integer> val2 = new ArrayList<Integer>(map2.values());
        Collections.sort(val1);
        Collections.sort(val2);
        
        return val1.equals(val2);
    }

}
