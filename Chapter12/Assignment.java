package Chapter12;
/*
 * Omar Faruk
 * Assignment 
 * 12/20/23
 */
import java.io.*;
public class Assignment {
    public static void main(String[] args) {
        File textFile = new File("I:\\APComputerScience\\Chapter12\\TextFile\\assignment.txt");
        FileReader in;
        BufferedReader readFile;
        String lineOfText;

        try {
            in = new FileReader(textFile);
            readFile = new BufferedReader(in);
            while ((lineOfText = readFile.readLine()) != null){
                System.out.println(lineOfText);
            }
            readFile.close();
            in.close();
        } catch (FileNotFoundException e){
            System.out.println("File Does not exist or could not be found");
            System.err.println("FileNotFoundException" + e.getMessage());
        } catch (IOException e){
            System.out.println("Problem Reading File");
            System.err.println("IOException: " + e.getMessage());
        }
    }
    
}
