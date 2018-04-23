package dtu.sh.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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

public class LoggedIn extends JFrame {

	private JPanel contentPane;
	private JTextField txtIminutter;

	public LoggedIn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 377);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] {68, 77, 23, 191, 154, 3};
		gbl_contentPane.rowHeights = new int[] {46, 41, 39, 59, 0, 160, 5};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblRegistrerTimer = new JLabel("Registrer Timer");
		GridBagConstraints gbc_lblRegistrerTimer = new GridBagConstraints();
		gbc_lblRegistrerTimer.insets = new Insets(0, 0, 5, 0);
		gbc_lblRegistrerTimer.gridx = 4;
		gbc_lblRegistrerTimer.gridy = 0;
		contentPane.add(lblRegistrerTimer, gbc_lblRegistrerTimer);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("Paul Fischer");
		comboBox.addItem("Aksel Acne");
		comboBox.addItem("Carsten");
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 2;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 0;
		gbc_comboBox.gridy = 1;
		contentPane.add(comboBox, gbc_comboBox);
		
		JComboBox comboBox_Activity = new JComboBox();
		comboBox_Activity.addItem("Kan ikke stave");
		comboBox_Activity.addItem("Kan ikke regne");
		comboBox_Activity.addItem("Kan ikke lide mennesker");
		GridBagConstraints gbc_comboBox_Activity = new GridBagConstraints();
		gbc_comboBox_Activity.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_Activity.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_Activity.gridx = 3;
		gbc_comboBox_Activity.gridy = 1;
		contentPane.add(comboBox_Activity, gbc_comboBox_Activity);
		
		
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
		
		JButton btnNewButton = new JButton("Tilføj");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnLogUd = new JButton("Log ud");
		btnLogUd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// gå tilbage til log in			
			}
		});
		
		JLabel lblTilfjTimerTil = new JLabel("Tilføj timer til aktivitet");
		GridBagConstraints gbc_lblTilfjTimerTil = new GridBagConstraints();
		gbc_lblTilfjTimerTil.insets = new Insets(0, 0, 5, 0);
		gbc_lblTilfjTimerTil.gridx = 4;
		gbc_lblTilfjTimerTil.gridy = 4;
		contentPane.add(lblTilfjTimerTil, gbc_lblTilfjTimerTil);
		GridBagConstraints gbc_btnLogUd = new GridBagConstraints();
		gbc_btnLogUd.insets = new Insets(0, 0, 0, 5);
		gbc_btnLogUd.gridx = 0;
		gbc_btnLogUd.gridy = 5;
		contentPane.add(btnLogUd, gbc_btnLogUd);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridx = 4;
		gbc_btnNewButton.gridy = 5;
		contentPane.add(btnNewButton, gbc_btnNewButton);
	}

}
