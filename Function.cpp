#include <iostream>
#include <cstdio>
using namespace std;

int max_of_four(int a,int b,int c,int d);

int main() {
    int a, b, c, d;
    scanf("%d %d %d %d", &a, &b, &c, &d);
    int ans = max_of_four(a, b, c, d);
    printf("%d", ans);
    
    return 0;
}

int max_of_four(int a,int b,int c,int d){
    return (a>b)?(c>d)?(a>c)?a:c:(a>d)?a:d:(c>d)?(b>c)?b:c:(b>d)?b:d;
}
