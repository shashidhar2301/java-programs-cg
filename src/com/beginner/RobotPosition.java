package com.beginner;

public class RobotPosition {
	
	public static void main(String[] args) {
			

		/*"18. Problem Statement:

		A robot moves on a grid. The grid has a X axis and Y axis. The robot can take the following commands:
		L -  The robot moves  one position left on  X axis.
		R - The robot moves  one position right on  X axis.
		U - The robot moves  one position up on  Y axis.
		D - The robot moves  one position down on Y axis.

		Considering the robot is at position 0,0 When given a String like RRULDDDLR,
		 what is the final location of the robot on the grid?""" */
		
		int x = 0;
		int y = 0;
		
		String cmd = "RRULDDDLR";
		
		
		for(Character ch : cmd.toCharArray()) {
			
			switch(ch) {
			case 'R' :
				x++;
				break;
			case 'L' :
				x--;
				break;
			case 'U' :
				y++;
				break;
			case 'D' :
				y--;
				break;
			default :
				System.out.println("Invalid cmd");
				
			}
		}
		
		System.out.println("position:"+x+":"+y);
		

		/*
		 * ### Time and Space Complexity
		 * 
		 * - **Time Complexity**: - The time complexity of the program is (O(n)),
		 * where (n) is the length of the command string. This is because each
		 * character in the string is processed exactly once.
		 * 
		 * - **Space Complexity**: - The space complexity is (O(1)), as the program
		 * uses a constant amount of space regardless of the size of the input string.
		 * The space is used for storing the robot's coordinates and the command string
		 * itself.
		 */

}
}
