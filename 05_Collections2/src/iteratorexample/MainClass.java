package iteratorexample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainClass {

	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		
		names.add("ali");
		names.add("veli");
		names.add("ahmet");
		names.add("mehmet");
		names.add("osman");
		
		
		//Code below generated ConcurrentModificationException
		//Because in a foreach loop list is tried to be modified!
	//Don't do it
	/*
	 * for (String name : names) { if(name.equals("ali")) { names.remove(name); } }
	 * 
	 * System.out.println(names);
	 */
		
		
		Iterator<String> it = names.iterator();
		
		
		while(it.hasNext()) {
			String currentElement = it.next();
			if(currentElement.equals("ali")) {
				it.remove();
				break;
			}
		}
		
		
		System.out.println(names);
		

		
	}
	
	
	
	
}
