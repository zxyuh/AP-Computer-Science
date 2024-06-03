import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class method {
    public static void main(String[] args) {
        File file = new File("Student.txt")

    try {
        Scanner scanner = new Scanner(file);

        //now read the file line by line...
        int lineNum = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            lineNum++;
            if(line.equals("mango")){
            System.out.println("MANGO IS FOUND!");
        }
    }
    } catch(FileNotFoundException e) { 
    //handle this
}
    }

}
