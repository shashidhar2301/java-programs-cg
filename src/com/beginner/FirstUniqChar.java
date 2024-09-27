package com.beginner;

public class FirstUniqChar {
	
	public static void main(String[] args) {
		
		// Step 1: Initialize frequency array for 26
        // lowercase letters
		String s = "apple";
        int[] freq = new int[26];

        // Step 2: Populate the frequency array
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // Step 3: Find the first character with frequency 1
        for (int i = 0; i < s.length(); ++i) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                System.out.println(s.charAt(i));
                break;
            }
        }

     //  System.out.println("-1");
		
	}

}
