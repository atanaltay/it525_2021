package setexamples;

import java.util.Comparator;

public class ProductIdComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		
		return new Integer(o1.getId()).compareTo(o2.getId());
		
		
	}

	
	
	
	
	
}
