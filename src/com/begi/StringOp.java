package com.begi;

public class StringOp {
	
	public static void main(String[] args) {
		
		String s1 = "abc";
		String s2 = "abc";
		String s5 = s2;
		System.out.println(s5==s2);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String s3 = new String("abc");
		String s4 = new String("abc");
		String s7 = new String(s3);
		String s6 = s4;
		System.out.println(s3==s7);
		System.out.println(s6==s3);
		System.out.println(s6==s4);
		System.out.println(s3==s4);
		System.out.println(s1==s4);
		System.out.println(s3.equals(s4));
		
	}

}
