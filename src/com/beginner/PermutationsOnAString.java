package com.beginner;

public class PermutationsOnAString {
	
	public static void main(String[] args) {
		
		String str = "abc";
		printPermute(str,"");
		
	}

	public static void printPermute(String str, String ans){
		int length = str.length();
		
		   if(str.isEmpty()) {
		       System.out.println(ans + " ");
		       //System.out.println(str.length());
		      // return;
		   }
		  
		       for(int i=0; i<length;i++){
		           char c = str.charAt(i);
		           String s = str.substring(0,i) + str.substring(i + 1);
		          // System.out.println(i+":"+str.substring(0,i) +"::"+ str.substring(i + 1));
		           printPermute(s, ans + c);
		       }
		}
	
}
