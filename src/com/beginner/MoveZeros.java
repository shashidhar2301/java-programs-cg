package com.beginner;

import java.util.Arrays;

public class MoveZeros {
	
	public static void main(String[] args) {
		
		/*
		 * Input: nums = [0,1,0,3,12] Output: [1,3,12,0,0]
		 */
		
		int[] arr = {0,1,0,3,12};
		int nonZeroIndex = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0)
				arr[nonZeroIndex++] = arr[i];
		}
		
		
		for(int i=nonZeroIndex;i<arr.length;i++) {
			arr[i] = 0;
		}
		System.out.println(Arrays.toString(arr));	
		
		/*
		 * ### Time Complexity - **First Pass:** (O(n)) - where (n) is the number of
		 * elements in the array. This is because we iterate through the array once to
		 * move non-zero elements. - **Second Pass:** (O(n)) - another iteration
		 * through the array to fill remaining positions with zeros. - **Overall Time
		 * Complexity:** (O(n))
		 * 
		 * ### Space Complexity - **Space Complexity:** (O(1)) - since we are
		 * modifying the array in-place and not using any additional data structures.
		 */
	}

}
