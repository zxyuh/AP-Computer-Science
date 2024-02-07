package HelloWorld;

import javax.swing.*;

import java.awt.event.*;

public class Sunflower implements ActionListener{
	
	final static String LABEL_TEXT = "Sunflower";
	JFrame frame;
	JPanel contentPane;
	JLabel label;
	JButton button;
	
	public Sunflower(){
		/* Create and set up the frame */
		frame = new JFrame("Sunflower");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Create a content pane with a BoxLayout and Empty Borders
		contentPane = new JPanel();
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));
		contentPane.setBorder(BorderFactory.createEmptyBorder(50, 25, 25, 25));
		
		//Create and add label that is centered and has empty borders
		label = new JLabel(LABEL_TEXT);
		label.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		label.setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50));
		contentPane.add(label);
		
		//Create and Add button that is centered
		button = new JButton("English");
		button.setAlignmentX(JButton.CENTER_ALIGNMENT);
		button.setActionCommand("English");
		button.addActionListener(this);
		contentPane.add(button);
		
		//Create another button
		button = new JButton("Latin");
		button.setAlignmentX(JButton.CENTER_ALIGNMENT);
		button.setActionCommand("Latin");
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
		
		if(eventName.equals("English")){
			label.setText("Sunflower");
		} else {
			label.setText("HELIANTHUS");
		}
	}

	private static void runGUI(){
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		new Sunflower();
	}
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				runGUI();
			}
		});
	}

}

