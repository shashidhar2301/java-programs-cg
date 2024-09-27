package com.Complex;

public class Platforms {
	
	public static void main(String[] args) {
//		Input arr[] = {900, 940, 950, 1100, 1500, 1800}, dep[] = {910, 1200, 1120, 1130, 1900, 2000} 
	//			Output 3 
		
		int arr[] = {900, 940, 950, 1100, 1500, 1800}, dep[] = {910, 1200, 1120, 1130, 1900, 2000};
		
		int platformsNeeded = 1;
		int result=1;
		
		int i=1,j=0;
		int size = arr.length;
		
		while(i<size && j<size) {
			
			if(arr[i]<= dep[j]) {
				platformsNeeded ++;
				i++;
			}else {
				platformsNeeded--;
				j++;
			}
			
			if (platformsNeeded > result)
                result = platformsNeeded;
			
		}
		System.out.println(result);

	}

}
