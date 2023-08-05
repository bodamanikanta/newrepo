#include<iostream>
#include<string>

using namespace std;

int main(){
    string expression;
    double a,b,c,f=0;
    cout << "Enter any Expression : ";
    cin >> expression;
    for(int i = 0; i < expression.length(); i++){

        switch (expression[i])
        {
        case '+':
            a = stoi(expression.substr(0, i));
            b = stoi(expression.substr(i + 1));
            c = a + b;
            cout << a << " + " << b << " = " << c;
            f=1;
            break;
        case '-':
            a = stoi(expression.substr(0, i));
            b = stoi(expression.substr(i + 1));
            c = a - b;
            cout << a << " - " << b << " = " << c;
            f=1;
            break;
        case '*':
            a = stoi(expression.substr(0, i));
            b = stoi(expression.substr(i + 1));
            c = a * b;
            cout << a << " * " << b << " = " << c;
            f=1;
            break;
        case '/':
            a = stoi(expression.substr(0, i));
            b = stoi(expression.substr(i + 1));
            c = a / b;
            cout << a << " / " << b << " = " << c;
            f=1;
            break;
        default:
            break;
        }
        if(f == 1)
        break;
    }
    





}
