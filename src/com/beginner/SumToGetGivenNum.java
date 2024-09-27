package com.beginner;

public class SumToGetGivenNum {
	
	public static void main(String[] args) {
		
		int num =3;
		
		
		combination(num);
	}
	
	static void combination(int num){
		
		
		while(num>0) {
			for(int i=1;i<num;i++) {
				combination(num-i);
				System.out.println(i);
			}
			
		}
		
	}

}
