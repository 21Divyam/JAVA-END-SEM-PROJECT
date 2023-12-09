public class Game {
    public static void main(String[] args) {
        Board board = new Board();
        GameLogic gameLogic = new GameLogic(board);
        InputHandler inputHandler = new InputHandler();
        Display display = new Display();
        Player player1 = new Player("Player 1", 'X');
        Player player2 = new Player("Player 2", 'O');
        Player currentPlayer = player1;

        while (true) {
            display.printBoard(board.getBoard());
            display.printTurn(currentPlayer.getName());
            int[] input = inputHandler.getInput();

            if (board.placeToken(input[0], input[1], currentPlayer.getToken())) {
                if (gameLogic.checkWin()) {
                    display.printWin(currentPlayer.getName());
                    break;
                } else if (gameLogic.checkDraw()) {
                    System.out.println("The game is a draw!");
                    break;
                }
                currentPlayer = (currentPlayer == player1) ? player2 : player1;
            } else {
                display.printInvalidMove();
            }
        }
        inputHandler.closeScanner();
    }
}