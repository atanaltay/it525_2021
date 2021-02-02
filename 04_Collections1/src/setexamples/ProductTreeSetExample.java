package setexamples;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProductTreeSetExample {

	public static void main(String[] args) {
		
		Product p1 = new Product(2,"Laptop");
		Product p2 = new Product(1,"Mouse");
		Product p3 = new Product(3,"Keyboard");
		Product p4 = new Product(4,"Display");
		Product p5 = new Product(3,"Keyboard");
		Product p6 = new Product(4,"Display");
		Product p7 = new Product(8,"Harddisk");
		Product p8 = new Product(7,"flash disk");
		Product p9 = new Product(6,"memory");
		Product p10 = new Product(5,"cpu");
		
		Set<Product> productSet = new TreeSet<Product>();
		
		productSet.add(p1);
		productSet.add(p2);
		productSet.add(p3);
		productSet.add(p4);
		productSet.add(p5);
		productSet.add(p6);
		productSet.add(p7);
		productSet.add(p8);
		productSet.add(p9);
		productSet.add(p10);
		
		for (Product product : productSet) {
			System.out.println(product);
		}
		
		//At the background TreeSet casts the object to Comparable
		//and calls compareTo() method for sorting
		
		
	}
	
	
	
}
