package Chapter13;
import java.io.*;
public class Maze{
    
    public static void main(String[] args) {

        MazeSlide culture = new MazeSlide("Maze.dat");
        culture.displaySlide();
        culture.displayPath();
    
    }
       
}