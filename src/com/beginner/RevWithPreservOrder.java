package com.beginner;

import java.util.Arrays;

public class RevWithPreservOrder {

	public static void main(String[] args) {
		// Input = abcd, output = dcba
		String input = "abcd x";

		char[] result = new char[input.length()];

		for (int i = 0; i < input.length(); i++) {

			if (input.charAt(i) == ' ') {
				result[i] = input.charAt(i);
			}
		}
		System.out.println(Arrays.toString(result));

		int j = result.length - 1;

		for (int i = 0; i < input.length(); i++) {

			if (input.charAt(i) != ' ') {
				if (result[j] == ' ')
					j--;

				result[j] = input.charAt(i);
				j--;

			}
		}

		System.out.println(Arrays.toString(result));
	}
}
