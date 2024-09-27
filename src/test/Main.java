package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	
	public static void main(String[] args) throws ExecutionException {
		
		
		Vach v = new Vach("ele");
		
		Car c = new Car("ele","tes S");
		
		Vach tes = new Car("Ele","tes X");
		
		System.out.println(v.getType());
		System.out.println(c.getModel());
		System.out.println(((Car) tes).getModel());
		
		
	}





	 
	
	
	
}

class Vach{
	
	private String type;

	public Vach(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	
	
}

class Car extends Vach{
	
	private String model;

	public Car(String type, String model) {
		super(type);
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	
	
}
 