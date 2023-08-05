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
    fp=fopen("Record.txt","w");
    if(fp==NULL)
    {
        printf("Insufficient Memory");
        exit(0);
    }
    printf("Enter no of Records : ");
    scanf("%d",&n);
    printf("Enter Records : ");
    for(i=0;i<n;i++)
    {
        scanf("%s %d %f",s.name,&s.age,&s.gpa);
        //fprintf(fp, "%s %d %f\n",s.name,s.age,s.gpa);
        fwrite(&s, sizeof(s), 1,fp);
    }
    fclose(fp);
    return 0;
}