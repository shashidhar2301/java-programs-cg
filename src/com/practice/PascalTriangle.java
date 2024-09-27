package com.practice;

public class PascalTriangle {
	
	public static void main(String[] args) {
		int line = 4;
		for(int i=1;i<=line;i++) {
			int first = 1;
			
			
			for(int j=1;j<=i;j++) {
				System.out.print(first+" ");
				first = first * (i-j)/j;
			}
			System.out.println();
		}
	 
		int value = getValueFromCoordinate(2,1);
		System.out.println(value);
	}

	private static int getValueFromCoordinate(int i, int j) {
		int num  = factorial(i)/(factorial(j)*factorial(i-j));
		return num;
	}
	
	static int factorial(int n) {
		
		if(n==0)
			return 1;
		int fact  = 1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		return fact;
		
	}

}
