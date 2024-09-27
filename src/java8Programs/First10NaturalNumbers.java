package java8Programs;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class First10NaturalNumbers {

	public static void main(String[] args) {
		
		IntStream.range(1, 10).forEach(e->System.out.println(e));
		
		int sum = IntStream.range(1, 10).sum();
		System.out.println(sum);
		
		
		int[] even = IntStream.range(1, 10).filter(e->e%2==0).toArray();
		System.out.println(Arrays.toString(even));
		
		
		int[] arr = {3,5,3,67,1};
		
		int sum2 = Arrays.stream(arr).sum();
		System.out.println(sum2);
		
		OptionalInt max = Arrays.stream(arr).reduce((a, b) -> a >b ?a : b);
		System.out.println(max.getAsInt());
		
		
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		String s4 = new String("abc");
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		System.out.println(s1.equals(s3));
	}
}
