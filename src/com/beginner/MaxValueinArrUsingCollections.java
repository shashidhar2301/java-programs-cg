package com.beginner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxValueinArrUsingCollections {
	public static void main(String[] args) {
		Integer[] array = { 2, 8, 5, 1, 12, 6 };  

		List<Integer> list = Arrays.asList(array);

		int maxValue = Collections.max(list);

		System.out.println("Maximum value in the array: " + maxValue);
	}
}
