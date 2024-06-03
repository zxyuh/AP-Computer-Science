package Chapter13;
/*
* Omar Faruk
* MyBoggle
* 4/4/24
*/
import java.util.Scanner;

public class MyBoggle {

   public static char[][] generateBoard(int size){
       char[][] board = new char[size][size];
       for(int i = 0; i < board.length; i++){
           for(int j = 0; j < board[i].length; j++){
               board[i][j] = (char)((Math.random() * (90 - 65)) + 65);
           }
       }
       return board;
   }

   public static void displayBoard(char[][] board){
       for(int i = 0; i < board.length; i++){
           for(int j = 0; j < board[i].length; j++){
               System.out.print(board[i][j] + " ");
           }
           System.out.println();
       }
   }

   public static boolean findWord(char[][] board, String word) {
       boolean[][] visited = new boolean[board.length][board[0].length];


       for (int i = 0; i < board.length; i++) {
           for (int j = 0; j < board[i].length; j++) {
               if (findWord(board, word, visited, i, j, 0)) {
                   return true;
               }
           }
       }
       return false;
   }

   public static boolean findWord(char[][] board, String word, boolean[][] visited, int i, int j, int index) {
       if (index == word.length()) {
           return true;
       }

       if (i < 0 || i >= board.length || j < 0 || j >= board[i].length || visited[i][j] || board[i][j] != word.charAt(index)) {
           return false;
       }

       visited[i][j] = true;

       if (
           findWord(board, word, visited, i + 1, j, index + 1) ||
           findWord(board, word, visited, i - 1, j, index + 1) ||
           findWord(board, word, visited, i, j + 1, index + 1) ||
           findWord(board, word, visited, i, j - 1, index + 1) ||
           findWord(board, word, visited, i + 1, j + 1, index + 1) ||
           findWord(board, word, visited, i - 1, j - 1, index + 1) ||
           findWord(board, word, visited, i + 1, j - 1, index + 1) ||
           findWord(board, word, visited, i - 1, j + 1, index + 1)){

           return true;
       }

       visited[i][j] = false;

       return false;
   }

   public static void main(String[] args) {
       char[][] board;
       Scanner input = new Scanner(System.in);
       String searchWord;

       board = generateBoard(5);
       displayBoard(board);

       do{
           System.out.print("Enter A Word To Search (0 To Stop): ");
           searchWord = input.nextLine();
           searchWord = searchWord.toUpperCase();
           if (!searchWord.equals("0")) {
              if(findWord(board, searchWord)){
               System.out.println("We Found The Word!");
              } else {
               System.out.println("We Didn't Find The Word.");
              }
           }
       } while (!searchWord.equals("0"));
       input.close();


   }
}



