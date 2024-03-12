package Chapter13;

import java.util.*;

public class ObjectBinarySearch {
    public static void displayArray(String[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
    }
    public static void main(String[] args) {
        String[] words = {"Apple", "World", "Elephant", "Zebra", "Hello", "Blue", "X-Ray", "Fish", "Nine", "Train"};
        Scanner input = new Scanner(System.in);
        String locateString;
        int location;
        
        //Displays The Array Of Strings Sorted and Unsorted
        System.out.println("Unsorted: ");
        displayArray(words);
        System.out.println();
        System.out.println("Sorted: ");
        Sorts.insertionSort(words);
        displayArray(words);

        System.out.print("Enter A String To Search For: ");
        locateString = input.nextLine();
        input.close();
        location = Search.binarySearch(words, 0, words.length - 1, locateString);
        System.out.println("String is at postion: " + location);







    }
}
