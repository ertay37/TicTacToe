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

  public boolean isEmpty(int position) {
    return board[position - 1] == EMPTY;
  }

  public void setPosition(int position, int value) {
    board[position - 1] = value;
  }

  public int getWinner() {
    for (int[] combo : WINNING_COMBOS) {
      int sum = board[combo[0]] + board[combo[1]] + board[combo[2]];
      if (sum == 3)
        return X;
      if (sum == -3)
        return O;
    }
    return EMPTY;
  }

  public boolean isFull() {
    for (int cell : board) {
      if (cell == EMPTY)
        return false;
    }
    return true;
  }

  public List<Integer> getAvailablePositions() {
    List<Integer> positions = new ArrayList<>();
    for (int i = 0; i < board.length; i++) {
      if (board[i] == EMPTY) {
        positions.add(i + 1);
      }
    }
    return positions;
  }

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