package com.beginner;

import java.util.Arrays;
import java.util.Comparator;

public class MinimunCurrency {
	
	public static void main(String[] args) {
		
		int[] notes = {100,500};
		int amount = 1300;
		int count = 0;
		int[] result = new int[notes.length];
		Integer[] array = Arrays.stream(notes).boxed().toArray(Integer[]::new);
		
		Arrays.sort(array, Comparator.reverseOrder());
		 
		for (int i = 0; i < array.length; i++) {
            result[i] = amount / array[i];
            amount = amount % array[i];
            count+=result[i];
        }
		
		System.out.println(Arrays.toString(result));
		System.out.println(count);
	}
	
	/*
	 * ### Time Complexity - **Sorting**: The sorting step has a time complexity of
	 * (O(n log n)), where (n) is the number of denominations. - **Greedy
	 * Calculation**: The greedy calculation itself has a time complexity of
	 * (O(n)), where (n) is the number of denominations.
	 * 
	 * Overall, the time complexity of the program is (O(n log n)) due to the
	 * sorting step.
	 */

}
