package com.begi.practice;

public class FractionSimplestForm {
	
	public static void main(String[] args) {
		
		/*
		"26. Add two fraction a/b and c/d and print answer in simplest form.

		Examples :

		Input:  1/2 + 3/2
		Output: 2/1

		Input:  1/3 + 3/9
		Output: 2/3

		Input:  1/5 + 3/15
		Output: 2/5"
		*/
		
		int a =1;
		int b =3;
		int c=3;
		int d=9;
		
		int num = (a*d) + (b*c);
		int den = b*d;
		
		
		int gcd = calculateGCD(num, den);
		System.out.println(gcd);
		System.out.println((num/gcd)+"/"+(den/gcd));
		

	}

	private static int calculateGCD(int num, int den) {
		
	while(den!=0) {
		int temp = den;
		den = num % den;
		num = temp;
	}
		return num;
	}

}
