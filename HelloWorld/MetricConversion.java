package HelloWorld;

import javax.swing.*;
import java.awt.event.*;

public class MetricConversion implements ActionListener{
    JFrame frame;
    JPanel contentPane;
    JComboBox conversions;
    JLabel conversionPrompt, conversion;

    public MetricConversion(){
        //create and set up frame
        frame = new JFrame("Metric Conversion");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 150);

        //create a content pane with a boxlayout
        contentPane = new JPanel();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));
        contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        //create a combo box and a descriptive label
        conversionPrompt = new JLabel("Select A Conversion");
        conversionPrompt.setAlignmentX(JLabel.LEFT_ALIGNMENT);
        conversionPrompt.setSize(500, 100);
        contentPane.add(conversionPrompt);

        String[] list = {"Inches to Centimeters", "Foot to Meter", "Gallon to Liters", "Pound to Kilogram"};
        conversions = new JComboBox<>(list);
        conversions.setAlignmentX(JComboBox.LEFT_ALIGNMENT);
        conversions.setSelectedIndex(0);
        conversions.addActionListener(this);
        contentPane.add(conversions);

        //create and add a label that will display the conversion
        conversion = new JLabel("");
        conversion.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
        contentPane.add(conversion);

        //add contnet pane to frame
        frame.setContentPane(contentPane);

        //size and then display the frame
        //frame.pack();
        frame.setVisible(true);
    }

    //Handle a selectrion from the combo box
    public void actionPerformed(ActionEvent event){
        JComboBox comboBox = (JComboBox)event.getSource();
        String metricConversion = (String)comboBox.getSelectedItem();

        if(metricConversion == "Inches to Centimeters"){
            conversion.setText("1in = 2.54cm");
        } else if(metricConversion == "Foot to Meter"){
            conversion.setText("1ft = .3048m");
        } else if(metricConversion == "Gallon to Liters"){
            conversion.setText("1G = 4.5461L");
        } else if(metricConversion == "Pound to Kilogram"){
            conversion.setText("1lb = .4536kg");
        }
    }

    //create and show GUI
    private static void runGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true);

        new MetricConversion();
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                runGUI();
            }
        });
    }

    
}