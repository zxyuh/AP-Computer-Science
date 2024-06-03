package Chapter13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MazeSlide {
    private char[][] slideData;
    private boolean pathFound = false;
    private char space = ' ';

    public MazeSlide(String s){
        try{
            File maze = new File("I:\\APComputerScience\\Chapter13\\Maze.dat");
            FileReader in = new FileReader(maze);
            BufferedReader readSlide = new BufferedReader(in);
            int length = Integer.parseInt(readSlide.readLine());
            int width = Integer.parseInt(readSlide.readLine());
            slideData = new char[length][width];
            for(int row = 0; row < length; row++){
                for(int col = 0; col < width; col++){
                    slideData[row][col] = (char)readSlide.read();
                }
                readSlide.readLine();
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

    public void displaySlide() {
        for (int row = 0; row < slideData.length; row++) {
            for (int col = 0; col < slideData[0].length; col++) {
                System.out.print(slideData[row][col]);
            }
            System.out.println();
        }
    }

    private int collectCells(int row, int col) {
		
		if ((row < 0) || (row >= slideData.length) || (col < 0) || (col >= slideData[0].length)
				|| (slideData[row][col] != '$')) {
			return(0);
		} else {
   			slideData[row][col] = 'X';
   			return(1+
					collectCells(row+1, col)+
					collectCells(row-1, col)+
					collectCells(row, col+1)+
					collectCells(row, col-1));			
		}
	}


    public void displayPath() {
        int count = 0;
        boolean pathFound = false;
        
        for (int row = 0; row < slideData.length; row++) {
               for (int col = 0; col < slideData[0].length; col++) {
                if (collectCells(row, col) == 0) {
                    pathFound = true;
                    System.out.println("(" + row + "," + col + ")");
                }
            }
        }
    }
}
