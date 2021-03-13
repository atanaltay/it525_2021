package service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Default;

import model.Product;

@Default
@SessionScoped
public class ProductServiceImpl implements ProductService, Serializable{

	@Override
	public List<Product> getAllProducts() {
		List<Product> products = new ArrayList<>();
		products.add(new Product(1, "shoes", "clothing", 100, true));
		products.add(new Product(2, "shirt", "clothing", 75, true));
		products.add(new Product(3, "tshirt", "clothing", 150, false));
		products.add(new Product(4, "mouse", "electronics", 500, true));
		products.add(new Product(5, "keyboard", "electronics", 600, true));
		return products;
	}

}
