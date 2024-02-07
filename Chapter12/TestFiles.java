package Chapter12;

import java.io.*;

public class TestFiles {
    public static void main(String[] args) {
        File textFile = new File("I:\\APComputerScience\\tools+.txt");
        if (textFile.exists()){
            System.out.println("File Are Already Exists");
        } else {
            try {
                textFile.createNewFile();
                System.out.println("New File Created");
            } catch (IOException e) {
                System.out.println("File Couldn't be Created");
                System.err.println("IOException: " + e.getMessage());
            }
        }
    }
}
