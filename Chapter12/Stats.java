package Chapter12;

import java.io.*;
public class Stats {
    public static void main(String[] args) {
        File dataFile = new File("I:\\APComputerScience\\Chapter12\\TextFile\\scores.dat");
        FileReader in;
        BufferedReader readFile;
        String score;
        double avgScore;
        double totalScores = 0;
        int numScores = 0;
        int count = 0;
        double lowest = 0;
        double highest = 0;

        try{
            in = new FileReader(dataFile);
            readFile = new BufferedReader(in);
            while ((score = readFile.readLine()) != null){
                count++;
                if(count == 1){
                    System.out.print(score + ": ");
                }
                if (count == 2){
                    System.out.print(score);
                    if(lowest == 0 && highest == 0){
                        lowest = Double.parseDouble(score);
                        highest = Double.parseDouble(score);
                    }

                    if(Double.parseDouble(score) < lowest){
                        lowest = Double.parseDouble(score);
                    } else if ( Double.parseDouble(score) > highest){
                        highest = Double.parseDouble(score);
                    }
                    
                    numScores += 1;
                    totalScores += Double.parseDouble(score);
                    count = 0;
                    System.out.println();
                }
                //System.out.println(score);
            }
            avgScore = totalScores / numScores;
            System.out.println();
            System.out.println("Highest = " + (int)highest);
            System.out.println("Lowest = " + (int)lowest);
            System.out.println("Average = " + (int)avgScore);
            readFile.close();
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist or could not be found.");
            System.err.println("FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Problem Reading File");
            System.err.println("IOException: " + e.getMessage());
        }
        
    }
}
