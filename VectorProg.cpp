#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int n , q , i , j ;
    string line,temp="";
    cin >> n >> q;
    vector <int> arr[n];
    for(i = 0 ; i < n ; i++ ){
        cin >> j;
        while(!cin.end){
            cin >> j;
            arr[i].push_back(j);
        }

        /* getline(cin,line);
        len=line.length();
        for(j=0;j<len;j++){
            ch=line.at(j);
            if(ch!=' ')
            temp = ch+temp;
            else{
                a[i].push_back(stoi(temp));
                temp="";
            }
        } */
    }
    cout << "Hello 1"; 
    int x , y;
    for(i = 0 ; i < q ; i++ ){
        cin >> x >> y;
        cout << arr[x][y] << endl;
    }
    cout << "Hello 2";
    return 0;
}