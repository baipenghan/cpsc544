package ubc.cpsc544;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Profile extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Profile frame = new Profile();
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
	public Profile() {
		final Profile p = this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 642, 436);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Profile.class.getResource("/ubc/cpsc544/Picachu.png")));
		label.setBounds(59, 137, 103, 101);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Patrick");
		label_1.setFont(new Font("Apple Chancery", Font.BOLD | Font.ITALIC, 15));
		label_1.setBounds(81, 108, 61, 16);
		contentPane.add(label_1);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("Rank  \n\n90%");
		textPane.setBounds(18, 160, 45, 66);
		contentPane.add(textPane);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(174, 75, 12, 275);
		contentPane.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Proposed Ideas/Comments");
		lblNewLabel_1.setFont(new Font("Helvetica", Font.BOLD, 17));
		lblNewLabel_1.setBounds(255, 45, 270, 25);
		contentPane.add(lblNewLabel_1);
		
		final JLabel lblNewLabel_2 = new JLabel("1. Optimal Temperature for house heating");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Comment cm = new Comment();
				cm.setVisible(true);
			}
		});
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(198, 92, 341, 27);
		contentPane.add(lblNewLabel_2);
		
		JButton btnClose = new JButton("Close");
		btnClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				p.setVisible(false);
			}
		});
		btnClose.setBounds(546, 11, 79, 29);
		contentPane.add(btnClose);
	}
}
