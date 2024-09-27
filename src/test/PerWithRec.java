package test;

public class PerWithRec {
	
	public static void main(String[] args) {
		String str = "abc";
		recursiveMethod(str, "");
		
	}

	private static void recursiveMethod(String str, String newStr) {
		
		if(str.isEmpty())
			System.out.println(newStr);
		
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			String substring = str.substring(0, i)+str.substring(i+1);
			recursiveMethod(substring, newStr+ch);
		}
		
	}
	
	

}
