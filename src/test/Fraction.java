package test;

import java.util.HashMap;
import java.util.Map;

public class Fraction {
	
	public static void main(String[] args) {
		
		int num = 1;
		int den = 2;
		
		num = num % den;
		
		StringBuilder builder = new StringBuilder();
		builder.append(num/den);
		
		if(num==0) {
			System.out.println(builder);
		}else {
			builder.append(".");
			Map<Integer, Integer> map = new HashMap<>();
			while(num!=0) {
				
				if(map.containsKey(num)) {
					builder.insert(map.get(num),"(");
					builder.append(")");
					System.out.println(builder);
					break;
				}
				
				map.put(num, builder.length());
				num*=10;
				builder.append(num/den);
				num = num % den;
				
				
				
			
			
			//System.out.println(map);
			}
			System.out.println(builder);
			}
	}

}
