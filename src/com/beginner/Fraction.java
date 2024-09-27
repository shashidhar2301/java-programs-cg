package com.beginner;

public class Fraction {
	
	public static void main(String[] args) {
		String decimal = findDecimal(1,6);
		System.out.println(decimal);
	}
	
	private static String findDecimal(int nr, int dr) {
		double d = (double) nr / dr;
		String decimal = String.valueOf(d);
 
		String afterDecimal = decimal.split("\\.")[1];
		String recurring = checkRecurring(afterDecimal);
		if (recurring == null) {
			return decimal;
		} else {
			return decimal.split("\\.")[0] + ".(" + recurring + ")";
		}
 
	}
 
	private static String checkRecurring(String afterDecimal) {
		if (afterDecimal.matches("^0*$"))
			return "0";
		char initial = afterDecimal.charAt(0);
		String str = "" + initial;
		for (int i = 1; i < afterDecimal.length(); i++) {
			if (afterDecimal.charAt(i) == initial)
				return str;
			else
				str += afterDecimal.charAt(i);
		}
		return null;
	}

}
