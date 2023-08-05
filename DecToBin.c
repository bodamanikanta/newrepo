#include <stdio.h>

void main()
{
    int i, t, c = 0, w;
    double dec, f;
    char bin[20];
    printf("Enter number in decimal : ");
    scanf("%lf", &dec);
    w = (int)dec;
    f = dec - w;
    printf("w= %d\n", w);
    printf("f= %lf\n", f);
    for (i = w; i > 0; i /= 2)
    {
        t = i % 2;
        bin[c++] = t + 48;
    }
    for (i = 0; i < c / 2; i++)
    {
        t = bin[i];
        bin[i] = bin[c - i - 1];
        bin[c - i - 1] = t;
    }
    bin[c++] = '.';
    while (f > 0)
    {
        f = f * 2;
        bin[c++] = (int)f;
        f = f - (int)f;
    }
    for (i = 0; i < c; i++)
    {
        printf("%c", bin[i]);
    }
}