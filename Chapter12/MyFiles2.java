package Chapter12;
/*
 * Omar Faruk
 * MyFiles Part 2
 * 12/20/23
 */
import java.io.File;
import java.io.IOException;
import java.util.*;

public class MyFiles2 {
    public static void main(String[] args) {
        File textFile = new File("I:\\APComputerScience\\Chapter12\\TextFile\\zzz.txt");
        Scanner input = new Scanner(System.in);
        String userFile;
        if (textFile.exists()){
            System.out.println("File Already Exists");
            System.out.print("Do You Want To Keep Or Delete The File?: ");
            userFile = input.nextLine();
            userFile.toLowerCase();
            if (userFile.equals("keep")) {
                System.out.println("file is kept");
            } else if (userFile.equals("delete")){
                textFile.delete();
                System.out.println("File Has Been Deleted");
            }
        } else {
            try {
                textFile.createNewFile();
                System.out.println("zzz.txt file has been created.");
                System.out.print("Do You Want To Keep Or Delete The File?: ");
                userFile = input.nextLine();
                userFile.toLowerCase();
                if (userFile.equals("keep")) {
                    System.out.println("file is kept");
                } else if (userFile.equals("delete")){
                    textFile.delete();
                    System.out.println("File Has Been Deleted");
                }
            } catch (IOException e){
                System.out.println("An Error Occured, Couldn't Perform Action");
                System.err.println("IOException: " + e.getMessage());
            }
        }
        input.close();
    }
}
