package com.beginner;

public class SecondSmallest {

	public static void main(String[] args) {

		int[] arr = { -1, -10, 20, 42, -13, 0, 100 };

		int firstSmall = Integer.MAX_VALUE;
		int secondSmall = Integer.MAX_VALUE;
		int thirdSmall = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < firstSmall)
				firstSmall = arr[i];
		}
		// System.out.println(firstSmall);

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < secondSmall && arr[i] > firstSmall) {

				secondSmall = arr[i];

			}

		}

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < thirdSmall && arr[i] > secondSmall) {

				thirdSmall = arr[i];

			}

		}

		System.out.println(thirdSmall);

		/*
		 * Overall Time Complexity
		 * 
		 * - **Combining Both Loops**: - Each loop independently has a time complexity
		 * of (O(n)). - Since they are sequential and not nested, the overall time
		 * complexity is the sum of the complexities of both loops, which is still
		 * (O(n)).
		 * 
		 * Therefore, **the overall time complexity of the code is (O(n))**.
		 * 
		 * ### Space Complexity
		 * 
		 * - **Space Complexity**: - The space used by the code is constant regardless
		 * of the input size, as it only uses a few extra integer variables
		 * (`firstSmall` and `secondSmall`). - Therefore, the space complexity is
		 * (O(1)).
		 */
	}

	private static void secondSmallest(int[] arr) {

		int firstSmallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		for (int i : arr) {
			if (i < firstSmallest) {
				secondSmallest = firstSmallest;
				firstSmallest = i;

			} else if (i < secondSmallest && i != firstSmallest)
				secondSmallest = i;
		}

		System.out.println(firstSmallest);
		System.out.println(secondSmallest);

		/*
		 * for(int i : arr) {
		 * 
		 * if(firstSmallest<i && i<secondSmallest) secondSmallest = i; }
		 * 
		 * System.out.println(secondSmallest);
		 */

	}

}
