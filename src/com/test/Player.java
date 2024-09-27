package com.test;

public class Player implements Comparable<Player>{

	
	private String Name;
	private int Level;
	private int Score;
	@Override
	public int compareTo(Player o) {
		
		if(this.Level!=o.Level)
			return Integer.compare(this.Level, o.Level);
		
		return Integer.compare(this.Score, o.Score);
	}
	
	public Player(String name, int level, int score) {
		this.Name = name;
		this.Level = level;
		this.Score = score;
		
	}
	
	public String toString() {
		 return "name:"+Name+"::level::"+Level+"::score::"+Score;
	}
	
}
