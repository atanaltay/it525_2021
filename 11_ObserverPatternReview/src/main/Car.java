package main;

public class Car implements SignalListener{

	
	
	@Override
	public void colorChanged(SignalEventObject evt) {
		
		if(evt.getColor().equals("Red")) {
			System.out.println("Car stopped.");
		}else {
			System.out.println("Car moved.");
		}
		
		
	}
	
}
