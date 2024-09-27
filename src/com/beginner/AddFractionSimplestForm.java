package com.beginner;

public class AddFractionSimplestForm {

	public static void main(String[] args) {
		
		int a =1;
		int b= 2;
		int c= 3;
		int d= 2;
		
		int num = (a*d) + (b*c);
		int den = (b*d);
		
		int gcd = calculateGCD(num,den);
		System.out.println((num/gcd)+"/"+(den/gcd));
		
	}
	
	static int calculateGCD(int x, int y) {
		
		int temp = 0;
		
		while(y!=0) {
			temp = y;
			y = y % x;
			x = temp;
		}
		
		return x;
	}
}
