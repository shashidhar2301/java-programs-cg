package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccOfChar {
	
	public static void main(String[] args) {
		
		String str = "Heena";
		
		
		Map<String, Long> result = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),
				Collectors.counting()));
		
		//System.out.println(result);
		
		//result.entrySet().forEach(e->e.getKey());
	//	result.entrySet().forEach(e->System.out.println(e.getKey()+":"+e.getValue()));
		
		List<String> list = new ArrayList<>();
		list.add("Ramu");
		list.add("Yma");
		List<String> list2 = list.stream().filter(e->e.startsWith("R")).collect(Collectors.toList());
		System.out.println(list2);
		
	}

}
