package simple;

public class Program2 {

	public static void main(String[] args) {
		/*
		 * "2. Check the given String is Panagram or Not. A. Check the string is
		 * Panagram or not B. If not panagram , then print the missing letters ex: The
		 * quick brown fox jumps over the lazy dog. Write a program for Panagram
		 * Detector.
		 * 
		 * The sentence ""The quick brown fox jumps over the lazy dog"" contains every
		 * single letter in the alphabet. Such sentences are called pangrams. Write a
		 * function called ""findMissingLetters""  which takes a String `sentence`,  and
		 * returns all the letters it is missing. Which prevent it from being a pangram.
		 * You should ignore the case of the letters in sentence, and your return should
		 * be all lower case letters, in alphabetical order. You should also ignore all
		 * non US-ASCII characters."
		 * 
		 */
		
		/*
		String str  = "The quick brown fox jumps over the lazy dog";
		String result =checkPanagram(str);
		*/
		String str  = "findMissingLetters";
		String result =checkPanagram(str);
		
		if(result.isEmpty())
			System.out.println("Panagram");
		else {
			System.out.println("Not");
			System.out.println(result);
		}
		
	}
	
	public static String checkPanagram(String str) {
		String result = "";
		for(char i='a';i<='z';i++) {
			if(!str.toLowerCase().contains(Character.toString(i))) {
				result+=i;
			}
		}
		return result;
	}
}
