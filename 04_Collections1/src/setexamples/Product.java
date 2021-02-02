package setexamples;

public class Product implements Comparable<Product>{
	private int id;
	private String name;
	private String category;
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	

	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;

	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
		
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCategory() {
		return category;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		return new Integer(id).equals(((Product)obj).getId());
		

	}
	
	
	@Override
	public int hashCode() {
		
		return id;
		
	}
	
	
	/*
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Product) {
			if (this.id == ((Product)obj).getId()){
				return true;
			}
			
			
		}
		return false;
		
	}

*/
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "category="+category + "]";
	}

	//Returns a negative integer, zero, 
	//or a positive integer as this object is less than, equal to, or greater than the specified object.
	
	/*
	@Override
	public int compareTo(Product o) {
		
		if(this.id<o.getId()) {
			return -1;
		}else if(this.id>o.getId()) {
			return 1;
		}else return 0;
		
		
	}
	*/
	/*
	@Override
	public int compareTo(Product o) {
		
		return -1 * new Integer(id).compareTo(o.getId());
	}
	*/
	
	//All java types have compareTo() already implemented
	// if you want reverse order, multiply result with -1
	@Override
	public int compareTo(Product o) {
		
		return  name.compareTo(o.getName());
		
		
	}
	
	

}
