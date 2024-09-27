package com.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class RepeatedWordsFromFile {

	public static void main(String[] args) {

		String path = "C:\\Users\\ALLRAJ\\OneDrive - Capgemini\\Desktop\\Sample.txt";
		Map<String, Integer> count = readFromFile(path);
		printRepeatedWords(count);
	}

	private static Map<String, Integer> readFromFile(String path) {
		// TODO Auto-generated method stub
		BufferedReader buffer = null;
		Map<String, Integer> map = new HashMap<>();
		try {
			buffer = new BufferedReader(new FileReader(path));

			String line = buffer.readLine();
			while ((line = buffer.readLine()) != null) {
				String input = line;
				String[] arr = input.split("\\s+");
				for (String s : arr) {
					if (!s.isEmpty())
						map.put(s, map.getOrDefault(s, 0) + 1);
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				buffer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return map;
	}

	public static void printRepeatedWords(Map<String, Integer> wordCountMap) {
		System.out.println("Repeated words and their counts:");
		boolean foundRepeated = false;
		for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + ": " + entry.getValue());
				foundRepeated = true;
			}
		}

		if (!foundRepeated) {
			System.out.println("No repeated words found.");
		}
	}

	/*
	 * ### Time Complexity - Reading the file: O(n), where n is the number of
	 * characters in the file. 
	 * - Splitting the line and counting words: O(m),
	 * where m is the number of words in the file. - Overall: O(n + m), which is
	 * essentially O(n) since every character and word is processed.
	 * 
	 * This code reads the file line by line, splits the lines into words, and
	 * then counts each word using a `HashMap`. Finally, it prints out the words
	 * that occur more than once.
	 */
}
