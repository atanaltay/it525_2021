package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

public class MainFrame extends JFrame implements AddNameListener{

	private JPanel contentPane;
	private JList lstData;
	private List<String> data = new ArrayList<>();
	private JButton btnAddData;
	private JLabel lblPosition;

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
		data.add("Altug Tanaltay");
		data.add("Mehmet Emin");
		data.add("Ali Tanaltay");
		data.add("Ayse Tanaltay");
		//String[] dataArr = data.toArray(new String[data.size()]);
		

		DefaultComboBoxModel<String> mdl = new DefaultComboBoxModel<>(data.toArray(new String[data.size()]));
		lstData.setModel(mdl);
		
		btnAddData = new JButton("Add Data");
		btnAddData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				displayAddData();
			}
		});
		btnAddData.setBounds(169, 54, 117, 29);
		contentPane.add(btnAddData);
		
		lblPosition = new JLabel("New label");
		lblPosition.setBounds(20, 18, 341, 36);
		contentPane.add(lblPosition);
		
		
		
	}
	
	//Event handler method
	protected void displayAddData() {
		
		
		AddNameFrame frm = new AddNameFrame(this);
		frm.setVisible(true);
		
	}

	private void initGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 338);
		contentPane = new JPanel();
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				mouseMovedOverFrame(e);
				
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lstData = new JList();
		lstData.setBounds(161, 95, 138, 200);
		contentPane.add(lstData);
	}

	protected void mouseMovedOverFrame(MouseEvent e) {
		
		lblPosition.setText("X Pos: " + e.getX() + "Y Pos: " + e.getY());
		
		
		
		
	}

	@Override
	public void nameAdded(String name) {
		data.add(name);
		DefaultComboBoxModel<String> mdl = new DefaultComboBoxModel<>(data.toArray(new String[data.size()]));
		lstData.setModel(mdl);
	}
}
