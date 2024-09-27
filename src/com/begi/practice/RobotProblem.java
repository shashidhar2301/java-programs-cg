package com.begi.practice;

public class RobotProblem {
	
	public static void main(String[] args) {
		
		/*
		"18. Problem Statement:

		A robot moves on a grid. The grid has a X axis and Y axis. The robot can take the following commands:
		L -  The robot moves  one position left on  X axis.
		R - The robot moves  one position right on  X axis.
		U - The robot moves  one position up on  Y axis.
		D - The robot moves  one position down on Y axis.

		Considering the robot is at position 0,0 When given a String like RRULDDDLR, what is the final location of 
		the robot on the grid?"""
		
		
		
*/
		
		String str = "RRULDDDLR";
		int x = 0;
		int y = 0 ;
		
		for(char s : str.toCharArray()) {
			
			switch(s) {
				case 'R':
					x++;
					break;
				case 'L' :
					x--;
					break;
				case 'U' :
					y++;break;
				case 'D' :
					y--;
					break;
				default :
					System.out.println("Wrong direction");
					
			}
			
		}
		System.out.println("Final position ("+x+","+y+")");
	}

}
