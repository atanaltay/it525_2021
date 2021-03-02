package threadcontrol;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProgressFrame extends JFrame {

	private JPanel contentPane;
	private JProgressBar progressBar;
	private JButton btnStart;
	private JButton btnStop;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProgressFrame frame = new ProgressFrame();
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
	public ProgressFrame() {
		initGUI();
	}
	private void initGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 754, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		progressBar = new JProgressBar();
		progressBar.setBounds(92, 20, 378, 20);
		contentPane.add(progressBar);
		
		btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnStartClicked();
			}
		});
		btnStart.setBounds(80, 75, 117, 29);
		contentPane.add(btnStart);
		
		btnStop = new JButton("Stop");
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnStopClicked();
			}
		});
		btnStop.setBounds(209, 75, 117, 29);
		contentPane.add(btnStop);
		
		btnPause = new JButton("Pause");
		btnPause.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnPauseClicked();
			}
		});
		btnPause.setBounds(331, 75, 117, 29);
		contentPane.add(btnPause);
		
		btnResume = new JButton("Resume");
		btnResume.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnResumeClicked();
				
			}
		});
		btnResume.setBounds(460, 75, 117, 29);
		contentPane.add(btnResume);
	}

	protected void btnPauseClicked() {
		if(prgThread!=null && prgThread.isAlive()) {
			
			prgThread.pauseThread();
			
			
		}
		
	}

	protected void btnResumeClicked() {
		
		if(prgThread!=null) {
			
			prgThread.resumeThread();
			
			synchronized (prgThread) {
				prgThread.notify();
			}
			
			
		}
		
		
	}

	protected void btnStopClicked() {
		if(prgThread!=null && prgThread.isAlive()) {
			prgThread.stopThread();
		}
		
	}

	ProgressThread prgThread;
	private JButton btnPause;
	private JButton btnResume;
	protected void btnStartClicked() {
		progressBar.setValue(0);
		prgThread = new ProgressThread();
		prgThread.start();
		
	}
	
	class ProgressThread extends Thread{
		
		boolean canRun = true;
		boolean paused = false;
		
		//if a thread instance's run method finishes execution, that thread instance is DEAD!
		@Override
		public void run() {
			
			while(progressBar.getValue()<100) {
				
				if(canRun) {
					if(!paused) {
						progressBar.setValue(progressBar.getValue()+1);
						
						try {
							Thread.sleep(50);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}else {
						
						try {
							synchronized (this) {
								wait();
							}
							
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						
					}
					
				}else {
					break;
				}

			}
			

			
		}
		
		public void resumeThread() {
			paused = false;
		}
		
		public void pauseThread() {
			paused = true;
		}
		
		public void stopThread() {
			canRun = false;
		}
		
	}
	
}
