package observerandbutton;

public class MainClass {

	public static void main(String[] args) {
		
		Button btn1 = new Button();
		
		btn1.addClickListener(evt -> System.out.println("Event obsevrved in main method.."));
		
		UIForm frm = new UIForm(btn1);
		
		btn1.fireClick();
		
		
		
		
		
	}
	
	
	
	
	
}
