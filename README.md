Tic Tac Toe: Java Console Game 
------------------------------------------------------------------------------------------------------------------------------------------------------------------
This open-source project implements a fully functional Tic Tac Toe game in Java, featuring a human vs. computer mode. The computer makes valid random moves, and the program runs entirely in the console—ideal for demonstrating object-oriented design, user input handling, and game logic fundamentals.

Overview
------------------------------------------------------------------------------------------------------------------------------------------------------------------
- Object-Oriented Design
- Built around three core classes: Main, TicTacToeGame, and TicTacToeBoard.
- Clean separation of responsibilities between input handling, game flow, and board state.
- Player vs Computer Gameplay
- Player is X, computer is O.
- The computer selects random valid positions from the remaining available spots.
- Game detects wins, losses, and ties automatically.

Replay Support
------------------------------------------------------------------------------------------------------------------------------------------------------------------
- After each game, users can choose to play again without restarting the program.

Setup & Usage
------------------------------------------------------------------------------------------------------------------------------------------------------------------
- 1. Clone the repository: git clone https://github.com/your-username/java-tictactoe.gitcd java-tictactoe
- 2. Compile the source files: javac Main.java TicTacToeGame.java TicTacToeBoard.java
- 3. Run the game: java Main
  
- You’ll see the board displayed in the console and be prompted to enter positions (1–9) for your moves.

How It Works
------------------------------------------------------------------------------------------------------------------------------------------------------------------
- Board Representation: The game board is stored as an integer array of length 9 (int[] board), where:
- 1 = X (Player)
- -1 = O (Computer)
- 0 = Empty

Game Logic
------------------------------------------------------------------------------------------------------------------------------------------------------------------
After every move, the program checks all 8 possible winning combinations (rows, columns, diagonals). If a line sums to 3 (all X) or -3 (all O), the game declares a winner.

Computer Move Generation
------------------------------------------------------------------------------------------------------------------------------------------------------------------
The computer retrieves the list of available positions and picks one at random using Java’s Random class.

Flow Control
------------------------------------------------------------------------------------------------------------------------------------------------------------------
The game alternates turns between player and computer until a win or tie is detected, then prompts for replay.

Example Gameplay
------------------------------------------------------------------------------------------------------------------------------------------------------------------
Welcome to Tic Tac Toe!
Player is X, Computer is O
 | | 
-+-+-
 | | 
-+-+-
 | | 

Enter a position (1-9): 5
Computer is thinking...
X| | 
-+-+-
 |O| 
-+-+-
 | | 

You win!
Would you like to play again? (yes/no): no
Thanks for playing!

Features
------------------------------------------------------------------------------------------------------------------------------------------------------------------
- Lightweight console-based Java game.
- Clear game state visualization.
- Robust input validation (rejects invalid or occupied moves).
- Portable — runs on any system with Java 8+.
- Fully open-source and beginner-friendly.

Future Improvements
------------------------------------------------------------------------------------------------------------------------------------------------------------------
- Implement a Minimax AI for unbeatable computer play.
- Add GUI support using Swing or JavaFX.
- Track player statistics and scores.
- Introduce two-player (local) mode.

License
------------------------------------------------------------------------------------------------------------------------------------------------------------------
MIT License (see LICENSE file for details).

Contributing
------------------------------------------------------------------------------------------------------------------------------------------------------------------
Pull requests and issues are welcome.
If you’d like to improve the AI, UI, or overall design, feel free to fork the repo and submit a PR.
