package simple;

import java.util.Arrays;

public class Program6 {

	public static void main(String[] args) {
		/*
		 * "6. Find Reverse String With Preserving Order. Ex:   Input = abcd, output =
		 * dcba   Input = I am Java Developer, Output  = r ep olev eDavajamI"
		 * 
		 */
		
		//String str = "abcd";
		String str = "I am Java Developer";
		reverseOfString(str);
	}

	private static void reverseOfString(String str) {
		
		//I am Java Developer
		char[] ch = str.toCharArray();
		char[] result = new char[ch.length];
		
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i] == ' ') {
				result[i] =' ';
			}
			
		}
		
		int j = ch.length-1;
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=' ') {
				if(result[j] ==' ') {
					j--;
				}
				result[j--] = ch[i];
			}
			
			
		}
		System.out.println(result);
		
	}
}
