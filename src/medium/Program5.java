package medium;

public class Program5 {

	public static void main(String[] args) {

		/*
		 * "5. Question: For the given string such as ""aabbbbbcc"" print the longest
		 * occurring character,index and number of times it occurs. Ex: longest
		 * occurring character is b and length is 5 at index 2."
		 * 
		 */
		
		longestChar("aabbbbbcc");
	}

	private static void longestChar(String str) {
		
		int count = 1;
		int maxCount = 0;
		int index  = 0;
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i) == str.charAt(i-1)) {
				count++;
				if(maxCount < count) {
					maxCount = count;
					index = i - count + 1;
				}
			}else {
				count = 1;
			}
		}
		
		System.out.println(maxCount);
		System.out.println(index);
		
	}
}
