package simple;

import java.util.Arrays;

public class Program18 {

	public static void main(String[] args) {

		/*
		 * "18. Problem Statement:
		 * 
		 * A robot moves on a grid. The grid has a X axis and Y axis. The robot can take
		 * the following commands: L - The robot moves one position left on X axis. R -
		 * The robot moves one position right on X axis. U - The robot moves one
		 * position up on Y axis. D - The robot moves one position down on Y axis.
		 * 
		 * Considering the robot is at position 0,0 When given a String like RRULDDDLR,
		 * what is the final location of the robot on the grid?"""
		 * 
		 */
		
		String position = "RRULDDDLR";
		
		System.out.println(Arrays.toString(getFinalPosition(position)));
	}

	private static int[] getFinalPosition(String position) {
		
		int x = 0;
		int y = 0;
		
		for(char c : position.toCharArray()) {
			
			switch(c) {
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
					System.out.println("Invalid command");
					
			}
		}
		
		return new int[] {x,y};
		
		
	}
}
