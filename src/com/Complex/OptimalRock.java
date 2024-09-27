package com.Complex;

import java.util.Arrays;

public class OptimalRock {

	public static void main(String[] args) {
		int[][] grid = { { 0, 0, 0, 0, 5 }, 
						 { 0, 1, 1, 1, 0 }, 
						 { 2, 0, 0, 0, 0 } };

		int maxRocks = findPath(grid);
		System.out.println("Maximum rocks collected: " + maxRocks); // Output: 10
	}
	//* The total for this example would be 10 (2+0+1+1+1+0+5)." 

	public static int findPath(int[][] arr) {
		int row = arr.length;
		int col = arr[0].length;
		int ans = 0;
		int[][] dp = new int[row][col];
		
		for (int i = 0; i < row; i++) {
			
			for (int j = col - 1; j >= 0; j--) {
				
				if (i == 0 && j == col - 1)
					dp[i][j] = arr[i][j];
				
				else if (i == 0)
					dp[i][j] = arr[i][j] + dp[i][j + 1];
				
				else if (j == col - 1)
					dp[i][j] = arr[i][j] + dp[i - 1][j];
				
				else
					dp[i][j] = arr[i][j] + Math.max(dp[i - 1][j], dp[i][j + 1]);
				
				System.out.println(Arrays.deepToString(dp));
			}
		}
		return dp[row - 1][0];
	}

}
