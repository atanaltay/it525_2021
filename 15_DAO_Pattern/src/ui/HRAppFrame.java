package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import model.Department;
import model.Employee;
import service.ApplicationService;
import service.ApplicationServiceImpl;

import javax.swing.JSplitPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HRAppFrame extends JFrame implements EmployeeFrameListener{

	private JPanel contentPane;
	private JSplitPane splitPane;
	private JPanel panel;
	private JComboBox cmbDepartments;
	private JScrollPane scrollPane;
	private JTable tblEmployees;
	
	private ApplicationService appService = new ApplicationServiceImpl();
	private JButton btnLoad;
	private List<Employee> employees = new ArrayList<>();
	private JButton btnUpdate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HRAppFrame frame = new HRAppFrame();
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
	public HRAppFrame() {
		initGUI();
		loadDepartments();
	}
	private void loadDepartments() {
		
		List<Department> departments =  appService.getAllDepartments();
		DefaultComboBoxModel<Department> mdl = new DefaultComboBoxModel<>(departments.toArray(new Department[departments.size()]));
		cmbDepartments.setModel(mdl);
		
	}

	private void initGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 684, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		contentPane.add(splitPane, BorderLayout.CENTER);
		
		panel = new JPanel();
		splitPane.setLeftComponent(panel);
		
		cmbDepartments = new JComboBox();
		panel.add(cmbDepartments);
		
		btnLoad = new JButton("Load");
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadEmployees();
			}
		});
		panel.add(btnLoad);
		
		btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				showUpdateForm();
				
			}
		});
		panel.add(btnUpdate);
		
		scrollPane = new JScrollPane();
		splitPane.setRightComponent(scrollPane);
		
		tblEmployees = new JTable();
		scrollPane.setViewportView(tblEmployees);
	}

	protected void showUpdateForm() {
		
		int row = tblEmployees.getSelectedRow();
		
		EmployeeFrame frm = new EmployeeFrame(employees.get(row),this);
		frm.setVisible(true);
		
		
	}

	protected void loadEmployees() {
		int deptid = ((Department)cmbDepartments.getSelectedItem()).getId();
		employees=  appService.getEmployeesByDepartmentId(deptid);
		
		String[] colNames = new String[] {"id","Name","Last Name","Salary","Notes"};
		
		Object[][] data = new Object[employees.size()][];
		
		for (int i = 0; i < employees.size(); i++) {
			Employee emp = employees.get(i);
			data[i] = new Object[] {emp.getId(),emp.getName(),emp.getLastname(),emp.getSalary(),emp.getNotes()};
			
			
		}
		
		DefaultTableModel tblModel = new DefaultTableModel(data, colNames);
		tblEmployees.setModel(tblModel);
		
		
	}

	@Override
	public void employeeUpdated() {
		loadEmployees();
		
	}

}
