package com.practice;

public class SubStrCheckAndLongest {

	/*
	 * 24. given two string check whether the substring of one is present in another
	 * string {"padmaja","maj"} return true 
	 * 2. use the above method in this question
	 * Given 3 string, find the longestsubstring present in the string whose length
	 * is high {"padmaja", "maj", "maja"} -> here "maja" should be returned and not
	 * "padmaja" (as padmaja is a not a substring of any other string) only "maj" or
	 * "maja" is a substring of "padmaja", in that longest substring should be
	 * returned. There could be other inputs which are not part of any substring as
	 * well. exlude them like {"padmaja","wxyz","maj"}
	 * 
	 */
	
	public static void main(String[] args) {
		
		String[] str  = {"padmaja","wxyz","maj"};
		
		//String[] str  = { "maj", "maja","padmaja"};
		
		//boolean flag = isSubstring(str[0],str[1]);
		//System.out.println(flag);
		
		String s = longestSubStr(str);
		System.out.println(s);
	}

	private static String longestSubStr(String[] strings) {
		
		/*
		String longestStr  = "";
		for(String current : str) {
			
			for(String inner : str) {
				
				if(!current.equals(inner) && subStringCheck(current,inner)) {
					if(current.length() > longestStr.length())
						longestStr = current;
				}
				
			}
			
			
		}
		*/
		 String longestValidSubstring = "";


	        for (String current : strings) {
	            for (String other : strings) {
	                if (!current.equals(other) && subStringCheck(other, current)) {
	                    if (current.length() > longestValidSubstring.length()) {
	                        longestValidSubstring = current;
	                    }
	                }
	            }
	        }
	        return longestValidSubstring.isEmpty() ? "No valid substring found" : longestValidSubstring;
	    
	}
	private static boolean subStringCheck(String str1, String str2) {
		
			
			return str1.contains(str2) ;
			
		
	}
	
	// Method to check if str2 is a substring of str1
    public static boolean isSubstring(String str1, String str2) {
        return str1.contains(str2);
    }

}
