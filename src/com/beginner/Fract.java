package com.beginner;

import java.util.HashMap;
import java.util.Map;

public class Fract {
	
	public static void main(String[] args) {
		
		int num = 1;
		int den = 2;
		
		StringBuilder result = new StringBuilder();
		result.append(num/den);
		
		num  = num%den;
		
		if(num==0)
			System.out.println(":"+result);
		
		result.append(".");
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		while (num != 0) {
            if (map.containsKey(num)) {
                result.insert(map.get(num), "(");
                result.append(")");
                break;
            }

            map.put(num, result.length());
            num *= 10;
            result.append(num / den);
            num %= den;
        }
		
		System.out.println(result);
	}

}
