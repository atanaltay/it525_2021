package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Employee;
import service.ApplicationServiceImpl;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmployeeFrame extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblLastName;
	private JLabel lblNewLabel_1;
	private JTextField txtLastname;
	private JTextField txtName;
	private JTextField txtSalary;
	private JButton btnSave;
	private JButton btnCancel;
	private Employee employee;
	EmployeeFrameListener listener;
	/**
	 * Create the frame.
	 */
	public EmployeeFrame(Employee employee,EmployeeFrameListener listener) {
		this.employee = employee;
		this.listener = listener;
		initGUI();
		
		txtName.setText(employee.getName());
		txtLastname.setText(employee.getLastname());
		txtSalary.setText(String.valueOf(employee.getSalary()));
	}
	private void initGUI() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Name:");
		lblNewLabel.setBounds(30, 18, 61, 16);
		contentPane.add(lblNewLabel);
		
		lblLastName = new JLabel("Last name:");
		lblLastName.setBounds(30, 46, 108, 16);
		contentPane.add(lblLastName);
		
		lblNewLabel_1 = new JLabel("Salary:");
		lblNewLabel_1.setBounds(30, 91, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		txtLastname = new JTextField();
		txtLastname.setBounds(215, 41, 130, 26);
		contentPane.add(txtLastname);
		txtLastname.setColumns(10);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(215, 13, 130, 26);
		contentPane.add(txtName);
		
		txtSalary = new JTextField();
		txtSalary.setBounds(215, 86, 130, 26);
		contentPane.add(txtSalary);
		txtSalary.setColumns(10);
		
		btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				saveEmployee();
				
			}
		});
		btnSave.setBounds(244, 141, 117, 29);
		contentPane.add(btnSave);
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeeFrame.this.dispose();
			}
		});
		btnCancel.setBounds(104, 141, 117, 29);
		contentPane.add(btnCancel);
	}
	protected void saveEmployee() {
		employee.setName(txtName.getText());
		employee.setLastname(txtLastname.getText());
		employee.setSalary(Double.valueOf(txtSalary.getText()));
		new ApplicationServiceImpl().updateEmployee(employee);
		listener.employeeUpdated();
		this.dispose();
		
		
	}
}
