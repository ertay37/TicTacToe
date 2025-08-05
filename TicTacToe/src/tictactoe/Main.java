package tictactoe;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    TicTacToeGame game = new TicTacToeGame();

    System.out.println("Welcome to Tic Tac Toe!");

    while (true) {
      game.playTicTacToe(1); // Player is X, Computer is O

      System.out.print("Would you like to play again? (yes/no): ");
      String answer = scanner.nextLine().trim();
      if (!answer.equalsIgnoreCase("yes")) {
        System.out.println("Thanks for playing!");
        break;
      }
    }
    
    scanner.close();
  }
}