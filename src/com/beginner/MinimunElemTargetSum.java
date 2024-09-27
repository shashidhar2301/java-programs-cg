package com.beginner;

import java.util.Arrays;
import java.util.Comparator;

public class MinimunElemTargetSum {
	
	public static void main(String[] args) {
		
		int[] arr = { 1,2,3,4};
		int value = 8;
		
		Integer[] array = Arrays.stream(arr).boxed().toArray(Integer[]::new);
		
		Arrays.sort(array, Comparator.reverseOrder());
		
		System.out.println(Arrays.toString(array));
		
		int sum = 0;
		int count = 0;
		for(int i : array) {
			
			sum+=i;
			count++;
			if(sum>=value) {
				
				System.out.println(count);
				break;
			}
			
		}
	}
	


}
