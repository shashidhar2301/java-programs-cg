package simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program8 {

	public static void main(String[] args) {
		/*
		 * 8. List of Integer let say {9,7,4,30} , concatenate each element and find out
		 * the maximum number
		 * 
		 */
		
		List<Integer> list = new ArrayList<>(Arrays.asList(9,7,4,89,30,90,212,8));
		
		String[] array = list.stream().map(String::valueOf).toArray(String[]::new);
		
		/*
		Comparator<Integer> custom = (s1,s2)->{
			return String.valueOf(s2).compareTo(String.valueOf(s1));
		};
		Collections.sort(list,custom);
		*/
		
		Collections.sort(Arrays.asList(array), (a,b) -> (b+a).compareTo(a+b));
		
		for(String s : array) {
			System.out.print(s);
		}
	}
}
