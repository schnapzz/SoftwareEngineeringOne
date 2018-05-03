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

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class LoggedIn extends JFrame {

	private SH softwarehuset;
	private LoggedIn self;
	
	private JPanel contentPane;
	private JTextField txtIminutter;
	private JComboBox<String> projectComboBox;
	private JComboBox<String> unfinishedActivityComboBox = new JComboBox<String>();
	private JComboBox<String> finishedActivitiesComboBox = new JComboBox<String>();
	private JButton btnCreateProjectActivity;

	public LoggedIn(SH softwarehuset) {
		
		this.softwarehuset = softwarehuset;
		this.self = this;
		
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
		
		// Mikkel
		JLabel lblProjectLabel = new JLabel("Projects");
		GridBagConstraints gbc_lblProjectLabel = new GridBagConstraints();
		gbc_lblProjectLabel.anchor = GridBagConstraints.SOUTH;
		gbc_lblProjectLabel.gridwidth = 2;
		gbc_lblProjectLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblProjectLabel.gridx = 0;
		gbc_lblProjectLabel.gridy = 0;
		contentPane.add(lblProjectLabel, gbc_lblProjectLabel);
		
		// Mikkel
		JLabel lblUnfinishedActivities = new JLabel("Unfinished Activities");
		GridBagConstraints gbc_lblUnfinishedActivities = new GridBagConstraints();
		gbc_lblUnfinishedActivities.anchor = GridBagConstraints.SOUTH;
		gbc_lblUnfinishedActivities.insets = new Insets(0, 0, 5, 5);
		gbc_lblUnfinishedActivities.gridx = 3;
		gbc_lblUnfinishedActivities.gridy = 0;
		contentPane.add(lblUnfinishedActivities, gbc_lblUnfinishedActivities);
		
		JLabel lblRegistrerTimer = new JLabel("Registrer Timer");
		GridBagConstraints gbc_lblRegistrerTimer = new GridBagConstraints();
		gbc_lblRegistrerTimer.anchor = GridBagConstraints.SOUTH;
		gbc_lblRegistrerTimer.insets = new Insets(0, 0, 5, 0);
		gbc_lblRegistrerTimer.gridx = 4;
		gbc_lblRegistrerTimer.gridy = 0;
		contentPane.add(lblRegistrerTimer, gbc_lblRegistrerTimer);
		
		// Mikkel
		projectComboBox = new JComboBox<String>();
		// ==================
		List<Project> projects = softwarehuset.getProjects();
		for (Project p : projects) {
			projectComboBox.addItem(p.getId() + " - " + p.getTitle());
		}
		// ==================
		projectComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent projectActionEvent) {
				
				Project project = getSelectedProject();
				
				showCreateProjectActivityButtonIfProjectLeader(project.getProjectLeader(), softwarehuset.getLoggedInEmployee().getID());
				reloadProjectActivityCombobox();
			}
		});
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 2;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 0;
		gbc_comboBox.gridy = 1;
		contentPane.add(projectComboBox, gbc_comboBox);
		
		// Mikkel
		// Activity Combobox constraints
		GridBagConstraints gbc_unfinished_Activity = new GridBagConstraints();
		gbc_unfinished_Activity.insets = new Insets(0, 0, 5, 5);
		gbc_unfinished_Activity.fill = GridBagConstraints.HORIZONTAL;
		gbc_unfinished_Activity.gridx = 3;
		gbc_unfinished_Activity.gridy = 1;
		contentPane.add(unfinishedActivityComboBox, gbc_unfinished_Activity);
		
		
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
		
