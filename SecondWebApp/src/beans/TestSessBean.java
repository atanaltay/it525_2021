package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.Product;
import service.ProductService;

@Named
@SessionScoped
public class TestSessBean implements Serializable{

	private List<Product> products;
	
	//Only session scoped beans can be injected....
	@Inject private ProductService prodService;
	private Product newProduct;
	
	
	
	@PostConstruct
	public void init() {
		
		products = prodService.getAllProducts();
		newProduct = new Product();
		System.out.println("---------session postconstruct called...");
	}
	
	public String saveProduct() {
		System.out.println("----- session save product invoked.....");
		//System.out.println("Method param:" + test);
		
		products.add(newProduct);
		newProduct = new Product();
		return null;

		
	}
	public Product getNewProduct() {
		return newProduct;
	}
	
	public void setNewProduct(Product newProduct) {
		this.newProduct = newProduct;
	}
	
	public List<Product> getProducts() {
		return products;
	}
	
}
