package morecomponents;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class ComponentFrame extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JComboBox comboBox;
	private JLabel lblNewLabel_3;
	private JComboBox<Department> cmbEntityComboBox;
	private JLabel lbloutput;
	private JLabel lblNewLabel_4;
	private JComboBox<Department> cmbWithModel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		ComponentFrame frame = new ComponentFrame();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public ComponentFrame() {
		initGUI();
		
		Department selectedDept = (Department)cmbEntityComboBox.getSelectedItem();
		
		lbloutput.setText(selectedDept.getId() + "-" + selectedDept.getName());
		
		
		
		
		
	}
	private void initGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Name:");
		lblNewLabel.setBounds(16, 25, 61, 16);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(102, 20, 222, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Last Name:");
		lblNewLabel_1.setBounds(16, 74, 95, 16);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(107, 69, 217, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Department:");
		lblNewLabel_2.setBounds(16, 126, 95, 16);
		contentPane.add(lblNewLabel_2);
		
		comboBox = new JComboBox();
		comboBox.setBounds(110, 122, 214, 32);
		
		comboBox.addItem("IT");
		comboBox.addItem("SALES");
		comboBox.addItem("ACCOUNTING");
		
		
		
		contentPane.add(comboBox);
		
		lblNewLabel_3 = new JLabel("Department:");
		lblNewLabel_3.setBounds(16, 173, 95, 16);
		contentPane.add(lblNewLabel_3);
		
		cmbEntityComboBox = new JComboBox<>();
		cmbEntityComboBox.setBounds(133, 166, 191, 32);
		
		for (Department dept : Department.getDepartments()) {
			cmbEntityComboBox.addItem(dept);
		}
		
		
		
		contentPane.add(cmbEntityComboBox);
		
		lbloutput = new JLabel("New label");
		lbloutput.setBounds(26, 210, 285, 16);
		contentPane.add(lbloutput);
		
		
		lblNewLabel_4 = new JLabel("Department:");
		lblNewLabel_4.setBounds(16, 256, 95, 16);
		contentPane.add(lblNewLabel_4);
		
		cmbWithModel = new JComboBox<>();
		
		List<Department> depts = Department.getDepartments();
		//Data is loaded at once inside the model then can be sent to the combo box
		//Useful for bulk operations (database, file reading, etc)
		DefaultComboBoxModel<Department> cmbModel = new DefaultComboBoxModel<Department>(depts.toArray(new Department[depts.size()]));
		cmbWithModel.setModel(cmbModel);
	
		
		cmbWithModel.setBounds(143, 252, 181, 27);
		contentPane.add(cmbWithModel);
	}
}
