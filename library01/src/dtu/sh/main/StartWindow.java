package dtu.sh.main;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import dtu.sh.controller.Controller;
import dtu.sh.model.SH;

public class StartWindow {
	protected JFrame frame;
	private JTextField txtUsername;
	private Controller controller;
	private SH sh;

	public StartWindow() {
		sh = new SH();
		this.controller = new Controller();
		//this.controller = new Controller(sh);
		
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 491, 338);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{210, 126, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{60, 16, 35, 26, 29, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JButton btnNewButton = new JButton("Log in ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.login();
			}
		});
		
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
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 4;
		frame.getContentPane().add(btnNewButton, gbc_btnNewButton);
	}
	
}


