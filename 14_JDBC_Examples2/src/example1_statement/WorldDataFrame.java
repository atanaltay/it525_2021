package example1_statement;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WorldDataFrame extends JFrame {

	private JPanel contentPane;
	private JComboBox cmbCountry;
	private JButton btnSelectCountry;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JTextArea txtCities;
	
	private List<Country> countries = new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WorldDataFrame frame = new WorldDataFrame();
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
	public WorldDataFrame() {
		initGUI();
		fillCountryComboBox();
	}
	
	public void fillCountryComboBox() {
		
		try (
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/world", "root", "e118528!");
				Statement stmt = conn.createStatement();
				
				) {
			
			String query = "select * from country";
			ResultSet rs =  stmt.executeQuery(query);
			
			while(rs.next()) {
				
				Country cnt = new Country(rs.getString("code"), rs.getString("name"));
				countries.add(cnt);
				
				
			}
			
			DefaultComboBoxModel<Country> mdlCombo = new DefaultComboBoxModel<>(countries.toArray(new Country[countries.size()]));
			cmbCountry.setModel(mdlCombo);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	private void initGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 611, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cmbCountry = new JComboBox();
		cmbCountry.setBounds(134, 6, 315, 27);
		contentPane.add(cmbCountry);
		
		btnSelectCountry = new JButton("OK");
		btnSelectCountry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnOkClicked();
			}
		});
		btnSelectCountry.setBounds(461, 5, 117, 29);
		contentPane.add(btnSelectCountry);
		
		panel = new JPanel();
		panel.setBounds(36, 66, 550, 271);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		panel.add(scrollPane, BorderLayout.CENTER);
		
		txtCities = new JTextArea();
		scrollPane.setViewportView(txtCities);
	}

	//Handler methods
	protected void btnOkClicked() {
		
		String selectedContryCode = ((Country)cmbCountry.getSelectedItem()).getCode();
		StringBuilder cityData = new StringBuilder();
		try (
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/world", "root", "e118528!");
				
				
				) {
			Statement stmt = conn.createStatement();
			String query = "SELECT * FROM city where countrycode='" + selectedContryCode +"';";
			//An update query example:
			//String queryUpdate = "update city set population=" + pop + " where id=" + id;
			//stmt.executeUpdate(queryUpdate);
			ResultSet rs =  stmt.executeQuery(query);
			
			while(rs.next()) {
				
				cityData.append(rs.getString("name") + " - " + rs.getInt("population") + "\n");
			}
			
			txtCities.setText(cityData.toString());
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
