package setexample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Question1 {

	//Please list all card numbers only once
	
	
	public static void main(String[] args) {
		
		try (
				BufferedReader reader = new BufferedReader(new FileReader("creditcards.txt"));
				){
			
			Set<String> uniqueNUmbers = new HashSet<String>();
			String line = "";
			while((line=reader.readLine())!=null) {
				
				uniqueNUmbers.add(line);
				
				
			}
			
			System.out.println("Numuber of unique cards:" + uniqueNUmbers.size());
			
			for (String numb : uniqueNUmbers) {
				System.out.println(numb);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
	}
	
	
	
}
