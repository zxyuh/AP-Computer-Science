package Chapter12;
/*
 * Omar Faruk
 * MyFile Part 1
 * 12/19/23;
 */
import java.io.*;
import java.util.*;
public class MyFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String path = "I:\\APComputerScience\\Chapter12\\TextFile\\";
        String file;
        

        System.out.print("Enter The Name Of The File Or Path: ");
        file = input.nextLine();
        input.close();

        if (!file.contains(path) && !file.contains(".txt")){
            path = path + file + ".txt";
            System.out.println(path);
        } else if(!file.contains(path) && file.contains(".txt")) {
            path = path + file;
            System.out.println(path);
        } else {
            System.out.println(file);
        }


        File textFile = new File(path);

        if(textFile.exists()){
            System.out.println("File Exits");
        } else {
            System.out.println("File Doesn't Exist");
        }

    }
   
}
