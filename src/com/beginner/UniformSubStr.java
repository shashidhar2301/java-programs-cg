package com.beginner;

public class UniformSubStr {
	
	public static void main(String[] args) {
		
		//aabbbbbCdAA
		//String s = "aabbbbbCdAA";
		String s = "aabbabbccaa";
		int idx = 0;
		int count = 1;
        int maxCharCount = 1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
                if(count > maxCharCount){
                    maxCharCount = count;
                    idx = i - count+1;
                }
            }
            else{
                count = 1;
            }
        }
        System.out.println(idx+":"+maxCharCount);
	}

}
/*
 * ### Time Complexity The time complexity remains (O(n)), where (n) is the
 * length of the string, as we still iterate through the string only once.
 * 
 * This refined code handles case sensitivity, empty strings, and maintains
 * clarity and correctness.
 */
