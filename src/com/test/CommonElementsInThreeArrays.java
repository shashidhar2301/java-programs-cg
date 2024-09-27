package com.test;

import java.util.ArrayList;
import java.util.List;

public class CommonElementsInThreeArrays {

	public static void main(String[] args) {

		/*
		 * "22. Given three integer arrays arr1, arr2 and arr3 sorted in strictly
		 * increasing order, return a sorted array of only the integers that appeared in
		 * all three arrays in O(n). Make sure the time complexity is met.
		 * 
		 * Example 1: Input: arr1 = [1,2,3,4,5], arr2 = [1,2,5,7,9], arr3 = [1,3,4,5,8]
		 * Output: [1,5] Explanation: Only 1 and 5 appeared in the three arrays"
		 * 
		 */
		
		int[] arr1 = {1,2,3,4,5}; 
		int[] arr2 = {1,2,5,7,9};
		int[] arr3 = {1,3,4,5,8};
		
		int i = 0;
		int j = 0;
		int k = 0;
		List<Integer> list = new ArrayList<>();
		while(i<arr1.length && j<arr2.length && k<arr3.length) {
			
			if(arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
				list.add(arr1[i]);
				i++;
				j++;
				k++;
				System.out.println("first if");
			}else if(arr1[i] < arr2[j]) {
				i++;
				System.out.println("second if");
			}else if(arr2[j] < arr3[k]) {
				j++;
				System.out.println("third if");
			}else {
				k++;
				System.out.println("fourth if");
			}
			
			
		}
		System.out.println(list);
		
		/*
		Time Complexity: The time complexity of this solution is 
		
		O(n), where n is the maximum length of the three arrays. This is because we traverse each array at most once.
		*/
	}

}
