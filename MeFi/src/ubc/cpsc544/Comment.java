package ubc.cpsc544;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

public class Comment extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Comment frame = new Comment();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Comment() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100,  1024, 768);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBulbIcon = new JLabel("");
		lblBulbIcon.setIcon(new ImageIcon(PublicDashboard.class.getResource("/ubc/cpsc544/bulb.png")));
		lblBulbIcon.setBounds(12, 11, 35, 33);
		contentPane.add(lblBulbIcon);
		
		JLabel lblUbcEnergyDashboard = new JLabel("UBC Energy Dashboard");
		lblUbcEnergyDashboard.setForeground(new Color(0, 128, 0));
		lblUbcEnergyDashboard.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblUbcEnergyDashboard.setBorder(null);
		lblUbcEnergyDashboard.setBounds(49, 15, 229, 29);
		contentPane.add(lblUbcEnergyDashboard);
		
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
		label_7.setBounds(337, 15, 86, 29);
		contentPane.add(label_7);
		
		JLabel lblIdeaCompetition = new JLabel("Idea Competition");
		lblIdeaCompetition.setBackground(Color.ORANGE);
		lblIdeaCompetition.setOpaque(true);
		lblIdeaCompetition.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblIdeaCompetition.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdeaCompetition.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIdeaCompetition.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblIdeaCompetition.setBounds(619, 14, 133, 29);
		contentPane.add(lblIdeaCompetition);
		
		JLabel label_9 = new JLabel("Comparison");
		label_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Comparison comp = new Comparison();
				comp.getFrame().setVisible(true);
			}
		});
		label_9.setOpaque(true);
		label_9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_9.setBorder(new LineBorder(new Color(0, 0, 0)));
		label_9.setBackground(new Color(0, 204, 204));
		label_9.setBounds(484, 15, 86, 29);
		contentPane.add(label_9);
		
		JLabel label = new JLabel("Optimal Thermostat setting");
		label.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		label.setBounds(68, 84, 343, 27);
		contentPane.add(label);
		
		final JLabel label_2 = new JLabel("4");
		label_2.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		label_2.setBounds(78, 156, 59, 43);
		contentPane.add(label_2);
		
		final JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(label_2.getText().equals("5"))
					;
				else
					label_2.setText(Integer.toString(Integer.parseInt(label_2.getText()) + 1));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				label_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		label_1.setIcon(new ImageIcon(Comment.class.getResource("/ubc/cpsc544/UpArrow.png")));
		label_1.setBounds(68, 139, 34, 16);
		contentPane.add(label_1);
		
		
		
		final JLabel label_3 = new JLabel("");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(label_2.getText().equals("3"))
					;
				else
					label_2.setText(Integer.toString(Integer.parseInt(label_2.getText()) - 1));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				label_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		label_3.setIcon(new ImageIcon(Comment.class.getResource("/ubc/cpsc544/DownArrow.png")));
		label_3.setBounds(68, 199, 34, 16);
		contentPane.add(label_3);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("Lower your thermostat by 4 - 5 degrees Celsius (7 - 9 degrees Fahrenheit) while you're sleeping at night and when no one is at home.\n\n\t\t   \n\t\t  Edited Oct 23 at 16:35 ");
		textPane.setBounds(143, 135, 319, 111);
		contentPane.add(textPane);
		
		final JTextArea textArea = new JTextArea();
		textArea.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		textArea.setBounds(143, 489, 319, 82);
		contentPane.add(textArea);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(499, 84, 12, 135);
		contentPane.add(separator);
		
		final JLabel label_4 = new JLabel("");
		label_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Profile pikachu = new Profile();
				pikachu.setVisible(true);

			}
			@Override
			public void mouseEntered(MouseEvent e) {
				label_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		label_4.setIcon(new ImageIcon(Comment.class.getResource("/ubc/cpsc544/Picachu.png")));
		label_4.setBounds(593, 131, 103, 101);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Patrick");
		label_5.setFont(new Font("Apple Chancery", Font.BOLD | Font.ITALIC, 15));
		label_5.setBounds(617, 113, 61, 16);
		contentPane.add(label_5);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("Rank  \n\n90%");
		textPane_1.setBounds(542, 147, 45, 66);
		contentPane.add(textPane_1);
		
		JLabel lblComments = new JLabel("Comments");
		lblComments.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblComments.setBounds(68, 246, 343, 27);
		contentPane.add(lblComments);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(12, 284, 694, 12);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(499, 318, 12, 101);
		contentPane.add(separator_2);
		
		JLabel label_10 = new JLabel("");
		label_10.setIcon(new ImageIcon(Comment.class.getResource("/ubc/cpsc544/Charmander.png")));
		label_10.setBounds(590, 335, 88, 92);
		contentPane.add(label_10);
		
		JLabel lblBilly = new JLabel("Billy");
		lblBilly.setFont(new Font("Apple Chancery", Font.BOLD | Font.ITALIC, 15));
		lblBilly.setBounds(599, 307, 61, 16);
		contentPane.add(lblBilly);
		
		JTextPane txtpnRank = new JTextPane();
		txtpnRank.setText("Rank  \n\n40%");
		txtpnRank.setBounds(542, 337, 45, 66);
		contentPane.add(txtpnRank);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				textArea.setEditable(false);
				Border empty = BorderFactory.createEmptyBorder();
				textArea.setBorder(empty);
				
				
				
			}
		});
		btnSubmit.setBounds(368, 583, 88, 29);
		contentPane.add(btnSubmit);
		
		JButton btnEdit = new JButton("Cancel");
		btnEdit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				textArea.setEditable(true);
				Border loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
				textArea.setBorder(loweredetched);
			}
		});

		btnEdit.setBounds(274, 583, 88, 29);
		contentPane.add(btnEdit);
		
		JTextPane txtpnIReallyCant = new JTextPane();
		txtpnIReallyCant.setText("Thanks! That makes sense, as the blanket is warm enough.\n\n\t\t    Edited Nov 1 at 9:12");
		txtpnIReallyCant.setBounds(132, 335, 319, 72);
		contentPane.add(txtpnIReallyCant);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(12, 445, 694, 12);
		contentPane.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setBounds(499, 489, 12, 101);
		contentPane.add(separator_4);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(Comment.class.getResource("/ubc/cpsc544/Me.png")));
		label_6.setBounds(590, 505, 88, 103);
		contentPane.add(label_6);
		
		JLabel lblMe = new JLabel("Me");
		lblMe.setFont(new Font("Apple Chancery", Font.BOLD | Font.ITALIC, 15));
		lblMe.setBounds(599, 478, 61, 16);
		contentPane.add(lblMe);
		
		JTextPane txtpnRank_1 = new JTextPane();
		txtpnRank_1.setText("Rank  \n\n95%");
		txtpnRank_1.setBounds(543, 517, 45, 66);
		contentPane.add(txtpnRank_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(746, 78, 240, 493);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblResidents = new JLabel("Residents");
		lblResidents.setBounds(10, 11, 147, 19);
		lblResidents.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblResidents.setBorder(null);
		panel_1.add(lblResidents);
		
		JLabel label_13 = new JLabel("");
		label_13.setIcon(new ImageIcon(Ideas.class.getResource("/ubc/cpsc544/Picachu.png")));
		label_13.setBounds(10, 51, 63, 61);
		panel_1.add(label_13);
		
		JLabel label_14 = new JLabel("");
		label_14.setIcon(new ImageIcon(Ideas.class.getResource("/ubc/cpsc544/Me.png")));
		label_14.setBounds(129, 51, 63, 61);
		panel_1.add(label_14);
		
		JLabel label_15 = new JLabel("");
		label_15.setIcon(new ImageIcon(Ideas.class.getResource("/ubc/cpsc544/Turtle.png")));
		label_15.setBounds(129, 202, 63, 61);
		panel_1.add(label_15);
		
		JLabel label_16 = new JLabel("");
		label_16.setIcon(new ImageIcon(Ideas.class.getResource("/ubc/cpsc544/Me.png")));
		label_16.setBounds(20, 202, 63, 61);
		panel_1.add(label_16);
		
		JLabel lblPatrick_1 = new JLabel(" Patrick");
		lblPatrick_1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		lblPatrick_1.setBounds(10, 123, 81, 19);
		panel_1.add(lblPatrick_1);
		
		JLabel lblTom = new JLabel("Tom");
		lblTom.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		lblTom.setBounds(139, 123, 61, 16);
		panel_1.add(lblTom);
		
		JLabel lblJennifer = new JLabel("Jennifer");
		lblJennifer.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		lblJennifer.setBounds(30, 274, 61, 16);
		panel_1.add(lblJennifer);
		
		JLabel lblSam = new JLabel("Katherine");
		lblSam.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		lblSam.setBounds(139, 274, 79, 16);
		panel_1.add(lblSam);
		
		JLabel label_17 = new JLabel("90%");
		label_17.setBounds(20, 145, 46, 14);
		panel_1.add(label_17);
		
		JLabel label_18 = new JLabel("85%");
		label_18.setBounds(146, 145, 46, 14);
		panel_1.add(label_18);
		
		JLabel label_19 = new JLabel("60%");
		label_19.setBounds(40, 301, 46, 14);
		panel_1.add(label_19);
		
		JLabel label_20 = new JLabel("75%");
		label_20.setBounds(146, 301, 46, 14);
		panel_1.add(label_20);
	}
}
