import java.io.*;
import java.util.*;

public class WordList {
    private String word;
    private boolean wordFound = false;
    private File dict = new File("words.txt");


    public WordList(){
        //default Word
        word = "";
    }

    public void setWord(String newWord){
        word = newWord;
    }

    public String getWord(){
       return word;
    }

    public boolean isWord(){
        try{
            Scanner scanner = new Scanner(dict);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                if(line.equals(word)){
                    wordFound = true;
                    System.out.println(line);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e){
            System.out.println("File Does Not Exist Or Could Not Be Found");
            System.err.println("FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Problem Reading File");
            System.err.println("IOException: "+ e.getMessage());
        }

        return wordFound;
    }

   
}


