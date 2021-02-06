package setexample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question2 {

	//Cluster the card numbers into two sets: in one display the repeting cards and their counts
	// in the other display the cards that appear only once.
	
	
	/*Repeting numbers:
	 * 5432 2234 9876 9876 27/01  20
	   5342 2344 9876 5132 23/07  10
	   5132 5432 4532 4532 23/07  5
	 * 
	 * 
	 * 5341 8764 3421 5132 27/01
       5341 2344 7346 6543 27/01
       5132 5432 4532 4532 27/01
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		
		//Create a HashMap
		// key -> card numbers
		// value -> count of card numbers
		
		// 1. list numbers where count>1
		// 2. list numbers where count == 1
		
		Map<String, Integer> countMap = new HashMap<String, Integer>();
		
		// countMap.get("AKEY") -> return null
		// countMap.put("AKEY",AVALUE) ->  afterwards countMap.get("AKEY") -> return AVALUE
		// countMap.put("AKEY",ANOTHERVALUE) - > value is overridden
		

		//Files and Paths
		
		try {
			List<String> lines =  Files.readAllLines(Paths.get("creditcards.txt"));
			
			for (String line : lines) {
				
				if(countMap.get(line)!=null) {
					
					countMap.put(line, countMap.get(line) +1);
					
					
				}else {
					countMap.put(line, 1);
				}
				
			}
			
			System.out.println("Repeating numbers:");
			for(String key: countMap.keySet()) {
				if(countMap.get(key)>1) {
					System.out.println(key + ":" + countMap.get(key));
				}

				
			}
			
			System.out.println("--------------------------");
			
			System.out.println("Non repeating numbers:");
			
			for(String key: countMap.keySet()) {
				if(countMap.get(key)==1) {
					System.out.println(key + ":" + countMap.get(key));
				}

				
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
}
