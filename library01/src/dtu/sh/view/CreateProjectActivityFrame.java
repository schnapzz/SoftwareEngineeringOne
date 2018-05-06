package dtu.sh.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dtu.sh.Exceptions.IllegalWeekNumberFormatException;
import dtu.sh.Exceptions.OperationNotAllowedException;
import dtu.sh.model.Employee;
import dtu.sh.model.Project;
import dtu.sh.model.ProjectActivity;
import dtu.sh.model.SH;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

// Mikkel
public class CreateProjectActivityFrame extends JFrame {

	private CreateProjectActivityFrame self;
	
	private JPanel contentPane;
	private JLabel lblTitle;
	private JLabel lblStartWeek;
	private JLabel lblEndWeek;
	private JTextField textFieldTitle;
	private JTextPane textPaneDescription;
	private JTextField textFieldStartWeek;
	private JTextField textFieldEndWeek;
	private JLabel lblPriority;
	private JComboBox<String> comboBoxPriority;
	private JLabel lblAddEmployees;
	private JTextField textFieldCSVEmployees;

	/**
	 * Create the frame.
	 * Mikkel
	 */
	public CreateProjectActivityFrame(LoggedIn loginFrame, Project project, SH softwarehuset) {
		
		this.self = this;
		
		this.addWindowListener(new WindowAdapter()
		{
		    public void windowClosing(WindowEvent e)
		    {
		    		loginFrame.showLoggedIn();
		    }
		});
		
		
		setTitle("Create A New Project Activity");
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{134, 300, 6, 0};
		gbl_contentPane.rowHeights = new int[]{16, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		lblTitle = new JLabel("*Title:");
		GridBagConstraints titleLabel = new GridBagConstraints();
		titleLabel.anchor = GridBagConstraints.EAST;
		titleLabel.insets = new Insets(0, 0, 5, 5);
		titleLabel.gridx = 0;
		titleLabel.gridy = 1;
		contentPane.add(lblTitle, titleLabel);
		
		textFieldTitle = new JTextField();
		GridBagConstraints gbc_textFieldTitle = new GridBagConstraints();
		gbc_textFieldTitle.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldTitle.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldTitle.gridx = 1;
		gbc_textFieldTitle.gridy = 1;
		contentPane.add(textFieldTitle, gbc_textFieldTitle);
		textFieldTitle.setColumns(10);
		
		lblPriority = new JLabel("Priority");
		GridBagConstraints gbc_lblPriority = new GridBagConstraints();
		gbc_lblPriority.anchor = GridBagConstraints.EAST;
		gbc_lblPriority.insets = new Insets(0, 0, 5, 5);
		gbc_lblPriority.gridx = 0;
		gbc_lblPriority.gridy = 2;
		contentPane.add(lblPriority, gbc_lblPriority);
		
		comboBoxPriority = new JComboBox();
		comboBoxPriority.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBoxPriority.setSelectedIndex(4);
		GridBagConstraints gbc_comboBoxPriority = new GridBagConstraints();
		gbc_comboBoxPriority.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxPriority.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxPriority.gridx = 1;
		gbc_comboBoxPriority.gridy = 2;
		contentPane.add(comboBoxPriority, gbc_comboBoxPriority);
		
		JLabel lblDescription = new JLabel("Description:");
		GridBagConstraints descriptionLabel = new GridBagConstraints();
		descriptionLabel.gridheight = 2;
		descriptionLabel.anchor = GridBagConstraints.EAST;
		descriptionLabel.insets = new Insets(0, 0, 5, 5);
		descriptionLabel.gridx = 0;
		descriptionLabel.gridy = 3;
		contentPane.add(lblDescription, descriptionLabel);
		
		textPaneDescription = new JTextPane();
		GridBagConstraints gbc_textPaneDescription = new GridBagConstraints();
		gbc_textPaneDescription.gridheight = 2;
		gbc_textPaneDescription.insets = new Insets(0, 0, 5, 5);
		gbc_textPaneDescription.fill = GridBagConstraints.BOTH;
		gbc_textPaneDescription.gridx = 1;
		gbc_textPaneDescription.gridy = 3;
		contentPane.add(textPaneDescription, gbc_textPaneDescription);
		
		lblStartWeek = new JLabel("Start Week:");
		GridBagConstraints startLabel = new GridBagConstraints();
		startLabel.anchor = GridBagConstraints.EAST;
		startLabel.insets = new Insets(0, 0, 5, 5);
		startLabel.gridx = 0;
		startLabel.gridy = 5;
		contentPane.add(lblStartWeek, startLabel);
		
		textFieldStartWeek = new JTextField();
		GridBagConstraints gbc_textFieldStartWeek = new GridBagConstraints();
		gbc_textFieldStartWeek.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStartWeek.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStartWeek.gridx = 1;
		gbc_textFieldStartWeek.gridy = 5;
		contentPane.add(textFieldStartWeek, gbc_textFieldStartWeek);
		textFieldStartWeek.setColumns(10);
		
		lblEndWeek = new JLabel("End Week");
		GridBagConstraints endLabel = new GridBagConstraints();
		endLabel.anchor = GridBagConstraints.EAST;
		endLabel.insets = new Insets(0, 0, 5, 5);
		endLabel.gridx = 0;
		endLabel.gridy = 6;
		contentPane.add(lblEndWeek, endLabel);
		
		textFieldEndWeek = new JTextField();
		GridBagConstraints gbc_textFieldEndWeek = new GridBagConstraints();
		gbc_textFieldEndWeek.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldEndWeek.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldEndWeek.gridx = 1;
		gbc_textFieldEndWeek.gridy = 6;
		contentPane.add(textFieldEndWeek, gbc_textFieldEndWeek);
		textFieldEndWeek.setColumns(10);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			
			// Mikkel
			public void actionPerformed(ActionEvent e) {
				
				String[] employeeIds = textFieldCSVEmployees.getText().split(",");
				
				for (String s : employeeIds) {
					System.out.println(s);
				}
				if (isMandatoryFieldsFilled() && isEmployeeCSVCorrectlyFormatted(employeeIds, softwarehuset)) {
					
					try {
						
						String title = textFieldTitle.getText();
						String desc = textPaneDescription.getText();
						int priority = Integer.parseInt((String)comboBoxPriority.getSelectedItem());
						
						if (textFieldStartWeek.getText().isEmpty() && textFieldEndWeek.getText().isEmpty() ) {
							
							project.addActivity(title, desc, priority, softwarehuset.getLoggedInEmployee());
							
						} else {
							
							int startWeek = Integer.parseInt(textFieldStartWeek.getText());
							int endWeek = Integer.parseInt(textFieldEndWeek.getText());
							
							project.addActivity(title, desc, priority, startWeek, endWeek, softwarehuset.getEmployeesFromIds(employeeIds), 
																						  softwarehuset.getLoggedInEmployee());
						}
						
						loginFrame.reloadProjectActivityCombobox();
						
						self.dispose();
						loginFrame.showLoggedIn();
						
					} catch (OperationNotAllowedException e1) {
					
						JOptionPane.showMessageDialog(null, e1.getMessage(), "Error during creation of a project activity", JOptionPane.ERROR_MESSAGE);
						
					} catch (NumberFormatException|IllegalWeekNumberFormatException e2) {
						
						lblStartWeek.setForeground(Color.red);
						lblEndWeek.setForeground(Color.red);
						
					}
					
				}
			}
		});
		
