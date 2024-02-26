package Chapter12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.io.*;

public class HTMLViewer{
    public static void main(String[] args) {
        File html = new File("I:\\APComputerScience\\Chapter12\\TextFile\\june_bugs.html");
        FileReader in;
        BufferedReader readFile;
        String line;
        int ch;
        int length;
        boolean go = true;
        String sentance = "";

        try {
            in = new FileReader(html);
            readFile = new BufferedReader(in);
            while ((line = readFile.readLine()) != null){
                length = line.length();
                Reader reader = new StringReader(line);
                do{
                    ch = reader.read();
                    sentance = sentance + (char)ch;
                    if(sentance.contains("<p>")){
                        sentance = sentance.replace("<p>", "\n\n");
                        //go = false;
                    }
                    if(sentance.contains("<br>")){
                        sentance = sentance.replace("<br>", "\n");
                    }
                    if(!sentance.contains("<p>") || !sentance.contains("<br>")){
                        go = false;
                    }
                } while (go != false);
                System.out.println(sentance);
                //go = true;
                
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