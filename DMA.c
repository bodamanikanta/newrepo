#include<stdio.h>
#include<stdlib.h>
int main()
{
    int n,i,j,t;
    printf("Enter size of array : ");
    scanf("%d",&n);
    int *p;
    p=(int *)malloc(n*sizeof(int));
    for(i=0;i<n;i++)
        scanf("%d",(p+i));
    for(i=0;i<n;i++)
        for(j=0;j<n-1-i;j++)
            if(*(p+j)>*(p+j+1))
            {
                t=*(p+j);
                *(p+j)=*(p+j+1);
                *(p+j+1)=t;
            }
    printf("\n");
    for(i=0;i<n;i++)
        printf("%d\t",*(p+i));
    free(p);
    return 0;
}