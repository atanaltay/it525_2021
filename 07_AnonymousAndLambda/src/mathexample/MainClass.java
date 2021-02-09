package mathexample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MainClass {

	public static void main(String[] args) {
		
		
		double[] xs = {1,2,3,4,5};
		double[] ys = {6,7,8,9,10};
		
		MathClass math = new MathClass();
		math.makeCalculations(xs, ys, (x,y)-> x+y);
		
		math.makeCalculations(xs, ys, (x,y)->x/y);
		
		
		List<String> names = new ArrayList<String>();
		names.add("ali");
		names.add("veli");
		names.add("ahmet");
		names.add("osman");
		names.add("haydar");
		names.add("yunus");
		
		/*
		for (String name : names) {
			System.out.println(name);
		}
		*/
		
		System.out.println("----------");
		
		//Consumer is a functional interface with a void returning accept(obj) method
		names.forEach(t->System.out.println(t));
		
	}
	
	
	
	
}
