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
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class GUI_Start extends JFrame {

	private JPanel contentPane;
	private JLabel lblMcgquizchampion;
	private JButton btnStart;
	private JButton btnRules;
	private JButton btnSpieler1;
	private JButton btnSpieler2;
	private JButton btnSpieler3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private final ButtonGroup btnGrpSpielerzahl = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Start frame = new GUI_Start();
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
	public GUI_Start() {
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
				Hauptklasse.setSpielername1(textField.getText());
				Hauptklasse.setSpielername2(textField_1.getText());
				Hauptklasse.setSpielername3(textField_2.getText());
			}
		});
		btnStart.setBounds(674, 635, 300, 90);
		contentPane.add(btnStart);
		
		btnRules = new JButton("REGELN");
		btnRules.setFont(new Font("Narkisim", Font.PLAIN, 30));
		btnRules.setBounds(10, 635, 300, 90);
		contentPane.add(btnRules);
		
		btnSpieler1 = new JButton("Allein");
		btnGrpSpielerzahl.add(btnSpieler1);
		btnSpieler1.setFont(new Font("Narkisim", Font.PLAIN, 30));
		btnSpieler1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hauptklasse.setSpielerZahl(1);
			}
		});
		btnSpieler1.setBounds(93, 265, 360, 75);
		contentPane.add(btnSpieler1);
		
		btnSpieler2 = new JButton("2 Spieler");
		btnGrpSpielerzahl.add(btnSpieler2);
		btnSpieler2.setFont(new Font("Narkisim", Font.PLAIN, 30));
		btnSpieler2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hauptklasse.setSpielerZahl(2);
			}
		});
		btnSpieler2.setBounds(93, 351, 360, 75);
		contentPane.add(btnSpieler2);
		
		btnSpieler3 = new JButton("3 Spieler");
		btnGrpSpielerzahl.add(btnSpieler3);
		btnSpieler3.setFont(new Font("Narkisim", Font.PLAIN, 30));
		btnSpieler3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hauptklasse.setSpielerZahl(3);
			}
		});
		btnSpieler3.setBounds(93, 437, 360, 75);
		contentPane.add(btnSpieler3);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Narkisim", Font.PLAIN, 30));
		textField.setBounds(463, 265, 415, 75);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_1.setFont(new Font("Narkisim", Font.PLAIN, 30));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		textField_1.setBounds(463, 351, 415, 75);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_2.setFont(new Font("Narkisim", Font.PLAIN, 30));
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		textField_2.setBounds(463, 437, 415, 75);
		contentPane.add(textField_2);
	}
}
