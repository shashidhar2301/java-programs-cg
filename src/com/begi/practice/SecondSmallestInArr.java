package com.begi.practice;

public class SecondSmallestInArr {

	public static void main(String[] args) {

		/*
		 * "19. Find out the second smallest element in a given array with appropriate logic that takes minimal"
		 * time and space complexity. Array = {-1,-10,20,42,-13,0,100}
		 * 
		 * Output : -10"
		 */

		int[] arr = { -1, -10, 20, 42, -13, 0, 100 };
		int firstSmall = Integer.MAX_VALUE;
		int secondSmall = Integer.MAX_VALUE;

		for (int i = 1; i < arr.length; i++) {

			if (firstSmall > arr[i]) {
				firstSmall = arr[i];
			}
		}

		for (int i = 1; i < arr.length; i++) {

			if (firstSmall < arr[i] && secondSmall > arr[i]) {
				secondSmall = arr[i];
			}
		}

		System.out.println(firstSmall);
		System.out.println(secondSmall);
	}

}
