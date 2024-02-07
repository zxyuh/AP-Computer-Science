import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String name;

        System.out.println("Enter A String");
        name = input.nextLine();

        System.out.println(name);
        
        if(name.contains("\\")){
            name.replace("\\", "\\\\");
        }

        System.out.println(name);
        
    

    }
}
