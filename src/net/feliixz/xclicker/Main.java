package net.feliixz.xclicker;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;

public class Main extends JFrame
{

	private JPanel contentPane;
	private JLabel lblVersion;
	private JLabel lblCreator;
	private JLabel lblTitle;
	private JLabel lblScore;
	private JButton btnClicker;
	private JTextField txtScore;
	private JLabel lblShop;
	private JLabel lblBonus2;
	private JLabel lblBonus3;
	private JLabel lblBonus4;
	private JLabel lblBonus5;
	private JLabel lblBonus6;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxNewCheckBox_1;
	private JCheckBox chckbxNewCheckBox_2;
	private JCheckBox chckbxNewCheckBox_3;
	private JCheckBox chckbxNewCheckBox_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Main frame = new Main();
					frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main()
	{
		initComponents();
	}
	private void initComponents() {
		setTitle("X-Clicker");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setIconImage(loadImage("rsc/X-Clicker_Icon.png"));
		
		lblTitle = new JLabel("X-CLICKER");
		lblTitle.setForeground(Color.WHITE);
		lblTitle.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 50));
		lblTitle.setBounds(250, 37, 250, 58);
		contentPane.add(lblTitle);
		
		lblVersion = new JLabel("Version 0.0");
		lblVersion.setForeground(Color.WHITE);
		lblVersion.setBounds(673, 696, 71, 14);
		contentPane.add(lblVersion);
		
		lblCreator = new JLabel("Made by FeliixZ");
		lblCreator.setForeground(Color.WHITE);
		lblCreator.setBounds(10, 696, 92, 14);
		contentPane.add(lblCreator);
		
		lblScore = new JLabel("X-Score");
		lblScore.setFont(new Font("Arial", Font.PLAIN, 25));
		lblScore.setForeground(Color.WHITE);
		lblScore.setBounds(78, 165, 132, 34);
		contentPane.add(lblScore);
		
		btnClicker = new JButton("");
		btnClicker.setForeground(Color.BLACK);
		btnClicker.setBackground(Color.BLACK);
		ImageIcon ico = new ImageIcon(loadImage("rsc/btnScore.png"));
		btnClicker.setIcon(ico);
		btnClicker.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnClickerActionPerformed(arg0);
			}
		});
		
		txtScore = new JTextField();
		txtScore.setHorizontalAlignment(SwingConstants.RIGHT);
		txtScore.setFont(new Font("Arial", Font.PLAIN, 20));
		txtScore.setEditable(false);
		txtScore.setText("0");
		txtScore.setForeground(Color.BLACK);
		txtScore.setBounds(236, 165, 279, 34);
		contentPane.add(txtScore);
		txtScore.setColumns(10);
		btnClicker.setBounds(250, 250, 250, 250);
		contentPane.add(btnClicker);
		
		lblShop = new JLabel("Shop");
		lblShop.setForeground(Color.WHITE);
		lblShop.setBounds(78, 520, 46, 14);
		contentPane.add(lblShop);
		
		lblBonus2 = new JLabel("Bonus x2");
		lblBonus2.setForeground(Color.WHITE);
		lblBonus2.setBounds(134, 520, 46, 14);
		contentPane.add(lblBonus2);
		
		lblBonus3 = new JLabel("Bonus x3");
		lblBonus3.setForeground(Color.WHITE);
		lblBonus3.setBounds(134, 545, 46, 14);
		contentPane.add(lblBonus3);
		
		lblBonus4 = new JLabel("Bonus x4");
		lblBonus4.setForeground(Color.WHITE);
		lblBonus4.setBounds(134, 570, 46, 14);
		contentPane.add(lblBonus4);
		
		lblBonus5 = new JLabel("Bonus x5");
		lblBonus5.setForeground(Color.WHITE);
		lblBonus5.setBounds(134, 595, 46, 14);
		contentPane.add(lblBonus5);
		
		lblBonus6 = new JLabel("Bonus x6");
		lblBonus6.setForeground(Color.WHITE);
		lblBonus6.setBounds(134, 620, 46, 14);
		contentPane.add(lblBonus6);
		
		chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBounds(202, 516, 21, 23);
		contentPane.add(chckbxNewCheckBox);
		
		chckbxNewCheckBox_1 = new JCheckBox("");
		chckbxNewCheckBox_1.setBounds(202, 541, 21, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		chckbxNewCheckBox_2 = new JCheckBox("");
		chckbxNewCheckBox_2.setBounds(202, 566, 21, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		chckbxNewCheckBox_3 = new JCheckBox("");
		chckbxNewCheckBox_3.setBounds(202, 591, 21, 23);
		contentPane.add(chckbxNewCheckBox_3);
		
		chckbxNewCheckBox_4 = new JCheckBox("");
		chckbxNewCheckBox_4.setBounds(202, 616, 21, 23);
		contentPane.add(chckbxNewCheckBox_4);
	}
	protected void btnClickerActionPerformed(ActionEvent arg0) 
	{
		String Score = this.txtScore.getText();
		long S = Long.parseLong(Score);
		
		S = S + 1;
		
		Score = Long.toString(S);
		this.txtScore.setText(Score);
	}
	public static BufferedImage loadImage(String path)
	{
		BufferedImage picture = null;
		try
		{
		    File file = new File(path);
			picture = ImageIO.read(file);
		}
		catch (IOException e)
		{
			e.printStackTrace();
			System.out.println("Could not load pictures!");
		}
		return picture;
	}
}
