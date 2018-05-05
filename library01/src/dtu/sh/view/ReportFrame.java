package dtu.sh.view;

import java.awt.EventQueue;

import javax.swing.JFrame;

import dtu.sh.model.ProjectActivity;
import dtu.sh.model.Report;
import java.awt.GridBagLayout;
import javax.swing.JComboBox;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import java.awt.Font;

public class ReportFrame {

	private JFrame frame;

	

	/**
	 * Create the application.
	 */
	public ReportFrame(Report r) {
		initialize(r);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Report report) {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 141, 0, 175, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 147, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblFinishedActivities = new JLabel("Finished Activities");
		lblFinishedActivities.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblFinishedActivities = new GridBagConstraints();
		gbc_lblFinishedActivities.insets = new Insets(0, 0, 5, 5);
		gbc_lblFinishedActivities.gridx = 1;
		gbc_lblFinishedActivities.gridy = 2;
		frame.getContentPane().add(lblFinishedActivities, gbc_lblFinishedActivities);
		
		JLabel lblUnfinished = new JLabel("Unfinished Activities");
		lblUnfinished.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblUnfinished = new GridBagConstraints();
		gbc_lblUnfinished.insets = new Insets(0, 0, 5, 5);
		gbc_lblUnfinished.gridx = 3;
		gbc_lblUnfinished.gridy = 2;
		frame.getContentPane().add(lblUnfinished, gbc_lblUnfinished);
		
		JComboBox<String> comboBox_finishedActivities = new JComboBox<String>();
		GridBagConstraints gbc_comboBox_finishedActivities = new GridBagConstraints();
		if (!report.getFinishedActivities().equals(null)) {
			for(ProjectActivity pa: report.getFinishedActivities()) {
				comboBox_finishedActivities.addItem(pa.getTitle());
			}
		}
		
		gbc_comboBox_finishedActivities.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_finishedActivities.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_finishedActivities.gridx = 1;
		gbc_comboBox_finishedActivities.gridy = 3;
		frame.getContentPane().add(comboBox_finishedActivities, gbc_comboBox_finishedActivities);
		
		JComboBox<String> comboBox_unfinishedActivities = new JComboBox<String>();
		GridBagConstraints gbc_comboBox_unfinishedActivities = new GridBagConstraints();
		for(ProjectActivity pa: report.getUnFinishedActivities()) {
			comboBox_unfinishedActivities.addItem(pa.getTitle());
		}
		gbc_comboBox_unfinishedActivities.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_unfinishedActivities.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_unfinishedActivities.gridx = 3;
		gbc_comboBox_unfinishedActivities.gridy = 3;
		frame.getContentPane().add(comboBox_unfinishedActivities, gbc_comboBox_unfinishedActivities);
		
	}

}
