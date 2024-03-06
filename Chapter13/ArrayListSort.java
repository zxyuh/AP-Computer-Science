package Chapter13;
/*
 * Omar Faruk
 * ArrayListSort
 * 3/4/24
 */
import java.util.Scanner;

public class ArrayListSort {

    public static void displayArray(double[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i] + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int numObjects = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter The Number Of Objects: ");
        numObjects = input.nextInt();
        input.close();

        double[] objectList = new double[numObjects];
        for(int i = 0; i < numObjects; i++){
            objectList[i] = Math.random() * 100;
        }

        System.out.println("Unsorted: ");
        displayArray(objectList);

        Sorts.selectionSort(objectList);

        System.out.println("Sorted: ");
        displayArray(objectList);



    }

    
}
