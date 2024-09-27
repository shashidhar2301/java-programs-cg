package com.practice;

import java.util.Arrays;

public class MergeTwoArrInSorted {
	
	public static void main(String[] args) {


		// the overall time complexity of the 
		 //`mergeAndSortArrays` method is \(O((n1 + n2) \log (n1 + n2))\) and the overall space 
		//complexity is \(O(n1 + n2)\).
		
		int arr1[] = { 1, 3, 4, 5}, arr2[] = {2, 4, 6, 8};
		
		int arr3[] = new int[arr1.length+arr2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i<arr1.length && j<arr2.length) {
			
			if(arr1[i] < arr2[j])
				arr3[k++] = arr1[i++];
			else
				arr3[k++] = arr2[j++];
					
			
		}
		
		while(i<arr1.length) {
			arr3[k++] = arr1[i++];
			
		}
		
		while(j<arr2.length) {
			arr3[k++] = arr2[j++];
		}
		
		System.out.println(Arrays.toString(arr3));

	}

}
