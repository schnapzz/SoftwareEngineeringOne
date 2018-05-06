package dtu.sh.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dtu.sh.Exceptions.OperationNotAllowedException;
import dtu.sh.model.Employee;
import dtu.sh.model.GeneralActivity;
import dtu.sh.model.SH;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GeneralActivityFrame extends JFrame {
	private Employee employee;
	private SH software;
	private LoggedIn loggedIn;
	private JPanel contentPane;
	private JTextField txtTtitlefield;
	private JTextPane txtpnDescriptionfield;
	private JLabel lblStartWeek;
	private JLabel lblEndWeek;
	private JTextField txtStartfield;
	private JTextField txtEndfield;
	private JButton btnCreate;

	/**
	 * Create the frame.
	 */
	public GeneralActivityFrame(SH software, LoggedIn loggedIn) {
		this.software = software;
		this.loggedIn = loggedIn;
		employee = software.getLoggedInEmployee();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 54, 37, 125, 37, 55, 46, 0, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 24, 0, 58, 59, 42, 53, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JLabel lblTitle = new JLabel("Title:");
		GridBagConstraints gbc_lblTitle = new GridBagConstraints();
		gbc_lblTitle.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitle.gridx = 1;
		gbc_lblTitle.gridy = 1;
		contentPane.add(lblTitle, gbc_lblTitle);

		txtTtitlefield = new JTextField();
		txtTtitlefield.setText("");
		GridBagConstraints gbc_txtTtitlefield = new GridBagConstraints();
		gbc_txtTtitlefield.insets = new Insets(0, 0, 5, 5);
		gbc_txtTtitlefield.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTtitlefield.gridx = 2;
		gbc_txtTtitlefield.gridy = 1;
		contentPane.add(txtTtitlefield, gbc_txtTtitlefield);
		txtTtitlefield.setColumns(10);

		JLabel lblDescription = new JLabel("Description:");
		GridBagConstraints gbc_lblDescription = new GridBagConstraints();
		gbc_lblDescription.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescription.gridx = 1;
		gbc_lblDescription.gridy = 2;
		contentPane.add(lblDescription, gbc_lblDescription);

		txtpnDescriptionfield = new JTextPane();
		txtpnDescriptionfield.setText("");
		GridBagConstraints gbc_txtpnDescriptionfield = new GridBagConstraints();
		gbc_txtpnDescriptionfield.insets = new Insets(0, 0, 5, 5);
		gbc_txtpnDescriptionfield.fill = GridBagConstraints.BOTH;
		gbc_txtpnDescriptionfield.gridx = 2;
		gbc_txtpnDescriptionfield.gridy = 2;
		contentPane.add(txtpnDescriptionfield, gbc_txtpnDescriptionfield);

		lblStartWeek = new JLabel("Start Week:");
		GridBagConstraints gbc_lblStartWeek = new GridBagConstraints();
		gbc_lblStartWeek.anchor = GridBagConstraints.EAST;
		gbc_lblStartWeek.insets = new Insets(0, 0, 5, 5);
		gbc_lblStartWeek.gridx = 1;
		gbc_lblStartWeek.gridy = 3;
		contentPane.add(lblStartWeek, gbc_lblStartWeek);

		txtStartfield = new JTextField();
		txtStartfield.setText("");
		GridBagConstraints gbc_txtStartfield = new GridBagConstraints();
		gbc_txtStartfield.insets = new Insets(0, 0, 5, 5);
		gbc_txtStartfield.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtStartfield.gridx = 2;
		gbc_txtStartfield.gridy = 3;
		contentPane.add(txtStartfield, gbc_txtStartfield);
		txtStartfield.setColumns(10);

		lblEndWeek = new JLabel("End Week:");
		GridBagConstraints gbc_lblEndWeek = new GridBagConstraints();
		gbc_lblEndWeek.anchor = GridBagConstraints.EAST;
		gbc_lblEndWeek.insets = new Insets(0, 0, 5, 5);
		gbc_lblEndWeek.gridx = 1;
		gbc_lblEndWeek.gridy = 4;
		contentPane.add(lblEndWeek, gbc_lblEndWeek);

		txtEndfield = new JTextField();
		txtEndfield.setText("");
		GridBagConstraints gbc_txtEndfield = new GridBagConstraints();
		gbc_txtEndfield.insets = new Insets(0, 0, 5, 5);
		gbc_txtEndfield.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEndfield.gridx = 2;
		gbc_txtEndfield.gridy = 4;
		contentPane.add(txtEndfield, gbc_txtEndfield);
		txtEndfield.setColumns(10);

		btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.out.println(software.getLoggedInEmployee().getID());
				String title = txtTtitlefield.getText();
				String description = txtpnDescriptionfield.getText();
				System.out.println("description is " + description != null);

				try {
					int start = Integer.parseInt((String) txtStartfield.getText());
					int end = Integer.parseInt((String) txtEndfield.getText());
					if (software.allFieldsFilled(title, description, txtStartfield.getText(), txtEndfield.getText()) && software.isValidWeekNumber(start) && software.isValidWeekNumber(end)) {
						GeneralActivity gifflar = new GeneralActivity(title, description, start, end);
						employee.addGeneralActivity(gifflar);
						loggedIn.reloadGenActCombo(employee);
					}
				} catch (NumberFormatException n) {
					System.out.println("Weeks should be integers");
				}

			}

		});
		GridBagConstraints gbc_btnCreate = new GridBagConstraints();
		gbc_btnCreate.insets = new Insets(0, 0, 0, 5);
		gbc_btnCreate.gridx = 2;
		gbc_btnCreate.gridy = 5;
		contentPane.add(btnCreate, gbc_btnCreate);
	}
}