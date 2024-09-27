package com.beginner;


public class Armstrong {
	
	public static void main(String[] args) {
		
		int val = 0;
		for(int i=1;i<=200;i++) {
			int length = String.valueOf(i).length();
			int sum =0;
			val = i;
			 while (val > 0) {
		            int digit = val % 10;
		            sum += Math.pow(digit, length);
		            val /= 10;
		        }
			
			if(sum==i)
				System.out.println(i);
			/*
			 * else System.out.println("no");
			 */
			
		}
		/*
		 * ### Time and Space Complexity
		 * 
		 * - **Time Complexity**: - The time complexity is (O(n cdot d)), where (n)
		 * is the number of numbers to check (1000 in this case), and (d) is the
		 * average number of digits (up to 4 for numbers between 1 and 1000).
		 * 
		 * - **Space Complexity**: - The space complexity is (O(d)) for storing digits
		 * and intermediate calculations, where (d) is the number of digits in the
		 * number.
		 * 
		 * This approach is efficient for the given range (1 to 1000) and provides a
		 * straightforward way to determine and print Armstrong numbers.
		 */
		
	}
	 

}
