package tictactoe;
import java.util.*;

public class TicTacToeBoard {
  private final int[] board = new int[9];

  public static final int X = 1;
  public static final int O = -1;
  public static final int EMPTY = 0;

  private static final int[][] WINNING_COMBOS = {
      { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 }, // Rows
      { 0, 3, 6 }, { 1, 4, 7 }, { 2, 5, 8 }, // Columns
      { 0, 4, 8 }, { 2, 4, 6 } // Diagonals
  };

  // pre: position is between 1 and 9
  // post: returns true if the position is empty, false otherwise
  public boolean isEmpty(int position) {
    return board[position - 1] == EMPTY;
  }

  // pre: position is between 1 and 9, value is X, O, or EMPTY
  // post: board at position is updated to value
  public void setPosition(int position, int value) {
    board[position - 1] = value;
  }

  // pre: board is initialized with valid values (X, O, EMPTY)
  // post: returns X if player X wins, O if player O wins, EMPTY if no winner  public int getWinner() {
    for (int[] combo : WINNING_COMBOS) {
      int sum = board[combo[0]] + board[combo[1]] + board[combo[2]];
      if (sum == 3)
        return X;
      if (sum == -3)
        return O;
    }
    return EMPTY;
  }

  // pre: board is initialized
  // post: returns true if no EMPTY positions remain, false otherwise
  public boolean isFull() {
    for (int cell : board) {
      if (cell == EMPTY)
        return false;
    }
    return true;
  }

  // pre: board is initialized
  // post: returns a list of integers corresponding to empty positions (1-9)
  public List<Integer> getAvailablePositions() {
    List<Integer> positions = new ArrayList<>();
    for (int i = 0; i < board.length; i++) {
      if (board[i] == EMPTY) {
        positions.add(i + 1);
      }
    }
    return positions;
  }

  // pre: board is initialized
  // post: prints board state with X, O, and separators
  public void print() {
    for (int i = 0; i < 9; i++) {
      String mark = board[i] == X ? "X" : board[i] == O ? "O" : " ";
      System.out.print(mark);
      if ((i + 1) % 3 == 0) {
        System.out.println();
        if (i < 6)
          System.out.println("-+-+-");
      } else {
        System.out.print("|");
      }
    }
    System.out.println();
  }
}
