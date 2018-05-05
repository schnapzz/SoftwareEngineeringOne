package dtu.sh.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dtu.sh.model.Activity;
import dtu.sh.model.ProjectActivity;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

// Mikkel
public class ActivityInformation extends JFrame {

	private ActivityInformation self;
	
	private JPanel contentPane;

	/**
	 * Create the frame.
	 * Mikkel
	 */
	public ActivityInformation(LoggedIn loginFrame, Activity activity) {
		
		this.self = this;
		this.addWindowListener(new WindowAdapter()
		{
		    public void windowClosing(WindowEvent e)
		    {
		    		loginFrame.showLoggedIn();
		    }
		});
		
		String title = isProjectActivity(activity) ? "Project Activity Information" : "General Activity Infomation";
		setTitle(title);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 300, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 150, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Title:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblTitle = new JLabel(activity.getTitle());
		GridBagConstraints gbc_lblTitle = new GridBagConstraints();
		gbc_lblTitle.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitle.gridx = 1;
		gbc_lblTitle.gridy = 0;
		contentPane.add(lblTitle, gbc_lblTitle);
		
		JLabel lblType = new JLabel(makeTypeTitle(activity));
		GridBagConstraints gbc_lblType = new GridBagConstraints();
		gbc_lblType.anchor = GridBagConstraints.EAST;
		gbc_lblType.insets = new Insets(0, 0, 5, 5);
		gbc_lblType.gridx = 0;
		gbc_lblType.gridy = 1;
		contentPane.add(lblType, gbc_lblType);
		
		JLabel typeLabel = new JLabel(makeTypeDescription(activity));
		GridBagConstraints gbc_typeLabel = new GridBagConstraints();
		gbc_typeLabel.insets = new Insets(0, 0, 5, 5);
		gbc_typeLabel.gridx = 1;
		gbc_typeLabel.gridy = 1;
		contentPane.add(typeLabel, gbc_typeLabel);
		
		JLabel lblDescription = new JLabel("Description:");
		GridBagConstraints gbc_lblDescription = new GridBagConstraints();
		gbc_lblDescription.anchor = GridBagConstraints.EAST;
		gbc_lblDescription.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescription.gridx = 0;
		gbc_lblDescription.gridy = 2;
		contentPane.add(lblDescription, gbc_lblDescription);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setText(activity.getDescription());
		GridBagConstraints gbc_textPane = new GridBagConstraints();
		gbc_textPane.insets = new Insets(0, 0, 5, 5);
		gbc_textPane.fill = GridBagConstraints.BOTH;
		gbc_textPane.gridx = 1;
		gbc_textPane.gridy = 2;
		contentPane.add(textPane, gbc_textPane);
		
		JLabel lblStartWeek = new JLabel("Start Week:");
		GridBagConstraints gbc_lblStartWeek = new GridBagConstraints();
		gbc_lblStartWeek.anchor = GridBagConstraints.EAST;
		gbc_lblStartWeek.insets = new Insets(0, 0, 5, 5);
		gbc_lblStartWeek.gridx = 0;
		gbc_lblStartWeek.gridy = 3;
		contentPane.add(lblStartWeek, gbc_lblStartWeek);
		
		JLabel startWeekLabel = new JLabel("" + activity.getStartDate());
		GridBagConstraints gbc_startWeekLabel = new GridBagConstraints();
		gbc_startWeekLabel.insets = new Insets(0, 0, 5, 5);
		gbc_startWeekLabel.gridx = 1;
		gbc_startWeekLabel.gridy = 3;
		contentPane.add(startWeekLabel, gbc_startWeekLabel);
		
		JLabel lblEndWeek = new JLabel("End Week:");
		GridBagConstraints gbc_lblEndWeek = new GridBagConstraints();
		gbc_lblEndWeek.anchor = GridBagConstraints.EAST;
		gbc_lblEndWeek.insets = new Insets(0, 0, 5, 5);
		gbc_lblEndWeek.gridx = 0;
		gbc_lblEndWeek.gridy = 4;
		contentPane.add(lblEndWeek, gbc_lblEndWeek);
		
		JLabel endWeekField = new JLabel("" + activity.getEndDate());
		GridBagConstraints gbc_endWeekField = new GridBagConstraints();
		gbc_endWeekField.insets = new Insets(0, 0, 5, 5);
		gbc_endWeekField.gridx = 1;
		gbc_endWeekField.gridy = 4;
		contentPane.add(endWeekField, gbc_endWeekField);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				self.dispose();
				loginFrame.showLoggedIn();
			}
		});
		
		JLabel lblassignednemployees = new JLabel("<html><pre>Assigned\nEmployees</pre></html>");
		GridBagConstraints gbc_lblassignednemployees = new GridBagConstraints();
		gbc_lblassignednemployees.insets = new Insets(0, 0, 5, 5);
		gbc_lblassignednemployees.gridx = 0;
		gbc_lblassignednemployees.gridy = 5;
		contentPane.add(lblassignednemployees, gbc_lblassignednemployees);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 5;
		contentPane.add(scrollPane, gbc_scrollPane);
		
		JTextPane txtpnEmployees = new JTextPane();
		txtpnEmployees.setText(""); // Set employees hours here
		scrollPane.setViewportView(txtpnEmployees);
		GridBagConstraints gbc_btnBack = new GridBagConstraints();
		gbc_btnBack.insets = new Insets(0, 0, 5, 5);
		gbc_btnBack.gridx = 1;
		gbc_btnBack.gridy = 6;
		contentPane.add(btnBack, gbc_btnBack);
		
		JLabel endWeekLabel = new JLabel("");
		GridBagConstraints gbc_endWeekLabel = new GridBagConstraints();
		gbc_endWeekLabel.insets = new Insets(0, 0, 0, 5);
		gbc_endWeekLabel.gridx = 1;
		gbc_endWeekLabel.gridy = 7;
		contentPane.add(endWeekLabel, gbc_endWeekLabel);
		
		
	}
	
	// Mikkel
	private String makeTypeTitle(Activity activity) {
		
		if (activity instanceof ProjectActivity) {
			
			return "Priority:";
			
		} else {
			
			return "Something else";
		}
	}

	// Mikkel
	private String makeTypeDescription(Activity activity) {

		if (isProjectActivity(activity)) {
			
			return "" + ((ProjectActivity)activity).getPriority();
			
		} else {
			
			// This is in case of general activity.
			// Present information here
			return "TEST TEST TEST";
		}
	}
	
	// Mikkel
	private boolean isProjectActivity(Activity activity) {
		return activity instanceof ProjectActivity;
	}
}
