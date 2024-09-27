package com.test;

import java.util.HashMap;
import java.util.Map;

public class FractionCycle {

	public static void main(String[] args) {

		/*
		 * 
		 * ""Implement the method that provided numerator and denominator will return a
		 * string representing fraction's decimal form. Some fractions in decimal form
		 * have cyclic decimal points.
		 *
		 * Examples: 1/2 = 0.5 1/3 = 0.(3)"""
		 */
		
		
		int num = 1;
		int den = 3;
		
		String fraction  = calculateFraction(num, den);
		System.out.println(fraction);
	}

	private static String calculateFraction(int num, int den) {
		
		
		
		StringBuilder builder = new StringBuilder();
		builder.append(num/den);
		
		num = num % den;
		
		if(num==0)
			return builder.toString();
		
		builder.append(".");
		
		Map<Integer,Integer> map = new HashMap<>();
		
		while(num!=0) {
			
			if(map.containsKey(num)) {
				builder.insert(map.get(num), "(");
				builder.append(")");
				break;
			}
			
			map.put(num, builder.length());
			num*=10;
			builder.append(num/den);
			num = num % den;
			
		}
		return builder.toString();
	}
}
