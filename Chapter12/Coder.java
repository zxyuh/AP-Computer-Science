package Chapter12;
/*
 * Omar Faruk
 * Coder 
 * 10/23/23
 */
import java.util.*;
public class Coder {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        String prompt = "";
        char[] wordLetters;
        char letter;
       

        System.out.print("Enter A String: ");
        prompt = input.nextLine();
        input.close();

        prompt.toUpperCase();
        wordLetters = prompt.toCharArray();

        for(int i = 0; i < wordLetters.length; i++){
            letter = wordLetters[i];
            if((int)letter != 32){
                letter +=2;
            }
            wordLetters[i] = letter;
        }

        System.out.println(wordLetters);
    }
    
}


