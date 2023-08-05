#include<stdio.h>
#include<stdlib.h>
struct student
{
    char *name[50];
    int age;
    float gpa;
}s;

int main()
{
    int n,i;
    FILE *fp;
    fp=fopen("Record.txt","r");
    if(fp==NULL)
    {
        printf("Insufficient Memory");
        exit(0);
    }
    while (fread(&s, sizeof(s), 1, fp)==1)
    //while(fscanf(fp,"%s %d %f",s.name,&s.age,&s.gpa)!=EOF)
    {
        printf("%s %d %f\n",s.name,s.age,s.gpa);
    }
    fclose(fp);
    return 0;
}