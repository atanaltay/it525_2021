package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ShoppingBasketMain {

	public static void main(String[] args) {
		
		Product p1 = new Product("laptop", 2000, 0.18);
		Product p2 = new Product("mouse", 100, 0.18);
		Product p3 = new Product("keyboard", 300, 0.18);
		
		
		ArrayList<Product> shopBasket = new ArrayList<Product>();
		shopBasket.add(p1);
		shopBasket.add(p2);
		shopBasket.add(p3);
		
		try (
				ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream("basket.dat"))
				
				
				){
			
			
				writer.writeObject(shopBasket);
				writer.flush();
			
			
			} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	
	
}
