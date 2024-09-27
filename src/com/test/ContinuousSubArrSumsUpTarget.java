package com.test;

import java.util.ArrayList;
import java.util.List;

public class ContinuousSubArrSumsUpTarget {
	
	public static void main(String[] args) {
		/*
		 * "21. Given an unsorted array A of size N, find a continuous sub-array which
		 * sums up to S. For example if the input array is [ 12,7,29,6, 2, 11,4,8] and
		 * the expected sum is 8, then there are two possibilities [6,2] and [8] if the
		 * expected sum is 19 there are two possibilities [12,7] and [6,2,11]. [11,8] is
		 * not a possibility since its not continuous."
		 */
		
		int[] arr = {12,7,29,6, 2, 11,4,8};
		int target = 8;
		
		List<List<Integer>> output =calculateSum(arr,target);
		System.out.println(output);
		
	}

	private static List<List<Integer>> calculateSum(int[] arr, int target) {
		
		int tempSum = 0;
		int start = 0;
		int end  = 0;
		List<List<Integer>> result = new ArrayList<>();
		
		for(end=0;end<arr.length;end++) {
			
			tempSum = tempSum + arr[end];
			
			while(tempSum > target && start <= end) {
				tempSum = tempSum - arr[start];
				start++;
			}
			
			if(tempSum == target) {
				List<Integer> subArr = new ArrayList<>();
				for(int i=start;i<=end;i++) {
					subArr.add(arr[i]);
				}
				result.add(subArr);
			}
			
			
		}
		
		return result;
	}
	
	/*
	 * 
### Explanation:
1. Sliding Window:
    - You maintain a sliding window with two pointers: `start` and `end`.
    - As you iterate over the array with `end`, you keep adding elements to `currentSum`.
    - If `currentSum` exceeds `targetSum`, you start reducing it by incrementing the `start` pointer 
    (removing elements from the beginning of the window).
    - If `currentSum` equals `targetSum`, you've found a subarray, which you add to the result.

2. Time Complexity: 
   - The algorithm runs in O(N) time, where `N` is the length of the array. Each element is added to 
   `currentSum` and removed at most once.
  
3. Space Complexity:
   - The space complexity is O(1) for the algorithm itself, but the final space complexity depends on the number of subarrays that match the target sum, which is stored in the `result` list.
	 */

}
