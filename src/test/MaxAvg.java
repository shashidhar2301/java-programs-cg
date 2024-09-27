package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxAvg {
	public static void main(String[] args) {
		
		
		String[][] scores = {{"Rohit", "-66"},{"Rahul","-120"},{"Rohit", "-65"}};
		
		Map<String, List<Integer>> map = new HashMap<>();
		
		for(int i=0;i<scores.length;i++) {
			
			if(map.containsKey(scores[i][0])) {
				List<Integer> indivScore = map.get(scores[i][0]);
				indivScore.add(Integer.parseInt(scores[i][1]));
			}else {
			
			List<Integer> indivScore =  new ArrayList<>();
			indivScore.add(Integer.parseInt(scores[i][1]));
			map.put(scores[i][0], indivScore);
			}
			
		}
		System.out.println(map);
		double maxAvg = Double.NEGATIVE_INFINITY;
		for(Map.Entry<String, List<Integer>> e : map.entrySet()) {
			
			List<Integer> scoresList = e.getValue();
			double avg = calculateAvg(scoresList);
			if(avg>maxAvg){
				maxAvg = avg; 
	          }
		}
		System.out.println((int)maxAvg);
		
		
	//
		
		
		
	}

	private static double calculateAvg(List<Integer> scoresList) {
		
		int sum =0;
		for(int i : scoresList) {
			sum+=i;
		}
		return   Math.floor((double)sum/scoresList.size());
	}
}
