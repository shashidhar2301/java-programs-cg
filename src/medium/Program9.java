package medium;

import java.util.ArrayList;
import java.util.List;

public class Program9 {

	public static void main(String[] args) {

		/*
		 * "9. Find out unique substring of given length of string. EX: Input - (aab,2)
		 * , Output - aa, ab Input- (aabc,2), Output - aa, ab,bc Input -(abc,1), Output
		 * - a,b,c"
		 * 
		 */
		
		uniqueSubStr("a",1);
	}//aa,

	private static void uniqueSubStr(String str, int length) {
		
		List<String> result = new ArrayList<>();
		for(int i=0;i<=str.length()-length;i++) {
			result.add(str.substring(i,length+i));
		}
		System.out.println(result);
	}

}
