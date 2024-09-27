package com.beginner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class AvgScorsTwoDemArr {

	public static void main(String[] args) {
		
		String[][] scores =    {{"Rohit", "-66"},{"Rahul", "-122"},{"Rohit", "-65"}};
		
		
		
		HashMap<String, List<Integer>> map = new HashMap<>();
		
		for(int i=0;i<scores.length;i++) {
			List<Integer> scoreList = map.get(scores[i][0]);
        if(scoreList == null) {
            List<Integer> currentScore = new ArrayList<>();
            currentScore.add(Integer.valueOf(scores[i][1]));
            map.put(scores[i][0], currentScore);
        } else {
            scoreList.add(Integer.valueOf(scores[i][1]));
            map.put(scores[i][0], scoreList);
        }}
		
		System.out.println(map);

		//List<Integer> collect = hm.entrySet().stream().map(e->e.getValue()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		//System.out.println(collect);
		double currentAvg = 0;
		double highestAvg = Integer.MIN_VALUE;
		for(Entry<String, List<Integer>> e:map.entrySet()) {
			
			List<Integer> scoresList  = (List<Integer>) e.getValue();
			currentAvg = findAvg(scoresList);
			//System.out.println(currentAvg);
			highestAvg = Math.max(currentAvg, highestAvg);
			
		}
	//	System.out.println((int)highestAvg);
		
	//	System.out.println(Math.round(190.3));

	//	System.out.println(Math.round(-65.5));

		System.out.println(highestAvg);
		
		
	}

	private static double findAvg(List<Integer> scoresList) {
		double sum = 0;
		double avg = 0;
		for(int i : scoresList) {
			sum+=i;
		}
		avg= sum/scoresList.size();
	//	System.out.println(avg);
		return Math.round(avg);
		
	}
}
/*
testCases.put(new String[][] {
    {"Bobby", "87"},
    {"Charles", "100"},
    {"Eric", "64"},
    {"Charles", "22"}},
  87);
// empty
testCases.put(new String[][] {},
  0);
// multiple scores each
testCases.put(new String[][] {
    {"Sarah", "91"},
    {"Goldie", "92"},
    {"Elaine", "93"},
    {"Elaine", "95"},
    {"Goldie", "94"},
    {"Sarah", "93"}},
  94);
// negatives and zeros
testCases.put(new String[][] {
    {"Janie", "-66"},
    {"Janie", "0"},
    {"Gina", "-88"},
    {"Bobby", "0"},
    {"Gina", "44"},
    {"Bobby", "0"},
    {"Bobby", "-6"}},
  -2);
// same value and average
testCases.put(new String[][] {
    {"Alpha", "99"},
    {"Bravo", "99"},
    {"Charlie", "99"},
    {"Delta", "99"},
    {"Echo", "99"},
    {"Foxtrot", "99"},
    {"Foxtrot", "99"}},
  99);
// non-integer average
testCases.put(new String[][] {
    {"Gerald", "91"},
    {"Gerald", "92"}},
  91);
// negative non-integer average
testCases.put(new String[][] {
      {"Barry", "-66"},
      {"Barry", "-65"},
      {"Alfred", "-122"}},
  -66);
// same student has two identical test scores and one that is different (this test case has proven especially beneficial for running average implementations)
testCases.put(new String[][] {
    {"Bobby", "82"},
    {"Charles", "100"},
    {"Charles", "100"},
    {"Eric", "64"} ,
    {"Charles", "50"}},
  83); */