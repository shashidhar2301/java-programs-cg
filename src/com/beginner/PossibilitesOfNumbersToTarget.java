package com.beginner;

import java.util.ArrayList;
import java.util.List;

public class PossibilitesOfNumbersToTarget {
	// Function to find and print all combinations
	public static void findCombinations(int target) {
		List<Integer> combination = new ArrayList<>();
		findCombinationsUtil(target, combination);
	}

	// Utility function to recursively find combinations
	private static void findCombinationsUtil(int target, List<Integer> combination) {
		if (target == 0) {
			// Base case: if target is zero, print the combination
			System.out.println(combination);
			return;
		}

		for (int i = 1; i <= target; i++) {
			// Choose the current number 'i'
			combination.add(i);
			// Recur with reduced target
			findCombinationsUtil(target - i, combination);
			// Backtrack and remove the last number to try the next one
			combination.remove(combination.size() - 1);
		}
	}

	public static void main(String[] args) {
		int targetNumber = 4;
		System.out.println("All combinations for the number " + targetNumber + ":");
		findCombinations(targetNumber);
	}
}
//O(2^n)