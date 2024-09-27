package com.beginner;

public class Player {//implements Comparable<Player>{

	String name;
    int level;
    int score;
	
    
	public Player(String name, int level, int score) {
		super();
		this.name = name;
		this.level = level;
		this.score = score;
	}
	/*
	@Override
	public int compareTo(Player pl) {
		
		if(this.level!=pl.level)
			return Integer.compare(this.level, pl.level);
		
		return Integer.compare(this.score, pl.score);
			
	} */
	@Override
	public String toString() {
		return "Player [name=" + name + ", level=" + level + ", score=" + score + "]";
	}
	
	
}
