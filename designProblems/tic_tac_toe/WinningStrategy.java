package designProblems.tic_tac_toe;

public interface WinningStrategy {
    boolean checkWinner(Board board, char symbol);
}
