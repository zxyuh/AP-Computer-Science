package Chapter13;
//DETECT COLONIES SLIDE CLASS 
/*
* Omar Faruk
* Detect Colonies 2
* 4/4/24
*/
import java.io.*;
public class Slide2 {
   private char NON_COLONY = '0';
   private char COLONY;
   private char[][] slideData;
      
   /**
    * constructor
    * pre: Slide file contains valid slide data in the format:
    * first line: lenght of slide
    * second line: width of slide
    * remaining lines: slide data
    * post: Slide data has been loaded from slide file.
    */
   public Slide2(String s) {
      
       try {
           File slideFile = new File(s);
           FileReader in = new FileReader(slideFile);
           BufferedReader readSlide = new BufferedReader(in);
           int length = Integer.parseInt(readSlide.readLine());
           int width = Integer.parseInt(readSlide.readLine());
           slideData = new char[length][width];
           for (int row = 0; row < length; row++) {
               for (int col = 0; col < width; col++) {
                   slideData[row][col] = (char)(readSlide.read());
                   //System.out.println(num);
               }
               readSlide.readLine();   //read past end-of-line characters
           }
           readSlide.close();
           in.close();
       } catch (FileNotFoundException e) {
           System.out.println("File does not exist or could not be found.");
           System.err.println("FileNotFoundException: " + e.getMessage());
       } catch (IOException e) {
           System.out.println("Problem reading file.");
           System.err.println("IOException: " + e.getMessage());
       }
   }


       /**
    * Determines a colony size
    * pre: none
    * post: All colony cells adjoining and including cell (Row, Col) have
    * been changed to NON_COLONY, and count of these cells is returned.
    */
   private int collectCells(int row, int col) {
      
       if ((row < 0) || (row >= slideData.length) || (col < 0) || (col >= slideData[0].length) || (slideData[row][col] != COLONY)) {
           return(0);
       } else {
           slideData[row][col] = NON_COLONY;
           return(1+
                   collectCells(row+1, col)+
                   collectCells(row-1, col)+
                   collectCells(row, col+1)+
                   collectCells(row, col-1));                 
       }
   }


     /**
    * Analyzes a slide for colonies and displays colony data
    * pre: none
    * post: Colony data has been displayed.
    */
   public void displayColonies() {
       int count;
       int num = 49;
      
       do{
           COLONY = (char)num;
           for (int row = 0; row < slideData.length; row++) {
               for (int col = 0; col < slideData[0].length; col++) {
                 if(slideData[row][col] == COLONY){
                    count = collectCells(row, col);
                    System.out.println("Colony " + COLONY + " at (" + row + "," + col + ") with size " + count);
                   }
               }
           }
           num++;
       } while(num < 57);
      
   }
  
  
   /**
    * Displays a slide.
    * pre: none
    * post: Slide data has been displayed.
    */
   public void displaySlide() {
      
       for (int row = 0; row < slideData.length; row++) {
           for (int col = 0; col < slideData[0].length; col++) {
               System.out.print(slideData[row][col]);
           }
           System.out.println();
       }
   }
}


