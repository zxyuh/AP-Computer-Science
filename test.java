import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class test implements ActionListener{
    public static final int X = 3;
    public static final int Y = 3;
    JFrame frame;
    JPanel contentPane;
    JButton[][] lightBoard;

    public test(){
        //set up the frame
        frame = new JFrame("Game Of Light");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.white);
        
        //create a content pane with a grid layout
        contentPane = new JPanel();
        contentPane.setLayout(new GridLayout(3, 3, 0, 0));
        contentPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        lightBoard = new JButton[X][Y];
        for (int i = 0; i < lightBoard.length; i++) {
			for (int j = 0; j < lightBoard[0].length; j++) {
				lightBoard[i][j] = new JButton();
                lightBoard[i][j].setActionCommand(i + " " + j);
                lightBoard[i][j].addActionListener(new WorldGridListener());
                lightBoard[i][j].setBackground(Color.black);
                contentPane.add(lightBoard[i][j]);

			}
		}

        //answer label 
      
        //add content pane to frame
        //contentPane.add(subPanel);
        frame.setContentPane(contentPane);

        // size and display
        frame.pack();
        frame.setVisible(true);
        
    }

    public void actionPerformed(ActionEvent event){
        String eventName = event.getActionCommand();

    }

    class WorldGridListener implements ActionListener {
   	
        /**
         * Turns a Button yellow
         * pre: btnCoords is a string with a integer followed by a space
         * followed by a second integer.
         * post: Button turned Yellow.
         */
        public void actionPerformed(ActionEvent event) {
            String btnCoords = event.getActionCommand();
            int spacePosition, row, col;
            
            spacePosition = btnCoords.indexOf(" ");
            row = Integer.parseInt(btnCoords.substring(0, spacePosition));
            col = Integer.parseInt(btnCoords.substring(spacePosition + 1));
            //lifeGame.addLiveCell(row, col);		                //add a live cell
            lightBoard[row][col].setBackground(Color.yellow);		//show a live cell
        }
 }
    
    private static void runGUI(){
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		test greeting = new test();
	}
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				runGUI();
			}
		});
	}
    
}
