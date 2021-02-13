package observerandbutton;

public class UIForm implements ButtonClickListener{
	
	Button btn1;
	
	
	public UIForm(Button btn1) {
		this.btn1 = btn1;

		btn1.addClickListener(this);
		
		btn1.addClickListener(new ButtonClickListener() {
			
			@Override
			public void buttonClicked(ButtonClickEventObject evt) {
				System.out.println("Button clicked observed by anonymous type at " + evt.getClickTime());
				
			}
		});
		
		btn1.addClickListener(evt -> System.out.println("Lambda observer observed event at " + evt.getClickTime()));
		
	}


	@Override
	public void buttonClicked(ButtonClickEventObject evt) {
		System.out.println("Button clicked observed by Form at " + evt.getClickTime());
		
	}
	
	

}
