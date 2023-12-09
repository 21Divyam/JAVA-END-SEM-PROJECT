public class GameLogic {
    private Board board;

    public GameLogic(Board board) {
        this.board = board;
    }

    public boolean checkWin() {
        for (int i = 0; i < 3; i++) {
            if (board.getBoard()[i][0] != '-' && board.getBoard()[i][0] == board.getBoard()[i][1]
                    && board.getBoard()[i][0] == board.getBoard()[i][2]) {
                return true;
            }
            if (board.getBoard()[0][i] != '-' && board.getBoard()[0][i] == board.getBoard()[1][i]
                    && board.getBoard()[0][i] == board.getBoard()[2][i]) {
                return true;
            }
        }
        if (board.getBoard()[0][0] != '-' && board.getBoard()[0][0] == board.getBoard()[1][1]
                && board.getBoard()[0][0] == board.getBoard()[2][2]) {
            return true;
        }
        if (board.getBoard()[0][2] != '-' && board.getBoard()[0][2] == board.getBoard()[1][1]
                && board.getBoard()[0][2] == board.getBoard()[2][0]) {
            return true;
        }
        return false;
    }

    public boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board.getBoard()[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}
