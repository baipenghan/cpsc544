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
		setBounds(150, 150,  1024, 768);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Optimal Temperature for house heating");
		label.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		label.setBounds(58, 25, 343, 27);
		contentPane.add(label);
		
		final JLabel label_2 = new JLabel("4");
		label_2.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		label_2.setBounds(65, 105, 59, 43);
		contentPane.add(label_2);
		
		final JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				label_2.setText(Integer.toString(Integer.parseInt(label_2.getText()) + 1));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				label_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		label_1.setIcon(new ImageIcon(Comment.class.getResource("/ubc/cpsc544/UpArrow.png")));
		label_1.setBounds(58, 76, 34, 16);
		contentPane.add(label_1);
		
		
		
		final JLabel label_3 = new JLabel("");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				label_2.setText(Integer.toString(Integer.parseInt(label_2.getText()) - 1));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				label_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		label_3.setIcon(new ImageIcon(Comment.class.getResource("/ubc/cpsc544/DownArrow.png")));
		label_3.setBounds(60, 159, 34, 16);
		contentPane.add(label_3);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("I think the optimal temperature for house heating is 23, because we can save a lot of energy in this way.\n\n\t\t   \n\t\t  Edited Oct 23 at 16:35 ");
		textPane.setBounds(133, 76, 319, 111);
		contentPane.add(textPane);
		
		final JTextArea textArea = new JTextArea();
		textArea.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		textArea.setBounds(133, 390, 319, 82);
		contentPane.add(textArea);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(499, 58, 12, 135);
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
		label_4.setBounds(593, 76, 103, 101);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Patrick");
		label_5.setFont(new Font("Apple Chancery", Font.BOLD | Font.ITALIC, 15));
		label_5.setBounds(617, 58, 61, 16);
		contentPane.add(label_5);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("Rank  \n\n90%");
		textPane_1.setBounds(542, 92, 45, 66);
		contentPane.add(textPane_1);
		
		JLabel lblComments = new JLabel("Comments");
		lblComments.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblComments.setBounds(58, 199, 343, 27);
		contentPane.add(lblComments);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(16, 225, 694, 12);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(499, 248, 12, 101);
		contentPane.add(separator_2);
		
		JLabel label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon(Comment.class.getResource("/ubc/cpsc544/Charmander.png")));
		label_9.setBounds(590, 265, 88, 92);
		contentPane.add(label_9);
		
		JLabel lblBilly = new JLabel("Billy");
		lblBilly.setFont(new Font("Apple Chancery", Font.BOLD | Font.ITALIC, 15));
		lblBilly.setBounds(599, 237, 61, 16);
		contentPane.add(lblBilly);
		
		JTextPane txtpnRank = new JTextPane();
		txtpnRank.setText("Rank  \n\n40%");
		txtpnRank.setBounds(542, 267, 45, 66);
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
		btnSubmit.setBounds(358, 484, 88, 29);
		contentPane.add(btnSubmit);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				textArea.setEditable(true);
				Border loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
				textArea.setBorder(loweredetched);
			}
		});

		btnEdit.setBounds(264, 484, 88, 29);
		contentPane.add(btnEdit);
		
		JTextPane txtpnIReallyCant = new JTextPane();
		txtpnIReallyCant.setText("I really can't agree with you. I think 23 Celcius is so cold. I prefer 25.\n\n\t\t    Edited Nov 1 at 9:12");
		txtpnIReallyCant.setBounds(133, 249, 319, 72);
		contentPane.add(txtpnIReallyCant);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(16, 366, 694, 12);
		contentPane.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setBounds(499, 393, 12, 101);
		contentPane.add(separator_4);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(Comment.class.getResource("/ubc/cpsc544/Me.png")));
		label_6.setBounds(589, 400, 88, 103);
		contentPane.add(label_6);
		
		JLabel lblMe = new JLabel("Me");
		lblMe.setFont(new Font("Apple Chancery", Font.BOLD | Font.ITALIC, 15));
		lblMe.setBounds(599, 382, 61, 16);
		contentPane.add(lblMe);
		
		JTextPane txtpnRank_1 = new JTextPane();
		txtpnRank_1.setText("Rank  \n\n95%");
		txtpnRank_1.setBounds(542, 412, 45, 66);
		contentPane.add(txtpnRank_1);
		
		
	}
}
