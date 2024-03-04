package Chapter12;

/*
 * Omar Faruk
 * ApplicationDoc
 * 2/23/24
 */
import java.io.*;
import java.util.*;

public class ApplicationDoc {
    public static void main(String[] args) {
        File docFile = new File("I:\\APComputerScience\\Chapter12\\TextFile\\ApplicationDoc.txt");
        //I:\\APComputerScience\\Chapter12\\TextFile\\CountLetters.java
        FileReader in;
        BufferedReader readFile;
        String line;
        String nameFile;
        Scanner input = new Scanner(System.in);
        File javaFile;
        ArrayList<String> comments = new ArrayList<String>();
        String base;

        FileWriter out;
        BufferedWriter writeFile;

        try {
            System.out.println("Enter The Name of File: ");
            nameFile = input.next();
            if(nameFile.contains(".java")){
                javaFile = new File(nameFile);
            } else {
                nameFile = nameFile + ".java";
                javaFile = new File(nameFile);
            }
            in = new FileReader(javaFile);
            readFile = new BufferedReader(in);
            while ((line = readFile.readLine()) != null) {
                line = line.trim();
                if (line.startsWith("/**") && line.endsWith("*/")) {
                    comments.add(line);
                } else if(line.startsWith("*") || line.startsWith("/*")){
                    comments.add(line);
                }
            }
            System.out.println(comments);
        } catch (FileNotFoundException e) {
            System.out.println("File Does not exist or could not be found");
            System.err.println("FileNotFoundException" + e.getMessage());
        } catch (IOException e) {
            System.out.println("Problem Reading File");
            System.err.println("IOException: " + e.getMessage());
        }


        try{
            docFile.createNewFile();
            out = new FileWriter(docFile);
            writeFile = new BufferedWriter(out);
            for(int i = 0; i < comments.size(); i++){
                base = comments.get(i);
                writeFile.write(base);
                writeFile.newLine();
                System.out.println(base);
            }
            writeFile.close();
            out.close();
            System.out.println("Data Written To File");
        } catch (FileNotFoundException e) {
            System.out.println("File Does not exist or could not be found");
            System.err.println("FileNotFoundException" + e.getMessage());
        } catch (IOException e) {
            System.out.println("Problem Reading File");
            System.err.println("IOException: " + e.getMessage());
        }

    }
}
