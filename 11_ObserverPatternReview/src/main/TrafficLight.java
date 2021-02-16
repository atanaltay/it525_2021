package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TrafficLight {

	
	private String color;
	private List<SignalListener> listeners = new ArrayList<>();
	
	public void changeLights(String color) {
		this.color = color;
		//Inform listeners (observers) about the state change
		
		SignalEventObject evtObj = new SignalEventObject(this,color,new Date());
		
		for (SignalListener signalListener : listeners) {
			signalListener.colorChanged(evtObj);
		}
		
		
	}
	
	public List<SignalListener> getListeners() {
		return listeners;
	}
	
	public void registerListener(SignalListener listener) {
		this.listeners.add(listener);
	}
	
	public String getColor() {
		return color;
	}
	
	
}
