package beans;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.Product;
import service.ProductService;

//CDI
@Named
@RequestScoped
public class HomePageBean {

	private String welcomeMessage;
	private List<String> names;
	
	private List<Product> products;
	
	@Inject
	private ProductService prodService;
	
	
	//Gettin input data from forms
	//Add fields one by one.
	//private int newProdid;
	//private String newProdName;
	
	
	private Product newProduct;
	
	private Product selectedProduct;
	
	
	//Do not prefer to add a constructor to Managed Beans,
	//prefer @PostCosntruct method instead.
	/*
	public HomePageBean() {
		System.out.println("---------constructor call");

	}*/
	
	//CDI
	//Called after constructor, at this phase all CDI beans are ready to use.
	@PostConstruct
	public void init() {
		welcomeMessage = "Welcome to second web app";
		names = new ArrayList<>();
		names.add("altug");
		names.add("ahmet");
		names.add("mehmet");
		names.add("hasan");
		names.add("osman");
		
		products = prodService.getAllProducts();
		
		newProduct = new Product();
		
		System.out.println("--------- postconstruct called...");
	}
	
	
	
	public String saveProduct(String test) {
		System.out.println("----- save product invoked.....");
		//System.out.println("Method param:" + test);
		products.add(newProduct);
		
		return null;
		//The String returned creates a navigation case..
		//return "result.jsf?faces-redirect=true";
		
	}
	
	public String saveProduct2() {
		System.out.println("----- save product invoked.....");
		products.add(newProduct);
		
		
		//The String returned creates a navigation case..
		return "result";
		
	}
	
	public String viewProduct(Product product) {
	
		selectedProduct = product;
		
		return "viewproduct";
		
		
		
	}
	
	//CDI
	@PreDestroy
	public void destroy() {
		//Resource cleaning area
		System.out.println("-----------destroy called");
	}
	
	public String getWelcomeMessage() {
		return welcomeMessage;
	}

	public List<String> getNames() {
		return names;
	}
	
	public List<Product> getProducts() {
		return products;
	}
	
	public Product getNewProduct() {
		return newProduct;
	}
	
	public void setNewProduct(Product newProduct) {
		this.newProduct = newProduct;
	}
	
	public Product getSelectedProduct() {
		return selectedProduct;
	}
	
	public void setSelectedProduct(Product selectedProduct) {
		this.selectedProduct = selectedProduct;
	}
}
