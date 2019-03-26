import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JTextField;

public class GUI_Fragen extends JFrame {

	private JPanel contentPane;
	private JLabel lblMcgquizchampion;
	private JButton btnStart;
	private JButton btnHelp;
	private JButton btnSpieler1;
	private JButton btnSpieler2;
	private JButton button_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Fragen frame = new GUI_Fragen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI_Fragen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblMcgquizchampion = new JLabel("MCG QUIZCHAMPION");
		lblMcgquizchampion.setFont(new Font("Narkisim", Font.PLAIN, 85));
		lblMcgquizchampion.setHorizontalAlignment(SwingConstants.CENTER);
		lblMcgquizchampion.setBounds(10, 100, 964, 107);
		contentPane.add(lblMcgquizchampion);
		
		btnStart = new JButton("START");
		btnStart.setFont(new Font("Narkisim", Font.PLAIN, 30));
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnStart.setBounds(674, 635, 300, 90);
		contentPane.add(btnStart);
		
		btnHelp = new JButton("HELP");
		btnHelp.setFont(new Font("Narkisim", Font.PLAIN, 30));
		btnHelp.setBounds(10, 635, 300, 90);
		contentPane.add(btnHelp);
		
		btnSpieler1 = new JButton("Spieler 1");
		btnSpieler1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSpieler1.setBounds(93, 265, 175, 75);
		contentPane.add(btnSpieler1);
		
		btnSpieler2 = new JButton("Spieler 2");
		btnSpieler2.setBounds(93, 351, 175, 75);
		contentPane.add(btnSpieler2);
		
		button_1 = new JButton("New button");
		button_1.setBounds(93, 437, 175, 75);
		contentPane.add(button_1);
		
		textField = new JTextField();
		textField.setBounds(278, 265, 175, 75);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(278, 351, 175, 75);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(278, 437, 175, 75);
		contentPane.add(textField_2);
	}
}
