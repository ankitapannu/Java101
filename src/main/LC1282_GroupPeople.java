package main;

import java.util.*;

public class LC1282_GroupPeople {
	// https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/
	
	public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
        for (int i = 0; i < groupSizes.length; i++) {
            int size = groupSizes[i];
            if (map.containsKey(size)) {
                map.get(size).add(i);
            } else {
                ArrayList<Integer> l = new ArrayList<Integer>();
                l.add(i);
                map.put(size, l);
            }
            if (map.containsKey(size) && map.get(size).size() == size) {
                result.add(map.get(size));
                ArrayList<Integer> empty = new ArrayList<Integer>();
                map.put(size, empty);
            }
        }
        return result;
    }
}
