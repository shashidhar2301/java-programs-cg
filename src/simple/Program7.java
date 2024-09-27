package simple;

import java.util.ArrayList;
import java.util.List;

public class Program7 {

	public static void main(String[] args) {
		/*7. Write a program to find fibonacci series */
		
		int num = 10;
		 List<Integer> result= printFibonacci(num);
		 System.out.println(result);
	
	}

	private static List<Integer> printFibonacci(int num) {
		
		int start = 0;
		int end = 1;
		int temp = 0;
		List<Integer> result = new ArrayList<>();
		result.add(start);
		result.add(end);
		
		for(int i=1;i<=num;i++) {
			temp = start + end;
			start = end;
			end = temp;
			result.add(temp);
		}
	return result;
	
		
	}
}
