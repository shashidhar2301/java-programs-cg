package com.beginner;

public class Pangram {
	
	public static void main(String[] args) {
		
		
		String s1 = "abcd",s2="";
		boolean flag = true;
		for(char c='a';c<='z';c++) {
			if(!s1.contains(String.valueOf(c))) {
				flag = false;
				s2 += c;
				//break;
			}
		}
		if(flag)
			System.out.println("Panagram");
		else {
			System.out.println("Not Panagram");
			System.out.println(s2);
		}
		
	}

}
