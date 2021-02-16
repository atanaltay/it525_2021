package main;

import java.util.Date;
import java.util.EventObject;


public class SignalEventObject extends EventObject{
	
	private String color;
	private Date time;
	
	public SignalEventObject(Object source) {
		super(source);
	}
	
	
	
	
	public SignalEventObject(Object source, String color, Date time) {
		super(source);
		this.color = color;
		this.time = time;
	}




	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
	
	
	

}
