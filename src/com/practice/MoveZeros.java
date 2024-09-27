package com.practice;

import java.util.Arrays;

public class MoveZeros {

	public static void main(String[] args) {
		 System.out.println(Arrays.toString(moveZeroes(new int[]{0,1,0,3,12,2})));
	}
	public static int[] moveZeroes(int[] nums) {
	    int j = 0; // Pointer for the next non-zero element
	    
	    // Loop through all the elements in the array
	    for (int i = 0; i < nums.length; i++) {
	        if (nums[i] != 0) {
	            // Swap elements
	            int temp = nums[i];
	            nums[i] = nums[j];
	            nums[j] = temp;
	            j++; // Move the pointer for the next non-zero element
	        }
	    }
	    return nums;
	}

}
