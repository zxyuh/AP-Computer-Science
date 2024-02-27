package Chapter13;
import java.util.Scanner;

import javafx.scene.shape.Circle;

import java.util.Random;
public class ArrayListSort {
    public static void displayArray(Circle[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i] + " ");
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numObjects;
        Circle[] test;
        Random rand = new Random();

        System.out.println("Enter the number of objects: ");
        numObjects = input.nextInt();
        input.close();

        test = new Circle[numObjects];
        for(int i = 0; i < test.length; i++){
            test[i] = new Circle(rand.nextInt(10));
        }
        System.out.println("Unsorted: ");
        displayArray(test);

        Sorts.selectionSort(test);

        System.out.println("Sorted: ");
        displayArray(test);

    }

    
}
