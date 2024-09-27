package simple;

import java.util.Arrays;

public class Program1 {

	/*
	 * "1. Check the String is Anargam or not Ex: Dog, god 
	 * Cat, tac, act 
	 * angle - glean 
	 * tar-rat 
	 * car-rac"
	 * 
	 */
	
	public static void main(String[] args) {
		
		String s1 = "Dog";
		String s2 = "God";
		String s3 = "ods";
		
		boolean isAnagram = checkAnagram(s1,s2);
		boolean isAnagramTwo = checkAnagram(s2,s3);
		System.out.println(isAnagram && isAnagramTwo);
	}

	private static boolean checkAnagram(String s1, String s2) {
		
		
		/*
		char[] ch1 = s1.toLowerCase().toCharArray();
		char[] ch2 = s2.toLowerCase().toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		return Arrays.equals(ch1, ch2);
		*/
		int[] counter = new int[256];
		
		for(int i=0;i<s1.length();i++) {
			counter[s1.toLowerCase().charAt(i)]++;
			counter[s2.toLowerCase().charAt(i)]--;
		}
		
		for(int i=0;i<counter.length;i++) {
			if(counter[i]!=0)
				return false;
		}
		return true;
		
		
	}
}
