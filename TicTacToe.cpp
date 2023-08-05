#include <iostream>
#include <string>
using namespace std;

char board[3][3] = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
int player = 1;
int choice;

void drawBoard()
{
    cout << "Player 1 (X) - Player 2 (O)" << endl;
    cout << endl;
    cout << "     |     |     " << endl;
    cout << "  " << board[0][0] << "  |  " << board[0][1] << "  |  " << board[0][2] << endl;
    cout << "_____|_____|_____" << endl;
    cout << "     |     |     " << endl;
    cout << "  " << board[1][0] << "  |  " << board[1][1] << "  |  " << board[1][2] << endl;
    cout << "_____|_____|_____" << endl;
    cout << "     |     |     " << endl;
    cout << "  " << board[2][0] << "  |  " << board[2][1] << "  |  " << board[2][2] << endl;
    cout << "     |     |     \n" << endl;
}

void playerTurn()
{
    if (player % 2 == 1)
        player = 1;
    else
        player = 2;

    cout<<"Player "<<player<<", enter a number: ";
    cin>>choice;

    char mark = (player == 1) ? 'X' : 'O';

    if (choice == 1 && board[0][0] == '1')
        board[0][0] = mark;
    else if (choice == 2 && board[0][1] == '2')
        board[0][1] = mark;
    else if (choice == 3 && board[0][2] == '3')
        board[0][2] = mark;
    else if (choice == 4 && board[1][0] == '4')
        board[1][0] = mark;
    else if (choice == 5 && board[1][1] == '5')
        board[1][1] = mark;
    else if (choice == 6 && board[1][2] == '6')
        board[1][2] = mark;
    else if (choice == 7 && board[2][0] == '7')
        board[2][0] = mark;
    else if (choice == 8 && board[2][1] == '8')
        board[2][1] = mark;
    else if (choice == 9 && board[2][2] == '9')
        board[2][2] = mark;

}

int checkWin()
{
//check win for X or O
}

int main()
{
//main function
}