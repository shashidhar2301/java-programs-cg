package com.practice;

public class AddFractionSimplestForm {

	public static void main(String[] args) {
		
		int a =1;
		int b= 2;
		int c= 3;
		int d= 9;
		
		int num = (a*d) + (b*c);
		int den = (b*d);
		
		
		int gcd = calculateGCD(num, den);
		System.out.println((num/gcd) +"/"+(den/gcd));
		
	}
	
	static int calculateGCD(int num, int den) {
		
		while(den!=0) {
			int temp = den;
			den = num % den;
			num = temp;
		}
		
		return num;
	}
}
