package com.test;

import java.util.Arrays;

public class MergeTwoSortedArrIntoOne {

	public static void main(String[] args) {

		/*
		 * "23. Given two sorted arrays, the task is to merge them in a sorted manner .
		 * Example:1 Input: arr1[] = { 1, 3, 4, 5}, arr2[] = {2, 4, 6, 8} Output: arr3[]
		 * = {1, 2, 3, 4, 4, 5, 6, 8} Example 2: Input: arr1[] = { 3,7,9,12,21}, arr2[]
		 * = {6,8,15,18,27} Output: arr3[] = {3,6,7,8,9,12,15,18,21,27} Example 3:
		 * Input: arr1[] = { 3,7,9,-12,21,12}, arr2[] = {6,8,15,-18,27} Output: arr3[] =
		 * {-18,-12,3,6,7,8,9,12,1521,27} Time complexity: O(n1+n2) where n1 and n2 are
		 * size of each array."
		 * 
		 */

		int[] arr1 = { 3, 7, 9, -12, 21, 12 };
		int[] arr2 = { 6, 8, 15, -18, 27 };

		int[] output = new int[arr1.length + arr2.length];

		int i = 0, j = 0;
		int k = 0;

		while (i < arr1.length && j < arr2.length) {

			if (arr1[i] < arr2[j]) {
				output[k++] = arr1[i++];
			} else
				output[k++] = arr2[j++];

		}

		while (i < arr1.length) {
			output[k++] = arr1[i++];
		}

		while (j < arr2.length) {
			output[k++] = arr2[j++];
		}
		Arrays.sort(output);
		System.out.println(Arrays.toString(output));
	}

	/*
	 * ### Explanation: 1. **mergeSortedArrays**: This function merges two sorted
	 * arrays into a single sorted array. 2. **Time Complexity**: The time
	 * complexity is ( O(n1 + n2) ), where ( n1 ) and ( n2 ) are the sizes of
	 * the input arrays. This is because the function iterates through each element
	 * of both arrays exactly once. 3. **Handling Unsorted Arrays**: For example 3,
	 * since the input arrays are not sorted, I've added a sorting step after
	 * merging the arrays.
	 * 
	 */

}
