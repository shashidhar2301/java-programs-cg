package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaximumAverageGrade {

	public static void main(String[] args) {

		/*
		  "8. For a given input 2D array of strings, find the maximum average grade,
		  round off to the nearest floor integer.
		  
		  Input :  {  {"Rohit", "85"},                                 {"Rahul",
		  "80"},                                 {"Amit","85"},
		                                  {"Rohit", "90"}   }
		  
		  Output : 87 Logic : Rohit's average grade is (85+90)/2 = 87.5  which when
		  rounded off to floor is  87"
		  
		 */
		String[][] scores = {{"Rohit", "-66"},{"Rahul","-120"},{"Rohit", "-65"}};
		int avg = calculateScores(scores);
		System.out.println("Highest average is "+avg);
	}

	private static int calculateScores(String[][] scores) {
	
		Map<String, List<Integer>> map = new HashMap<>();
		
		for(int i=0;i<scores.length;i++) {
			
			if(map.containsKey(scores[i][0])) {
				List<Integer> list = map.get(scores[i][0]);
				list.add(Integer.parseInt(scores[i][1]));
			}else {
				List<Integer> indivScore = new ArrayList<Integer>();
				indivScore.add(Integer.parseInt(scores[i][1]));
				map.put(scores[i][0], indivScore);
			}
			
		}
		System.out.println(map);
		double maxAvg = Double.NEGATIVE_INFINITY;
		for(Map.Entry<String, List<Integer>> entry : map.entrySet()) {
			
			double avg = calculateAvg(entry.getValue());
			//System.out.println(avg);
			if(avg > maxAvg)
				maxAvg = avg;
		}
		return (int)maxAvg;
	}

	private static double calculateAvg(List<Integer> list) {
		
		int sum = 0;
		for(int i : list) {
			sum+=i;
		}
		//System.out.println((double) sum / list.size());
		 return (list.size() > 0) ? Math.floor((double) sum / list.size()) : 0;
	}

}
