import java.io.*;
import java.util.*;
public class dictionaryReader {
 
    public static void main(String[] args) {
        File dictionary = new File("words.txt");
        FileReader in;
        BufferedReader readFile;
        String text;
        Boolean wordFound = false;

        try{
            in = new FileReader(dictionary);
            readFile = new BufferedReader(in);
            while (!wordFound) {
                text = readFile.readLine().toLowerCase();
                //System.out.println(text);
                if(text.equals("1208361ucgsa")){
                    wordFound = true;
                }
            }
            readFile.close();
            in.close();
            if(wordFound = true){
                System.out.println("Word was found!");
            } else {
                System.out.println("Word was not found!");
            }
            
        } catch (FileNotFoundException e){
            System.out.println("File Does Not Exist Or Could Not Be Found");
            System.err.println("FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Problem Reading File");
            System.err.println("IOException: "+ e.getMessage());
        }
    }
}
