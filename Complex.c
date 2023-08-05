#include <stdio.h>
struct complex
{
    int real;
    int imaginary;
};
typedef struct complex comp;
comp add(comp a, comp b)
{
    comp c;
    c.real = a.real + b.real;
    c.imaginary = a.imaginary + b.imaginary;
    return c;
}

int main()
{
    comp a, b, c;
    printf("Enter 1st complex number : ");
    scanf("%d+%di", &a.real, &a.imaginary);
    printf("Enter 2nd complex number : ");
    scanf("%d+%di", &b.real, &b.imaginary);
    c = add(a, b);
    printf("Sum is %d+%di\n", c.real, c.imaginary);
    return 0;
}