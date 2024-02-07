package HelloWorld;

import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.*;

public class Riddle implements ActionListener{
	
	final static String LABEL_TEXT = "Why did the chicken cross the road?";
	JFrame frame;
	JPanel contentPane;
	JLabel label;
	JButton button;
	
	public Riddle(){

		/* Create and set up the frame */
		frame = new JFrame("Riddle");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Create a content pane with a BoxLayout and Empty Borders
		contentPane = new JPanel();
		contentPane.setLayout(new GridLayout(0, 2, 10, 5));
		
		//Create an dadd label that is centered and has empty borders
		label = new JLabel(LABEL_TEXT);
		label.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		label.setBorder(BorderFactory.createEmptyBorder(0, 2, 10, 5));
		contentPane.add(label);
		
		//Add another Label
		label = new JLabel(" ");
		label.setAlignmentX(JLabel.RIGHT_ALIGNMENT);
		label.setBorder(BorderFactory.createEmptyBorder(0, 2, 10, 5));
		contentPane.add(label);
				
		//create and add button
		button = new JButton("Answer");
		button.setAlignmentX(JButton.CENTER_ALIGNMENT);
		button.setActionCommand("Answer");
		button.addActionListener(this);
		contentPane.add(button);
		
		//Add content pane to frame
		frame.setContentPane(contentPane);
				
		//Size and then display the frame
		frame.pack();
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event){
		String eventName = event.getActionCommand();
		
		if(eventName.equals("Answer")){
			label.setText("To get to the other side!");
		}
	}
	
	private static void runGUI(){
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		new Riddle();
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				runGUI();
			}
		});
	}

}

