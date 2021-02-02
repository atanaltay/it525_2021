package setexamples;

import java.util.HashSet;
import java.util.Set;

public class Example1 {

	public static void main(String[] args) {
		
		Set<String> namesSet = new HashSet<String>();
		
		namesSet.add("Altug");
		namesSet.add("Ahmet");
		namesSet.add("Mehmet");
		namesSet.add("Hasan");
		namesSet.add("Ayhan");
		namesSet.add("Altug");
		namesSet.add("Mehmet");
		namesSet.add("Hasan");
		
		
		for (String name : namesSet) {
			System.out.println(name);
		}
		
		
		
		
		
	}
	
	
	
	
	
}
