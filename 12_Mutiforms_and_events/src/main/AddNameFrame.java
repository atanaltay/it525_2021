package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddNameFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnCancel;
	private JButton btnOK;
	private AddNameListener listener;


	public AddNameFrame(AddNameListener listener) {
		this.listener = listener;
		initGUI();
	}
	private void initGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 406, 160);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(55, 21, 298, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnCancelClicked();
				
			}
		});
		btnCancel.setBounds(108, 78, 117, 29);
		contentPane.add(btnCancel);
		
		btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnOkClicked();
			}
		});
		btnOK.setBounds(237, 78, 117, 29);
		contentPane.add(btnOK);
	}
	protected void btnOkClicked() {
		
		
		listener.nameAdded(textField.getText());
		this.dispose();
		
		
	}
	protected void btnCancelClicked() {
		this.dispose();
		
	}
}
