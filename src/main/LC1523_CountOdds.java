package main;

import java.util.stream.IntStream;

public class LC1523_CountOdds {
	
	// https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
	
	// This is an overly complicated way of solving this; was just trying to play around with Java Streams
	public int countOdds(int low, int high) {
        return (int) IntStream.range(low, high+1).filter(e -> e % 2 == 1).count(); 
    }

}
