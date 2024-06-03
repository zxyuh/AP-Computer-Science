package Chapter13;

/*
 * Omar Faruk
 * Knapsack
 * 4/3/24
 */

import java.util.Random;
import java.util.Scanner;
public class Knapsack {

    public static boolean fillKnapsack(int[] weights, int goalWeight, int start) {
		if (goalWeight == 0) {
			return(true);
		} else if (start >= weights.length) {
   			return(false);
   		} else {
   			if (fillKnapsack(weights, goalWeight, start + 1)) {
   				return(true);
   			} else if (fillKnapsack(weights, goalWeight - weights[start], start + 1)) {
   				return(true);
   			} else {
   				return(false);
   			}
		}
    }

    public static boolean isPossible(int[] weights, int goalWeight){
         return fillKnapsack(weights, goalWeight, 0);
    }


    public static void main(String[] args) {
        int[] weights = new int[4];
        int goalWeight;
        int sumWeights = 0;
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        String generate;


        do{
            //generates weights and randomizes a weight to search for;
            for(int i = 0; i <= weights.length - 1; i++){
                weights[i] = rand.nextInt(10);
                sumWeights += weights[i];
            }
            goalWeight = rand.nextInt(sumWeights);

            //displayes the weights and the goal
            System.out.print("Your Weights Are: ");
            for(int i = 0; i <= weights.length - 1; i++){
            System.out.print(weights[i] + " ");
            }
            System.out.println();

        
            System.out.println("Goal Weight is: " + goalWeight);

            if(isPossible(weights, goalWeight) == true){
                System.out.println("Goal Is Possible");
            } else {
                System.out.println("Goal Is Not Possible");
            }

            System.out.print("Generate Again? (Y/N): ");
            generate = input.nextLine().toUpperCase();

            if (generate.equals("N")) {
                break;
            }

        } while(true);
    }
    
}
