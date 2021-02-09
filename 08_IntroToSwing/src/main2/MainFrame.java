package main2;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class MainFrame extends JFrame{

	
	private JButton btn1;
	private JButton btn2;
	private JTextField txtName;
	
	public MainFrame(String title) {
	
		super(title);
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setBounds(200,200,500,500);
		
		btn1 = new JButton("Button 1");
		btn2 = new JButton("Button 2");
		
		txtName = new JTextField("Welcome text");
		
		getContentPane().add(btn1);
		getContentPane().add(btn2);
		getContentPane().add(txtName);
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		
		new MainFrame("Welcome to Swing").setVisible(true);
		
	}
	
	
}
