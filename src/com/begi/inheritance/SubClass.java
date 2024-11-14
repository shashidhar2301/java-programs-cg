package com.begi.inheritance;

public class SubClass extends Parent{

	//Cannot reduce the visibility of the inherited method from Parent
	/*
	private void add() {
		System.out.println("Parent add");
	}
	*/
	
	public void add() {
		System.out.println("Parent add");
	}
}
