package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PlayerLeaderBoard {

	public static void main(String[] args) {

		/*
		 * "27. Players - Leaderboard The leaderboard should display Players in the
		 * order of their level and Scores. Logic -Consider Player class with fields ->
		 * Name, Level and Score Needs to sort the players list - first sort by Level
		 * and then by score"""
		 * 
		 */

		List<Player> list = new ArrayList<Player>(
				Arrays.asList(new Player("shiva", 1, 76), new Player("Ram", 2, 1000), new Player("Anu", 1, 23),
						new Player("Priya", 1, 98), new Player("Raju", 2, 120), new Player("Neha", 1, 45)));

		Collections.sort(list);

		for (Player p : list) {
			System.out.println(p);
		}

		/*
		 * The time complexity for the provided code mainly depends on the sorting
		 * operation. Here's a breakdown:
		 * 
		 * ### Sorting Time Complexity - The sorting algorithm used by
		 * `Collections.sort()` in Java is a variant of Timsort, which has a time
		 * complexity of O(n log n) in the average and worst cases. - Here, `n` is
		 * the number of `Player` objects in the list.
		 * 
		 * ### Comparison Time Complexity - Each comparison between two `Player` objects
		 * involves comparing their `level` and, if necessary, their `score`. - The
		 * comparison itself is O(1).
		 * 
		 * ### Overall Time Complexity Since the dominant operation is sorting, the
		 * overall time complexity of the program is O(n log n), where `n` is the
		 * number of players in the list.
		 */
	}

}
