#include <stdio.h>
int main()
{
    int i, max, max2, li=0;
    int a[] = {102, 5, 9, 8, 7, 2, 5, 2, 54, 98, 5};
    max = a[0];
    for (i = 0; i < 11; i++)
    {
        if (a[i] > max)
        {
            max = a[i];
            li = i;
        }
    }
    max2 = (li==0)?a[1]:a[0];
    for (i = 0; i < 11; i++)
    {
        if (li == i)
            continue;
        if (a[i] > max2)
        {
            max2 = a[i];
        }
    }
    printf("largest =%d, Second largest =%d",max,max2);
    return 0;
}