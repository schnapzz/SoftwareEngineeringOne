package dtu.sh.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

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


public class Projects extends JFrame{
	private JFrame frame;
	private JPanel contentPane;
	private List<Project> projects;
	
	public Projects(SH sh) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 377);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{120, 90, 90, 90, 90, 120};
		gbl_contentPane.rowHeights = new int[]{40, 40, 40, 40, 40, 40, 40};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		//"Projects" label
		JLabel lblProjects = new JLabel("Projects:");
		GridBagConstraints gbc_lblProjects = new GridBagConstraints();
		gbc_lblProjects.insets = new Insets(0, 0, 5, 0);
		gbc_lblProjects.gridx = 0;
		gbc_lblProjects.gridy = 0;
		contentPane.add(lblProjects, gbc_lblProjects);
		
		//"Projects" label
		JLabel lblProjectleader = new JLabel("Projectleader");
		GridBagConstraints gbc_lblProjectleader = new GridBagConstraints();
		gbc_lblProjectleader.insets = new Insets(0, 0, 5, 0);
		gbc_lblProjectleader.gridx = 1;
		gbc_lblProjectleader.gridy = 0;
		contentPane.add(lblProjectleader, gbc_lblProjectleader);
		
		//"Projects" label
		JLabel lblProjectStart = new JLabel("Start");
		GridBagConstraints gbc_lblProjectStart = new GridBagConstraints();
		gbc_lblProjectStart.insets = new Insets(0, 0, 5, 0);
		gbc_lblProjectStart.gridx = 2;
		gbc_lblProjectStart.gridy = 0;
		contentPane.add(lblProjectStart, gbc_lblProjectStart);
		
		//"Projects" label
		JLabel lblProjectEnd = new JLabel("End");
		GridBagConstraints gbc_lblProjectEnd = new GridBagConstraints();
		gbc_lblProjectEnd.insets = new Insets(0, 0, 5, 0);
		gbc_lblProjectEnd.gridx = 3;
		gbc_lblProjectEnd.gridy = 0;
		contentPane.add(lblProjectEnd, gbc_lblProjectEnd);
		
		//Combobox for all the projects in 
		projects = sh.getProjects();
		JComboBox comboBox_Projects= new JComboBox();
		for (Project p:projects) {
			comboBox_Projects.addItem(p.getTitle());
		}
		GridBagConstraints gbc_comboBox_Projects = new GridBagConstraints();
		gbc_comboBox_Projects.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_Projects.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_Projects.gridx = 0;
		gbc_comboBox_Projects.gridy = 1;
		contentPane.add(comboBox_Projects, gbc_comboBox_Projects);
		
		
		//Textfield for the ID of the project leader
		JTextField txtProjectLeaderID = new JTextField();
		txtProjectLeaderID.setBounds(7,4,10,10);
		txtProjectLeaderID.setText(sh.getProjectFromTitle(comboBox_Projects.getItemAt(0) + "").getProjectLeader() + "");	
		GridBagConstraints gbc_txtProjectLeaderID = new GridBagConstraints();
		gbc_txtProjectLeaderID.insets = new Insets(0, 0, 5, 0);
		gbc_txtProjectLeaderID.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtProjectLeaderID.gridx = 1;
		gbc_txtProjectLeaderID.gridy = 1;
		contentPane.add(txtProjectLeaderID, gbc_txtProjectLeaderID);
		txtProjectLeaderID.setColumns(10);
		
		
		//Textfield for the start date of the project
		JTextField txtStart = new JTextField();
		txtStart.setBounds(7,4,10,10);
		txtStart.setText(sh.getProjectFromTitle(comboBox_Projects.getItemAt(0) + "").getStart() + "");	
		txtStart.setPreferredSize(new Dimension(10, 2));
		GridBagConstraints gbc_txtNewStart = new GridBagConstraints();
		gbc_txtNewStart.insets = new Insets(0, 0, 5, 0);
		gbc_txtNewStart.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNewStart.gridx = 2;
		gbc_txtNewStart.gridy = 1;
		contentPane.add(txtStart, gbc_txtNewStart);
		txtStart.setColumns(10);
		
		
		//Textfield for the end date of the project
		JTextField txtEnd = new JTextField();
		txtEnd.setBounds(7,4,10,10);
		txtEnd.setText(sh.getProjectFromTitle(comboBox_Projects.getItemAt(0) + "").getEnd() + "");	
		txtEnd.setPreferredSize(new Dimension(10, 2));
		GridBagConstraints gbc_txtEnd = new GridBagConstraints();
		gbc_txtEnd.insets = new Insets(0, 0, 5, 0);
		gbc_txtEnd.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEnd.gridx = 3;
		gbc_txtEnd.gridy = 1;
		contentPane.add(txtEnd, gbc_txtEnd);
		txtEnd.setColumns(10);
		txtEnd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtEnd.setText("");
			}
		});	

		
		//Get Info button
		JButton btnGetInfo = new JButton("Get Info");
		btnGetInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtProjectLeaderID.setText(sh.getProjectFromTitle(comboBox_Projects.getItemAt(comboBox_Projects.getSelectedIndex()) + "").getProjectLeader() + "");
				txtStart.setText(sh.getProjectFromTitle(comboBox_Projects.getItemAt(comboBox_Projects.getSelectedIndex()) + "").getStart() + "");
				txtEnd.setText(sh.getProjectFromTitle(comboBox_Projects.getItemAt(comboBox_Projects.getSelectedIndex()) + "").getEnd() + "");
			}
		});
		GridBagConstraints gbc_btnGetInfo = new GridBagConstraints();
		gbc_btnGetInfo.insets = new Insets(0, 0, 0, 5);
		gbc_btnGetInfo.gridx = 0;
		gbc_btnGetInfo.gridy = 2;
		contentPane.add(btnGetInfo, gbc_btnGetInfo);
		
		
		//Update Info button
		JButton btnUpdate = new JButton("Update Info");
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
		gbc_btnProjects.insets = new Insets(0, 0, 0, 5);
		gbc_btnProjects.gridx = 2;
		gbc_btnProjects.gridy = 2;
		contentPane.add(btnUpdate, gbc_btnProjects);
		
	}
}
