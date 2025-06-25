// File: TicTacToeGame.java
public class TicTacToeGame {
    private char[][] board;
    private char currentPlayer;

    public TicTacToeGame(char startingPlayer) {
        board = new char[3][3];
        currentPlayer = startingPlayer;
    }

    public boolean placeSymbol(int row, int col) {
        if (board[row][col] == '\u0000') {
            board[row][col] = currentPlayer;
            return true;
        }
        return false;
    }

    public boolean checkWinner() {
        for (int i = 0; i < 3; i++) {
            if (match(board[i][0], board[i][1], board[i][2]) ||
                match(board[0][i], board[1][i], board[2][i])) {
                return true;
            }
        }
        return match(board[0][0], board[1][1], board[2][2]) ||
               match(board[0][2], board[1][1], board[2][0]);
    }

    private boolean match(char a, char b, char c) {
        return a != '\u0000' && a == b && b == c;
    }

    public boolean isBoardFull() {
        for (char[] row : board) {
            for (char cell : row) {
                if (cell == '\u0000') return false;
            }
        }
        return true;
    }

    public char getCurrentPlayer() {
        return currentPlayer;
    }

    public void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }
}
