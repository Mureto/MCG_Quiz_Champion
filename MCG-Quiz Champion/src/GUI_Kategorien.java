import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_Kategorien extends JFrame {

	private JPanel contentPane;
	private JLabel lblWhleEineKategorie;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	static String kategorie1;
	static String kategorie2;
	static String kategorie3;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Kategorien frame = new GUI_Kategorien();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		kategorienWahl();
	}
	
	public static void kategorienWahl()
	{
		int fls = Hauptklasse.fragenkatalog.kategorien.size() - 1;
		int kat1 = (int) Math.round(Math.random()*fls);
		int kat2 = (int) Math.round(Math.random()*fls);
		while(kat2==kat1)
		{
			kat2 = (int) Math.round(Math.random()*fls);
		}
		int kat3 = (int) Math.round(Math.random()*fls);
		while(kat3==kat2 || kat3==kat1)
		{
			kat3 = (int) Math.round(Math.random()*fls);
		}
		System.out.print(kat1 + " " + kat2 + " " + kat3);
		kategorie1 = Hauptklasse.fragenkatalog.kategorien.get(kat1);
		kategorie2 = Hauptklasse.fragenkatalog.kategorien.get(kat2);
		kategorie3 = Hauptklasse.fragenkatalog.kategorien.get(kat3);
	}

	/**
	 * Create the frame.
	 */
	public GUI_Kategorien() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblWhleEineKategorie = new JLabel("W\u00E4hle eine Kategorie");
		lblWhleEineKategorie.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblWhleEineKategorie.setBounds(425, 150, 150, 50);
		contentPane.add(lblWhleEineKategorie);
		
		btnNewButton_1 = new JButton(kategorie1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(375, 250, 250, 50);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton(kategorie2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2.setBounds(375, 350, 250, 50);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton(kategorie3);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_3.setBounds(375, 450, 250, 50);
		contentPane.add(btnNewButton_3);
	}
}
