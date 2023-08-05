#include<stdio.h>
int length(char str[])
{
    int l;
    for(l=0;str[l]!='\0';l++);
    return l;
}
int isPalindrome(char str[],int len)
{
    int i;
    for(i=0;i<len/2;i++)
        if(str[i]!=str[len-1-i])
            return 0;
    return 1;
}
int main()
{
    char s[50];
    printf("Enter any String : ");
    scanf("%s",s);
    int l=length(s);
    printf("Length = %d\n",l);
    if(isPalindrome(s,l))
        printf("It is Palindrome");
    else
        printf("It is not Palindrome");
    return 0;
}