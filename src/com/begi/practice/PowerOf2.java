package com.begi.practice;

public class PowerOf2 {
	
	public static void main(String[] args) {
		
		int num = 10;
		boolean check = checkPower(num);
		System.out.println(check);
	}

	private static boolean checkPower(int num) {
		
		while(num>=2 && num %2==0) {
			
			num/=2;
			System.out.println(num);
		}
		return num ==1;
		
	}

}
