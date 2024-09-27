package com.beginner;

public class SubStringArr {

	public static void main(String[] args) {
		
		String[] arr = {"padmaja","maj"};
		int flag = subStrCheck(arr);
		if(flag==-1)
			System.out.println("false");
		else
			System.out.println("true");
		
	}
	
	static int subStrCheck(String[] arr){
		
		if(arr[0].length() >arr[1].length())
			arr[0].indexOf(arr[1]);
		else
			arr[1].indexOf(arr[0]);
		return 0;
	}
}
