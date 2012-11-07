package ubc.cpsc544;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Point;
import javax.swing.JSplitPane;
import javax.swing.Box;
import javax.swing.JLayeredPane;
import javax.swing.JToolBar;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.InputStream;

import javax.swing.JSpinner;
import javax.swing.JTable;

public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
//		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
//		InputStream Picachu = classLoader.getResourceAsStream("/Picachu.gif");
//		Image picachu= ImageIO.read(input);
//	      LblLogo = new JLabel( new ImageIcon( logo ) );
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 735, 530);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(568, 22, 147, 27);
		frame.getContentPane().add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Newest", "Top 5 Monthly", "Top 5 Yearly"}));
		comboBox.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		
		JLabel lblProposedSuggestions = new JLabel("Proposed Suggestions");
		lblProposedSuggestions.setBounds(138, 15, 271, 30);
		frame.getContentPane().add(lblProposedSuggestions);
		lblProposedSuggestions.setFont(new Font("Helvetica", Font.PLAIN, 25));
		
		JLabel lblSortedBy = new JLabel("Sorted by");
		lblSortedBy.setBounds(503, 26, 61, 16);
		frame.getContentPane().add(lblSortedBy);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(20, 276, 694, 12);
		frame.getContentPane().add(separator);
		
		final JLabel label_5 = new JLabel("4");
		label_5.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		label_5.setBounds(68, 165, 59, 43);
		frame.getContentPane().add(label_5);
		
		final JLabel label_6 = new JLabel("2");
		label_6.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		label_6.setBounds(68, 378, 55, 43);
		frame.getContentPane().add(label_6);
		
		final JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				label_5.setText(Integer.toString(Integer.parseInt(label_5.getText()) + 1));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		lblNewLabel.setIcon(new ImageIcon(Main.class.getResource("/ubc/cpsc544/UpArrow.png")));
		lblNewLabel.setBounds(60, 131, 34, 16);
		frame.getContentPane().add(lblNewLabel);
		
		final JLabel label_2 = new JLabel("");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				label_5.setText(Integer.toString(Integer.parseInt(label_5.getText()) - 1));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				label_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		label_2.setIcon(new ImageIcon(Main.class.getResource("/ubc/cpsc544/DownArrow.png")));
		label_2.setBounds(62, 227, 34, 16);
		frame.getContentPane().add(label_2);
		
		final JLabel label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				label_6.setText(Integer.toString(Integer.parseInt(label_6.getText()) + 1));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		label.setIcon(new ImageIcon(Main.class.getResource("/ubc/cpsc544/UpArrow.png")));
		label.setBounds(60, 339, 34, 16);
		frame.getContentPane().add(label);
		
		final JLabel label_3 = new JLabel("");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				label_6.setText(Integer.toString(Integer.parseInt(label_6.getText()) - 1));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				label_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		label_3.setIcon(new ImageIcon(Main.class.getResource("/ubc/cpsc544/DownArrow.png")));
		label_3.setBounds(62, 438, 34, 16);
		frame.getContentPane().add(label_3);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(520, 93, 12, 162);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(520, 312, 12, 162);
		frame.getContentPane().add(separator_2);
		
		final JLabel lblNewLabel_1 = new JLabel("Optimal Temperature for house heating");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Comment com = new Comment();
				com.setVisible(true);
			}
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblNewLabel_1.setBounds(66, 69, 343, 27);
		frame.getContentPane().add(lblNewLabel_1);
		
		final JTextPane txtpnIThinkThe = new JTextPane();
		txtpnIThinkThe.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Comment com = new Comment();
				com.setVisible(true);
			}
			public void mouseEntered(MouseEvent e) {
				txtpnIThinkThe.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		txtpnIThinkThe.setText("I think the optimal temperature for house heating is 23, because we can save a lot of energy in this way.\n\n\t\t   \n\t\t  Edited Oct 23 at 16:35 ");
		txtpnIThinkThe.setBounds(126, 132, 319, 111);
		frame.getContentPane().add(txtpnIThinkThe);
		
		JTextPane txtpnWeShouldLeave = new JTextPane();
		txtpnWeShouldLeave.setText("We should leave our lights off when we leave our apartment.\n\n\t\t   \n\t\t  \n\t\t  Edited Nov 1 at 13:36 ");
		txtpnWeShouldLeave.setBounds(125, 347, 319, 107);
		frame.getContentPane().add(txtpnWeShouldLeave);
		
		JLabel lblSuggestionForEnegy = new JLabel("Suggestion for enegy saving");
		lblSuggestionForEnegy.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblSuggestionForEnegy.setBounds(60, 300, 319, 27);
		frame.getContentPane().add(lblSuggestionForEnegy);
		
		final JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				//label_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		label_1.setIcon(new ImageIcon(Main.class.getResource("/ubc/cpsc544/Picachu.png")));
		label_1.setBounds(612, 121, 103, 101);
		frame.getContentPane().add(label_1);
		
		JLabel lblPatrick = new JLabel("Patrick");
		lblPatrick.setFont(new Font("Apple Chancery", Font.BOLD | Font.ITALIC, 15));
		lblPatrick.setBounds(632, 93, 61, 16);
		frame.getContentPane().add(lblPatrick);
		
		JTextPane txtpnRank = new JTextPane();
		txtpnRank.setText("Rank  \n\n90%");
		txtpnRank.setBounds(554, 156, 45, 66);
		frame.getContentPane().add(txtpnRank);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(Main.class.getResource("/ubc/cpsc544/Turtle.png")));
		label_4.setBounds(612, 339, 114, 115);
		frame.getContentPane().add(label_4);
		
		JLabel lblKatherine = new JLabel("Katherine");
		lblKatherine.setFont(new Font("Apple Chancery", Font.BOLD | Font.ITALIC, 15));
		lblKatherine.setBounds(628, 313, 81, 16);
		frame.getContentPane().add(lblKatherine);
		
		JTextPane txtpnRank_1 = new JTextPane();
		txtpnRank_1.setText("Rank  \n\n75%");
		txtpnRank_1.setBounds(554, 378, 45, 66);
		frame.getContentPane().add(txtpnRank_1);
	}
}
