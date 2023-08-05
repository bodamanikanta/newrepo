#include <stdio.h>

int main(){
    int a=2,b=6,c=5;
    c += a + b++ + c++;
    printf("%d\n",c);
    return 0;
}