import java.io.*;
import java.util.Scanner;
public class Stats2 {
    public static void main(String[] args) {
        File dataFile = new File("");
        FileWriter out;
        BufferedWriter writeFile;
        Scanner input = new Scanner(System.in);
        double score = 0;
        String name = "";
        String nameFile = "";
        int numStudents = 0;
        int students = 0;

       // File dataFile = new File("I:\\APComputerScience\\Chapter12\\TextFile\\scores.dat");
        FileReader in;
        BufferedReader readFile;
        String stuScore;
        double avgScore;
        double totalScores = 0;
        int numScores = 0;
        int count = 0;
        double lowest = 0;
        double highest = 0;

        try{
            System.out.println("Enter The Name of File: ");
            nameFile = input.next();
            if(nameFile.contains(".dat")){
                dataFile = new File(nameFile);
            } else {
                nameFile = nameFile + ".dat";
                dataFile = new File(nameFile);
            }
            System.out.println("Enter The Number of Students: ");
            numStudents = input.nextInt();
            System.out.println();

            out = new FileWriter(dataFile);
            writeFile = new BufferedWriter(out);
            while(students != numStudents){
               System.out.println("Enter Student Name: ");
               name = input.next();
               if(!name.equals("-1")){
                System.out.println("Enter test Score: ");
                score = input.nextDouble();
                writeFile.write(name);
                writeFile.newLine();
                writeFile.write(String.valueOf(score));
                writeFile.newLine(); 
                students++;
               }
            }
            writeFile.close();
            out.close();
            System.out.println("Data Written To File");
        } catch (IOException e){
            System.out.println("Problem writing to file.");
            System.err.println("IOException: " + e.getMessage());
        }

        try{
            in = new FileReader(dataFile);
            readFile = new BufferedReader(in);
            while ((stuScore = readFile.readLine()) != null){
                count++;
                if(count == 1){
                    System.out.print(stuScore + ": ");
                }
                if (count == 2){
                    System.out.print(stuScore);
                    if(lowest == 0 && highest == 0){
                        lowest = Double.parseDouble(stuScore);
                        highest = Double.parseDouble(stuScore);
                    }

                    if(Double.parseDouble(stuScore) < lowest){
                        lowest = Double.parseDouble(stuScore);
                    } else if ( Double.parseDouble(stuScore) > highest){
                        highest = Double.parseDouble(stuScore);
                    }
                    
                    numScores += 1;
                    totalScores += Double.parseDouble(stuScore);
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
        input.close();
    }
    
}
