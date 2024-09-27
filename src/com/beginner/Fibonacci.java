package com.beginner;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		//0,1,1,2,3,5,8,13,21
		
		int first = 0, second = 1;
		int result;
		System.out.print(first+","+second);
		for(int i=0;i<10;i++) {
			result = first + second;
			first = second;
			second = result;
			System.out.print(","+result);
			
		}
		
		
	}

}
