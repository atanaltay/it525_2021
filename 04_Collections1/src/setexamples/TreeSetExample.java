package setexamples;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		//TreeSet is the sorted version of Set
		Set<String> namesSet = new TreeSet<String>();
		
		namesSet.add("altug");
		namesSet.add("ahmet");
		namesSet.add("mehmet");
		namesSet.add("zeynep");
		namesSet.add("hasan");
		namesSet.add("pinar");
		
		
		for (String name : namesSet) {
			System.out.println(name);
		}
		
		
	}
	

}
