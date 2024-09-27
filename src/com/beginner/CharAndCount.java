package com.beginner;

public class CharAndCount {
	
	public static void main(String[] args) {
		
		String str = "aaabbc";
		int count = 1;
		StringBuilder newStr = new StringBuilder();
		
		
		for(int i=0;i<str.length();i++) {
			
			if(i+1 < str.length() && str.charAt(i) == str.charAt(i+1)) {
				count++;
			}else {
				newStr.append(str.charAt(i));
				newStr.append(count);
				count = 1;
				
			}
				
			
		}
		System.out.println(newStr.toString());
		
		
	}

}
