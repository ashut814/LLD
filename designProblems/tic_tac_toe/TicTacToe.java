package designProblems.tic_tac_toe;


import java.util.Arrays;

public class TicTacToe {
    public static void main(String[] args) {
        Player player1 = new Player("Alice", 'X');
        Player player2 = new Player("Bob", 'O');

        Game game = new Game(3, Arrays.asList(player1, player2), new DefaultWinningStrategy());
        game.startGame();
    }
}
