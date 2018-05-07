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
import dtu.sh.view.Reports;

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
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
	import javax.swing.SwingConstants;
	import java.awt.Font;

/**
 * Helena
 */
public class Reports extends JFrame {
	private JPanel contentPane;
	private Reports self;
	
	public Reports(Report report) {
		this.self = this;
		setTitle("Report");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 141, 0, 175, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 50, 59, 150, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gridBagLayout); 
		
		JLabel lblFinishedActivities = new JLabel("Finished Activities");
		lblFinishedActivities.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblFinishedActivities = new GridBagConstraints();
		gbc_lblFinishedActivities.insets = new Insets(0, 0, 5, 5);
		gbc_lblFinishedActivities.gridx = 1;
		gbc_lblFinishedActivities.gridy = 2;
		contentPane.add(lblFinishedActivities, gbc_lblFinishedActivities);
		
		JLabel lblUnfinished = new JLabel("Unfinished Activities");
		lblUnfinished.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblUnfinished = new GridBagConstraints();
		gbc_lblUnfinished.insets = new Insets(0, 0, 5, 5);
		gbc_lblUnfinished.gridx = 3;
		gbc_lblUnfinished.gridy = 2;
		contentPane.add(lblUnfinished, gbc_lblUnfinished);
		
		JComboBox<String> comboBox_finishedActivities = new JComboBox<String>();
		GridBagConstraints gbc_comboBox_finishedActivities = new GridBagConstraints();
		
		for(ProjectActivity pa: report.getFinishedActivities()) {
			comboBox_finishedActivities.addItem(pa.getTitle());
		}
		gbc_comboBox_finishedActivities.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_finishedActivities.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_finishedActivities.gridx = 1;
		gbc_comboBox_finishedActivities.gridy = 3;
		contentPane.add(comboBox_finishedActivities, gbc_comboBox_finishedActivities);
		
		JComboBox<String> comboBox_unfinishedActivities = new JComboBox<String>();
		GridBagConstraints gbc_comboBox_unfinishedActivities = new GridBagConstraints();
		
		for(ProjectActivity pa : report.getUnFinishedActivities()) {
			comboBox_unfinishedActivities.addItem(pa.getTitle());
		}
		
		gbc_comboBox_unfinishedActivities.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_unfinishedActivities.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_unfinishedActivities.gridx = 3;
		gbc_comboBox_unfinishedActivities.gridy = 3;
		contentPane.add(comboBox_unfinishedActivities, gbc_comboBox_unfinishedActivities);
	}

}
