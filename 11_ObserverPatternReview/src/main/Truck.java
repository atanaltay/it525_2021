package main;

public class Truck implements SignalListener{

	
	
	@Override
	public void colorChanged(SignalEventObject evt) {
		
		if(evt.getColor().equals("Red")) {
			System.out.println("Truck stopped.");
		}else {
			System.out.println("Truck moved.");
		}
		
		
	}
	
}
