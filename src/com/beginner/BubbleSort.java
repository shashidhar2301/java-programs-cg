package com.beginner;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int[] array = {64, 34, 25, 12, 22, 11, 90};
		
		boolean swapped = false;
		int temp = 0;
		for(int i=0;i<array.length-1;i++) {
			
			swapped = false;
			
			for(int j=0;j<array.length-i-1;j++) {
				
				if(array[j] > array[j+1]) {
					temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
					swapped = true;
				}
				
				
			}
			
            // If no two elements were swapped in the inner loop, then the array is sorted
            if (!swapped) break;

			
			
			
		}
		
		if(!swapped)
			System.out.println("already swapped");
		else
			System.out.println(Arrays.toString(array));
	}
	
	
	/*
	 * **Time Complexity**: - **Worst Case**: (O(n^2)), where (n) is the number
	 * of elements in the array. This occurs when the array is sorted in reverse
	 * order. - **Best Case**: (O(n)), when the array is already sorted, thanks to
	 * the optimization with the `swapped` flag.
	 * 
	 * - **Space Complexity**: (O(1)), as Bubble Sort is an in-place sorting
	 * algorithm and does not require additional space beyond the input array.
	 * 
	 * Bubble Sort is generally not used for large datasets due to its inefficiency
	 * compared to more advanced algorithms like Quick Sort or Merge Sort, but it is
	 * a good introductory algorithm for understanding basic sorting concepts.
	 */

}
