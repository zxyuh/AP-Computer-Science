package HelloWorld;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class Roll implements ActionListener {
	JFrame frame;
	JPanel contentPane;
	JButton rollDie;
	JLabel dieFace1, dieFace2;
	
	public Roll(){
		//create and set up frame
		frame = new JFrame("Roll");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//create a content pane
		contentPane = new JPanel();
		contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		contentPane.setBackground(Color.white);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));
		
		//create a label
		dieFace1 = new JLabel(new ImageIcon("I:\\Downloads\\die3.gif"));
		dieFace1.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		dieFace1.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
		contentPane.add(dieFace1);
		
		//ano0ther one
		dieFace2 = new JLabel(new ImageIcon("I:\\Downloads\\die3.gif"));
		dieFace2.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		dieFace2.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
		contentPane.add(dieFace2);
		
		//create a roll die button
		rollDie = new JButton("Roll Die");
		rollDie.setAlignmentX(JButton.CENTER_ALIGNMENT);
		rollDie.addActionListener(this);
		contentPane.add(rollDie);
		
		//add content pane to frame
		frame.setContentPane(contentPane);
	
		//size and then display the frame
		frame.pack();
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event){
		Random rand = new Random();
		int newRoll, newRoll2;
		
		newRoll = rand.nextInt(6) + 1;
		if(newRoll == 1){
			dieFace1.setIcon(new ImageIcon("I:\\Downloads\\die1.gif"));
		} else if (newRoll == 2){
			dieFace1.setIcon(new ImageIcon("I:\\Downloads\\die2.gif"));
		} else if (newRoll == 3){
			dieFace1.setIcon(new ImageIcon("I:\\Downloads\\die3.gif"));
		} else if (newRoll == 4){
			dieFace1.setIcon(new ImageIcon("I:\\Downloads\\die4.gif"));
		} else if (newRoll == 5){
			dieFace1.setIcon(new ImageIcon("I:\\Downloads\\die5.gif"));
		} else if (newRoll == 6){
			dieFace1.setIcon(new ImageIcon("I:\\Downloads\\die6.gif"));
		}
		
		newRoll2 = rand.nextInt(6) + 1;
		if(newRoll2 == 1){
			dieFace2.setIcon(new ImageIcon("I:\\Downloads\\die1.gif"));
		} else if (newRoll2 == 2){
			dieFace2.setIcon(new ImageIcon("I:\\Downloads\\die2.gif"));
		} else if (newRoll2 == 3){
			dieFace2.setIcon(new ImageIcon("I:\\Downloads\\die3.gif"));
		} else if (newRoll2 == 4){
			dieFace2.setIcon(new ImageIcon("I:\\Downloads\\die4.gif"));
		} else if (newRoll2 == 5){
			dieFace2.setIcon(new ImageIcon("I:\\Downloads\\die5.gif"));
		} else if (newRoll2 == 6){
			dieFace2.setIcon(new ImageIcon("I:\\Downloads\\die6.gif"));
		}
	}
	
	private static void runGUI(){
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		Roll greeting = new Roll();
	}
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				runGUI();
			}
		});
	}

}
