package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Department;
import service.ApplicationService;

import javax.swing.JTextArea;

public class TestFrame extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea;
	
	private ApplicationService service = new ApplicationService();
	List<Department> departments = new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestFrame frame = new TestFrame();
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
	public TestFrame() {
		initGUI();
		departments = service.getAllDepartments();
		
		for (Department department : departments) {
			textArea.append(department.toString() + "\n");
		}
		
		
		
		
	}
	private void initGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textArea = new JTextArea();
		textArea.setColumns(10);
		textArea.setRows(20);
		textArea.setBounds(55, 32, 347, 203);
		contentPane.add(textArea);
	}

}
