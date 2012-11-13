package ubc.cpsc544;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class PrivateDashboard {

	private JFrame frame;

//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					PrivateDashboard window = new PrivateDashboard();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public PrivateDashboard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1024, 768);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(194, 69, 585, 438);
		frame.getContentPane().add(panel_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(PrivateDashboard.class.getResource("/ubc/cpsc544/3DApartmentView.png")));
		panel_1.add(label);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(10, 69, 174, 141);
		frame.getContentPane().add(panel_3);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(PrivateDashboard.class.getResource("/ubc/cpsc544/user.png")));
		panel_3.add(label_6);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(null);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(10, 521, 346, 185);
		frame.getContentPane().add(panel_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(PrivateDashboard.class.getResource("/ubc/cpsc544/comparison.png")));
		panel_4.add(lblNewLabel);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(721, 525, 276, 181);
		frame.getContentPane().add(panel_5);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(PrivateDashboard.class.getResource("/ubc/cpsc544/weather.png")));
		panel_5.add(label_1);
		
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
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 221, 174, 284);
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
		lblK.setIcon(new ImageIcon(PrivateDashboard.class.getResource("/ubc/cpsc544/Electricity.jpg")));
		lblK.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblK.setBorder(null);
		lblK.setBounds(10, 32, 144, 31);
		panel.add(lblK);
		
		JLabel lblCo = new JLabel("20,735 CO2");
		lblCo.setIcon(new ImageIcon(PrivateDashboard.class.getResource("/ubc/cpsc544/COs.jpg")));
		lblCo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCo.setBorder(null);
		lblCo.setBounds(10, 67, 144, 31);
		panel.add(lblCo);
		
		JLabel label_2 = new JLabel("3,601.25");
		label_2.setIcon(new ImageIcon(PrivateDashboard.class.getResource("/ubc/cpsc544/Dollar_Symbol.gif")));
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
		label_3.setIcon(new ImageIcon(PrivateDashboard.class.getResource("/ubc/cpsc544/Electricity.jpg")));
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_3.setBorder(null);
		label_3.setBounds(10, 176, 144, 31);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("5.4%");
		label_4.setForeground(new Color(0, 204, 0));
		label_4.setIcon(new ImageIcon(PrivateDashboard.class.getResource("/ubc/cpsc544/DownArrow.png")));
		label_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_4.setBorder(null);
		label_4.setBounds(10, 224, 144, 31);
		panel.add(label_4);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 133, 152, 2);
		panel.add(separator);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(379, 521, 310, 185);
		frame.getContentPane().add(panel_2);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(PrivateDashboard.class.getResource("/ubc/cpsc544/chartusage.gif")));
		panel_2.add(label_5);
		
		JLabel lblOverview = new JLabel("Overview");
		lblOverview.setOpaque(true);
		lblOverview.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblOverview.setBackground(Color.ORANGE);
		lblOverview.setHorizontalAlignment(SwingConstants.CENTER);
		lblOverview.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOverview.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblOverview.setBounds(251, 14, 86, 29);
		frame.getContentPane().add(lblOverview);
		
		JLabel lblComparison = new JLabel("Comparison");
		lblComparison.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Comparison comp = new Comparison();
				comp.getFrame().setVisible(true);
				
			}
		});
		lblComparison.setOpaque(true);
		lblComparison.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblComparison.setBackground(new Color(0, 204, 204));
		lblComparison.setHorizontalAlignment(SwingConstants.CENTER);
		lblComparison.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblComparison.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblComparison.setBounds(440, 14, 86, 29);
		frame.getContentPane().add(lblComparison);
		
		JLabel lblIdeas = new JLabel("Idea Competition");
		lblIdeas.setBackground(new Color(51, 204, 204));
		lblIdeas.setOpaque(true);
		lblIdeas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Ideas ideas = new Ideas();
				ideas.getFrame().setVisible(true);
			}
		});
		lblIdeas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblIdeas.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdeas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIdeas.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblIdeas.setBounds(619, 14, 133, 29);
		frame.getContentPane().add(lblIdeas);
		
		JPanel panel_Units = new JPanel();
		FlowLayout fl_panel_Units = (FlowLayout) panel_Units.getLayout();
		fl_panel_Units.setAlignment(FlowLayout.LEFT);
		panel_Units.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_Units.setBackground(Color.WHITE);
		panel_Units.setBounds(791, 69, 174, 141);
		frame.getContentPane().add(panel_Units);
		
		JLabel lblUnits = new JLabel("Units");
		lblUnits.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_Units.add(lblUnits);
		
		final JRadioButton radioButton_1 = new JRadioButton("Ibs of CO2");
		final JRadioButton radioButton = new JRadioButton("Kilo-Watt Hour kWH");
		final JRadioButton radioButton_2 = new JRadioButton("Dollar Value");
		radioButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				radioButton_1.setSelected(false);
				radioButton_2.setSelected(true);
				radioButton.setSelected(false);
			}
		});
	
		radioButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				radioButton_1.setSelected(true);
				radioButton_2.setSelected(false);
				radioButton.setSelected(false);
			}
		});
		
		
		radioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				radioButton_1.setSelected(false);
				radioButton_2.setSelected(false);
				radioButton.setSelected(true);
			}
		});
		radioButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		radioButton.setBackground(Color.WHITE);
		radioButton.setSelected(true);
		panel_Units.add(radioButton);
		
		
		radioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		radioButton_1.setBackground(Color.WHITE);
		panel_Units.add(radioButton_1);
		
		
		radioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		radioButton_2.setBackground(Color.WHITE);
		panel_Units.add(radioButton_2);
	
		
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
