package main;

public class LC1725_NumRectanglesLargestSquare {

	// https://leetcode.com/problems/number-of-rectangles-that-can-form-the-largest-square/
	
	public int countGoodRectangles(int[][] rectangles) {
        HashMap<Integer, Integer> counts = new HashMap<Integer, Integer>();
        int maxLen = -1;
        for (int[] i : rectangles) {
            int squareLen = Math.min(i[0], i[1]);
            counts.put(squareLen, counts.getOrDefault(squareLen, 0) + 1);
            maxLen = Math.max(maxLen, squareLen);
        }
        return counts.get(maxLen);
    }
}
