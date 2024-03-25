package Chapter13;
/*
 * Omar Faruk
 * Interpolation Search
 * 3/22/24
 */
import java.util.*;
public class InterpolationSearch {

    public static void displayArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numFind, location;
        
        //Adds integers into array and sorts the array
        System.out.println("Enter Number of Elements: ");
        int numItems = input.nextInt();
        int[] numArray = new int[numItems];
        for(int i = 0; i < numArray.length; i++){
            numArray[i] = (int) (Math.random() * 100);
        }

        Sorts.selectionSort(numArray);
        System.out.println("Your Sorted Numbers: ");
        displayArray(numArray);

        System.out.println("Enter A Number to Search: ");
        numFind = input.nextInt();
        input.close();

        System.out.println(numArray.length + " " + numFind);
        location = Search.interpolationSearch(numArray, 0, numArray.length - 1, numFind);
        System.out.println("Item is at position " + location);
    }
}
