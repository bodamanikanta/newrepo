#include <iostream>

using namespace std;

// Function to print the game board
void printBoard(char board[3][3]) {
    cout << "    1   2   3" << endl;
    cout << "  -------------" << endl;
    for (int i = 0; i < 3; i++) {
        cout << i+1 << " | ";
        for (int j = 0; j < 3; j++) {
            cout << board[i][j] << " | ";
        }
        cout << endl;
        cout << "  -------------" << endl;
    }
}

// Function to check if a player has won the game
bool checkWin(char board[3][3], char symbol) {
    for (int i = 0; i < 3; i++) {
        if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) {
            return true;
        }
        if (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol) {
            return true;
        }
    }
    if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) {
        return true;
    }
    if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol) {
        return true;
    }
    return false;
}

int main() {
    char board[3][3] = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    int row, col;
    char player1 = 'X';
    char player2 = 'O';
    char currentPlayer = player1;
    bool gameOver = false;
    int turn = 1;

    cout << "Welcome to Tic Tac Toe!" << endl;
    cout << "Player 1: X" << endl;
    cout << "Player 2: O" << endl;

    // Main game loop
    while (!gameOver) {
        cout << "Turn " << turn << endl;
        printBoard(board);
        cout << "Player " << currentPlayer << ", enter row (1-3): ";
        cin >> row;
        cout << "Player " << currentPlayer << ", enter column (1-3): ";
        cin >> col;
        row--;
        col--;

        // Check if chosen position is valid and mark the board
        if (board[row][col] == ' ') {
            board[row][col] = currentPlayer;
            turn++;

            // Check if current player has won the game
            if (checkWin(board, currentPlayer)) {
                cout << "Player " << currentPlayer << " wins!" << endl;
                printBoard(board);
                gameOver = true;
            }
            // If no one has won, check if the game is a tie
            else if (turn > 9) {
                cout << "The game is a tie!" << endl;
                printBoard(board);
                gameOver = true;
            }
            // If neither player has won and the game is not a tie, switch to the other player's turn
            else {
                currentPlayer = (currentPlayer == player1) ? player2 : player1;
            }
        }
    }
}
        // If chosen position is already taken, ask player
