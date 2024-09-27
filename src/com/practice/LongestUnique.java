package com.practice;

public class LongestUnique {
	
	public static void main(String[] args) {
		
		String str = "acbbbbbccc";
		int count=1;
		int maxCount = 0;
		int index = 0;
		for(int i=1;i<str.length();i++) {
			
			if(str.charAt(i)==str.charAt(i-1)) {
				count++;
				 if(count>maxCount) {
					maxCount = count;
					index = i - maxCount +1;
				}
			}else
				count =1;
			
		}
		System.out.println(maxCount+":"+index);
		
	}

}
