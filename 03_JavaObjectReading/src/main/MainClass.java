package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainClass {

	public static void main(String[] args) {
		
		
		try(ObjectInputStream reader = new ObjectInputStream(
				new FileInputStream("p1.dat")
			)
				
				) {
			
			 Product p= (Product)reader.readObject();
			
			 System.out.println(p.getName());
			 System.out.println(p.getPrice());
			 System.out.println(p.getTaxAmount());
			
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
