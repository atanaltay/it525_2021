package main;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MainClass {

	public static void main(String[] args) {
		
		//All swing types start with J
		
		//Create a form/frame
		// set a layout to the frame
		// add components to the frame
		//create interactions
		
		
		JFrame frm = new JFrame("First Swing App");
		
		
		frm.setBounds(200, 200, 500, 500);
		frm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		//FlowLayout - > Each component floats next to or below each other
		frm.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JButton btn1 = new JButton("Click me 1");
		JButton btn2 = new JButton("Click me 2");
		
		frm.getContentPane().add(btn1);
		frm.getContentPane().add(btn2);
		
		frm.setVisible(true);
		
		
	}
	
	
	
}
