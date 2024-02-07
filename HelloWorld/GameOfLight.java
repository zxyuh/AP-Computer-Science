package HelloWorld;
import java.util.*;

public class GameOfLight {

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        String board[][] = new String[3][3];
        int x, y;
        int row, col;

        do{
            System.out.print("Enter The Number of Rows You Want(3-9): ");
            x = input.nextInt();
        } while(x > 9 || x < 3);

        do{
            System.out.print("Enter The Number of Columns You Want(3-9): ");
            y = input.nextInt();
        } while(y > 9 || y < 3);

        //populate board with "O"
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				board[i][j] = "O"; 
			}
		}

        printBoard(board, x, y);

        do{
            System.out.println("Enter the Row: ");
            row = input.nextInt();
            System.out.println("Enter the Column");
            col = input.nextInt();

            changeCell(board, row, col, x, y);
            printBoard(board, x, y);


        } while(gameOver(board, x, y) == false);
        input.close();
        System.out.println("You Win!");

    } 

    public static void changeCell(String[][] board, int row, int col, int x, int y){
        row = row - 1;
        col = col - 1;

        board[row][col] = "L";

        //up
        if((row - 1 <= x && row - 1 > -1) && board[row -1][col] == "O" ){
            board[row -1][col] = "L";
        } else if((row - 1 <= x && row - 1 > -1) && board[row -1][col] == "L"){
            board[row -1][col] = "O";
        }

        //down
        if((row + 1 < x && row + 1 > - 1) && board[row + 1][col] == "O"){
            board[row + 1][col] = "L";
        } else if((row + 1 < x && row + 1 > - 1) && board[row + 1][col] == "L"){
            board[row + 1][col] = "O";
        }

        //left
        if((col - 1 < y && col - 1 > -1) && board[row][col - 1] == "O" ){
            board[row][col - 1] = "L";
        } else if((col - 1 < y && col - 1 > -1) && board[row][col - 1] == "L"){
            board[row][col - 1] = "O";
        }

        //right
        if((col + 1 < y && col + 1 > -1) && board[row][col + 1] == "O" ){
            board[row][col + 1] = "L";
        } else if((col + 1 < y && col + 1 > -1) && board[row][col + 1] == "L"){
            board[row][col + 1] = "O";
        }
        
        
    }

    public static boolean gameOver(String [][] board, int x, int y){
        int count = 0;
        for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if(board[i][j] == "L"){
                    count++;
                }
			}
		}

        if(count == (x * y)){
            return true;
        } else {
            return false;
        }

    }

    public static void printBoard(String [][] board, int x, int y) {
        int num = 48;
        int count = 0;

        do{
            System.out.print((char)num + " ");
            num++;
            count++;
        } while (count != x + 1 );
        System.out.println();

        num = 49;

		for (int i = 0; i < board.length; i++) {
            System.out.print((char)num + " ");
            num++;
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j] + " ");
				if (j == board[0].length - 1) {
					System.out.println();
				}
			}
		}
	}
}
       
