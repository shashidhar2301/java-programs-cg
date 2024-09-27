package complex;

import java.util.ArrayList;
import java.util.List;

public class Program1 {

	public static void main(String[] args) {
		/*
		 * 1. A guy uses elevator to reach his flat. But unfortunately elevator is not
		 * working today and he became sad. Suddenly God came and made the stairs
		 * magical, such that he can jump on it in a magical way. Initially he can take
		 * 1 or 2 steps. If he jumps “x” steps at a time then in the next step he can
		 * climb either x or x+1or x+2…… steps depending on his choice and he must reach
		 * exactly on n'th step. Print all possisblities to reach his flat by staircase.
		 * 
		 */
		int target = 4;
		List<List<Integer>> result = new ArrayList<>();
		allPosibilities(target, 0, 1, new ArrayList<>(),result);
		System.out.println(result);
	}

	private static void allPosibilities(int target, int current, int stepSize, List<Integer> currentPosb, List<List<Integer>> result) {

		if(current == target) {
			result.add( new ArrayList<>(currentPosb));
			return;
		}

		for(int i=stepSize;i<=target-current;i++) {
			currentPosb.add(i);
			allPosibilities(target, current+i, i, currentPosb,result);
			currentPosb.remove(currentPosb.size()-1);
		}
		
	}

}
