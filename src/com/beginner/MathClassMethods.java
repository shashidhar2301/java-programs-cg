package com.beginner;

public class MathClassMethods {

	public static void main(String[] args) {
		 
		double d1 = 6.1;
		double d2 = 6.5;
		double d3 = 6.7;
		
		double d4 = -6.1;
		double d5 = -6.5;
		double d6 = -6.7;
		
		System.out.println("-----Floor-------");
		System.out.println(d1+"--"+Math.floor(d1));
		System.out.println(d2+"--"+Math.floor(d2));
		System.out.println(d3+"--"+Math.floor(d3));
		
		System.out.println(d4+"--"+Math.floor(d4));
		System.out.println(d5+"--"+Math.floor(d5));
		System.out.println(d6+"--"+Math.floor(d6));
		
		System.out.println("-----Round-------");
		System.out.println(d1+"--"+Math.round(d1));
		System.out.println(d2+"--"+Math.round(d2));
		System.out.println(d3+"--"+Math.round(d3));
		
		System.out.println(d4+"--"+Math.round(d4));
		System.out.println(d5+"--"+Math.round(d5));
		System.out.println(d6+"--"+Math.round(d6));
		
		System.out.println("-----Ceil-------");
		System.out.println(d1+"--"+Math.ceil(d1));
		System.out.println(d2+"--"+Math.ceil(d2));
		System.out.println(d3+"--"+Math.ceil(d3));
		
		System.out.println(d4+"--"+Math.ceil(d4));
		System.out.println(d5+"--"+Math.ceil(d5));
		System.out.println(d6+"--"+Math.ceil(d6));
		 
	}
}