		lblAddEmployees = new JLabel("<html><pre>Add Employees\n(CSV format)</pre></html>");
		GridBagConstraints gbc_lblAddEmployees = new GridBagConstraints();
		gbc_lblAddEmployees.anchor = GridBagConstraints.EAST;
		gbc_lblAddEmployees.insets = new Insets(0, 0, 5, 5);
		gbc_lblAddEmployees.gridx = 0;
		gbc_lblAddEmployees.gridy = 7;
		contentPane.add(lblAddEmployees, gbc_lblAddEmployees);
		
		textFieldCSVEmployees = new JTextField();
		GridBagConstraints gbc_textFieldCSVEmployees = new GridBagConstraints();
		gbc_textFieldCSVEmployees.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldCSVEmployees.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldCSVEmployees.gridx = 1;
		gbc_textFieldCSVEmployees.gridy = 7;
		contentPane.add(textFieldCSVEmployees, gbc_textFieldCSVEmployees);
		textFieldCSVEmployees.setColumns(10);
		GridBagConstraints gbc_btnCreate = new GridBagConstraints();
		gbc_btnCreate.insets = new Insets(0, 0, 0, 5);
		gbc_btnCreate.gridx = 1;
		gbc_btnCreate.gridy = 8;
		contentPane.add(btnCreate, gbc_btnCreate);
	}
	

	// Mikkel
	private boolean isMandatoryFieldsFilled() {
		
		if (textFieldTitle.getText().isEmpty()) {
			lblTitle.setForeground(Color.red);
			return false;
		}
		lblTitle.setForeground(Color.black);
		
		return true;
	}
	
	// Mikkel
	private boolean isEmployeeCSVCorrectlyFormatted(String[] employeeIds, SH softwarehuset) {

		if (softwarehuset.isEmployeeIdsLegalForAssignments(employeeIds)) {
			lblAddEmployees.setForeground(Color.black);
			return true;
		}
		lblAddEmployees.setForeground(Color.red);
		return false;
	}
	
}
