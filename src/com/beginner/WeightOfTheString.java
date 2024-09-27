package com.beginner;

public class WeightOfTheString {
	
	public static void main(String[] args) {
		String str = "apple";
		int weight = 0;
		for(int i=0;i<str.length();i++) {
			weight = weight + str.charAt(i) - 'a' +1;
			
		}
		System.out.println(weight);
	}

}
