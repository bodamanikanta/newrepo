import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = new char[3][3];
        int row, col;
        char turn = 'X';
        boolean playing = true;
        while (playing) {
            System.out.println("Player " + turn + ", enter row and column for your move: ");
            row = scanner.nextInt() - 1;
            col = scanner.nextInt() - 1;
            if (board[row][col] == '\u0000') {
                board[row][col] = turn;
                if (checkWin(board, row, col, turn)) {
                    System.out.println("Player " + turn + " wins!");
                    playing = false;
                } else if (checkDraw(board)) {
                    System.out.println("It's a draw!");
                    playing = false;
                } else {
                    turn = turn == 'X' ? 'O' : 'X';
                }
            } else {
                System.out.println("That spot is already taken!");
            }
        }
    }

    public static boolean checkWin(char[][] board, int row, int col, char turn) {
        return (board[row][0] == turn && board[row][1] == turn && board[row][2] == turn)
                || (board[0][col] == turn && board[1][col] == turn && board[2][col] == turn)
                || (row == col && board[0][0] == turn && board[1][1] == turn && board[2][2] == turn)
                || (row + col == 2 && board[0][2] == turn && board[1][1] == turn && board[2][0] == turn);
    }

    public static boolean checkDraw(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '\u0000') {
                    return false;
                }
            }
        }
        return true;
    }
}