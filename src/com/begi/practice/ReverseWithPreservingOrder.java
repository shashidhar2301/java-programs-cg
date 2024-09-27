package com.begi.practice;


public class ReverseWithPreservingOrder {

	public static void main(String[] args) {

		/*
		 * 6. Find Reverse String With Preserving Order. Ex:   Input = abcd, output =
		 * dcba   Input = I am Java Developer, Output  = r ep olev eDavajamI
		 */

		String str = "abc d";
		reversingString(str.toCharArray());
	}

	private static void reversingString(char[] input) {

		char[] result = new char[input.length];
		int j = result.length-1;
		for (int i = input.length - 1; i >= 0; i--) {

			if (input[i] == ' ') {
				result[i] = input[i];
				// System.out.println(result);
			}

		}
		//System.out.println(Arrays.toString(result));
		for (int i = 0; i < input.length; i++) {

			if (input[i] != ' ') {
				if(result[j] == ' ') {
					j--;
				}
				result[j] = input[i];
				j--;
			}
			

		}

		System.out.println(String.valueOf(result));

	}

}
