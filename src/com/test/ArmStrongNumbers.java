package com.test;

import java.util.ArrayList;
import java.util.List;

public class ArmStrongNumbers {

	public static void main(String[] args) {

		List<Integer> list = getArmStrongNumbers(11, 500);
	}

	private static List<Integer> getArmStrongNumbers(int x, int y) {

		List<Integer> list = new ArrayList<Integer>();

		for (int i = x; i < y; i++) {

			
			boolean armStrong = checkArmStrong(i);
			if(armStrong)
				System.out.println(i);
		}
		return list;
	}

	private static boolean checkArmStrong(int originalNumber) {
		
		  int digits = 0;
		  int temp = originalNumber;
		  int sum = 0;
		  
		// 371
		if (originalNumber < 10)
			return true;
		else {
			 while (temp != 0) {
		          
					digits++;
					temp /= 10;
		        }
			 
			 temp = originalNumber;
			while (originalNumber != 0) {
				
				int num = originalNumber%10;
				sum+=Math.pow(num, digits);
				originalNumber/=10;
			}
		}
		return sum == temp;

	}
}
