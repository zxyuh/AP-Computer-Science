package Anagrams;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


class WordChecker {
   public static boolean isValidWord(String word) {
       // System.out.println(word);
       try {
           BufferedReader in = new BufferedReader(new FileReader(
               "I:\\APComputerScience\\Anagrams\\Dictionary.txt"));
           String str;
           while ((str = in.readLine()) != null) {
               if (str.indexOf(word) != -1) {
                   return true;
               }
           }
           in.close();
       } catch (IOException e) {
       }
       

       return false;
   }

}
