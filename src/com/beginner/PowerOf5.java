package com.beginner;

public class PowerOf5 {
	
	public static void main(String[] args) {
		
		int num = 80;
		
		while(num%5==0) {
				num/=5;
			}
			
		 System.out.println(num);
		if(num==1) {
			System.out.println("yes");
		}else
			System.out.println("no");
	}

}
