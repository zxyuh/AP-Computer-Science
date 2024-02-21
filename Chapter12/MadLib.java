package Chapter12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class MadLib {
    public static void main(String[] args) {
        File story = new File("I:\\APComputerScience\\Chapter12\\\\TextFile\\story.txt");
        File nouns = new File("I:\\APComputerScience\\Chapter12\\\\TextFile\\nouns.txt");
        File verbs = new File("I:\\APComputerScience\\Chapter12\\\\TextFile\\verbs.txt");
        FileReader in;
        BufferedReader readFile;

        ArrayList<String> listNouns = new ArrayList<String>();
        ArrayList<String> listVerbs = new ArrayList<String>();

        Random rand = new Random();

        String useStory;
        String word;
        String replace;
        int randomInt;
        int count = 1;
        int nounSize = 0;
        int verbSize = 0;

       

        try{
            in = new FileReader(nouns);
            readFile = new BufferedReader(in);
            while ((word = readFile.readLine()) != null) {
                listNouns.add(word);
            }
            nounSize = listNouns.size();
            System.out.println(listNouns);
        } catch (FileNotFoundException e){
            System.out.println("File Does not exist or could not be found");
            System.err.println("FileNotFoundException" + e.getMessage());
        } catch (IOException e){
            System.out.println("Problem Reading File");
            System.err.println("IOException: " + e.getMessage());
        }

        try{
            in = new FileReader(verbs);
            readFile = new BufferedReader(in);
            while ((word = readFile.readLine()) != null) {
                listVerbs.add(word);
            }
            verbSize = listVerbs.size();
            System.out.println(listVerbs);
        } catch (FileNotFoundException e){
            System.out.println("File Does not exist or could not be found");
            System.err.println("FileNotFoundException" + e.getMessage());
        } catch (IOException e){
            System.out.println("Problem Reading File");
            System.err.println("IOException: " + e.getMessage());
        }

        try{
            in = new FileReader(story);
            readFile = new BufferedReader(in);
            while ((word = readFile.readLine()) != null) {
                do{
                    if(word.contains("#")){
                        randomInt = rand.nextInt(nounSize - 1 + 1) + 1;
                        word = word.replaceFirst("#", listNouns.get(randomInt));
                    }
                    if(word.contains("%")){
                        randomInt = rand.nextInt(verbSize - 0 + 1) + 0;
                        word = word.replaceFirst("%", listVerbs.get(randomInt));
                    }
                } while (word.contains("#") || word.contains("%"));
                System.out.println(word);
            }

        } catch (FileNotFoundException e){
            System.out.println("File Does not exist or could not be found");
            System.err.println("FileNotFoundException" + e.getMessage());
        } catch (IOException e){
            System.out.println("Problem Reading File");
            System.err.println("IOException: " + e.getMessage());
        }

      

    }
}
