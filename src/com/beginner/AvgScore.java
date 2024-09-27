package com.beginner;

	
	import java.util.*;
	import java.util.Map.Entry;


public class AvgScore {
	    public static void main(String[] args) {
	        String[][] scores = {{"Rohit", "-66"}, {"Rahul", "-122"}, {"Rohit", "-65"}};

	        HashMap<String, List<Integer>> map = new HashMap<>();

	        // Populate the HashMap
	        for (int i = 0; i < scores.length; i++) {
	            List<Integer> scoreList = map.get(scores[i][0]);
	            if (scoreList == null) {
	                List<Integer> currentScore = new ArrayList<>();
	                currentScore.add(Integer.valueOf(scores[i][1]));
	                map.put(scores[i][0], currentScore);
	            } else {
	                scoreList.add(Integer.valueOf(scores[i][1]));
	                map.put(scores[i][0], scoreList);
	            }
	        }

	        System.out.println(map);

	        double highestAvg = Double.NEGATIVE_INFINITY;

	        // Calculate the highest average
	        for (Entry<String, List<Integer>> e : map.entrySet()) {
	            List<Integer> scoresList = e.getValue();
	            double currentAvg = findAvg(scoresList);
	            highestAvg = Math.max(currentAvg, highestAvg);
	        }

	        // Print the highest average (rounded)
	        System.out.println(Math.round(highestAvg));
	    }

	    private static double findAvg(List<Integer> scoresList) {
	        double sum = 0;
	        for (int i : scoresList) {
	            sum += i;
	        }
	        return sum / scoresList.size();
	    }
	}


