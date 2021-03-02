package graphicsexample;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class MyPanel2 extends JPanel{
	
	int posX = 50;
	int posY = 50;
	
	public MyPanel2() {
		
		this.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				
				
				posX = e.getX()-25;
				posY = e.getY()-25;
				
				repaint();
				
			}
			
			
		});
		
		
		this.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				posX = e.getX()-25;
				posY = e.getY()-25;
				repaint();
				
			}
		});
		
		
		
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		Graphics2D pen = (Graphics2D)g;
		
		//draw -> draw the shape border
		//fill -> created filled shapes
		
		pen.setColor(Color.red);
		pen.fillArc(posX, posY, 50, 50, 0, 360);
		
		
	}
	
	

}
