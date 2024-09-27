package simple;

import java.util.Arrays;
import java.util.Collections;

public class Program16 {

	public static void main(String[] args) {
		/*
		 * 16. Find the maximum value in Array using Collection?
		 * 
		 */
		
		maxValue(new int[] {8,3,2,53,6,60,21});
	}

	private static void maxValue(int[] arr) {
		
		Integer[] intArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
		
		Collections.sort(Arrays.asList(intArr), Collections.reverseOrder());
		
		Integer max = Collections.max(Arrays.asList(intArr));
		System.out.println(max);
		
		System.out.println(intArr[0]);
		//System.out.println(intArr[intArr.length-1]);
		
	}
}
