package test;

import java.util.HashMap;
import java.util.Map;

public class Frac {
	
	public static void main(String[] args) {
		
		int num = 1;
		int den = 6;
		
		String result = calculateFraction(num,den);
		System.out.println(result);
		
	}

	private static String calculateFraction(int num, int den) {
		
		
		//StringBuilder builder = new StringBuilder();
		String result = "";
		
		//builder.append(num/den);
		result+= num/den;
		num = num % den;
		
		if(num!=0)
			result+=".";
			//builder.append(".");
		
		Map<Integer,Integer> map = new HashMap<>();
		
		while(num!=0) {
			
			
			if(map.containsKey(num)) {
				result = result.substring(0, map.get(num))+"("+result.substring(map.get(num))+")";
				//builder.insert(map.get(num), "(");
				//builder.append(")");
				break;
				
			}
			
			map.put(num, result.length());
			num*=10;
		//	builder.append(num/den);
			result+= num/den;
			num = num % den;
		}
		return result.toString();
	}
	

}
