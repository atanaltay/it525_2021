package main3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JButton btnNorth;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnCenter;

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
	}
	private void initGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		btnNorth = new JButton("North Button");
		contentPane.add(btnNorth, BorderLayout.NORTH);
		
		btnNewButton_1 = new JButton("West button");
		contentPane.add(btnNewButton_1, BorderLayout.WEST);
		
		btnNewButton_2 = new JButton("East button");
		contentPane.add(btnNewButton_2, BorderLayout.EAST);
		
		btnNewButton_3 = new JButton("South button");
		contentPane.add(btnNewButton_3, BorderLayout.SOUTH);
		
		btnCenter = new JButton("Center button");
		contentPane.add(btnCenter, BorderLayout.CENTER);
	}

}
