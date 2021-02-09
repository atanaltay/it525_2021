package filexample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReadWithLambda {

	
	public static void main(String[] args) {
		
		
		
		try {
			Files.readAllLines(Paths.get("creditcards.txt"))
				.forEach(line->System.out.println(line));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
}
