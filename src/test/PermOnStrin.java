package test;

public class PermOnStrin {

	public static void main(String[] args) {
		String str = "abc";
		String newStr = "";
		combinations(str, newStr);
	}

	private static void combinations(String str, String newStr) {
		
		
		if(str.isEmpty()) {
			System.out.println(newStr);
		}
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			String s = str.substring(0,i)+ str.substring(i+1);
			combinations(s, newStr+ch);
		}
		
	}
}

