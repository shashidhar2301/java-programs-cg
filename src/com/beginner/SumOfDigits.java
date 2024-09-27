package com.beginner;

public class SumOfDigits {
	
	public static void main(String[] args) {
		
		int num =6765;
		int sum = 0;
		sum = sumMethod(num);
		System.out.println(sum);
	}
	
	static int sumMethod(int num) {
		int sum  =0;
		if(num<10)
			return num;
		while(num>0) {
			sum = sum+ num%10;
			num/=10;
			
		}
		if(sum>10)
			return sumMethod(sum);
		else
			return sum;
	}

}
