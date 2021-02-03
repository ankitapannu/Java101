package main;

public class LC1277_CountSquares {
	
	// https://leetcode.com/problems/count-square-submatrices-with-all-ones/
	
	public int countSquares(int[][] matrix) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1 && i != 0 && j != 0) {
                    matrix[i][j] = Math.min(Math.min(matrix[i-1][j], matrix[i][j-1]), matrix[i-1][j-1]) + 1;
                } else {
                    matrix[i][j] = matrix[i][j];
                }
                count += matrix[i][j];
            }
        }
        return count;
    }
}
