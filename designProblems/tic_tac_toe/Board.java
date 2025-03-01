package designProblems.tic_tac_toe;

import java.util.Arrays;

public class Board {
    private final int size;
    private final char[][] grid;

    // ✅ Constructor to initialize an empty board
    public Board(int size) {
        this.size = size;
        this.grid = new char[size][size];
        for (char[] row : grid) {
            Arrays.fill(row, ' ');
        }
    }

    // ✅ Method to initialize board with a predefined state
    public void setPredefinedBoard(char[][] initialGrid) {
        for (int i = 0; i < size; i++) {
            System.arraycopy(initialGrid[i], 0, grid[i], 0, size);
        }
    }

    // ✅ Method to display the board
    public void displayBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    // ✅ Places a move on the board if the cell is empty
    public boolean placeMove(int row, int col, char symbol) {
        if (isCellEmpty(row, col)) {
            grid[row][col] = symbol;
            return true;
        }
        return false;
    }

    // ✅ Checks if a cell is empty
    public boolean isCellEmpty(int row, int col) {
        return grid[row][col] == ' ';
    }

    // ✅ Getter for the board grid
    public char[][] getGrid() {
        return grid;
    }

    public boolean isBoardFull() {
        for (char[] row : grid) {
            for (char cell : row) {
                if (cell == ' ') return false;
            }
        }
        return true;
    }
}

