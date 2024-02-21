package Chapter12;

/**
 * TestProcessor
 */
import java.io.*;
import java.util.Scanner;
public class TestProcessor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fileName;
        File masterFile;
        FileReader in;
        String score;
        BufferedReader readFile;
        int count = -2;
        int numCorrect = 0;
        int percent = 0;
        String key = "";

        System.out.println("Enter The name of file: ");
        fileName = input.nextLine();

        masterFile = new File("I:\\APComputerScience\\Chapter12\\TextFile\\" + fileName);

        try {
            in = new FileReader(masterFile);
            readFile = new BufferedReader(in);
            while ((score = readFile.readLine()) != null){
                count++;
                if(count == -1){
                    key = score;
                    System.out.println(key);
                } 
                if (count == 0){
                    System.out.println(score + ": ");
                }
                if (count == 2){
                    System.out.print(score);
                    for(int i = 0; i < key.length(); i++){
                        if(key.charAt(i) ==  score.charAt(i)){
                            numCorrect++;
                        }
                    }
                    percent = numCorrect/key.length();
                    count = 0;
                    numCorrect = 0;
                    System.out.print(percent);
                    System.out.println();
                }
            }
        } catch (FileNotFoundException e){
            System.out.println("File does not exist or could not be found.");
            System.err.println("FileNotFoundException: " + e.getMessage());
        } catch (IOException e){
            System.out.println("Problem Reading File");
            System.err.println("IOException: " + e.getMessage());
        }



        
    }
}