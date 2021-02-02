package mapexample;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapExample {

	public static void main(String[] args) {
		
		// product name (string) - stock (integer)
		
		//keys are unique, and hashmap is not ordered
		//get(key)
		
		
		Map<String, Integer> prodMap = new HashMap<String, Integer>();
		
		
		prodMap.put("tomatoes", 12);
		prodMap.put("oranges", 5);
		prodMap.put("apples", 10);
		
		System.out.println(prodMap);
 		
		Set<String> keys = prodMap.keySet();
		
		for (String key : keys) {
			System.out.println(key + ":" + prodMap.get(key));
		}
		
		System.out.println("------------");
		
		Map<String, Integer> prodMapSorted = new TreeMap<String, Integer>();
		
		
		prodMapSorted.put("tomatoes", 12);
		prodMapSorted.put("oranges", 5);
		prodMapSorted.put("apples", 10);
		
		System.out.println(prodMap);
 		
		Set<String> keys2 = prodMapSorted.keySet();
		
		for (String key : keys2) {
			System.out.println(key + ":" + prodMapSorted.get(key));
		}
		
		System.out.println("------------------");
		
		prodMapSorted.put("apples",20);
		
		
		for (String key : prodMapSorted.keySet()) {
			System.out.println(key + ":" + prodMapSorted.get(key));
		}
		
	}
	
	
	
	
	
}
