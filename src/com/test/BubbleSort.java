package com.test;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] arr = {64, 34, 25, 12, 22, 11, 90};
		int n = arr.length; 
		  boolean swapped; 
	 
			// Traverse through all array elements
	        for (int i = 0; i < n - 1; i++) {
	            swapped = false; // Reset swapped for the current pass

	            // Last i elements are already in place
	            for (int j = 0; j < n - 1 - i; j++) {
	                // Compare adjacent elements
	                if (arr[j] > arr[j + 1]) {
	                    // Swap if they are in the wrong order
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                    swapped = true; // Mark that a swap occurred
	                }
	            }

	            // If no two elements were swapped in the inner loop, the array is sorted
	            if (!swapped) {
	                break;
	            }
			
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
