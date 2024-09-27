package com.test;

import java.util.HashSet;
import java.util.Set;

public class CommonSumByInterChangingNumbers {
	
	public static void main(String[] args) {
		
		//11. Given two arrays. Arr1 = {1,2,3,8}, arr2 = {5,6,4,7}. Find a number from each array to be
		//interchanged to reach a common sum of all elements for both arrays. Output: {1,5} or {3,7} or {2,6} 
		
		int[] arr1 = {1,2,3,8};
		int[] arr2 = {5,6,4,7};
		Set<Integer> set = new HashSet<>();
		
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i : arr1) {
			sum1+=i;
			set.add(i);
		}
		for(int j: arr2)
			sum2+=j;
		
		int diff = (sum1-sum2)/2;
		
		for(int j : arr2) {
			
			int num = j+diff;
			if(set.contains(num))
				System.out.println(num+","+j);
			
		}
		
		

	}

}
