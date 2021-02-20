package example_sqlinjection;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import example1_statement.Country;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JTextField txtPassword;
	private JLabel lblNewLabel;
	private JLabel lblPassword;
	private JButton btnLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
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
	public LoginFrame() {
		initGUI();
	}
	private void initGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(169, 22, 130, 26);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(169, 80, 130, 26);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);
		
		lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(18, 27, 139, 16);
		contentPane.add(lblNewLabel);
		
		lblPassword = new JLabel("Password");
		lblPassword.setBounds(18, 85, 139, 16);
		contentPane.add(lblPassword);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnLoginClickeed();
				
				
			}
		});
		btnLogin.setBounds(179, 126, 117, 29);
		contentPane.add(btnLogin);
	}

	protected void btnLoginClickeed() {
		
		try (
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/employeesdb", "root", "e118528!");
				//Statement stmt = conn.createStatement();
				
				) {
			
			//String query = "select count(*) as cnt from user where username='" + txtUsername.getText() 
			//												+ "' and password='"+ txtPassword.getText() + "'";
			//ResultSet rs =  stmt.executeQuery(query);
			//rs.next();
			String query = "select count(*) as cnt from user where username=? and password=?";
			PreparedStatement psmt = conn.prepareStatement(query);
			//Query parameter indexes start from 1
			psmt.setString(1, txtUsername.getText());
			psmt.setString(2, txtPassword.getText());
			ResultSet rs = psmt.executeQuery();
			
			
			rs.next();
			int result = rs.getInt("cnt");
			
			if(result>0) {
				JOptionPane.showMessageDialog(this, "Logged in successfully");
			}else {
				JOptionPane.showMessageDialog(this, "Username or password worng!!");
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}
