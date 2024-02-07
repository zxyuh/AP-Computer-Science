package Chapter12;

import java.io.*;
public class das {
    public static void main(String[] args) {
        File textFile = new File("\\\\fluorine\\2024\\HOME\\20240107\\APComputerScience\\Chapter12\\TextFile\\Wonder.txt");
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