//		JButton btnNewButton = new JButton("Tilf�j");
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//				Menu menu = new Menu(softwarehuset);
//				menu.setVisible(true);
//			}
//		});
		
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
				
				Project project = getSelectedProject();
				CreateProjectActivityFrame createProjectActivity = new CreateProjectActivityFrame(self, project, softwarehuset.getLoggedInEmployee());
				createProjectActivity.setVisible(true);
			}
		});
		GridBagConstraints gbc_btnCreateProjectActivity = new GridBagConstraints();
		gbc_btnCreateProjectActivity.insets = new Insets(0, 0, 5, 5);
		gbc_btnCreateProjectActivity.gridx = 3;
		gbc_btnCreateProjectActivity.gridy = 2;
		contentPane.add(btnCreateProjectActivity, gbc_btnCreateProjectActivity);
		
		// Mikkel
		JLabel lblFinishedActivities = new JLabel("Finished Activities");
		GridBagConstraints gbc_lblFinishedActivities = new GridBagConstraints();
		gbc_lblFinishedActivities.insets = new Insets(0, 0, 5, 5);
		gbc_lblFinishedActivities.gridx = 3;
		gbc_lblFinishedActivities.gridy = 4;
		contentPane.add(lblFinishedActivities, gbc_lblFinishedActivities);

		// Mikkel
		GridBagConstraints gbc_btnLogUd = new GridBagConstraints();
		gbc_btnLogUd.insets = new Insets(0, 0, 0, 5);
		gbc_btnLogUd.gridx = 0;
		gbc_btnLogUd.gridy = 5;
		contentPane.add(btnLogUd, gbc_btnLogUd);
		
		// Mikkel
		JLabel lblErrormessage = new JLabel("ErrorMessage");
		lblErrormessage.setVisible(false);
		GridBagConstraints gbc_lblErrormessage = new GridBagConstraints();
		gbc_lblErrormessage.insets = new Insets(0, 0, 5, 0);
		gbc_lblErrormessage.gridx = 4;
		gbc_lblErrormessage.gridy = 2;
		contentPane.add(lblErrormessage, gbc_lblErrormessage);
		
		// Mikkel
		JButton addRegistrationButton = new JButton("addRegistration");
		addRegistrationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					String selectedActivityTitle = (String)unfinishedActivityComboBox.getSelectedItem();
					String hoursAsString = txtIminutter.getText();
					
					// Get to the proper activity
					Project project = getSelectedProject();
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
		
		// Mikkel
		GridBagConstraints gbc_finishedActivitiesComboBox;
		gbc_finishedActivitiesComboBox = new GridBagConstraints();
		gbc_finishedActivitiesComboBox.anchor = GridBagConstraints.NORTH;
		gbc_finishedActivitiesComboBox.insets = new Insets(0, 0, 0, 5);
		gbc_finishedActivitiesComboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_finishedActivitiesComboBox.gridx = 3;
		gbc_finishedActivitiesComboBox.gridy = 5;
		contentPane.add(finishedActivitiesComboBox, gbc_finishedActivitiesComboBox);
		
		reloadProjectActivityCombobox();
	}
	
	// Mikkel
	private void reloadProjectActivityCombobox() {
		
		clearActivityData();
		
		Project project = getSelectedProject();
		List<ProjectActivity> unfinished = project.getUnfinishedActivities();
		List<ProjectActivity> finished = project.getFinishedActivities();

		// Load unfinished
		for (ProjectActivity projectActivity : unfinished) {
			unfinishedActivityComboBox.addItem(projectActivity.getTitle());
		}
		
		// Load finished
		for (ProjectActivity projectActivity : finished) {
			finishedActivitiesComboBox.addItem(projectActivity.getTitle());
		}
	}
	
	// Mikkel
	private void clearActivityData() {
		unfinishedActivityComboBox.removeAllItems();
		finishedActivitiesComboBox.removeAllItems();
	}

	// Mikkel
	private Project getSelectedProject() {
		
		String selectedProjectId = ((String)projectComboBox.getSelectedItem()).substring(0, 6);
		System.out.println("ID of selected project is " + selectedProjectId);
		
		return softwarehuset.getProjectWithId(selectedProjectId);
	}
	
	// Mikkel
	private ProjectActivity getSelectedUnfinishedActivity() {
		
		String selectedActivity = (String)unfinishedActivityComboBox.getSelectedItem();
		Project p = getSelectedProject();
		ProjectActivity pa = p.getProjectActivityWithTitle(selectedActivity);
		
		return pa;
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
