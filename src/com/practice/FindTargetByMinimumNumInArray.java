package com.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindTargetByMinimumNumInArray {

	public static void main(String[] args) {

		/*
		 * "10. For the given Array, accept the target value as input and find out the
		 * sum of minimum elements required to find the target value. Example : Array :
		 * { 1,2,3,4} Target Value = 6 out put = 2+4 =6            return 2    element
		 * required .
		 * 
		 * Target Value = 12 output = 1+2+3+4 = 10   return -1  target value out of
		 * Scope ."
		 * 
		 */
		
		int[] arr = {1,2,3,4};
		int target = 8;
		
		Integer[] array = Arrays.stream(arr).boxed().toArray(Integer[]::new);
		
		List<Integer> asList = Arrays.asList(array);
		
		Collections.sort(asList, Collections.reverseOrder());
		
		System.out.println(asList);
		
		
		int output = minNumbersRequired(asList, target);
		System.out.println("min numbers required:"+output);
		
	}

	private static int minNumbersRequired(List<Integer> asList, int target) {
		
		int temp = 0;
		int count = 0;
		for(int i : asList) {
			
			temp+=i;
			count++;
			if(target<=temp) {
				return count;
			}
		}
		return -1;
	}
	
	

}
