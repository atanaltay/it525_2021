package observerandbutton;

import java.util.Date;
import java.util.EventObject;

public class ButtonClickEventObject extends EventObject{

	private Object source;
	private Date clickTime;
	public ButtonClickEventObject(Object source, Date clickTime) {
		super(source);
		this.source = source;
		this.clickTime = clickTime;
	}
	public Object getSource() {
		return source;
	}
	public void setSource(Object source) {
		this.source = source;
	}
	public Date getClickTime() {
		return clickTime;
	}
	public void setClickTime(Date clickTime) {
		this.clickTime = clickTime;
	}
	
	
	
	
}
