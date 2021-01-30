package main;

import java.io.Serializable;

public class Product implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private String name;
	private double price;
	private double vat;
	
	
	//This field will not be persisted
	private transient double taxAmount;
	
	public Product() {
		
	}
	
	
	
	
	public Product(String name, double price, double vat) {
		super();
		this.name = name;
		this.price = price;
		this.vat = vat;
		taxAmount = price*vat;
		
	}


	
	public double getTaxAmount() {
	
		if(taxAmount==0) {
			taxAmount = vat*price;
		}
		return taxAmount;
		
	}
	
	public double getVat() {
		return vat;
	}
	
	public void setVat(double vat) {
		this.vat = vat;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
	
}
