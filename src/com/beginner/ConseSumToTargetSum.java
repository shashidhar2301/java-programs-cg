package com.beginner;

import java.util.ArrayList;
import java.util.List;

public class ConseSumToTargetSum {
	public static List<List<Integer>> findSubarraysWithSum(int[] A, int S) {
		List<List<Integer>> result = new ArrayList<>();
		int start = 0;
		int currentSum = 0;

		for (int end = 0; end < A.length; end++) {
			currentSum += A[end];
			//System.out.println("first sum:::"+currentSum+"::start::"+start+"::"+end);
			while (currentSum > S && start <= end) {
				currentSum -= A[start];
				start++;
				//System.out.println("second sum:::"+currentSum+"::start::"+start+"::"+end);
			}

			if (currentSum == S) {
				List<Integer> subarray = new ArrayList<>();
				for (int i = start; i <= end; i++) {
					subarray.add(A[i]);
				}
				result.add(subarray);
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[] A = { 12, 7, 29, 6, 2, 11, 4, 8 };
		int S1 = 8;
		int S2 = 19;

		System.out.println("Subarrays with sum " + S1 + ": " + findSubarraysWithSum(A, S1));
		//System.out.println("Subarrays with sum " + S2 + ": " + findSubarraysWithSum(A, S2));
	}
}
