package setexamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorExampleMain {

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
		
		p1.setCategory("LAPTOP");
		p2.setCategory("LAPTOP");
		p3.setCategory("LAPTOP");
		p4.setCategory("LAPTOP");
		p5.setCategory("LAPTOP");
		p6.setCategory("LAPTOP");
		p7.setCategory("TV");
		p8.setCategory("TV");
		p9.setCategory("TV");
		p10.setCategory("TV");
		
		
		Set<Product> productSet = new TreeSet<Product>(new ProductIdComparator());
		
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
		
		
		System.out.println("-----------");
		List<Product> productList = new ArrayList<Product>();
		
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		productList.add(p4);
		productList.add(p5);
		productList.add(p6);
		productList.add(p7);
		productList.add(p8);
		productList.add(p9);
		productList.add(p10);
		
		//Collections.sort(productList, new ProductCategoryComparator());
		Collections.sort(productList, new ProductIdComparator());
		
		
		for (Product product : productList) {
			System.out.println(product);
		}
		
		
	}
	
	
	
	
}
