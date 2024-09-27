package test;

import java.util.function.Function;

public class Ocean {

	public static void execute(proce p) {
		System.out.println("prr"+p.process(10));
	}
	
	public static void execute(Function<Integer, String> f) {
		System.out.println("prr"+f.apply(10));
	}
	
public static void main(String[] args) {
		//execute(n->"Number"+0);
		
	}
	

	 
}

interface proce{
	String process(int number);
}

