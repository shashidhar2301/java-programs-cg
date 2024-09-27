package com.Complex;

import java.util.ArrayList;
import java.util.List;

public class StairCaseProblem {

	public static void main(String[] args) {

		/*
		 * . A guy uses elevator to reach his flat. But unfortunately elevator is not
		 * working today and he became sad. Suddenly God came and made the stairs
		 * magical, such that he can jump on it in a magical way. Initially he can take
		 * 1 or 2 steps. If he jumps “x” steps at a time then in the next step he can
		 * climb either x or x+1or x+2…… steps depending on his choice and he must reach
		 * exactly on n'th step. Print all possisblities to reach his flat by staircase.
		 */
		
		int targetStep = 4;
		List<List<Integer>> result1 = new ArrayList<>();
		
		findPossibilities(targetStep, 0, 1,new ArrayList<>(), result1);
		
		for (List<Integer> way : result1) {
            System.out.println(way);
        }
		 
	}

	private static void findPossibilities(int targetStep, int currentStep, int stepSize, List<Integer> currentSteps,
			List<List<Integer>> result) {
		
		if (currentStep == targetStep) { // If the exact step is reached, add the current way to the result
            result.add(new ArrayList<>(currentSteps));
            return;
        }
		
		if (currentStep > targetStep) { // If the step goes beyond n, return
            return;
        }
		
		for(int i=stepSize; i<= targetStep - currentStep;i++) {
			currentSteps.add(i);
			findPossibilities(targetStep, currentStep + i, i,currentSteps, result);
			currentSteps.remove(currentSteps.size()-1);
		}
	}
	
	// Recursive method to find all possible ways to reach the nth step
    public static void findWays(int n, int currentStep, int stepSize, List<Integer> currentWay, List<List<Integer>> result) {
        if (currentStep == n) { // If the exact step is reached, add the current way to the result
            result.add(new ArrayList<>(currentWay));
            return;
        }
        
        if (currentStep > n) { // If the step goes beyond n, return
            return;
        }
        
        // Explore all possibilities by increasing the step size
        for (int i = stepSize; i <= n - currentStep; i++) {
            currentWay.add(i);
            findWays(n, currentStep + i, i, currentWay, result);
            currentWay.remove(currentWay.size() - 1); // Backtrack
        }
    }
}
