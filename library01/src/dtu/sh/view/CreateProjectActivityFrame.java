package dtu.sh.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dtu.sh.Exceptions.OperationNotAllowedException;
import dtu.sh.model.Employee;
import dtu.sh.model.Project;
import dtu.sh.model.ProjectActivity;
import dtu.sh.model.SH;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreateProjectActivityFrame extends JFrame {

	private JPanel contentPane;
	private JLabel lblTitle;
//	private JLabel lblTitle;
//	private JLabel lblTitle;
	private JTextField textFieldTitle;
	private JTextField textFieldStartWeek;
	private JTextField textFieldEndWeek;

	/**
	 * Create the frame.
	 */
	public CreateProjectActivityFrame(LoggedIn loginFrame, Project project, Employee loggedInEmployee) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{134, 200, 6, 0};
		gbl_contentPane.rowHeights = new int[]{16, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblCreateANew = new JLabel("Create a new Project Activity");
		lblCreateANew.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblCreateANew = new GridBagConstraints();
		gbc_lblCreateANew.gridwidth = 3;
		gbc_lblCreateANew.insets = new Insets(0, 0, 5, 0);
		gbc_lblCreateANew.anchor = GridBagConstraints.NORTH;
		gbc_lblCreateANew.gridx = 0;
		gbc_lblCreateANew.gridy = 0;
		contentPane.add(lblCreateANew, gbc_lblCreateANew);
		
		lblTitle = new JLabel("Title:");
		GridBagConstraints titleLabel = new GridBagConstraints();
		titleLabel.anchor = GridBagConstraints.EAST;
		titleLabel.insets = new Insets(0, 0, 5, 5);
		titleLabel.gridx = 0;
		titleLabel.gridy = 2;
		contentPane.add(lblTitle, titleLabel);
		
		textFieldTitle = new JTextField();
		GridBagConstraints gbc_textFieldTitle = new GridBagConstraints();
		gbc_textFieldTitle.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldTitle.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldTitle.gridx = 1;
		gbc_textFieldTitle.gridy = 2;
		contentPane.add(textFieldTitle, gbc_textFieldTitle);
		textFieldTitle.setColumns(10);
		
		JLabel lblDescription = new JLabel("Description:");
		GridBagConstraints descriptionLabel = new GridBagConstraints();
		descriptionLabel.anchor = GridBagConstraints.EAST;
		descriptionLabel.insets = new Insets(0, 0, 5, 5);
		descriptionLabel.gridx = 0;
		descriptionLabel.gridy = 3;
		contentPane.add(lblDescription, descriptionLabel);
		
		JTextPane textPaneDescription = new JTextPane();
		GridBagConstraints gbc_textPaneDescription = new GridBagConstraints();
		gbc_textPaneDescription.insets = new Insets(0, 0, 5, 5);
		gbc_textPaneDescription.fill = GridBagConstraints.BOTH;
		gbc_textPaneDescription.gridx = 1;
		gbc_textPaneDescription.gridy = 3;
		contentPane.add(textPaneDescription, gbc_textPaneDescription);
		
		JLabel lblStartWeek = new JLabel("Start Week:");
		GridBagConstraints startLabel = new GridBagConstraints();
		startLabel.anchor = GridBagConstraints.EAST;
		startLabel.insets = new Insets(0, 0, 5, 5);
		startLabel.gridx = 0;
		startLabel.gridy = 4;
		contentPane.add(lblStartWeek, startLabel);
		
		textFieldStartWeek = new JTextField();
		GridBagConstraints gbc_textFieldStartWeek = new GridBagConstraints();
		gbc_textFieldStartWeek.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStartWeek.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStartWeek.gridx = 1;
		gbc_textFieldStartWeek.gridy = 4;
		contentPane.add(textFieldStartWeek, gbc_textFieldStartWeek);
		textFieldStartWeek.setColumns(10);
		
		JLabel lblEndWeek = new JLabel("End Week");
		GridBagConstraints endLabel = new GridBagConstraints();
		endLabel.anchor = GridBagConstraints.EAST;
		endLabel.insets = new Insets(0, 0, 5, 5);
		endLabel.gridx = 0;
		endLabel.gridy = 5;
		contentPane.add(lblEndWeek, endLabel);
		
		textFieldEndWeek = new JTextField();
		GridBagConstraints gbc_textFieldEndWeek = new GridBagConstraints();
		gbc_textFieldEndWeek.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldEndWeek.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldEndWeek.gridx = 1;
		gbc_textFieldEndWeek.gridy = 5;
		contentPane.add(textFieldEndWeek, gbc_textFieldEndWeek);
		textFieldEndWeek.setColumns(10);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (isMandatoryFieldsFilled()) {
					
					try {
						
						ProjectActivity activity = createProjectActivity();
						project.addActivity(activity, loggedInEmployee);
						
						
						
					} catch (OperationNotAllowedException e1) {
					
						
					}
					
				} else {
					
					lblTitle.setForeground(Color.red);
				}
			}

			

			
		});
		GridBagConstraints gbc_btnCreate = new GridBagConstraints();
		gbc_btnCreate.insets = new Insets(0, 0, 0, 5);
		gbc_btnCreate.gridx = 1;
		gbc_btnCreate.gridy = 6;
		contentPane.add(btnCreate, gbc_btnCreate);
	}

	private boolean isMandatoryFieldsFilled() {
		
		if (textFieldTitle.getText().isEmpty()) {
			return false;
		}
		
		return true;
	}
	
	protected ProjectActivity createProjectActivity() {
		// TODO Auto-generated method stub
		return null;
	}
}
