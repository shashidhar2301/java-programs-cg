package com.notepad;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class WordsWhichDoesNotHaveVowels {

	public static void main(String[] args) throws IOException {
		//There is a story in a file. Find out all words which doesn’t have vowels
		String str = "Hey, Good Afternoon, how was the day zz? ";
		
		BufferedReader buffer = new  BufferedReader(new FileReader("C:\\Users\\ALLRAJ\\OneDrive - Capgemini\\Desktop\\Docs\\Sample.txt"));
		
		String line;
		
		while((line = buffer.readLine())!=null) {
		
		 
		
		for(String words : line.toLowerCase().replaceAll("[^a-zA-Z\\s]", "").split("\\s+")) {
			if(wordsWithoutVowels(words))
				System.out.println(words);
		}
		}
		
	}

	private static boolean wordsWithoutVowels(String words) {
		
		
		for(char c : words.toCharArray()) {
			
			if(c=='a' || c=='e' || c=='i' || c=='o' || c== 'u') {
				return false;
			}
			
		}
		return true;
		
	}
}

