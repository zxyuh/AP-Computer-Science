import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameOfLightGUI implements ActionListener{
    public static final int X = 3;
    public static final int Y = 3;
    JFrame frame;
    JPanel contentPane;
    JButton[][] GameOfLight;
    //GameOfLight lightGame = new GameOfLight();

    public GameOfLightGUI(){
        //create and set up the frame
        frame = new JFrame("Game Of Light GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create a content pane with a gridlayout and empty borders
        contentPane = new JPanel();
        contentPane.setLayout(new GridLayout(4, 3, 0, 0));
        contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        //create and add buttons
        GameOfLight = new JButton[X][Y];
        for (int row = 0; row < X; row++){
            for (int col = 0; col < Y; col++){
                GameOfLight[X][Y] = new JButton();
                GameOfLight[X][Y].setActionCommand(row + " " + col);
                GameOfLight[X][Y].addActionListener(this);
                contentPane.add( GameOfLight[X][Y]);
            }
        }

        //add content pane to frame
        frame.setContentPane(contentPane);

        //size and then display the frame
        frame.pack();
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event){

    }

    private static void runGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        GameOfLightGUI play = new GameOfLightGUI();
    }
     

    public static void main(String[] args) {
        /* Methods that create and show a GUI should be 
           run from an event-dispatching thread */
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                runGUI();
            }
        });
    }

    
}
