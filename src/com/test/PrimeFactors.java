package com.test;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

	public static void main(String[] args) {

		/*
		 * "4. Find Prime fraction of a number if no. Is 6 prime fraction is 2,3 If no.
		 * Is 24 then prime fraction is 2,2,2,3 If no. Is negative or 1 then there is no
		 * fraction it should be empty"
		 * 
		 */
		
		int num = 25;
		List<Integer> list = getPrimeFactors(num);
		System.out.println(list);
	}

	private static List<Integer> getPrimeFactors(int num) {
		
		List<Integer> list = new ArrayList<Integer>();
		if(num <= 1)
			return new ArrayList<>();
		//int temp = num;
		while(num%2 == 0) {
			list.add(2);
			num/=2;
		}
		
		for(int i=3;i<=num/2;i+=2) {
			while(num%i == 0) {
				list.add(i);
				num/=i;
			}
			
		}
		
		return list;
	}
	/*
	 * 
	 * ### Time Complexity: - The time complexity of this method is O(√n). - The
	 * initial division by `2` takes `O(log n)` time in the worst case (if the
	 * number is a power of `2`). - The loop over odd numbers takes `O(√n)` in the
	 * worst case.
	 * 
	 * This code efficiently finds the prime factors of any given number, and the
	 * logic is directly derived from the constraints mentioned in the image.
	 */
}
