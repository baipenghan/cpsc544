package ubc.cpsc544;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.JTextArea;
import java.awt.FlowLayout;

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
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		JLabel lblUbcEnergyDashboard = new JLabel("UBC Energy Dashboard");
		lblUbcEnergyDashboard.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUbcEnergyDashboard.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblUbcEnergyDashboard.setBounds(10, 14, 174, 29);
		frame.getContentPane().add(lblUbcEnergyDashboard);
		
		JTextPane txtpnIdeas = new JTextPane();
		txtpnIdeas.setEditable(false);
		txtpnIdeas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnIdeas.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtpnIdeas.setMargin(new Insets(30, 30, 30, 30));
		txtpnIdeas.setBounds(789, 69, 208, 157);
		frame.getContentPane().add(txtpnIdeas);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 221, 174, 284);
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
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(379, 521, 310, 185);
		frame.getContentPane().add(panel_2);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(PrivateDashboard.class.getResource("/ubc/cpsc544/chartusage.gif")));
		panel_2.add(label_5);
		
		JLabel lblOverview = new JLabel("Overview");
		lblOverview.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblOverview.setBackground(Color.ORANGE);
		lblOverview.setHorizontalAlignment(SwingConstants.CENTER);
		lblOverview.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOverview.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblOverview.setBounds(251, 14, 86, 29);
		frame.getContentPane().add(lblOverview);
		
		JLabel lblComparison = new JLabel("Comparison");
		lblComparison.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblComparison.setBackground(Color.WHITE);
		lblComparison.setHorizontalAlignment(SwingConstants.CENTER);
		lblComparison.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblComparison.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblComparison.setBounds(440, 14, 86, 29);
		frame.getContentPane().add(lblComparison);
		
		JLabel lblIdeas = new JLabel("Ideas");
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
		lblIdeas.setBounds(613, 14, 86, 29);
		frame.getContentPane().add(lblIdeas);
	
		
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
