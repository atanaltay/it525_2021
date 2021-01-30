package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ShoppingBasketReaderMain {

	public static void main(String[] args) {
		
		try (
				ObjectInputStream reader = new ObjectInputStream(new FileInputStream("basket.dat"));
				
				)
		
		{
		
			ArrayList<Product> prods =  (ArrayList<Product>)reader.readObject();
			
			for (Product product : prods) {
				System.out.println(product.getName());
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
}
