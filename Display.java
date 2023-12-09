public class Display {
    public void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public void printTurn(String playerName) {
        System.out.println(playerName + "'s turn. Enter row and column (1-3):");
    }

    public void printWin(String playerName) {
        System.out.println(playerName + " wins! ");
    }

    public void printInvalidMove() {
        System.out.println("Invalid move. Try again.");
    }
}
