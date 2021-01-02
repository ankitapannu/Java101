package main;

import java.util.Arrays;

public class LC1637_WidestVerticalArea {

	// https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/
	
	public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (p1, p2) -> p1[0] - p2[0]);
        int max = 0;
        for (int i = 0; i < points.length-1; i++) {
            int width = points[i+1][0] - points[i][0];
            max = Math.max(max, width);
        }
        return max;
    }
}
