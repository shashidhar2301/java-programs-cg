package com.beginner;

import java.util.Arrays;

public class ReverseStringPreserveOrder {

	public static void main(String[] args) {

		//Input = I am Java Developer, Output  = r ep olev eDavajamI
		String str = "I am Java Developer";
		
		char[] inputArray = str.toCharArray();
		char[] result = new char[str.length()];
//		
//		for(int i=str.length()-1;i>=0;i--) {
//			System.out.print(str.charAt(i));
//		}
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				//System.out.println( str.charAt(i));
				result[i] = str.charAt(i);
			}
		}
		 
		
		
		 int j = result.length - 1;  
		   
	        for (int i = 0; i < inputArray.length; i++) {  
	            if (inputArray[i] != ' ') {  
	                if (result[j] == ' ') {  
	                    j--;  
	                }  
	                result[j] = inputArray[i];  
	                j--;  
	            }  
	        } 
	        
	        System.out.println(str + " --> " + String.valueOf(result));  
	}
}
