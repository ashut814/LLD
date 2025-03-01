package designProblems.tic_tac_toe;

import java.util.List;
import java.util.Scanner;

class Game {
    private final Board board;
    private final List<Player> players;
    private final WinningStrategy strategy;
    private int currentPlayerIndex = 0;

    public Game(int size, List<Player> players, WinningStrategy strategy) {
        this.board = new Board(size);
        this.players = players;
        this.strategy = strategy;
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            board.displayBoard();
            Player currentPlayer = players.get(currentPlayerIndex);
            System.out.println(currentPlayer.getName() + "'s turn (" + currentPlayer.getSymbol() + "): Enter row and column (0-based index)");

            int row = -1, col = -1;

            while (true) {
                if (scanner.hasNextInt()) {
                    row = scanner.nextInt();
                    if (scanner.hasNextInt()) {
                        col = scanner.nextInt();
                        break;
                    }
                }
                System.out.println("Invalid input! Please enter two integers.");
                scanner.nextLine(); // Clear invalid input
            }

            if (!board.placeMove(row, col, currentPlayer.getSymbol())) {
                System.out.println("Invalid move, try again.");
                continue;
            }

            if (strategy.checkWinner(board, currentPlayer.getSymbol())) {
                board.displayBoard();
                System.out.println(currentPlayer.getName() + " wins!");
                break;
            }

            if(board.isBoardFull()) {
                board.displayBoard();
                System.out.println("It's a draw!");
                break;
            }

            currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
        }

        scanner.close();
    }

}

