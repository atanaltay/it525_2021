package example1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.time.LocalDateTime;

import javax.swing.SwingConstants;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JLabel lblTime;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		initGUI();
		TimeThread t = new TimeThread();
		t.start();
	}
	private void initGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTime = new JLabel("New label");
		lblTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime.setFont(new Font("Courier New", Font.BOLD, 25));
		lblTime.setBounds(120, 91, 247, 36);
		contentPane.add(lblTime);
	}
	
	class TimeThread extends Thread{
		
		@Override
		public void run() {
			
			
			while (true) {
				LocalDateTime now = LocalDateTime.now();
				
				int sec = now.getSecond();
				int min = now.getMinute();
				int hour = now.getHour();
				
				
				String seconds = "";
				String minutes = "";
				String hours = "";
				
				
				if(sec<10) {
					seconds = "0" + sec; 
				}else {
					seconds = String.valueOf(sec);
				}
				
				if(min<10) {
					minutes = "0" + min; 
				}else {
					minutes = String.valueOf(min);
				}
				
				if(hour<10) {
					hours = "0" + hour; 
				}else {
					hours = String.valueOf(hour);
				}
				
				lblTime.setText(hours + ":" + minutes + ":" + seconds); 
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			
			
		}
		
		
		
		
	}
}
