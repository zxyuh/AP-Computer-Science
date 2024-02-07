package HelloWorld;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class DivisibleBy3 implements ActionListener {
	
	JFrame frame;
	JPanel contentPane;
	JLabel label, answer;
	JTextField number;
	JButton check;
	
	public DivisibleBy3(){
		//Set up the frame
		frame = new JFrame("Divisble By 3");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//create a content pane with a gridlayout
		contentPane = new JPanel();
		contentPane.setLayout(new GridLayout(0, 2, 10, 5));
		contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		//add prompt and then text field
		label = new JLabel("Enter A Number:");
		contentPane.add(label);
		
		number = new JTextField(10);
		contentPane.add(number);
		
		//Create Button to check
		check = new JButton("Check");
		check.setActionCommand("Check");
		check.addActionListener(this);
		contentPane.add(check);
		
		//answer label
		answer = new JLabel(" ");
		contentPane.add(answer);
		
		//add content pane to frame
		frame.setContentPane(contentPane);
		
		//size and display
		frame.pack();
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event){
		String eventName = event.getActionCommand();
		
		if (eventName.equals("Check")){
			double divisible;
			String num = number.getText();
			divisible = Double.parseDouble(num) % 3;
			if(divisible == 0){
				answer.setText("Number Is Divisible By 3");
			} else {
				answer.setText("Number Is Not Divisible By 3");
			}
		}
	}

	private static void runGUI(){
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		new DivisibleBy3();
	}
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				runGUI();
			}
		});
	}

}

