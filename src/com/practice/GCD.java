package com.practice;

public class GCD {
	
	public static void main(String[] args) {
		
		int x =10;
		int y =20;
		//int x=0;
		
		/*
		 * while(y!=0) {
		 * 
		 * int x =y; y = x%y; x = x;
		 * 
		 * 
		 * } System.out.println(x);
		 */
		
		while(y!=0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
		
		System.out.println(x);
	}

}
