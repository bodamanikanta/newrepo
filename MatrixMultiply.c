#include<stdio.h>
int main()
{
    int m1,n1,m2,n2,i,j,k,s;
    printf("Enter row, and column of 1st matrix : ");
    scanf("%d %d",&m1,&n1);
    int a[m1][n1];
    printf("Enter values in 1st Matrix :\n");
    for(i=0;i<m1;i++)
        for(j=0;j<n1;j++)
            scanf("%d",&a[i][j]);
    printf("Enter row, and column of 2nd matrix : ");
    scanf("%d %d",&m2,&n2);
    int b[m2][n2];
    printf("Enter values in 2nd Matrix :\n");
    for(i=0;i<m2;i++)
        for(j=0;j<n2;j++)
            scanf("%d",&b[i][j]);
    if(n1==m2)
    {
        int c[m1][n2];
        for(i=0;i<m1;i++)
            for(j=0;j<n2;j++)
            {
                c[i][j] = 0;
                for (k = 0; k <n1; k++)
                c[i][j] += a[i][k] * b[k][j];
            }
        printf("The new Matrix is : \n");
        for(i=0;i<m2;i++)
        {
            for(j=0;j<n2;j++)
                printf("%d\t",c[i][j]);
            printf("\n");
        }
    }
    else   
        printf("Multiplication not possible");
}