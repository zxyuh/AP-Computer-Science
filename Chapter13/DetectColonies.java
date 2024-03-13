package Chapter13;
/**
 * Slide class.
 */

import java.io.*;
 
public class DetectColonies { 	
      
    public static void main(String[] args) {
         
        Slide culture = new Slide("slide.dat");
        culture.displaySlide();
        culture.displayColonies();
        culture.displaySlide();
    }
 }
