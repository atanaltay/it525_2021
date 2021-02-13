package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.awt.event.ActionEvent;

public class SimpleNotePadMainFrame extends JFrame {

	//JMenuBar: Container of all menu components, itecreates a menu bar
	//JMenu: An item to display on menubar with sub menu items
	//JMenuItem: All menu items to be added inside a JMenu
	
	
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JScrollPane scrollPane;
	private JTextArea txtData;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleNotePadMainFrame frame = new SimpleNotePadMainFrame();
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
	public SimpleNotePadMainFrame() {
		initGUI();
	}
	private void initGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 415);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem = new JMenuItem("Open");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser fileChooser = new JFileChooser();
				if(fileChooser.showOpenDialog(SimpleNotePadMainFrame.this)==JFileChooser.APPROVE_OPTION) {
					
					
					//JOptionPane.showMessageDialog(SimpleNotePadMainFrame.this, fileChooser.getSelectedFile().getName());
					
					try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileChooser.getSelectedFile()),"utf-8"))){
						
						String line ="";
						
						while((line = reader.readLine())!=null) {
							txtData.append(line + "\n");
							
							
							
						}
						
						
						
						
					} catch (Exception e2) {
						e2.printStackTrace();
					}
					
				}
				
				
				
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		mntmNewMenuItem_1 = new JMenuItem("Save");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser fileChooser = new JFileChooser();
				if(fileChooser.showSaveDialog(SimpleNotePadMainFrame.this)==JFileChooser.APPROVE_OPTION) {
					
					File selectedFile = fileChooser.getSelectedFile();
					
					try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(selectedFile),"utf-8"))){
						
						writer.write(txtData.getText());
						writer.flush();
						
						
						
						
						
					} catch (Exception e2) {
						e2.printStackTrace();
					}
					
					
					
					
				}
				

			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		txtData = new JTextArea();
		scrollPane.setViewportView(txtData);
	}

}
