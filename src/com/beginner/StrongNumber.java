package com.beginner;

public class StrongNumber {
	
	public static void main(String[] args) {
		
		
		int num  = 145;
		int ind = 0;
		int fact = 1, sum =0;
		int temp = num;
		while(num > 0) {
			 ind = num % 10;
			 fact = 1;
			 for(int i=1;i<=ind;i++) {
				 fact = fact * i;
			 }
			 sum = sum + fact;
			 
			num/=10;
		}
		if(temp == sum)
			System.out.println("strong");
		else
			System.out.println("not");
	}
	/*
	 * ### Time Complexity - **Factorial Calculation**: O(d), where d is the digit
	 * (0-9). This is constant time since the maximum value of d is 9. - **Strong
	 * Number Check**: O(k), where k is the number of digits in the number. -
	 * Overall, the time complexity of checking if a number is a strong number is
	 * O(k), where k is the number of digits in the number.
	 * 
	 * This ensures that the solution is efficient and runs in linear time relative
	 * to the number of digits in the input number.
	 */
}
