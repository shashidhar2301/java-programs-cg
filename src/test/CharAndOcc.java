package test;

public class CharAndOcc {

	public static void main(String[] args) {
		/*
		 * Write a program which would take a string as input like 'aabccd' and print
		 * the occurances of characters in the format a=2,b=1,c=2,d=1
		 */
		String str = "aabccd";
		StringBuilder builder = new StringBuilder();
		int count = 1;
		for(int i=0;i<str.length();i++) {
			
			if(i+1<str.length() && str.charAt(i) == str.charAt(i+1)) {
				count++;
			}else {
				builder.append(str.charAt(i)+"=").append(count+",");
				count = 1;
			}
				
		}
		
		if(builder.length()>0)
			builder.setLength(builder.length()-1);
		System.out.println(builder);
	}
}
