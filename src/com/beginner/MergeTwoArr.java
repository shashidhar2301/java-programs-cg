package com.beginner;

import java.util.Arrays;

public class MergeTwoArr {
	
	public static void main(String[] args) {
		int arr2[] = { 1, 3, 4, 5}, arr1[] = {2, 4, 6, 8};
		
		sortByTwoPointer(arr1,arr2);
		
		
	}

	private static void sortByTwoPointer(int[] arr1, int[] arr2) {
	
		int length1 = arr1.length;
		int length2 = arr2.length;
		int[] result = new int[length1+length2];
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i<length1 && j<length2) {
			
			if(arr1[i] <= arr2[j])
				result[k++] = arr1[i++];
			else
				result[k++] = arr2[j++];
			
		}
		
		while (i < length1) {
            result[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2, if any
        while (j < length2) {
            result[k++] = arr2[j++];
        }
		
		System.out.println(Arrays.toString(result));
		
	}

}
