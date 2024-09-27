package com.beginner;

public class PowerOf10 {
	
	public static void main(String[] args) {
		
		int input =190;
		double log = Math.log(100);
		System.out.println(log);
		boolean flag = power10(input);
		System.out.println(flag);
	}

	static boolean power10(int input){
		while (input >= 10 && input % 10 == 0) 
			  input /= 10;
			
		
		return input == 1;
	}
}
