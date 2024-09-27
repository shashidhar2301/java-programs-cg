package com.begi.practice;

public class StringPanagramCheck {
	
	public static void main(String[] args) {
		
		/*
		"2. Check the given String is Panagram or Not.
		A. Check the string is Panagram or not
		B. If not panagram , then print the missing letters 
		ex: The quick brown fox jumps over the lazy dog.
		Write a program for Panagram Detector.

		* The sentence ""The quick brown fox jumps over the lazy dog"" contains every single letter in the alphabet. Such sentences are called pangrams.
		* Write a function called ""findMissingLetters""  which takes a String `sentence`,  
		* and returns all the letters it is missing. Which prevent it from being a pangram.
		* You should ignore the case of the letters in sentence, and your return should be all lower case letters, in alphabetical order.
		* You should also ignore all non US-ASCII characters."
		* */
		//String str = "Te quick brown fox jumps over the lazy dog";
		String str = "sentence";
		String nonASCII =  str.toLowerCase().replaceAll("[^a-z]", "");
		boolean panagram = checkPanagram(nonASCII);
		System.out.println(panagram);
		
		String newStr = getMissedLetter(str);
		System.out.println("::"+newStr);

	}
	
	static boolean checkPanagram(String str) {
		
		if(str==null || (str!=null && str.length()<26))
			return false;
		int[] count = new int[26];
		for(int i=0;i<str.length();i++) {
			count[(int)(str.charAt(i) - 'a')]++;
		}
		
		for(int i=0;i<count.length;i++) {
			if(count[i]==0)
				return false;
		}
		
		return true;
	}
	
	static String getMissedLetter(String s) {
		
		String newStr = "";
		for(char c='a';c<='z';c++) {
			
			if(!s.contains(String.valueOf(c))){
				newStr+=c;
				
			}
					
			
		}
		
		return newStr;
	}

	
}
