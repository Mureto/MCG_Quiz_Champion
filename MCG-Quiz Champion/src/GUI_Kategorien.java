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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		int kat1 = (int) Math.round(Math.random()*Hauptklasse.fragenkatalog.fragenliste.size());
		int kat2 = (int) Math.round(Math.random()*Hauptklasse.fragenkatalog.fragenliste.size());
		while(kat2==kat1)
		{
			kat2 = (int) Math.round(Math.random()*Hauptklasse.fragenkatalog.fragenliste.size());
		}
		int kat3 = (int) Math.round(Math.random()*Hauptklasse.fragenkatalog.fragenliste.size());
		while(kat3==kat2 || kat3==kat1)
		{
			kat3 = (int) Math.round(Math.random()*Hauptklasse.fragenkatalog.fragenliste.size());
		}
		System.out.print(kat1 + " " + kat2 + " " + kat3);
	}

	/**
	 * Create the frame.
	 */
	public GUI_Kategorien() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblWhleEineKategorie = new JLabel("W\u00E4hle eine Kategorie");
		lblWhleEineKategorie.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblWhleEineKategorie.setBounds(325, 150, 150, 50);
		contentPane.add(lblWhleEineKategorie);
		
		btnNewButton_1 = new JButton(" ");
		btnNewButton_1.setBounds(275, 250, 250, 50);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton(" ");
		btnNewButton_2.setBounds(275, 350, 250, 50);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton(" ");
		btnNewButton_3.setBounds(275, 450, 250, 50);
		contentPane.add(btnNewButton_3);
	}
}
