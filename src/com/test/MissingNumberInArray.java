package com.test;

public class MissingNumberInArray {
	
	public static void main(String[] args) {
		
		//16. Write a Java Program to Find missing Number in an Array

		int[] arr = {1,2,3,5};
		
		int num = missingNum(arr);
		System.out.println(num);
	}

	
	private static int missingNum(int[] arr) {
	
		int n = arr.length+1;
		int sumOfnumbers = 0;
		int sumOdNaturalNumbers = n*(n+1)/2;
		
		for(int i : arr) {
			sumOfnumbers+=i;
		}
		
		return sumOdNaturalNumbers - sumOfnumbers;
	}

}
