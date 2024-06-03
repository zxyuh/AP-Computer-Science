package FinalProject;

import javax.swing.*;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.*;


public class Menu implements ActionListener {
    final static String LABEL_TEXT = "PICK A GAME!";
    JFrame frame;
    JPanel contentPane;
    JPanel textPane;
    JLabel label;
    JButton button;

    public Menu(){
        //create and set up the frame;
        frame = new JFrame("Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //text pane
        textPane = new JPanel();
        textPane.setLayout(new BoxLayout(textPane, BoxLayout.PAGE_AXIS));
        textPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));


        //create a content pane
        contentPane = new JPanel();
        //contentPane.setLayout(new GridLayout(0, 2, 10, 5));
		contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

       	//Create and add label that is centered and has empty borders
		label = new JLabel(LABEL_TEXT);
		label.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		label.setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50));
		textPane.add(label);

       //Create and Add button that is centered
		button = new JButton("CONNECTIONS");
		button.setAlignmentX(JButton.CENTER_ALIGNMENT);
		button.setActionCommand("connections");
		button.addActionListener(this);
		contentPane.add(button);

        button = new JButton("WORDLE");
		button.setAlignmentX(JButton.CENTER_ALIGNMENT);
		button.setActionCommand("wordle");
		button.addActionListener(this);
        button.setSize(100, 100);
		contentPane.add(button);

        button = new JButton("ANAGRAMS");
		button.setAlignmentX(JButton.CENTER_ALIGNMENT);
		button.setActionCommand("anagrams");
		button.addActionListener(this);
        button.setSize(100, 0);
		contentPane.add(button);

        //Add content pane to frame
        textPane.add(contentPane);
		frame.setContentPane(textPane);
		
		//Size and then display the frame
		frame.pack();
		frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent event){
        String eventName = event.getActionCommand();
        if(eventName.equals("connections")){
            label.setText("CONNECTIONS!!");
        } else if(eventName.equals("wordle")) {
            label.setText("WORDLE!!");
        } else {
            label.setText("ANAGRAMS!!");
        }
    }

    private static void runGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true);

        new Menu();
    }

    public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				runGUI();
			}
		});
	}
    
}
