package ubc.cpsc544;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;

public class PublicDashboard {

	private JFrame frame;
	private JTextField txtUsername;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
		    UIManager.setLookAndFeel("com.seaglasslookandfeel.SeaGlassLookAndFeel");
//		    UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(194, 69, 517, 436);
		frame.getContentPane().add(panel_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(PublicDashboard.class.getResource("/ubc/cpsc544/3DBuildingView.png")));
		panel_1.add(label);
		
		JPanel panel_3 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_3.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(10, 364, 174, 141);
		frame.getContentPane().add(panel_3);
		
		JLabel label_5 = new JLabel("Units:");
		panel_3.add(label_5);
		
		JRadioButton radioButton = new JRadioButton("Kilo-Watt Hour kWH");
		radioButton.setSelected(true);
		panel_3.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Ibs of CO2");
		panel_3.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("Dollar Value");
		panel_3.add(radioButton_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(10, 521, 701, 185);
		frame.getContentPane().add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(721, 525, 276, 181);
		frame.getContentPane().add(panel_5);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(PublicDashboard.class.getResource("/ubc/cpsc544/weather.png")));
		panel_5.add(label_1);
		
		JLabel lblTopIdeas = new JLabel("Top Ideas");
		lblTopIdeas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTopIdeas.setBounds(721, 69, 112, 29);
		lblTopIdeas.setBorder(new LineBorder(new Color(0, 0, 0)));
		frame.getContentPane().add(lblTopIdeas);
		
		JLabel lblBulbIcon = new JLabel("");
		lblBulbIcon.setIcon(new ImageIcon(PublicDashboard.class.getResource("/ubc/cpsc544/bulb.png")));
		lblBulbIcon.setBounds(12, 11, 35, 33);
		frame.getContentPane().add(lblBulbIcon);
		
		JLabel lblUbcEnergyDashboard = new JLabel("UBC Energy Dashboard");
		lblUbcEnergyDashboard.setForeground(new Color(0, 128, 0));
		lblUbcEnergyDashboard.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUbcEnergyDashboard.setBorder(null);
		lblUbcEnergyDashboard.setBounds(49, 15, 174, 29);
		frame.getContentPane().add(lblUbcEnergyDashboard);
		
		JTextPane txtpnIdeas = new JTextPane();
		txtpnIdeas.setEditable(false);
		txtpnIdeas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnIdeas.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtpnIdeas.setMargin(new Insets(30, 30, 30, 30));
		txtpnIdeas.setText("1. Lower your thermostat by 4 - 5 degrees Celsius (7 - 9 degrees Fahrenheit) while you're sleeping at night and when no one is at home. \n\n " +
				"2. Switch to cold when doing your laundry. 85 – 90% of the energy used to wash your clothes is used to heat the water. \n\n " +
				"3. Try setting your dishwasher to start after 7:00 p.m. when off-peak prices begin. ");
		txtpnIdeas.setBounds(721, 108, 276, 397);
		frame.getContentPane().add(txtpnIdeas);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 69, 174, 284);
		frame.getContentPane().add(panel);
		panel.setBackground(Color.WHITE);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setLayout(null);
		
		JLabel lblCumulative = new JLabel("Cumulative");
		lblCumulative.setBounds(10, 5, 89, 26);
		lblCumulative.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCumulative.setBorder(null);
		panel.add(lblCumulative);
		
		JLabel lblK = new JLabel("176,000 kWH");
		lblK.setIcon(new ImageIcon(PublicDashboard.class.getResource("/ubc/cpsc544/Electricity.jpg")));
		lblK.setFont(new Font("Tahoma", Font.PLAIN, 14));
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
		
		JLabel label_3 = new JLabel("176,000 kWH");
		label_3.setIcon(new ImageIcon(PublicDashboard.class.getResource("/ubc/cpsc544/Electricity.jpg")));
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_3.setBorder(null);
		label_3.setBounds(10, 176, 144, 31);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("5.4%");
		label_4.setForeground(new Color(0, 204, 0));
		label_4.setIcon(new ImageIcon(PublicDashboard.class.getResource("/ubc/cpsc544/DownArrow.png")));
		label_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_4.setBorder(null);
		label_4.setBounds(10, 224, 144, 31);
		panel.add(label_4);
	
		
	}
}
