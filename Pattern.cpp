#include <iostream>
using namespace std;

int main(){
    int n,i,j;
    cout << "Enter a number : ";
    cin >> n;
    if(n%2 == 1){

    for(i=1;i<=n;i++){
        for(j=1;j<=n;j++){
            if( i==1 || j==1 || i==n || j==n || i== (n/2+1) || j==(n/2+1))
                cout << "* ";
            else
                cout << "  ";
        }
        cout << "\n";
    }
    }
    else
    cout << "n must be odd";
    return 0;
}