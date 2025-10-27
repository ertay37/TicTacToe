package tictactoe;
import java.util.*;

public class TicTacToeGame {
  private final Scanner scanner = new Scanner(System.in);

  // pre: humanPlayer is either 1 (X) or -1 (O)
  // post: plays one complete game, prints board state, announces winner or tie
  public void playTicTacToe(int humanPlayer) {
    TicTacToeBoard board = new TicTacToeBoard();
    int currentPlayer = humanPlayer;

    System.out.println("Player is X, Computer is O");

    while (true) {
      board.print();
      if (currentPlayer == humanPlayer) {
        int move = getPlayerMove(board);
        board.setPosition(move, humanPlayer);
      } else {
        System.out.println("Computer is thinking...");
        int move = getComputerMove(board);
        board.setPosition(move, -humanPlayer);
      }

      int winner = board.getWinner();
      if (winner != 0) {
        board.print();
        System.out.println((winner == humanPlayer ? "You win!" : "Computer wins!"));
        break;
      }

      if (board.isFull()) {
        board.print();
        System.out.println("It's a tie!");
        break;
      }

      currentPlayer *= -1; // Switch player
    }
  }

  // pre: board is initialized
  // post: returns valid position (1-9) that is empty on the board
  private int getPlayerMove(TicTacToeBoard board) {
    while (true) {
      System.out.print("Enter a position (1-9): ");
      String input = scanner.nextLine();
      try {
        int pos = Integer.parseInt(input);
        if (pos >= 1 && pos <= 9 && board.isEmpty(pos)) {
          return pos;
        } else {
          System.out.println("Invalid move. Try again.");
        }
      } catch (NumberFormatException e) {
        System.out.println("Please enter a valid number.");
      }
    }
  }

  // pre: board is initialized
  // post: returns a valid available position (1-9) on the board
  private int getComputerMove(TicTacToeBoard board) {
    List<Integer> available = board.getAvailablePositions();
    return available.get(new Random().nextInt(available.size()));
  }
}
