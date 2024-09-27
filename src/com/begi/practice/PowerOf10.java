package com.begi.practice;

public class PowerOf10 {
	
	public static void main(String[] args) {
		
		int num =10;
		
		boolean flag =checkPower(num);
		System.out.println(flag);
	}

	private static boolean checkPower(int num) {
		// TODO Auto-generated method stub
		while(num>=10 && num%10==0) {
			num = num/10;
			if(num == 1) {
				return true;
			}
			
		}
		
		
		
		return false;
		
	}
	

}
