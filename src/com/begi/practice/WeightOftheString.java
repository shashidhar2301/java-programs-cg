package com.begi.practice;

public class WeightOftheString {
	/*
	4. Find the weight of given String.
	(A-Z/a-z) we have 26 alphabetic, consider the position of a-z alphabets as 1-26. 
	Based on that find the weight of the given String.
	Ex:
	Given String: Apple
	Output: 1+16+16+12+5 = 50
*/
	
	
	public static void main(String[] args) {
		String str = "shashidhar".toLowerCase();
		
		int weight = 0;
		
		for(int i=0;i<str.length();i++) {
			
			weight = weight + (str.charAt(i)-'a')+1;
			
		}
		
		//System.out.println(weight);
		
		int length = makeSingleDigit(weight);
		System.out.println(length);
		
	}

	private static int makeSingleDigit(int weight) {
		// TODO Auto-generated method stub
		//System.out.println("::"+weight);
		int sum = 0;
		while(weight > 0) {
			
			sum = sum + weight%10;
			weight/=10;
		}
		//System.out.println("sum--"+sum);
		if(sum>10)
			return makeSingleDigit(sum);
		
		return sum;
	}
}
