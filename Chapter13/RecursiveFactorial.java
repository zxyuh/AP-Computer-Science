package Chapter13;
/*
 * Omar Faruk
 * Recursive Factorial
 * 3/8/24
 */
import java.util.Scanner;
public class RecursiveFactorial {
    public static int recursionSort(int num){
		int result;
		if(num == 0){
			result = 1;
		} else {
			result = num * recursionSort(num - 1);
		}
		return result;
	}

    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter A Number: ");
        num = input.nextInt();
        input.close();

        System.out.println("Factorial is: " + recursionSort(num));
    }
    
}
