package flexlayout;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class FlexLayoutFrame extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JPanel panel;
	private JButton btn1;
	private JButton btn2;
	private JComboBox comboBox;
	private JPanel panel_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JSplitPane splitPane;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JList listMenu;
	private JTextArea txtOutput;
	private JButton btn3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlexLayoutFrame frame = new FlexLayoutFrame();
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
	public FlexLayoutFrame() {
		initGUI();
	}
	private void initGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 645, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		contentPane.add(panel, BorderLayout.NORTH);
		
		btn1 = new JButton("Button 1");
		btn1.setActionCommand("btn1action");
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button 1 clicked...");
				System.out.println(e.getActionCommand());
				System.out.println(new Date(e.getWhen()));
				//How to dsplay a message box: JOptionPane
				JOptionPane.showMessageDialog(FlexLayoutFrame.this, "Button 1 clicked...","Info",JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		
		btn1.addActionListener(this);
		
		
		
		panel.add(btn1);
		
		//interface implementation
		btn2 = new JButton("Button 2");
		btn2.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("Release...");
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("Pressed");
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("Exited");
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("Entered");
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
		
		
		panel.add(btn2);
		//Adding the event with an MouseAdapter, this is the correct way of implementing event listeners
		btn3 = new JButton("Button 3");
		btn3.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				
				
				JOptionPane.showMessageDialog(FlexLayoutFrame.this, "Button 3 clicked...");
				
				
				
			}
			
			
		});
		
		panel.add(btn3);
		
		comboBox = new JComboBox();
		panel.add(comboBox);
		
		panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		lblNewLabel = new JLabel("Copyright 2021");
		panel_1.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Output");
		panel_1.add(lblNewLabel_1);
		
		splitPane = new JSplitPane();
		contentPane.add(splitPane, BorderLayout.CENTER);
		splitPane.setDividerLocation(150);
		
		scrollPane = new JScrollPane();
		splitPane.setLeftComponent(scrollPane);
		
		listMenu = new JList();
		scrollPane.setViewportView(listMenu);
		
		scrollPane_1 = new JScrollPane();
		splitPane.setRightComponent(scrollPane_1);
		
		txtOutput = new JTextArea();
		scrollPane_1.setViewportView(txtOutput);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("observed by frame implementation.....");
		
	}

}
