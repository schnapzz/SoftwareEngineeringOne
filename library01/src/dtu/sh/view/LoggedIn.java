package dtu.sh.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dtu.sh.Exceptions.OperationNotAllowedException;
import dtu.sh.model.Project;
import dtu.sh.model.ProjectActivity;
import dtu.sh.model.SH;

import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Menu;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoggedIn extends JFrame {

	private JPanel contentPane;
	private JTextField txtIminutter;
	private JButton btnCreateProjectActivity;

	public LoggedIn(SH softwarehuset) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 377);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{68, 77, 23, 191, 154, 3};
		gbl_contentPane.rowHeights = new int[]{46, 41, 39, 59, 0, 160, 5};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblRegistrerTimer = new JLabel("Registrer Timer");
		GridBagConstraints gbc_lblRegistrerTimer = new GridBagConstraints();
		gbc_lblRegistrerTimer.insets = new Insets(0, 0, 5, 0);
		gbc_lblRegistrerTimer.gridx = 4;
		gbc_lblRegistrerTimer.gridy = 0;
		contentPane.add(lblRegistrerTimer, gbc_lblRegistrerTimer);
		
		JComboBox projectComboBox = new JComboBox();
		// This needs to be loaded trough our lists.
		// ==================
		projectComboBox.addItem("Paul Fischer");
		projectComboBox.addItem("Aksel Acne");
		projectComboBox.addItem("Carsten");
		// ==================
		projectComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent projectActionEvent) {
				
				// WARN: Check this when the proper info is added
				String selectedProject = projectComboBox.getSelectedItem().toString();
				Project project = softwarehuset.getProjectWithId(selectedProject);
				
				showCreateProjectActivityButtonIfProjectLeader(project.getProjectLeader(), softwarehuset.getLoggedInEmployee().getID());
			}
		});
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 2;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 0;
		gbc_comboBox.gridy = 1;
		contentPane.add(projectComboBox, gbc_comboBox);
		
		JComboBox activityComboBox = new JComboBox();
		// This needs to be loaded trough our lists.
		// ==================
		activityComboBox.addItem("Kan ikke stave");
		activityComboBox.addItem("Kan ikke regne");
		activityComboBox.addItem("Kan ikke lide mennesker");
		// ==================
		GridBagConstraints gbc_comboBox_Activity = new GridBagConstraints();
		gbc_comboBox_Activity.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_Activity.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_Activity.gridx = 3;
		gbc_comboBox_Activity.gridy = 1;
		contentPane.add(activityComboBox, gbc_comboBox_Activity);
		
		
		txtIminutter = new JTextField();
		txtIminutter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtIminutter.setText(" ");
			}
		});
		
		txtIminutter.setText("I Minutter");
		GridBagConstraints gbc_txtIminutter = new GridBagConstraints();
		gbc_txtIminutter.insets = new Insets(0, 0, 5, 0);
		gbc_txtIminutter.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtIminutter.gridx = 4;
		gbc_txtIminutter.gridy = 1;
		contentPane.add(txtIminutter, gbc_txtIminutter);
		txtIminutter.setColumns(10);
		
		JButton btnNewButton = new JButton("Tilf�j");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Menu menu = new Menu(softwarehuset);
//				menu.setVisible(true);
			}
		});
		
		JButton btnLogUd = new JButton("Log ud");
		btnLogUd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// gå tilbage til log in	
			}
		});
		
		// Mikkel
		btnCreateProjectActivity = new JButton("Create Project Activity");
		btnCreateProjectActivity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateProjectActivityFrame createProjectActivity = new CreateProjectActivityFrame(softwarehuset);
				createProjectActivity.setVisible(true);
			}
		});
		GridBagConstraints gbc_btnCreateProjectActivity = new GridBagConstraints();
		gbc_btnCreateProjectActivity.insets = new Insets(0, 0, 5, 5);
		gbc_btnCreateProjectActivity.gridx = 3;
		gbc_btnCreateProjectActivity.gridy = 4;
		contentPane.add(btnCreateProjectActivity, gbc_btnCreateProjectActivity);
		
		GridBagConstraints gbc_btnLogUd = new GridBagConstraints();
		gbc_btnLogUd.insets = new Insets(0, 0, 0, 5);
		gbc_btnLogUd.gridx = 0;
		gbc_btnLogUd.gridy = 5;
		contentPane.add(btnLogUd, gbc_btnLogUd);
		
		JLabel lblErrormessage = new JLabel("ErrorMessage");
		lblErrormessage.setVisible(false);
		GridBagConstraints gbc_lblErrormessage = new GridBagConstraints();
		gbc_lblErrormessage.insets = new Insets(0, 0, 5, 0);
		gbc_lblErrormessage.gridx = 4;
		gbc_lblErrormessage.gridy = 2;
		contentPane.add(lblErrormessage, gbc_lblErrormessage);
		
		// Mikkel
		JButton addRegistrationButton = new JButton("addRegistration");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					// This is done from the notion that we use the ID of projects in the Combobox.
					// We might want a format like: 'id - title' in other words '030109 - Test'
					// In that case handle this.
					String selectedProjectId = projectComboBox.getSelectedItem().toString();
					String selectedActivityTitle = activityComboBox.getSelectedItem().toString();
					String hoursAsString = txtIminutter.getText();
					
					// Get to the proper activity
					Project project = softwarehuset.getProjectWithId(selectedProjectId);
					ProjectActivity projectActivity = project.getProjectActivityWithTitle(selectedActivityTitle);
					
					// Register the time.
					projectActivity.registerHours(softwarehuset.getLoggedInEmployee().getID(), Double.parseDouble(hoursAsString));
					setLabelTextAndVisibility(lblErrormessage, "", false);
					
				} catch (OperationNotAllowedException e1) {
					
					setLabelTextAndVisibility(lblErrormessage, e1.getMessage(), true);
					
				} catch (NumberFormatException e2) { // In case the user inputs a wrong character
					
					setLabelTextAndVisibility(lblErrormessage, "Please insert whole number in dot notation", true);
				}
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 4;
		gbc_btnNewButton.gridy = 3;
		contentPane.add(addRegistrationButton, gbc_btnNewButton);
	}
	
	// Mikkel
	// Makes sure it's not possible for employees who's not projectLeader on the selected project to add activities.
	private void showCreateProjectActivityButtonIfProjectLeader(String projectLeader, String loggedInEmployee) {
		
		if (projectLeader.equals(loggedInEmployee)) {
			
			btnCreateProjectActivity.setVisible(true);
			btnCreateProjectActivity.setEnabled(true);
			
		} else {
			btnCreateProjectActivity.setVisible(false);
			btnCreateProjectActivity.setEnabled(false);
		}
	}

	// Mikkel
	private void setLabelTextAndVisibility(JLabel label, String message, boolean visibility) {
		label.setText(message);
		label.setVisible(visibility);
	}
}
