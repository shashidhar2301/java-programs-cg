package com.beginner;

import java.util.Comparator;

public class PlayerComparator implements Comparator<Player>{

	 
	@Override
	public int compare(Player p1, Player p2) {
		if(p1.level!=p2.level)
			return Integer.compare(p1.level, p2.level);
		
		return Integer.compare(p1.score, p2.score);
			
	}
	
	
}
