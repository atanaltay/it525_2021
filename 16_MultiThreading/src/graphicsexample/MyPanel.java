package graphicsexample;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class MyPanel extends JPanel{
	
	
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		Graphics2D pen = (Graphics2D)g;
		
		//draw -> draw the shape border
		//fill -> created filled shapes
		
		pen.setColor(Color.blue);
		
		
		pen.fillRect(50, 50, 100, 100);
		
		pen.setColor(Color.red);
		pen.fillArc(200, 200, 50, 50, 0, 360);
		
		
	}
	
	

}
