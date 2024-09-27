package simple;

public class Program4 {

	public static void main(String[] args) {

		/*
		 * "4. Find the weight of given String. (A-Z/a-z) we have 26 alphabetic,
		 * consider the position of a-z alphabets as 1-26. Based on that find the weight
		 * of the given String. Ex: Given String: Apple Output: 1+16+16+12+5 = 50"
		 * 
		 */
		
		String str = "apple";
		int weight = weight(str);
		System.out.println(weight);
	}

	private static int weight(String str) {
	
		int weight = 0;
		for(int i=0;i<str.length();i++) {
			weight+=str.charAt(i)-'a'+1;
		}
		return weight;
	}

}
