package dtu.sh.view;

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

import dtu.sh.model.Employee;
import dtu.sh.model.SH;
import java.awt.Color;
import java.awt.Font;

/**
 * Done by all
 */
public class Main {
    
	private SH softwarehuset;
	private Main self;
	private 	Employee employee;
	private JFrame frame;
	private JLabel loginErrorLabel;
	private JTextField txtUsername;

	/**
	 * Launching the application.
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
		self = this;
		softwarehuset = new SH();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 309, 317);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{80, 161, 0, 0};
		gridBagLayout.rowHeights = new int[]{85, 19, 26, 58, 37, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblIndtastLogin = new JLabel("Indtast login");
		lblIndtastLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblIndtastLogin = new GridBagConstraints();
		gbc_lblIndtastLogin.insets = new Insets(0, 0, 5, 5);
		gbc_lblIndtastLogin.gridx = 1;
		gbc_lblIndtastLogin.gridy = 1;
		frame.getContentPane().add(lblIndtastLogin, gbc_lblIndtastLogin);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtUsername.setBounds(7,4,10,10);
		txtUsername.setText("Username");
		GridBagConstraints gbc_txtUsername = new GridBagConstraints();
		gbc_txtUsername.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUsername.insets = new Insets(0, 0, 5, 5);
		gbc_txtUsername.gridx = 1;
		gbc_txtUsername.gridy = 2;
		frame.getContentPane().add(txtUsername, gbc_txtUsername);
		txtUsername.setColumns(10);
		
		JButton btnNewButton = new JButton("Log in ");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					String username = txtUsername.getText();
					if (softwarehuset.isEmployed(username)) {
						softwarehuset.logInEmployee(username);
						frame.dispose(); 
						employee = softwarehuset.getLoggedInEmployee();
						LoggedIn login = new LoggedIn(self, softwarehuset, username);
						login.setVisible(true);
						frame.setVisible(false);
					}
					
				} catch (Exception e1) {
					
					loginErrorLabel.setText(e1.getMessage());
				}
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.NORTH;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 3;
		frame.getContentPane().add(btnNewButton, gbc_btnNewButton);
	
		
	}

	public void showLogin() {
		frame.setVisible(true);
	}
}
