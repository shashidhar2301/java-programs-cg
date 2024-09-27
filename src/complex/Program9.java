package complex;

public class Program9 {

	public static void main(String[] args) {

		/*
		 * "9.Combine ingredients in a specific order, any of which may be repeated. Encoding format: introduce * to indicate ""repeat from beginning"
		 * ". Implement a function that takes as input an un-encoded potion and returns
		 * the minimum number of characters required to encode
		 * 
		 * Example Test Case:
		 * 
		 * Input: ABABCABABCE Output: 6 Explanation: In the first part, ABAB, AB has
		 * repeated twice and it can be replaced as AB* and similarly ABABC is repeated
		 * twice and so it can be encoded as AB*C*. The last character is placed as it
		 * is and the final encoded format would be AB*C*E and so the length of the
		 * minimum encoded string is 6. minimalSteps(""ABABCABABCE"") == 6 &&
		 * minimalSteps(""ABCDABCE"") == 8 && minimalSteps(""ABCABCE"") == 5 &&
		 * minimalSteps(""AAA"") == 3 && minimalSteps(""AAAA"") == 3 &&
		 * minimalSteps(""BBB"") == 3 && minimalSteps(""AAAAAA"") == 4"
		 * 
		 */

		//checkPattern("ABCABC");
		checkPattern("ABCEABCD");
	}

	private static void checkPattern(String str) {

		int i = 1;
		int length = str.length();
		StringBuilder result = new StringBuilder();
		result.append(str.charAt(0));

		if (length % 2 == 0) {
			String firstHalf = str.substring(0, length / 2);
			String secondHalf = str.substring(length / 2, length);

			if (firstHalf.equals(secondHalf)) {
				result.append(str.substring((length/2)+1)).append("*");
				System.out.println("even case::"+result);
				return;
			}
			
			
		}
		

		
		while(i < length) {
			
			String temp = str.substring(0,i);
			
			if(i*2 <= length) {
				
				if(temp.equals(str.substring(i,i*2))){
					result.append("*");
					i*=2;
				}else {
					result.append(str.charAt(i));
					i++;
				}
				
			}else {
				result.append(str.substring(i));
				break;
			}
			
		}
		
		
		System.out.println(result);
	}

}
