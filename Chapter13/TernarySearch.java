package Chapter13;

import java.util.Scanner;

public class TernarySearch {
    public static void displayArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
    }
    public static void main(String[] args) {
        //int[] numArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner input = new Scanner(System.in);
        int locateNum, numItems;
        int location;

        //Adds integers into array and sorts the array
        System.out.println("Enter Number of Elements: ");
        numItems = input.nextInt();
        int[] numArray = new int[numItems];
        for(int i = 0; i < numArray.length; i++){
            numArray[i] = (int) (Math.random() * 100);
        }
        Sorts.selectionSort(numArray);
        System.out.println("Your Numbers: ");
        displayArray(numArray);

        //locates the number the user searches for
        System.out.println("Enter The Number You Want To Find: ");
        locateNum = input.nextInt();
        input.close();
        System.out.println("Locating: " + locateNum);
        location = Search.TernarySearch(numArray, 0, numArray.length - 1, locateNum);
        System.out.println("Number at postion: " + location);
    }
    
}
