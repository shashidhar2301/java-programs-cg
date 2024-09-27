package simple;

import java.util.Arrays;

public class Program26 {

	public static void main(String[] args) {

		/*
		 * "26. Given an integer array nums, move all 0's to the end of it while
		 * maintaining the relative order of the non-zero elements.
		 * 
		 * Note that you must do this in-place without making a copy of the array.
		 * 
		 * 
		 * 
		 * Example 1:
		 * 
		 * Input: nums = [0,1,0,3,12] Output: [1,3,12,0,0] Example 2:
		 * 
		 * Input: nums = [0] Output: [0]"
		 * 
		 */
		
//		/movingZeros(new int[] {0,1,0,3,12});
		movingZeros(new int[] {0});
	}

	private static void movingZeros(int[] arr) {
		
		
		int j=0; 
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i]!=0)
				arr[j++] = arr[i];
		}
		
		for(int i=j;i<arr.length;i++) {
			arr[i] = 0;
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
