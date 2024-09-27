package simple;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Program3 {

	public static void main(String[] args) {

		/*
		 * "3. Remove the duplicate words from the given Sentence. Ex: a) Input: Good
		 * day day bye bye output: Good day bye b) input: greet the day user greet good
		 * day output:greet the day user good"
		 * 
		 */
		
		String str = "greet the day user greet good day";
		Set<String> result = new LinkedHashSet<>();
		
		for(String s : str.split("\\s")) {
			result.add(s);
		}
		System.out.println(String.join(" ", result));
		
		
		withoutCollection(str);
	}

	private static void withoutCollection(String str) {
		
		String[] input = str.split("\\s");
		
		String[] output = new String[input.length];
		int uniqueCount = 0;
		
		for(int i=0;i<input.length;i++) {
			boolean duplicate = false;
			for(int j=0;j<uniqueCount;j++) {
				if(input[i].equals(output[j])) {
					duplicate = true;
					break;
				}
				
			}
			
			if(!duplicate) {
				output[uniqueCount] = input[i];
				uniqueCount++;
			}
			
			
		}
		
		 StringBuilder result = new StringBuilder();
	        for (int i = 0; i < uniqueCount; i++) {
	            if (i > 0) {
	                result.append(" ");
	            }
	            result.append(output[i]);
	        }
		
		System.out.println(result);
		
		
	}
}
