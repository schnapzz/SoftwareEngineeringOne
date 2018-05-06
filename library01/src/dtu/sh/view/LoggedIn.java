package dtu.sh.view;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dtu.sh.Exceptions.OperationNotAllowedException;
import dtu.sh.model.Employee;
import dtu.sh.model.GeneralActivity;
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

/*
 * Done by everyone
 */
public class LoggedIn extends JFrame {
	private SH softwarehuset;
	private LoggedIn self;
	private String username;
	private Employee employee;
	private List<GeneralActivity> generalActivities;
	private boolean updating = false;

	
	private JPanel contentPane;
	private JTextField txtIminutter;
	private JComboBox<String> projectComboBox = new JComboBox<String>();
	private JComboBox<String> unfinishedActivityComboBox = new JComboBox<String>();
	private JComboBox<String> finishedActivitiesComboBox = new JComboBox<String>();
	private JComboBox<String> comboBoxgenAct = new JComboBox<String>();
	private JButton btnCreateProjectActivity;

	public LoggedIn(Main main, SH softwarehuset, String username) {
		this.employee = softwarehuset.getLoggedInEmployee();
		this.softwarehuset = softwarehuset;
		this.self = this;
		this.username = username; 
		generalActivities = employee.getGeneralActivities();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 377);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{68, 77, 23, 191, 154, 3};
		gbl_contentPane.rowHeights = new int[]{46, 41, 39, 59, 0, 0, 0, 0, 0, 0, 5};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		// Mikkel
		JLabel lblProjectLabel = new JLabel("Projects");
		GridBagConstraints gbc_lblProjectLabel = new GridBagConstraints();
		gbc_lblProjectLabel.gridwidth = 2;
		gbc_lblProjectLabel.anchor = GridBagConstraints.SOUTH;
		gbc_lblProjectLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblProjectLabel.gridx = 0;
		gbc_lblProjectLabel.gridy = 0;
		contentPane.add(lblProjectLabel, gbc_lblProjectLabel);
		
