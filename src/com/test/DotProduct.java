package com.test;

public class DotProduct {

	public static void main(String[] args) {

		/*
		 * "28. dot product of two arrays long dotProduct( int[] array1, int[] array2 )
		 *
		 * Given two arrays of integers, returns the dot product of the arrays"" int[]
		 * arr1 = {1, 2, 3, 4, 5}; int[] arr2 = {6, 7, 8, 9, 10}; do Product output:
		 * 130"
		 * 
		 */
		
		
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {6, 7, 8, 9, 10}; 
		int output = dotproduct(arr1,arr2);
		System.out.println("Value is :: "+output);
	}

	private static int dotproduct(int[] arr1, int[] arr2) {
		
		if(arr1.length!=arr2.length)
			return -1;
		
		int sum = 0;
		for(int i=0;i<arr1.length;i++) {
			
			sum+= arr1[i]*arr2[i];
			
			
		}
		
		return sum;
	}
	
/*
### Complexity Analysis:

- **Time Complexity:** `O(n)` where `n` is the length of the arrays. This is because the method iterates over each 
element of the arrays exactly once.
- **Space Complexity:** `O(1)` since no additional space is used apart from a few variables to store the result and
 loop counter.
*/
}
