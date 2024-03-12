package Chapter13;
/*
 * Omar Faruk
 * Search Locations
 * 3/11/24
 */
import java.util.*;
public class SearchLocations {
    public static void displayArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        int location, numItems, searchNum;
        int[] numArray;
        Scanner input = new Scanner(System.in);

        //Adds integers into array and sorts the array
        System.out.println("Enter Number of Elements: ");
        numItems = input.nextInt();
        numArray = new int[numItems];
        for(int i = 0; i < numArray.length; i++){
            numArray[i] = (int) (Math.random() * 100);
        }
        Sorts.selectionSort(numArray);
        System.out.println("Your Numbers: ");
        displayArray(numArray);

        //displays the location of the number being searched
        System.out.println("Enter a Number to Search For: ");
        searchNum = input.nextInt();
        input.close();
        location = Search.binarySearch(numArray, 0, numArray.length - 1, searchNum);
        System.out.println("Number at position: " + location);
        
        

            
        

    }
}
