package main;

public class Application {

	public static void main(String[] args) {
		
		TrafficLight trafficLight = new TrafficLight();
		
		Car car1 = new Car();
		Truck truck1 = new Truck();
		
		Car car2 = new Car();
		Truck truck2 = new Truck();
		
		trafficLight.registerListener(car1);
		trafficLight.registerListener(car2);
		trafficLight.registerListener(truck1);
		trafficLight.registerListener(truck2);
		
		//Adding a listener/observer with an anonymous inner class
		trafficLight.registerListener(new SignalListener() {
			
			@Override
			public void colorChanged(SignalEventObject evt) {
				System.out.println("Logger: color changed:" + evt.getColor());
				
			}
			
			@Override
			public String toString() {
				return "annonymous implementation output";
			}
		});
		
		
		//Adding a listener/observer with a lambda expression
		trafficLight.registerListener(evt -> System.out.println("Lambda listener: color changed to " + evt.getColor()));
		
		
		System.out.println("Initialized and waiting for an action.....");
		
		trafficLight.changeLights("Red");
		
		System.out.println("Lights are red.....");
		
		trafficLight.changeLights("Green");
		
		System.out.println("Lights are green.....");
		
		for (SignalListener listener : trafficLight.getListeners()) {
			System.out.println(listener);
		}
		
		
		
		
	}
	
	
	
}
