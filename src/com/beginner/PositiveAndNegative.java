package com.beginner;

import java.util.Arrays;

public class PositiveAndNegative {

	public static void main(String[] args) {
		
		
		// Eg: Input = [3,-2,1,-1,4,9,-6]   Output = [-2,-1,-6,3,1,4,6]
		
		int[] arr = {3,-2,1,-1,4,9,-6}; 
		int j=0;
		int temp = 0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]<0) {
				if( i!=j) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
			}
			j++;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
		
	}
	
	 static void rearrange(int arr[], int n)
	    {
	        int j = 0, temp;
	        for (int i = 0; i < n; i++) {
	            if (arr[i] < 0) {
	                if (i != j) {
	                    temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }
	                j++;
	            }
	        }
	    }
}
