#include <stdio.h>
#include <stdlib.h>
int main()
{
    int n = 3, m = 3;
    int **p, **q;
    p = (int **)malloc(n * sizeof(int *));
    for (int i = 0; i < n; i++)
        *(p + i) = (int *)malloc(m * sizeof(int));
    q = (int **)malloc(n * sizeof(int *));
    for (int i = 0; i < n; i++)
        q[i] = (int *)malloc(m * sizeof(int));
    printf("Enter data in 1st Matrix : \n");
    for (int i = 0; i < n; i++)
        for (int j = 0; j < m; j++)
            scanf("%d", &p[i][j]);
    printf("Enter data in 2nd Matrix : \n");
    for (int i = 0; i < n; i++)
        for (int j = 0; j < m; j++)
            scanf("%d", (*(q + i) + j));
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
            printf("%d\t", (*(*(p + i) + j) + q[i][j]));
        printf("\n");
    }
    free(p);
    free(q);
    return 0;
}