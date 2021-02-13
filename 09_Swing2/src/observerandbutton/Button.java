package observerandbutton;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//observer pattern: Subject
public class Button {

	List<ButtonClickListener> listeners = new ArrayList<>();
	
	public Button() {
		// TODO Auto-generated constructor stub
	}
	
	//a method to register the event
	public void addClickListener(ButtonClickListener listener) {
		this.listeners.add(listener);
	}
	
	//A method to broadcast the message
	public void fireClick() {
		for (ButtonClickListener buttonClickListener : listeners) {
			ButtonClickEventObject obj = new ButtonClickEventObject(this, new Date());
			buttonClickListener.buttonClicked(obj);
		}
	}
	
	
}
