package java8Programs.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

import java8Programs.example.Employee;

public class SortMapDemo {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("eight", 8);
		map.put("four", 4);
		map.put("ten", 10);
		map.put("two", 2);
		map.put("nine", 9);
		
		Map<Employee, Integer> employeeMap = new TreeMap<>((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()));
		employeeMap.put(new Employee(176, "Roshan", "TIT", 600000), 60);
		employeeMap.put(new Employee(388, "Bikash", "CIVIL", 900000), 90);
		employeeMap.put(new Employee(470, "Bimal", "DEFENCE", 500000), 50);
		employeeMap.put(new Employee(624, "Sourav", "CORE", 400000), 40);
		employeeMap.put(new Employee(284, "Prakash", "SOCIAL", 1200000), 120);

		//System.out.println(employeeMap);

		List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
		Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));

		System.out.println(entries);
		/*
		 * for (Entry<String, Integer> entry : entries) {
		 * System.out.println(entry.getKey() + "   " + entry.getValue()); }
		 */

		// map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("****************************");
		// map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
/*
		employeeMap.entrySet().stream()
				.sorted(Entry.comparingByKey(Comparator.comparing(Employee::getDept).reversed()))
				.forEach(System.out::println);
		*/
		
		//employeeMap.keySet().stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(e->System.out.println(e));

		
		employeeMap.values().stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		

		//Input: I am a Java developer
		String str = "I am a Java developer";


		Map<String,Long> map2 = Arrays.stream(str.split(""))
					.map(s->s.toLowerCase())
					.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		//map2.entrySet().stream().forEach(e->System.out.println(e.getKey()+":"+e.getValue()));
		
		
		
		HashMap<String, Long> collect = Arrays.stream(str.split("")).collect(Collectors.groupingBy(e->e, HashMap::new, Collectors.counting()));

		collect.entrySet().stream().filter(e->!e.getKey().equals(" ") && e.getValue()>2).forEach(e->System.out.println(e));

	
		List<Integer> list = Arrays.asList(1,4,3,1,3,5,null);


		//3
		LinkedHashMap<Integer, Long> map3 =   list.stream()
					.filter(Objects::nonNull)
			.collect(Collectors.groupingBy(e->e,LinkedHashMap::new,Collectors.counting())) ;


		Optional<Entry<Integer, Long>> first = map3.entrySet().stream().filter(e->e.getValue()>1).skip(1).findFirst();
		
		System.out.println(first.get().getKey());
		
		List<Integer> secondRepeated = map3.entrySet().stream()
	            .filter(entry -> entry.getValue() > 1) // Keep only repeated values
	            .map(Map.Entry::getKey) // Get the keys (the values that are repeated)
	            .collect(Collectors.toList());
		
		System.out.println(map3);
	
	}
}
