package designProblems.tic_tac_toe;

class DefaultWinningStrategy implements WinningStrategy {
    @Override
    public boolean checkWinner(Board board, char symbol) {
        char[][] grid = board.getGrid();
        int size = grid.length;

        for (int i = 0; i < size; i++) {
            if (checkRow(grid, i, symbol) || checkColumn(grid, i, symbol)) {
                return true;
            }
        }

        return checkMainDiagonal(grid, symbol) || checkAntiDiagonal(grid, symbol);
    }

    private boolean checkRow(char[][] grid, int row, char symbol) {
        for (char cell : grid[row]) {
            if (cell != symbol) return false;
        }
        return true;
    }

    private boolean checkColumn(char[][] grid, int col, char symbol) {
        for (char[] row : grid) {
            if (row[col] != symbol) return false;
        }
        return true;
    }

    private boolean checkMainDiagonal(char[][] grid, char symbol) {
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][i] != symbol) return false;
        }
        return true;
    }

    private boolean checkAntiDiagonal(char[][] grid, char symbol) {
        int size = grid.length;
        for (int i = 0; i < size; i++) {
            if (grid[i][size - 1 - i] != symbol) return false;
        }
        return true;
    }
}


