package com.beginner;

import java.util.Arrays;

public class UniqueChar {

	public static void main(String[] args) {
		
		String str = "aple";
		
		boolean[] ch = new boolean[256];
		Arrays.fill(ch, false);
		
		for(int i=0;i<str.length();i++) {
			
			if(ch[str.charAt(i)]  == true)
			{
				System.out.println("no unique");
				break;
			}
			
			ch[str.charAt(i)] = true;
			
		}
		
	
		System.out.println(Arrays.toString(ch));
	}
}
