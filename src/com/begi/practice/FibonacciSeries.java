package com.begi.practice;

public class FibonacciSeries {

	public static void main(String[] args) {

		int i = 0;
		int j = 1;
		int num = 10;
		System.out.print(i + "," + j);
		for (int k = 0; k < num; k++) {
			int temp = i + j;
			i = j;
			j = temp;

			System.out.print("," + temp);
		}

	}

}
