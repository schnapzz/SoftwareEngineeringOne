package dtu.sh.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dtu.sh.model.Project;
import dtu.sh.model.ProjectActivity;
import dtu.sh.model.Report;
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
import javax.swing.SwingConstants;
import java.awt.Font;

/*
 * Helena
 */

public class Projects extends JFrame{
	private JFrame frame;
	private JPanel contentPane;
	private List<Project> projects;
	private SH sh;
	private String username;
	
	private JComboBox<String> comboBox_Projects;
	private JTextField txtProjectLeaderID;
	private JTextField txtStart;
	private JTextField txtEnd;
	private JTextField txtAddTitle;
	private JTextField txtAddStart;
	private JTextField txtAddEnd;
	private Boolean updating = false;
	
	public Projects(SH sh, String username) {
		setTitle("Project Management");
		this.sh = sh;
		this.username = username;
		projects = sh.getProjects();
//		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		setBounds(100, 100, 650, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{120, 106, 101, 91, 79, 120};
		gbl_contentPane.rowHeights = new int[]{40, 24, 141, 48, 23, 77, 40};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		//"Projects" label
		JLabel lblProjects = new JLabel("Projects:");
		lblProjects.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblProjects.setVerticalAlignment(SwingConstants.BOTTOM);
		GridBagConstraints gbc_lblProjects = new GridBagConstraints();
		gbc_lblProjects.anchor = GridBagConstraints.SOUTH;
		gbc_lblProjects.insets = new Insets(0, 0, 5, 5);
		gbc_lblProjects.gridx = 0;
		gbc_lblProjects.gridy = 0;
		contentPane.add(lblProjects, gbc_lblProjects);
		
		//"Projects" label
		JLabel lblProjectleader = new JLabel("Leader");
		lblProjectleader.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblProjectleader.setVerticalAlignment(SwingConstants.BOTTOM);
		GridBagConstraints gbc_lblProjectleader = new GridBagConstraints();
		gbc_lblProjectleader.anchor = GridBagConstraints.SOUTH;
		gbc_lblProjectleader.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblProjectleader.insets = new Insets(0, 0, 5, 5);
		gbc_lblProjectleader.gridx = 1;
		gbc_lblProjectleader.gridy = 0;
		contentPane.add(lblProjectleader, gbc_lblProjectleader);
		
		//"Projects" label
		JLabel lblProjectStart = new JLabel("Start");
		lblProjectStart.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblProjectStart.setVerticalAlignment(SwingConstants.BOTTOM);
		GridBagConstraints gbc_lblProjectStart = new GridBagConstraints();
		gbc_lblProjectStart.anchor = GridBagConstraints.SOUTH;
		gbc_lblProjectStart.insets = new Insets(0, 0, 5, 5);
		gbc_lblProjectStart.gridx = 2;
		gbc_lblProjectStart.gridy = 0;
		contentPane.add(lblProjectStart, gbc_lblProjectStart);
		
		//"Projects" label
		JLabel lblProjectEnd = new JLabel("End");
		lblProjectEnd.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblProjectEnd.setVerticalAlignment(SwingConstants.BOTTOM);
		GridBagConstraints gbc_lblProjectEnd = new GridBagConstraints();
		gbc_lblProjectEnd.anchor = GridBagConstraints.SOUTH;
		gbc_lblProjectEnd.insets = new Insets(0, 0, 5, 5);
		gbc_lblProjectEnd.gridx = 3;
		gbc_lblProjectEnd.gridy = 0;
		contentPane.add(lblProjectEnd, gbc_lblProjectEnd);
		
		//Combobox for all the projects 
		comboBox_Projects = new JComboBox();
		comboBox_Projects.setFont(new Font("Tahoma", Font.PLAIN, 16));
		updateComboBox();
		GridBagConstraints gbc_comboBox_Projects = new GridBagConstraints();
		gbc_comboBox_Projects.anchor = GridBagConstraints.NORTH;
		gbc_comboBox_Projects.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_Projects.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_Projects.gridx = 0;
		gbc_comboBox_Projects.gridy = 1;
		contentPane.add(comboBox_Projects, gbc_comboBox_Projects);
		
		
		//Textfield for the ID of the project leader
		txtProjectLeaderID = new JTextField();
		txtProjectLeaderID.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtProjectLeaderID.setBounds(7,4,10,10);
		txtProjectLeaderID.setText(sh.getProjectFromTitle(comboBox_Projects.getItemAt(0) + "").getProjectLeader() + "");
		GridBagConstraints gbc_txtProjectLeaderID = new GridBagConstraints();
		gbc_txtProjectLeaderID.anchor = GridBagConstraints.NORTH;
		gbc_txtProjectLeaderID.insets = new Insets(0, 0, 5, 5);
		gbc_txtProjectLeaderID.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtProjectLeaderID.gridx = 1;
		gbc_txtProjectLeaderID.gridy = 1;
		contentPane.add(txtProjectLeaderID, gbc_txtProjectLeaderID);
		txtProjectLeaderID.setColumns(10);
		
		
		//Textfield for the start date of the project
		txtStart = new JTextField();
		txtStart.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtStart.setHorizontalAlignment(SwingConstants.RIGHT);
		txtStart.setBounds(7,4,10,10);
		txtStart.setText(sh.getProjectFromTitle(comboBox_Projects.getItemAt(0) + "").getStart() + "");
		GridBagConstraints gbc_txtNewStart = new GridBagConstraints();
		gbc_txtNewStart.anchor = GridBagConstraints.NORTH;
		gbc_txtNewStart.insets = new Insets(0, 0, 5, 5);
		gbc_txtNewStart.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNewStart.gridx = 2;
		gbc_txtNewStart.gridy = 1;
		contentPane.add(txtStart, gbc_txtNewStart);
		txtStart.setColumns(10);
		
		
		//Textfield for the end date of the project
		txtEnd = new JTextField();
		txtEnd.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtEnd.setHorizontalAlignment(SwingConstants.RIGHT);
		txtEnd.setBounds(7,4,10,10);
		txtEnd.setText(sh.getProjectFromTitle(comboBox_Projects.getItemAt(0) + "").getEnd() + "");
		GridBagConstraints gbc_txtEnd = new GridBagConstraints();
		gbc_txtEnd.anchor = GridBagConstraints.NORTH;
		gbc_txtEnd.insets = new Insets(0, 0, 5, 5);
		gbc_txtEnd.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEnd.gridx = 3;
		gbc_txtEnd.gridy = 1;
		contentPane.add(txtEnd, gbc_txtEnd);
		txtEnd.setColumns(10);

		
		//Get Info button
//		JButton btnGetInfo = new JButton("Get Info");
//		btnGetInfo.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				txtProjectLeaderID.setText(sh.getProjectFromTitle(comboBox_Projects.getItemAt(comboBox_Projects.getSelectedIndex()) + "").getProjectLeader() + "");
//				txtStart.setText(sh.getProjectFromTitle(comboBox_Projects.getItemAt(comboBox_Projects.getSelectedIndex()) + "").getStart() + "");
//				txtEnd.setText(sh.getProjectFromTitle(comboBox_Projects.getItemAt(comboBox_Projects.getSelectedIndex()) + "").getEnd() + "");
//			}
//		});
//		GridBagConstraints gbc_btnGetInfo = new GridBagConstraints();
//		gbc_btnGetInfo.insets = new Insets(0, 0, 0, 5);
//		gbc_btnGetInfo.gridx = 0;
//		gbc_btnGetInfo.gridy = 2;
//		contentPane.add(btnGetInfo, gbc_btnGetInfo);
		
		
		//Update Info button
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnUpdate.setHorizontalAlignment(SwingConstants.LEADING);
		btnUpdate.setVerticalAlignment(SwingConstants.TOP);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String newID = txtProjectLeaderID.getText();
					int newS = Integer.parseInt(txtStart.getText());
					int newE = Integer.parseInt(txtEnd.getText());
					if (sh.isEmployed(newID)) {
						sh.getProjectFromTitle(comboBox_Projects.getItemAt(comboBox_Projects.getSelectedIndex()) + "").setProjectLeader(newID);
					}
					if (newS >= 0 && newS <= 52) {
						sh.getProjectFromTitle(comboBox_Projects.getItemAt(comboBox_Projects.getSelectedIndex()) + "").setStartDate(newS);
					}
					if (newE >= 0 && newE <= 52) {
						sh.getProjectFromTitle(comboBox_Projects.getItemAt(comboBox_Projects.getSelectedIndex()) + "").setEndDate(newE);
					}
				} catch (Exception error) {
					
				}
			}
		});
		GridBagConstraints gbc_btnProjects = new GridBagConstraints();
		gbc_btnProjects.anchor = GridBagConstraints.NORTH;
		gbc_btnProjects.insets = new Insets(0, 0, 5, 5);
		gbc_btnProjects.gridx = 2;
		gbc_btnProjects.gridy = 2;
		contentPane.add(btnUpdate, gbc_btnProjects);
		
		/*
		 * Stuff for Registering a project 
		 */
		
		JLabel lblAddAProject = new JLabel("Add a Project");
		lblAddAProject.setFont(new Font("Tahoma", Font.BOLD, 25));
		GridBagConstraints gbc_lblAddAProject = new GridBagConstraints();
		gbc_lblAddAProject.gridwidth = 3;
		gbc_lblAddAProject.anchor = GridBagConstraints.SOUTH;
		gbc_lblAddAProject.insets = new Insets(0, 0, 5, 5);
		gbc_lblAddAProject.gridx = 1;
		gbc_lblAddAProject.gridy = 3;
		contentPane.add(lblAddAProject, gbc_lblAddAProject);
		//"Title" label
		JLabel lblAddTitle = new JLabel("Title");
		lblAddTitle.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblAddTitle = new GridBagConstraints();
		gbc_lblAddTitle.anchor = GridBagConstraints.SOUTH;
		gbc_lblAddTitle.insets = new Insets(0, 0, 5, 5);
		gbc_lblAddTitle.gridx = 1;
		gbc_lblAddTitle.gridy = 4;
		contentPane.add(lblAddTitle, gbc_lblAddTitle);
		
		//"Start" label
		JLabel lblAddStart = new JLabel("Start");
		lblAddStart.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblAddStart = new GridBagConstraints();
		gbc_lblAddStart.anchor = GridBagConstraints.SOUTH;
		gbc_lblAddStart.insets = new Insets(0, 0, 5, 5);
		gbc_lblAddStart.gridx = 2;
		gbc_lblAddStart.gridy = 4;
		contentPane.add(lblAddStart, gbc_lblAddStart);
		
		//"End" label
		JLabel lblAddEnd = new JLabel("End");
		lblAddEnd.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblAddEnd = new GridBagConstraints();
		gbc_lblAddEnd.anchor = GridBagConstraints.SOUTH;
		gbc_lblAddEnd.insets = new Insets(0, 0, 5, 5);
		gbc_lblAddEnd.gridx = 3;
		gbc_lblAddEnd.gridy = 4;
		contentPane.add(lblAddEnd, gbc_lblAddEnd);
		
		
		//TxtField for entering title
		JTextField txtAddTitle = new JTextField();
		txtAddTitle.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtAddTitle.setBounds(7,4,10,10);
		GridBagConstraints gbc_txtAddTitle = new GridBagConstraints();
		gbc_txtAddTitle.anchor = GridBagConstraints.NORTH;
		gbc_txtAddTitle.insets = new Insets(0, 0, 0, 5);
		gbc_txtAddTitle.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAddTitle.gridx = 1;
		gbc_txtAddTitle.gridy = 5;
		contentPane.add(txtAddTitle, gbc_txtAddTitle);
		txtAddTitle.setColumns(10);
		
		//TxtField for entering start
		txtAddStart = new JTextField();
		txtAddStart.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtAddStart.setBounds(7,4,10,10);
		GridBagConstraints gbc_txtAddStart = new GridBagConstraints();
		gbc_txtAddStart.anchor = GridBagConstraints.NORTH;
		gbc_txtAddStart.insets = new Insets(0, 0, 0, 5);
		gbc_txtAddStart.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAddStart.gridx = 2;
		gbc_txtAddStart.gridy = 5;
		contentPane.add(txtAddStart, gbc_txtAddStart);
		txtAddStart.setColumns(10);
		
		//TxtField for entering end
		txtAddEnd = new JTextField();
		txtAddEnd.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtAddEnd.setBounds(7,4,10,10);
		GridBagConstraints gbc_txtAddEnd = new GridBagConstraints();
		gbc_txtAddEnd.anchor = GridBagConstraints.NORTH;
		gbc_txtAddEnd.insets = new Insets(0, 0, 0, 5);
		gbc_txtAddEnd.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAddEnd.gridx = 3;
		gbc_txtAddEnd.gridy = 5;
		contentPane.add(txtAddEnd, gbc_txtAddEnd);
		txtAddEnd.setColumns(10);
		GridBagConstraints gbc_btnAddProject = new GridBagConstraints();
		gbc_btnAddProject.anchor = GridBagConstraints.NORTH;
		gbc_btnAddProject.gridx = 4;
		gbc_btnAddProject.gridy = 5;
		
		
		JButton btnAddProject = new JButton("Add Project");
		btnAddProject.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAddProject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					System.out.println("Test");
					String addT = txtAddTitle.getText();
					int addS = 0;
					int addE = 0;
					if (txtAddStart.getText().isEmpty() && txtAddEnd.getText().isEmpty() && !txtAddTitle.getText().isEmpty()) {
						sh.createProject(addT);
					} 
					if (!txtAddStart.getText().isEmpty() && !txtAddEnd.getText().isEmpty()) {
						addS = Integer.parseInt(txtAddStart.getText());
						addE = Integer.parseInt(txtAddEnd.getText());
						if ((addS <= 52 && addS >= 1) && (addE <= 52 && addE >= 1)) {
							sh.createProjectWithStartAndEnd(addT, addS, addE);
						}
					}
					updateScene();
					updateComboBox();
				} catch (Exception error) {
					System.out.println(error);
				}
				
			}
		});
		contentPane.add(btnAddProject, gbc_btnAddProject);
		
		comboBox_Projects.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateScene();
			}
		});
		/*
		 * Stuff for Getting a report
		 */
		JButton btnRepport = new JButton("Report");
		btnRepport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Project p = sh.getProjectFromTitle(comboBox_Projects.getItemAt(comboBox_Projects.getSelectedIndex()) + "");
					Report r = sh.requestReport(p, username);
					Reports reports = new Reports(r);
					reports.setVisible(true);
				} catch (Exception e) {
					System.out.println("You are not the project leader, " + username);
				}
			}
		});
		btnRepport.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_btnRepport = new GridBagConstraints();
		gbc_btnRepport.anchor = GridBagConstraints.NORTH;
		gbc_btnRepport.insets = new Insets(0, 0, 5, 0);
		gbc_btnRepport.gridx = 4;
		gbc_btnRepport.gridy = 2;
		contentPane.add(btnRepport, gbc_btnRepport);
		
	}
	public void updateScene() {
		if (!updating) {
			Project p = sh.getProjectFromTitle(comboBox_Projects.getItemAt(comboBox_Projects.getSelectedIndex()) + "");
			txtProjectLeaderID.setText(p.getProjectLeader());
			txtStart.setText(p.getStart() + "");
			txtEnd.setText(p.getEnd() + "");
		}
		
	}
	
	public void updateComboBox() {
		updating = true;
		comboBox_Projects.removeAllItems();
		projects = sh.getProjects();
		for (Project p:projects) {
			System.out.println(p.getTitle());
			comboBox_Projects.addItem(p.getTitle());
		}
		updating = false;
	}
	

}
