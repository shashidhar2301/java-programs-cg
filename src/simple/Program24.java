package simple;

public class Program24 {

	public static void main(String[] args) {
		/*
		 * "24. given two string check whether the substring of one is present in
		 * another string {""padmaja"",""maj""} return true 2. use the above method in
		 * this question Given 3 string, find the longestsubstring present in the string
		 * whose length is high {""padmaja"", ""maj"", ""maja""} -> here ""maja"" should
		 * be returned and not ""padmaja"" (as padmaja is a not a substring of any other
		 * string) only ""maj"" or ""maja"" is a substring of ""padmaja"", in that
		 * longest substring should be returned. There could be other inputs which are
		 * not part of any substring as well. exlude them like
		 * {""padmaja"",""wxyz"",""maj""}"
		 * 
		 */
		
		System.out.println(subStringCheck(new String[]{"padmaja","maj"}));
		
		System.out.println(longestSubStringCheck(new String[]{"maja", "padmaja","admaj"}));
	}

	private static String longestSubStringCheck(String[] arr) {
		
		String longestSubStr = "";
		
		for(String s : arr) {
			
			for(String inner : arr) {
				
				if(!s.equals(inner) && s.contains(inner)) {
					if(inner.length() > longestSubStr.length()) {
						longestSubStr = inner;
					}
						
				}
			}
		}
		
		return longestSubStr.isEmpty()?"No Substring":longestSubStr;
	}

	private static boolean subStringCheck(String[] arr) {
		
		String s1 = arr[0];
		String s2 = arr[1];
		
		return s1.contains(s2);
		
	}
}
