package com.beginner;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonSumBySwapping {
	
	public static void main(String[] args) {
		//Given two arrays. Arr1 = {1,2,3,8}, arr2 = {5,6,4,7}. Find a number from each array to be interchanged to 
		//	reach a common sum of all elements for both arrays. Output: {1,5} or {3,7} or {2,6}
		
		int[] arr1 = {1,2,3,8}, arr2 = {5,6,4,7};
		
		int sum1 = Arrays.stream(arr1).sum();

		int sum2 = Arrays.stream(arr2).sum();
		
		int diff = (sum1 - sum2)/2;
		
		Set<Integer> s = new HashSet<>();
		
		for(int i : arr1) {
			s.add(i);
		}
		
		for(int j: arr2) {
			int sum = j+diff;
			if(s.contains(sum)) {
				System.out.println(""+sum+":"+ j);
			}
		}
	}
	/*
	 * ### Time and Space Complexity
	 * 
	 * - **Time Complexity**: - Calculating sums: (O(n + m)), where (n) and
	 * (m) are the sizes of the arrays. - Creating the `HashSet`: (O(m)). -
	 * Finding the pair: (O(n)).
	 ** 
	 * Overall Time Complexity**: (O(n + m)).
	 * 
	 * - **Space Complexity**: - Space for the `HashSet`: (O(m)).
	 */

}
