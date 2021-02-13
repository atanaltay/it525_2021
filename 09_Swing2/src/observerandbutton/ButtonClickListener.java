package observerandbutton;

import java.util.EventListener;

//Observer pattenr: observer interface
public interface ButtonClickListener extends EventListener{

	public void buttonClicked(ButtonClickEventObject evt);
}
