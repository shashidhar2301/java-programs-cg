package com.beginner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class PlayerLeaderBoard {
	
	public static void main(String[] args) {
		
		 List<Player> players = new ArrayList<>();
	        players.add(new Player("Alice", 5, 100));
	        players.add(new Player("Bob", 5, 150));
	        players.add(new Player("Charlie", 3, 200));
	        players.add(new Player("David", 4, 180));
	        players.add(new Player("Eve", 5, 130));
	        
	        List<Player> list = new ArrayList<Player>(Arrays.asList(
					new Player("shiva", 1, 76),
					new Player("Ram", 2, 1000),
					new Player("Anu", 1, 23),
					new Player("Priya", 1, 98),
					new Player("Raju", 2, 120),
					new Player("Neha", 1, 45))
					);

	       // Collections.sort(list);
	        

	        Collections.sort(list,new PlayerComparator());
	        
	        for(Player p : list) {
	        	System.out.println(p);
	        }
	}

}
