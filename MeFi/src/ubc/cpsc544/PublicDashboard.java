package ubc.cpsc544;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import org.jfree.chart.ChartPanel;

public class PublicDashboard {

	private JFrame frame;
	private JTextField txtUsername;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
//		    UIManager.setLookAndFeel("com.seaglasslookandfeel.SeaGlassLookAndFeel");
//			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		    UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PublicDashboard window = new PublicDashboard();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PublicDashboard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1024, 768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setText("username");
		txtUsername.setBounds(716, 11, 86, 20);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setText("password");
		txtPassword.setBounds(812, 11, 86, 20);
		frame.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PrivateDashboard privateDashboard = new PrivateDashboard();
				privateDashboard.getFrame().setVisible(true);
			}
		});
		btnNewButton.setBounds(908, 10, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblForgotPassword = new JLabel("Forgot Password");
		lblForgotPassword.setForeground(Color.BLUE);
		lblForgotPassword.setBounds(895, 44, 102, 14);
		frame.getContentPane().add(lblForgotPassword);
		
		JPanel panel_MainChartPanel = new JPanel();
		panel_MainChartPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_MainChartPanel.setBackground(Color.WHITE);
		panel_MainChartPanel.setBounds(194, 69, 517, 436);
		frame.getContentPane().add(panel_MainChartPanel);
		panel_MainChartPanel.setLayout(null);
		
//		JLabel label = new JLabel("");
//		label.setBounds(0, 0, 67, 57);
//		label.setIcon(new ImageIcon(PublicDashboard.class.getResource("/ubc/cpsc544/3DBuildingView.png")));
//		panel_MainChartPanel.add(label);
		
		BarChart barChart = new BarChart();
		ChartPanel chartPanel = barChart.getChartPanel();
		chartPanel.setVisible(true);
		chartPanel.setBounds(0, 0, 517, 436);
		panel_MainChartPanel.add(chartPanel);
		
		JPanel panel_Units = new JPanel();
		FlowLayout fl_panel_Units = (FlowLayout) panel_Units.getLayout();
		fl_panel_Units.setAlignment(FlowLayout.LEFT);
		panel_Units.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_Units.setBackground(Color.WHITE);
		panel_Units.setBounds(10, 364, 174, 141);
		frame.getContentPane().add(panel_Units);
		
		JLabel lblUnits = new JLabel("Units");
		lblUnits.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_Units.add(lblUnits);
		
		JRadioButton radioButton = new JRadioButton("Kilo-Watt Hour kWH");
		radioButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		radioButton.setBackground(Color.WHITE);
		radioButton.setSelected(true);
		panel_Units.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Ibs of CO2");
		radioButton_1.setEnabled(false);
		radioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		radioButton_1.setBackground(Color.WHITE);
		panel_Units.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("Dollar Value");
		radioButton_2.setEnabled(false);
		radioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		radioButton_2.setBackground(Color.WHITE);
		panel_Units.add(radioButton_2);
		
		JPanel panel_4 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_4.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(10, 521, 701, 185);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JTextPane txtpnFloors = new JTextPane();
		txtpnFloors.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnFloors.setText("St. John\u2019s College is UBC\u2019s international graduate college. A magnet for international and multicultural exchange, the College offers an academic setting that encourages discussion, debate and cultural expression, all enlivened by the participation of resident graduate students who come from diverse cultural backgrounds.");
		txtpnFloors.setBounds(12, 60, 666, 80);
		panel_4.add(txtpnFloors);
		
		JTextPane txtpnNoFloors = new JTextPane();
		txtpnNoFloors.setFont(new Font("Helvetica", Font.PLAIN, 15));
		txtpnNoFloors.setText("NO. FLOORS  \t-  05\nOCCUPANTS  \t-  120\n\nSt. John\u2019s College is UBC\u2019s international graduate college. A magnet for international\n and multicultural exchange, the College offers an academic setting that encourages \ndiscussion, debate and cultural expression, all enlivened by the participation of \nresident graduate students who come from diverse cultural backgrounds.");
		panel_4.add(txtpnNoFloors);
		
		JTextPane txtpnFloorsOccupants = new JTextPane();
		txtpnFloorsOccupants.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtpnFloorsOccupants.setText("Floors:  05\r\nOccupants:  120\r");
		txtpnFloorsOccupants.setBounds(12, 12, 280, 51);
		panel_4.add(txtpnFloorsOccupants);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(721, 521, 276, 185);
		frame.getContentPane().add(panel_5);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(PublicDashboard.class.getResource("/ubc/cpsc544/weather.png")));
		panel_5.add(label_1);
		
		JLabel lblBulbIcon = new JLabel("");
		lblBulbIcon.setIcon(new ImageIcon(PublicDashboard.class.getResource("/ubc/cpsc544/bulb.png")));
		lblBulbIcon.setBounds(12, 11, 35, 33);
		frame.getContentPane().add(lblBulbIcon);
		
		JLabel lblUbcEnergyDashboard = new JLabel("UBC Energy Dashboard");
		lblUbcEnergyDashboard.setForeground(new Color(0, 128, 0));
		lblUbcEnergyDashboard.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblUbcEnergyDashboard.setBorder(null);
		lblUbcEnergyDashboard.setBounds(49, 15, 229, 29);
		frame.getContentPane().add(lblUbcEnergyDashboard);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 69, 174, 284);
		frame.getContentPane().add(panel);
		panel.setBackground(Color.WHITE);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setLayout(null);
		
		JLabel lblCumulative = new JLabel("Cumulative");
		lblCumulative.setBounds(10, 5, 89, 26);
		lblCumulative.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCumulative.setBorder(null);
		panel.add(lblCumulative);
		
		JLabel lblK = new JLabel("176,000 kWH");
		lblK.setIcon(new ImageIcon(PublicDashboard.class.getResource("/ubc/cpsc544/Electricity.jpg")));
		lblK.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblK.setBorder(null);
		lblK.setBounds(10, 32, 144, 31);
		panel.add(lblK);
		
		JLabel lblCo = new JLabel("20,735 CO2");
		lblCo.setIcon(new ImageIcon(PublicDashboard.class.getResource("/ubc/cpsc544/COs.jpg")));
		lblCo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCo.setBorder(null);
		lblCo.setBounds(10, 67, 144, 31);
		panel.add(lblCo);
		
		JLabel label_2 = new JLabel("3,601.25");
		label_2.setIcon(new ImageIcon(PublicDashboard.class.getResource("/ubc/cpsc544/Dollar_Symbol.gif")));
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBorder(null);
		label_2.setBounds(10, 97, 144, 31);
		panel.add(label_2);
		
		JLabel lblLastMonth = new JLabel("Last month");
		lblLastMonth.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLastMonth.setBorder(null);
		lblLastMonth.setBounds(10, 139, 89, 26);
		panel.add(lblLastMonth);
		
		JLabel lblKwh = new JLabel("166,500 kWH");
		lblKwh.setIcon(new ImageIcon(PublicDashboard.class.getResource("/ubc/cpsc544/Electricity.jpg")));
		lblKwh.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblKwh.setBorder(null);
		lblKwh.setBounds(10, 176, 144, 31);
		panel.add(lblKwh);
		
		JLabel label_4 = new JLabel("5.4%");
		label_4.setForeground(new Color(0, 204, 0));
		label_4.setIcon(new ImageIcon(PublicDashboard.class.getResource("/ubc/cpsc544/DownArrow.png")));
		label_4.setFont(new Font("Tahoma", Font.BOLD, 21));
		label_4.setBorder(null);
		label_4.setBounds(10, 224, 144, 31);
		panel.add(label_4);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 133, 152, 2);
		panel.add(separator);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(723, 71, 274, 434);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JTextPane txtpnIdeas = new JTextPane();
		txtpnIdeas.setBounds(12, 55, 259, 339);
		panel_2.add(txtpnIdeas);
		txtpnIdeas.setEditable(false);
		txtpnIdeas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnIdeas.setBorder(null);
		txtpnIdeas.setMargin(new Insets(30, 30, 30, 30));
		txtpnIdeas.setText("1. Lower your thermostat by 4 - 5 degrees Celsius (7 - 9 degrees Fahrenheit) while you're sleeping at night and when no one is at home. \n\n " +
				"2. Switch to cold when doing your laundry. 85 � 90% of the energy used to wash your clothes is used to heat the water. \n\n " +
				"3. Try setting your dishwasher to start after 7:00 p.m. when off-peak prices begin. ");
		
		JLabel lblTopIdeas = new JLabel("Top Ideas");
		lblTopIdeas.setBounds(12, 13, 112, 29);
		panel_2.add(lblTopIdeas);
		lblTopIdeas.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTopIdeas.setBorder(null);
		
		JLabel lblSt = new JLabel("St. John's College, UBC");
		lblSt.setFont(new Font("Dialog", Font.BOLD, 16));
		lblSt.setBounds(519, 40, 192, 22);
		frame.getContentPane().add(lblSt);
	
		
	}
}
