package com.Complex;


public class Dog extends Animal{

	public Dog() {
		System.out.println("Dog Con");
	}
	
	@Override
	void run() throws RuntimeException{
		 System.out.println("Dog run");
	 }
	
	public static void main(String[] args) {
		Animal a = new Animal();
		a.run();
	}
}
