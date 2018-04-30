package dtu.sh.main;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

//import dtu.library.Exceptions.OperationNotAllowedException;
import dtu.sh.model.SH;
import java.awt.Color;

public class Main {

	private SH softwarehuset;
	
	private JFrame frame;
	private JLabel loginErrorLabel;
	private JTextField txtUsername;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
		softwarehuset = new SH();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 491, 338);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{210, 126, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{60, 16, 35, 26, 29, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblIndtastLogin = new JLabel("Indtast login");
		GridBagConstraints gbc_lblIndtastLogin = new GridBagConstraints();
		gbc_lblIndtastLogin.insets = new Insets(0, 0, 5, 5);
		gbc_lblIndtastLogin.gridx = 1;
		gbc_lblIndtastLogin.gridy = 1;
		frame.getContentPane().add(lblIndtastLogin, gbc_lblIndtastLogin);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(7,4,10,10);
		txtUsername.setText("Username");
		GridBagConstraints gbc_txtUsername = new GridBagConstraints();
		gbc_txtUsername.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUsername.insets = new Insets(0, 0, 5, 5);
		gbc_txtUsername.gridx = 1;
		gbc_txtUsername.gridy = 3;
		frame.getContentPane().add(txtUsername, gbc_txtUsername);
		txtUsername.setColumns(10);
		
		JButton btnNewButton = new JButton("Log in ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				
//				try {
//				
//					softwarehuset.logInEmployee(txtUsername.getText());
//					
//					frame.dispose();
//					LoggedIn log = new LoggedIn();
//					log.setVisible(true);
//					
//				} catch (Exception e1) {
//					
//					
//				}
			}
		});
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setForeground(Color.RED);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 4;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 5;
		frame.getContentPane().add(btnNewButton, gbc_btnNewButton);
	}
}
