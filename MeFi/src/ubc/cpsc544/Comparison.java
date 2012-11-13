package ubc.cpsc544;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Insets;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;

public class Comparison {
	
	private JFrame frame;

	/**
	 * Create the frame.
	 */
	public Comparison() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100,  1024, 768);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label_7 = new JLabel("Overview");
		label_7.setOpaque(true);
		label_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PrivateDashboard privateDashboard = new PrivateDashboard();
				privateDashboard.getFrame().setVisible(true);
			}
		});
		label_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		label_7.setBackground(new Color(0, 204, 204));
		label_7.setBounds(222, 40, 86, 29);
		frame.getContentPane().add(label_7);
		
		JLabel lblIdeaCompetition = new JLabel("Idea Competition");
		lblIdeaCompetition.setBackground(new Color(0, 206, 209));
		lblIdeaCompetition.setOpaque(true);
		lblIdeaCompetition.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblIdeaCompetition.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdeaCompetition.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIdeaCompetition.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblIdeaCompetition.setBounds(484, 40, 134, 29);
		frame.getContentPane().add(lblIdeaCompetition);
		
		JLabel label_9 = new JLabel("Comparison");
		label_9.setOpaque(true);
		label_9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_9.setBorder(new LineBorder(new Color(0, 0, 0)));
		label_9.setBackground(Color.ORANGE);
		label_9.setBounds(359, 40, 86, 29);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("UBC Energy Dashboard");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_10.setBorder(new LineBorder(new Color(0, 0, 0)));
		label_10.setBounds(10, 40, 174, 29);
		frame.getContentPane().add(label_10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Comparison.class.getResource("/ubc/cpsc544/user.png")));
		lblNewLabel.setBounds(10, 100, 174, 107);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Apartment", "301", "302", "305"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(40, 219, 122, 27);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Floors", "2", "3", "4"}));
		comboBox_1.setBounds(40, 258, 122, 27);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Building", "St. John's"}));
		comboBox_2.setBounds(40, 297, 122, 27);
		frame.getContentPane().add(comboBox_2);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 349, 174, 141);
		frame.getContentPane().add(panel);
		
		JLabel label = new JLabel("Units:");
		panel.add(label);
		
		JRadioButton radioButton = new JRadioButton("Kilo-Watt Hour kWH");
		radioButton.setSelected(true);
		panel.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Ibs of CO2");
		panel.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("Dollar Value");
		panel.add(radioButton_2);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Comparison.class.getResource("/ubc/cpsc544/List.png")));
		label_1.setBounds(82, 513, 93, 192);
		frame.getContentPane().add(label_1);
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.setBounds(55, 518, 28, 23);
		frame.getContentPane().add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("");
		checkBox_1.setBounds(55, 536, 28, 23);
		frame.getContentPane().add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("");
		checkBox_2.setBounds(55, 553, 28, 23);
		frame.getContentPane().add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("");
		checkBox_3.setBounds(55, 571, 28, 23);
		frame.getContentPane().add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("");
		checkBox_4.setBounds(55, 588, 28, 23);
		frame.getContentPane().add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("");
		checkBox_5.setBounds(55, 606, 28, 23);
		frame.getContentPane().add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("");
		checkBox_6.setBounds(55, 623, 28, 23);
		frame.getContentPane().add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("");
		checkBox_7.setBounds(55, 639, 28, 23);
		frame.getContentPane().add(checkBox_7);
		
		JCheckBox checkBox_8 = new JCheckBox("");
		checkBox_8.setBounds(55, 657, 28, 23);
		frame.getContentPane().add(checkBox_8);
		
		JCheckBox checkBox_9 = new JCheckBox("");
		checkBox_9.setBounds(55, 674, 28, 23);
		frame.getContentPane().add(checkBox_9);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Comparison.class.getResource("/ubc/cpsc544/Chart.png")));
		lblNewLabel_1.setBounds(247, 505, 350, 231);
		frame.getContentPane().add(lblNewLabel_1);
		
		JCheckBox chckbxDaily = new JCheckBox("Daily");
		chckbxDaily.setBounds(633, 539, 128, 23);
		frame.getContentPane().add(chckbxDaily);
		
		JCheckBox chckbxWeekly = new JCheckBox("Weekly");
		chckbxWeekly.setBounds(633, 571, 128, 23);
		frame.getContentPane().add(chckbxWeekly);
		
		JLabel lblCustomDurastion = new JLabel("Custom Durastion");
		lblCustomDurastion.setBounds(638, 513, 123, 16);
		frame.getContentPane().add(lblCustomDurastion);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(247, 100, 514, 387);
		frame.getContentPane().add(panel_1);
		
		final JButton btnNewButton = new JButton("Add\n");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		btnNewButton.setBounds(883, 121, 75, 29);
		frame.getContentPane().add(btnNewButton);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Comparison.class.getResource("/ubc/cpsc544/userlist.png")));
		label_2.setBounds(801, 100, 164, 326);
		frame.getContentPane().add(label_2);

		
	}
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
