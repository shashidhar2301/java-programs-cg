package com.beginner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordsFromFile {

	public static void main(String[] args) {
		String filePath = "example.txt"; // Path to your file

		try {
			// Read file and count words
			Map<String, Integer> wordCount = countWordsInFile(filePath);

			// Print repeated words and their counts
			printRepeatedWords(wordCount);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Method to count occurrences of each word in the file
	public static Map<String, Integer> countWordsInFile(String filePath) throws IOException {
		Map<String, Integer> wordCountMap = new HashMap<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] words = line.split("\\s+"); // Split by whitespace
				for (String word : words) {
					word = word.toLowerCase(); // Convert to lowercase for case-insensitive comparison
					wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
				}
			}
		}
		return wordCountMap;
	}

	// Method to print repeated words and their counts
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
}
/*
 ** Time Complexity**: (O(n)), where (n) is the number of characters in the
 * file. This is because we read the file and process each word once. - **Space
 * Complexity**: (O(w)), where (w) is the number of unique words. This is
 * the space required for the `HashMap`.
 * 
 * This program will read the file, count the occurrences of each word, and
 * print only those words that appear more than once along with their counts.
 * Make sure to replace `"example.txt"` with the actual path to your file.
 */