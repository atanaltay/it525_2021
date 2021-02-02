package setexamples;

import java.util.HashSet;
import java.util.Set;

public class ProductExample {

	public static void main(String[] args) {
		
		Product p1 = new Product(1,"Laptop");
		Product p2 = new Product(2,"Mouse");
		Product p3 = new Product(3,"Keyboard");
		Product p4 = new Product(4,"Display");
		Product p5 = new Product(3,"Keyboard");
		Product p6 = new Product(4,"Display");

		
		Set<Product> productSet = new HashSet<Product>();
		
		productSet.add(p1);
		productSet.add(p2);
		productSet.add(p3);
		productSet.add(p4);
		productSet.add(p5);
		productSet.add(p6);

		
		//System.out.println(p1.hashCode());
		//System.out.println(p2.hashCode());
		
		for (Product product : productSet) {
			System.out.println(product);
		}
		
		
		
	}
	
	
	
	
}
