package com.practice;

import java.util.ArrayList;
import java.util.List;

public class CommonInArrays {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5 }, arr2 = { 1, 2, 5, 7, 9 }, arr3 = { 1, 3, 4, 5, 8 };

		int i = 0;
		int j = 0;
		int k = 0;

		List<Integer> list = new ArrayList<Integer>();

		while (i < arr1.length && j < arr2.length && k < arr3.length) {
			if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
				list.add(arr1[i]);
				i++;
				j++;
				k++;
			} else if (arr1[i] < arr2[j]) {
				i++;
			} else if (arr2[j] < arr3[k]) {
				j++;
			} else
				k++;

		}
		System.out.println("::" + list);
	}
}
