package model;

import javax.inject.Named;

@Named
public class Product {

	private int id;
	private String name;
	private String category;
	private double price;
	private boolean inStock;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String name, String category, double price, boolean inStock) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.inStock = inStock;
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isInStock() {
		return inStock;
	}
	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}
	
	
}