		//Helena
		JButton btnProjects = new JButton("Manage Projects");
		btnProjects.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Projects projects = new Projects(softwarehuset, username, self);
				projects.setVisible(true);
			}
		});
		GridBagConstraints gbc_btnProjects = new GridBagConstraints();
		gbc_btnProjects.anchor = GridBagConstraints.SOUTH;
		gbc_btnProjects.insets = new Insets(0, 0, 5, 5);
		gbc_btnProjects.gridx = 0;
		gbc_btnProjects.gridy = 2;
		contentPane.add(btnProjects, gbc_btnProjects);
		
		// Mikkel
		JLabel lblUnfinishedActivities = new JLabel("Unfinished Activities");
		GridBagConstraints gbc_lblUnfinishedActivities = new GridBagConstraints();
		gbc_lblUnfinishedActivities.anchor = GridBagConstraints.SOUTH;
		gbc_lblUnfinishedActivities.insets = new Insets(0, 0, 5, 5);
		gbc_lblUnfinishedActivities.gridx = 3;
		gbc_lblUnfinishedActivities.gridy = 0;
		contentPane.add(lblUnfinishedActivities, gbc_lblUnfinishedActivities);
		
		JLabel lblRegistrerTimer = new JLabel("Log hours");
		GridBagConstraints gbc_lblRegistrerTimer = new GridBagConstraints();
		gbc_lblRegistrerTimer.anchor = GridBagConstraints.SOUTH;
		gbc_lblRegistrerTimer.insets = new Insets(0, 0, 5, 0);
		gbc_lblRegistrerTimer.gridx = 4;
		gbc_lblRegistrerTimer.gridy = 0;
		contentPane.add(lblRegistrerTimer, gbc_lblRegistrerTimer);
		
		// Mikkel
		// ==================
		updateProjectsCombo();
		// ==================
		projectComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent projectActionEvent) {
				if (!updating) {
					Project project = getSelectedProject();
				showCreateProjectActivityButtonIfProjectLeader(project.getProjectLeader(), softwarehuset.getLoggedInEmployee().getID());
				reloadProjectActivityCombobox();
				}
			}
		});
		
		//Sofie-Amalie & Oli
		GridBagConstraints gbc_comboBoxenAct = new GridBagConstraints();
		gbc_comboBoxenAct.gridwidth = 2;
		gbc_comboBoxenAct.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxenAct.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxenAct.gridx = 0;
		gbc_comboBoxenAct.gridy = 1;
		contentPane.add(projectComboBox, gbc_comboBoxenAct);
		
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
		
		txtIminutter.setText("In half-hours");
		GridBagConstraints gbc_txtIminutter = new GridBagConstraints();
		gbc_txtIminutter.insets = new Insets(0, 0, 5, 0);
		gbc_txtIminutter.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtIminutter.gridx = 4;
		gbc_txtIminutter.gridy = 1;
		contentPane.add(txtIminutter, gbc_txtIminutter);
		txtIminutter.setColumns(10);
		
		// Mikkel
		btnCreateProjectActivity = new JButton("Create Project Activity");
		btnCreateProjectActivity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Project project = getSelectedProject();
				CreateProjectActivityFrame createProjectActivity = new CreateProjectActivityFrame(self, project, softwarehuset);
				createProjectActivity.setVisible(true);
				self.setVisible(false);
			}
		});
		GridBagConstraints gbc_btnCreateProjectActivity = new GridBagConstraints();
		gbc_btnCreateProjectActivity.insets = new Insets(0, 0, 5, 5);
		gbc_btnCreateProjectActivity.gridx = 3;
		gbc_btnCreateProjectActivity.gridy = 2;
		contentPane.add(btnCreateProjectActivity, gbc_btnCreateProjectActivity);
		
		JButton btnUnfinishedActivityInfo = new JButton("Unfinished Activity Info");
		btnUnfinishedActivityInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				openActivityInformation(unfinishedActivityComboBox);
			}
		});
		// Sofie-Amalie & Oli
		JButton btnCreateGeneralActivity = new JButton("Create General Activity");
		btnCreateGeneralActivity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneralActivityFrame generalActivityFrame = new GeneralActivityFrame(softwarehuset, self);
				generalActivityFrame.setVisible(true);
				self.setVisible(false);
			}
		});
		GridBagConstraints gbc_btnCreateGeneralActivity = new GridBagConstraints();
		gbc_btnCreateGeneralActivity.insets = new Insets(0, 0, 5, 5);
		gbc_btnCreateGeneralActivity.gridx = 0;
		gbc_btnCreateGeneralActivity.gridy = 3;
		contentPane.add(btnCreateGeneralActivity, gbc_btnCreateGeneralActivity);
		
		GridBagConstraints gbc_btnUnfinishedActivityInfo = new GridBagConstraints();
		gbc_btnUnfinishedActivityInfo.insets = new Insets(0, 0, 5, 5);
		gbc_btnUnfinishedActivityInfo.gridx = 3;
		gbc_btnUnfinishedActivityInfo.gridy = 3;
		contentPane.add(btnUnfinishedActivityInfo, gbc_btnUnfinishedActivityInfo);
		
		
		//Sofie-Amalie & Oli
		comboBoxgenAct = new JComboBox<String>();
		loadGenActCombobox();

		GridBagConstraints gbc_comboBoxgenAct = new GridBagConstraints();
		gbc_comboBoxgenAct.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxgenAct.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxgenAct.gridx = 0;
		gbc_comboBoxgenAct.gridy = 4;
		contentPane.add(comboBoxgenAct, gbc_comboBoxgenAct);
		
		// Mikkel
		JLabel lblFinishedActivities = new JLabel("Finished Activities");
		GridBagConstraints gbc_lblFinishedActivities = new GridBagConstraints();
		gbc_lblFinishedActivities.insets = new Insets(0, 0, 5, 5);
		gbc_lblFinishedActivities.gridx = 3;
		gbc_lblFinishedActivities.gridy = 4;
		contentPane.add(lblFinishedActivities, gbc_lblFinishedActivities);
		
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
			
			// Mikkel
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
		gbc_finishedActivitiesComboBox.gridheight = 2;
		gbc_finishedActivitiesComboBox.anchor = GridBagConstraints.NORTH;
		gbc_finishedActivitiesComboBox.insets = new Insets(0, 0, 5, 5);
		gbc_finishedActivitiesComboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_finishedActivitiesComboBox.gridx = 3;
		gbc_finishedActivitiesComboBox.gridy = 5;
		contentPane.add(finishedActivitiesComboBox, gbc_finishedActivitiesComboBox);
		
		JButton finishedActivityBtn = new JButton("Finished Activity Info");
		finishedActivityBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				openActivityInformation(finishedActivitiesComboBox);
			}
		});
		GridBagConstraints gbc_finishedActivityBtn = new GridBagConstraints();
		gbc_finishedActivityBtn.insets = new Insets(0, 0, 5, 5);
		gbc_finishedActivityBtn.gridx = 3;
		gbc_finishedActivityBtn.gridy = 7;
		contentPane.add(finishedActivityBtn, gbc_finishedActivityBtn);
		
		JButton btnLogUd = new JButton("Log out");
		btnLogUd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				self.dispose();
				main.showLogin();
			}
		});
		
		// Mikkel
		GridBagConstraints gbc_btnLogUd = new GridBagConstraints();
		gbc_btnLogUd.anchor = GridBagConstraints.WEST;
		gbc_btnLogUd.gridheight = 2;
		gbc_btnLogUd.insets = new Insets(0, 0, 0, 5);
		gbc_btnLogUd.gridx = 0;
		gbc_btnLogUd.gridy = 9;
		contentPane.add(btnLogUd, gbc_btnLogUd);
		
		reloadProjectActivityCombobox();
	}
	
	
	public void loadGenActCombobox() {
		for (GeneralActivity ga : generalActivities) {
			comboBoxgenAct.addItem(ga.getTitle());	
			System.out.println(ga.getTitle());
		}
		
		
	}
	
	public void reloadGenActCombo(Employee employee) {
		//Reload of the list of general activitites
		comboBoxgenAct.removeAllItems();
		this.employee = employee;
		System.out.println("her tak " + employee.getGeneralActivities() != null);
		generalActivities = employee.getGeneralActivities();
		for (GeneralActivity ga : generalActivities) {
			comboBoxgenAct.addItem(ga.getTitle());	
			System.out.println(ga.getTitle());
		}
	}


	//Helena
	public void updateProjectsCombo() {
		updating = true;
		List<Project> projects = softwarehuset.getProjects();
		projectComboBox.removeAllItems();
		for (Project p : projects) {
			projectComboBox.addItem(p.getId() + " - " + p.getTitle());
		}
		reloadProjectActivityCombobox();
		updating = false;
	}

	// Mikkel
	public void reloadProjectActivityCombobox() {
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
	private void openActivityInformation(JComboBox<String> chosenComboBox) {
		ProjectActivity projectActivity = getSelectedActivity(chosenComboBox);
		ActivityInformation ai = new ActivityInformation(self, projectActivity);
		ai.setVisible(true);
		self.setVisible(false);
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
	private ProjectActivity getSelectedActivity(JComboBox<String> comboBox) {
		String selectedActivity = (String)comboBox.getSelectedItem();
		Project p = getSelectedProject();
		ProjectActivity pa = p.getProjectActivityWithTitle(selectedActivity);
		return pa;
	}

	// Mikkel
	// Makes sure it's not possible for employees who are not projectLeader on the selected project to add activities.
	private void showCreateProjectActivityButtonIfProjectLeader(String projectLeader, String loggedInEmployee) {
		if (projectLeader.equals(loggedInEmployee))  {
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
	
	// Mikkel
	public void showLoggedIn() {
		self.setVisible(true);
	}
}
