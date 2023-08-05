#include<stdio.h>
typedef struct vector
{
    int y;
    int x;
}vect;
int isPerpendicular(vect a, vect b)
{
    int r=a.x*b.x+a.y*b.y;
    return (r==0)?1:0;
}
int main()
{
    vect v1,v2;
    scanf("%d %d",&v1.x,&v1.y);
    scanf("%d %d",&v2.x,&v2.y);
    printf("%d",isPerpendicular(v1,v2));
    return 0;
}