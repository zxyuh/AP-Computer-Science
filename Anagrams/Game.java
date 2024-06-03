package Anagrams;

import java.util.ArrayList;
import java.util.Random;

public class Game {
    private static String[] letters;

    public static boolean valid(char[] userArray, char[] givenLetters, String userGuess, ArrayList<String> usedWords){
        if(countMatchingCharacters(userArray, givenLetters) && isValidWord(userGuess) && usedBefore(userGuess, usedWords)){
            System.out.println("WINNER");
            return true;
        } else {
            System.out.println("CANT USE");
            return false;
        }
    }

    //generates the letters to be used
   public static String[] generateLetters(){
        Random rand = new Random();
        String[] givenLetters = new String[6];
        for(int i = 0; i < 6; i++){
            char randomLetter = (char)(rand.nextInt(90-65+1) + 65);
            givenLetters[i] = String.valueOf(randomLetter);
            letters = givenLetters;
        }
        return givenLetters;
    }

    public static String getLetters(){
        String word;
        for(String letterString : letters){
            word = letterString + " ";
        }
        return getLetters();
    }
     //checks if the word is valid.
    public static boolean isValidWord(String userGuess){
        new WordChecker();
        if(WordChecker.isValidWord(userGuess)){
            return true;
        } else {
            return false;
        }
    }

    //checks if the word has been used before
    public static boolean usedBefore(String userGuess, ArrayList<String> words){
        for(int i = 0; i < words.size(); i++ ){
            if(words.get(i) == userGuess){
                return true;
            }
        }
        return false;
    }

    //checks if the characters given are used
    public static boolean countMatchingCharacters(char userLetters[], char givenLetters[]) {
        int count = 0;
        int length = userLetters.length;
        for(int i = 0; i < userLetters.length; i++){
            for(int j = 0; j < givenLetters.length; j++){
                if(userLetters[i] == givenLetters[j]){
                    count++;
                    break; // break the inner loop as we found a match
                }
            }
        }
        
        if(count == length){
            return true;
        } else {
            return false;
        }
    }


    
}
