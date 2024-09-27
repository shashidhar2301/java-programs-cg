package com.test;

import java.util.Arrays;

public class MedianOfTwoArrays {
	/*
	 * "12. Find the median of two sorted arrays of different size. Example: Input :
	 * Array 1: 2 3 6 7 9 Array 2: -1 4 8 10  = 5 Output : 6 Hint: The final sorted
	 * array would be - 1, 2, 3, 4, 6, 7, 8, 9, 10 The 5th element of this array is
	 * 6. "
	 */

	public static void main(String[] args) {

		int[] arr1 = { 2, 3, 6, 7, 9 };
		int[] arr2 = { -1, 4, 8, 10, 22 };
		int[] arr3 = new int[arr1.length + arr2.length];

		int k = 0;
		int i = 0;
		int j = 0;
		//new int[]{ 1,2,3,8},new int[]{ 5,6,4,7}
		while (i < arr1.length && j < arr2.length) {

			if (arr1[i] < arr2[j]) {
				arr3[k++] = arr1[i++];
			} else
				arr3[k++] = arr2[j++];

		}

		while (i < arr1.length) {
			arr3[k++] = arr1[i++];
		}

		while (j < arr2.length) {
			arr3[k++] = arr2[j++];
		}

		System.out.println(Arrays.toString(arr3));

		double median = findMedian(arr3);
		System.out.println(median);
	}

	private static double findMedian(int[] arr3) {

		if (arr3.length % 2 != 0)
			return arr3[arr3.length / 2];

		double median = (arr3[arr3.length / 2] + arr3[arr3.length / 2 - 1]) / 2.0;

		return median;
	}
	/*
	 * Time Complexity Merging the Arrays: The merging process takes
	 * 
	 * O(n+m), where n is the length of the first array and m is the length of the
	 * second array. Finding the Median: Finding the median from the merged array
	 * takes
	 * 
	 * O(1) time since it only involves indexing. Overall Time Complexity: O(n+m)
	 */

}
